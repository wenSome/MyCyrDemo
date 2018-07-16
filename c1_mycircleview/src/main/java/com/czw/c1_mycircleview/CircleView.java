package com.czw.c1_mycircleview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


/*
 * @创建者     wenSome
 * @创建时间   2018/7/13 15:01
 * @描述	      ${TODO}
 *
 * @更新者     $Author$
 * @更新时间   $Date$
 * @更新描述   ${TODO}
 */

public class CircleView extends View {

    //构造方法
    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    //画笔
    Paint mPaint=new Paint();

    //设置初始值
    private float CircleX=50;
    private float CircleY=55;
    //圆的半径
    private float CircleRadius=25;

    //绘制内容时的回调
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔颜色
        mPaint.setColor(Color.RED);

        //绘制圆的 位置x,y  半径   画笔工具
        canvas.drawCircle(CircleX,CircleY,CircleRadius,mPaint);
    }

    //屏幕触摸事件
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //触摸点坐布
        CircleX=event.getX();
        CircleY=event.getY();

        //通知view自己重绘页面
        invalidate();

        return true;//返回true就是消费事件   false就是不消费
    }
}
