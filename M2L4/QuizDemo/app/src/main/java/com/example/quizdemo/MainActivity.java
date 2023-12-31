package com.example.quizdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansAButton;
    Button ansBButton;
    Button ansCButton;
    Button ansDButton;
    Button okButton;
    String selectedAnswer = "";
    int currentQuestionIndex = 0;
    int score = 0;
    int totalQuestions = QuestionAnswers.question.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalQuestionsTextView = findViewById(R.id.totalQuestions);
        questionTextView = findViewById(R.id.question);
        ansAButton = findViewById(R.id.ans_a);
        ansBButton = findViewById(R.id.ans_b);
        ansCButton = findViewById(R.id.ans_c);
        ansDButton = findViewById(R.id.ans_d);
        okButton = findViewById(R.id.ok);

        loadNewQuestion();
    }

    @Override
    public void onClick(View view) {
        ansAButton.setBackgroundColor(Color.BLUE);
        ansBButton.setBackgroundColor(Color.BLUE);
        ansCButton.setBackgroundColor(Color.BLUE);
        ansDButton.setBackgroundColor(Color.BLUE);

        Button button = (Button) view;
        if (button.getId() == R.id.ok) {
            if (selectedAnswer.equals(QuestionAnswers.answers[currentQuestionIndex])) {
                score++;
            }
            ++currentQuestionIndex;
            loadNewQuestion();
        } else {
            selectedAnswer = button.getText().toString();
            Log.i("ABCD", selectedAnswer);
            button.setBackgroundColor(Color.GREEN);
        }
    }

    private void loadNewQuestion() {
        if (currentQuestionIndex == totalQuestions) {
            okButton.setEnabled(false);
            FinishQuiz();
            return;
        }
        questionTextView.setText(QuestionAnswers.question[currentQuestionIndex]);
        ansAButton.setText(QuestionAnswers.choices[currentQuestionIndex][0]);
        ansBButton.setText(QuestionAnswers.choices[currentQuestionIndex][1]);
        ansCButton.setText(QuestionAnswers.choices[currentQuestionIndex][2]);
        ansDButton.setText(QuestionAnswers.choices[currentQuestionIndex][3]);
    }

    private void FinishQuiz() {
        String passStatus = "";
        if (score > totalQuestions * 0.6) {
            passStatus = "Passed";
        } else {
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is " + score + " out of " + totalQuestions)
                .setPositiveButton("Restart", ((dialogInterface, i) -> restartQuiz()))
                .setCancelable(false)
                .show();
    }

    private void restartQuiz() {
        Log.i("AlaBalaNica", Integer.toString(score));
        score = 0;
        currentQuestionIndex = 0;
        selectedAnswer = "";
        okButton.setEnabled(true);
        loadNewQuestion();
        Log.i("AlaBalaNica", Integer.toString(score));
    }
}