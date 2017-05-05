package com.shenzhen.socialcontact.alwayschat.net.okhttp;

/**
 * Created by Administrator on 2017/4/26.
 *
 */
public interface HttpOnNextListener<T>
{
    void onNext(T response);
}

