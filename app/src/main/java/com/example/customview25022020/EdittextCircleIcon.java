package com.example.customview25022020;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class EdittextCircleIcon extends RelativeLayout {
    private TextView mTvTitle;
    private ImageView mImgIcon;
    private String mTextTitle;
    private Integer mResId;
    private View mView;

    public EdittextCircleIcon(Context context) {
        super(context);
        initLayout(null , null);
    }

    public EdittextCircleIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        initLayout(context , attrs);
    }

    public EdittextCircleIcon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void initLayout(@Nullable Context context, AttributeSet attrs) {
        if (context != null && attrs != null){
            initLayout(context);
            TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.EdittextCircleIcon);
            mTextTitle = typedArray.getString(R.styleable.EdittextCircleIcon_title);
            mResId = typedArray.getResourceId(R.styleable.EdittextCircleIcon_icon_left , 0);
            typedArray.recycle();
            mapview();
            setupView();
        }
    }

    private void initLayout(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mView = inflater.inflate(R.layout.layout_edittext_red_circle, this , true);
    }

    private void mapview() {
        mTvTitle = mView.findViewById(R.id.tvTitle);
        mImgIcon = mView.findViewById(R.id.imgIcon);
    }

    private void setupView() {
        mTvTitle.setText(mTextTitle);
        mImgIcon.setImageResource(mResId);
    }


}
