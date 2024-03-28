package com.example.recursivecircles;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class MyDraw extends View {
    Paint paint;
    private int centerX, centerY, radius;

    public MyDraw(Context context) {
        super(context);
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6);
        paint.setColor(Color.RED);

        Point centerPoint = getCenterOfScreen(context);
        centerX = centerPoint.x;
        centerY = centerPoint.y;
        radius = 200;
    }

    private Point getCenterOfScreen(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int screenWidth = size.x;
        int screenHeight = size.y;
        return new Point(screenWidth / 2, screenHeight / 2);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        drawCircles(canvas, centerX, centerY, radius);
    }

    private void drawCircles(Canvas canvas, int centerX, int centerY, int radius) {
        canvas.drawCircle(centerX, centerY, radius, paint);
        if (radius > 50) {
            drawCircles(canvas, centerX, centerY-radius, radius / 2);
            drawCircles(canvas, centerX, centerY+radius, radius / 2);
            drawCircles(canvas, centerX+radius, centerY, radius / 2);
            drawCircles(canvas, centerX-radius, centerY, radius / 2);
        }
    }
}