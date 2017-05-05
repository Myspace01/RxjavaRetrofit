package com.shenzhen.socialcontact.alwayschat.chat.injection.module;

import android.app.Activity;
import android.content.Context;

import com.shenzhen.socialcontact.alwayschat.base.ActivityContext;
import com.shenzhen.socialcontact.alwayschat.base.PerActivity;
import com.shenzhen.socialcontact.alwayschat.net.okhttp.Api;
import com.shenzhen.socialcontact.alwayschat.net.okhttp.ApiCache;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2017/4/26.
 */

@Module
public class ActivityModule
{
    private Activity mActivity;

    public ActivityModule(Activity mActivity)
    {
        this.mActivity = mActivity;
    }

    @Provides
    Activity provideActivity()
    {
        return mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext()
    {
        return mActivity;
    }

    @Provides
    @PerActivity
    public Api provideApi(@Named("api") OkHttpClient okHttpClient, @ActivityContext Context mContext)
    {
        return new Api(okHttpClient, mContext);
    }

    @Provides
    @PerActivity
    public ApiCache provideApiCache(@Named("apiCache") OkHttpClient okHttpClient, @ActivityContext Context mContext)
    {
        return new ApiCache(okHttpClient, mContext);
    }
}
