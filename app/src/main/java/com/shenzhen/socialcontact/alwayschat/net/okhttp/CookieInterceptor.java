package com.shenzhen.socialcontact.alwayschat.net.okhttp;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/4/26.
 *
 */
public class CookieInterceptor implements Interceptor
{

    public CookieInterceptor()
    {
    }

    @Override
    public Response intercept(Chain chain) throws IOException
    {
        return null;
    }
}
