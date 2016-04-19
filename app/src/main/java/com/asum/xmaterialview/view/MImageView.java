package com.asum.xmaterialview.view;

import com.asum.xmaterialview.R;
import com.asum.xmaterialview.tools.MaterialBackgroundDetector;
import com.asum.xmaterialview.tools.XMViewConfig;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by kifile on 15-1-4.
 */
public class MImageView extends ImageView implements MaterialBackgroundDetector.Callback {
	private MaterialBackgroundDetector mDetector;

	public MImageView(Context context) {
		super(context);
		init(null, 0);
	}

	public MImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(attrs, 0);
	}

	public MImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(attrs, defStyle);
	}

	private void init(AttributeSet attrs, int defStyle) {
		final TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.MTextView, defStyle, 0);
		int color = a.getColor(R.styleable.MTextView_maskColor, XMViewConfig.RIPPLE_COLOR);
		a.recycle();
		mDetector = new MaterialBackgroundDetector(getContext(), this, this, color);
	}

	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		mDetector.onSizeChanged(w, h);
	}

	@SuppressLint("ClickableViewAccessibility")
	public boolean onTouchEvent(MotionEvent event) {
		boolean superResult = super.onTouchEvent(event);
		return mDetector.onTouchEvent(event, superResult);
	}

	public void cancelAnimator() {
		mDetector.cancelAnimator();
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		if (isInEditMode()) {
			return;
		}
		mDetector.draw(canvas);
	}

	@SuppressLint("ClickableViewAccessibility")
	public boolean performClick() {
		return mDetector.handlePerformClick();
	}

	public boolean performLongClick() {
		return mDetector.handlePerformLongClick();
	}

	public void performClickAfterAnimation() {
		super.performClick();
	}

	public void performLongClickAfterAnimation() {
		super.performLongClick();
	}
}
