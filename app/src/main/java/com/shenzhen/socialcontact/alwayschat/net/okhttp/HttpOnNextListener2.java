package com.shenzhen.socialcontact.alwayschat.net.okhttp;

import com.shenzhen.socialcontact.alwayschat.net.BaseResponse;

/**
 * Created by Administrator on 2017/4/26.
 *
 */

public abstract class HttpOnNextListener2<T>
{
    public abstract void onNext(T response);

    public void onFail(BaseResponse errResponse)
    {
    }

    public void onError(Throwable error)
    {
    }
}
