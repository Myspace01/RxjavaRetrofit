package com.shenzhen.socialcontact.alwayschat.widget.pulltozoomview;

import android.content.res.TypedArray;
import android.view.View;

public interface IPullToZoom<T extends View> {
  
    View getZoomView();

    View getHeaderView();

   
    T getPullRootView();

   
    boolean isPullToZoomEnabled();

    boolean isZooming();

    boolean isParallax();

    boolean isHideHeader();

    void handleStyledAttributes(TypedArray a);
}
