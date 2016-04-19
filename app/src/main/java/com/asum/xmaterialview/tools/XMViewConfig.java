package com.asum.xmaterialview.tools;

import android.graphics.Color;

/**
 * Material 相关属性
 * 
 * @author Asum
 *
 */
public class XMViewConfig {
	/**
	 * 波纹颜色
	 */
	public static int RIPPLE_COLOR = Color.BLACK;

	/**
	 * 波纹透明度，20最佳
	 */
	public static int RIPPLE_ALPHA = 20;

	/**
	 * 波纹缓慢扩展速度，最佳1500
	 */
	public static int DURATION_SLOW = 1500;

	/**
	 * 波纹快速扩展速度，最佳300
	 */
	public static int DURATION_FAST = 300;

	/**
	 * 两次点击的间隔，最佳和DURATION_FAST值一样
	 */
	public static int INTERVAL = 300;
}
