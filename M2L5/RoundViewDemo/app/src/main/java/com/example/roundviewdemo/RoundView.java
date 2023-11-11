package com.example.roundviewdemo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class RoundView extends View {
    private final Paint paint;
    private int circleColor = Color.RED;

    public RoundView(Context context) {
        this(context, null, 0, 0);
    }

    public RoundView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0, 0);
    }

    public RoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public RoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        paint = new Paint();
        paint.setStyle();
    }
}
