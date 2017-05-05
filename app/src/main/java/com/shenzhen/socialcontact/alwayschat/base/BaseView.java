package com.shenzhen.socialcontact.alwayschat.base;

/**
 * Created by Administrator on 2017/4/26.
 * <p/>
 * Class Note:
 * MVP中所有 View的接口
 */

public interface BaseView
{
    void showMessage(String msg, double seconds);

    void close();

    void showProgress(String msg);

    void showProgress(String msg, int progress);

    void hideProgress();

    void showErrorMessage(String msg, String content);
}
