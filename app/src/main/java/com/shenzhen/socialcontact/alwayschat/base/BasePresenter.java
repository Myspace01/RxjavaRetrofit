package com.shenzhen.socialcontact.alwayschat.base;

/**
 * Created by Administrator on 2017/4/26.
 * <p>
 * Class Note:
 * MVP中所有Presenter的接口，完成view的绑定和解除
 */

public interface BasePresenter<T extends BaseView>
{
    /**
     * 注入View，使之能够与View相互响应
     *
     * @param view
     */
    void attachView(T view);
    
    /**
     * 释放资源
     */
    void detachView();
}
