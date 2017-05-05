package com.shenzhen.socialcontact.alwayschat.chat.injection.component;

import android.app.Application;
import android.content.Context;

import com.shenzhen.socialcontact.alwayschat.base.ApplicationContext;
import com.shenzhen.socialcontact.alwayschat.chat.base.BaseApp;
import com.shenzhen.socialcontact.alwayschat.chat.injection.module.ApiModule;
import com.shenzhen.socialcontact.alwayschat.chat.injection.module.ApplicationModule;
import com.shenzhen.socialcontact.alwayschat.net.okhttp.OkHttpHelper;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2017/4/26.
 * 注射
 */
@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent
{
    void inject(BaseApp application);

    @ApplicationContext
    Context context();

    Application application();
    

    @Named("api")
    OkHttpClient getOkHttpClient();

    @Named("apiCache")
    OkHttpClient getOkHttpClientCache();

    OkHttpHelper getOkHttpHelper();
}
