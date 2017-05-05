package com.shenzhen.socialcontact.alwayschat.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shenzhen.socialcontact.alwayschat.R;

/**
 * Created by Administrator on 2017/4/26.
 * <p>
 * 主页底部导航控件
 */

public class BottomMenu extends LinearLayout
{

    private TextView tvmenu;
    private ImageView ivmenu;

    private int imgNormal, imgSelect, tvNormal, tvSelect;

    private boolean isSelect = false;

    private float FACTOR = 0.2F;


    private Fragment fragment;

    public BottomMenu(Context context)
    {
        this(context, null);
    }

    public BottomMenu(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs)
    {
        //加载布局自定义layout_bottom_menu布局
        View view = View.inflate(context, R.layout.layout_bottom_menu, this);
        //初始化控件
        tvmenu = (TextView) view.findViewById(R.id.item_tv);
        ivmenu = (ImageView) view.findViewById(R.id.item_iv);

        //自定义属性
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.BottomMenu);

        String text = typedArray.getString(R.styleable.BottomMenu_text);

        tvmenu.setText(text);

        //找到attrs文件里自定义的属性
        imgNormal = typedArray.getResourceId(R.styleable.BottomMenu_image_normal, 0);
        imgSelect = typedArray.getResourceId(R.styleable.BottomMenu_image_selected, 0);
        tvNormal = typedArray.getColor(R.styleable.BottomMenu_text_color_normal, 0);
        tvSelect = typedArray.getColor(R.styleable.BottomMenu_text_color_selected, 0);

        //设置字体颜色
        tvmenu.setTextColor(tvNormal);

        //设置图片
        ivmenu.setImageResource(imgNormal);
    }

    /**
     * 选中状态
     */
    public void selectMenu()
    {
        isSelect = true;
        ivmenu.setImageResource(imgSelect);
        tvmenu.setTextColor(tvSelect);
        
//        ObjectAnimator animator = ObjectAnimator.ofFloat(this, "xxx", 0, 1).setDuration(300);
//        animator.addUpdateListener(animation ->
//        {
//            float progress = (float) animation.getAnimatedValue();
//            updateView(progress);
//        });
//        animator.start();
    }

    /**
     * 非选中状态
     */
    public void unSelectMenu()
    {
        isSelect = false;
        ivmenu.setImageResource(imgNormal);
        tvmenu.setTextColor(tvNormal);

//        ObjectAnimator animator = ObjectAnimator.ofFloat(this, "animator", 1, 0).setDuration(300);
//        animator.addUpdateListener(animation ->
//        {
//            float progress = (float) animation.getAnimatedValue();
//            updateView(progress);
//        });
//        animator.start();

    }

    private void updateView(float progress)
    {
        setPivotX(getWidth() / 2);
        setPivotY(0);
        setScaleX(1 + FACTOR * progress);
        setScaleY(1 + FACTOR * progress);
    }


    public Fragment getmFragment()
    {
        return fragment;
    }

    public void setmFragment(Fragment mFragment)
    {
        this.fragment = mFragment;
    }

}
