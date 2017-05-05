package com.shenzhen.socialcontact.alwayschat.chat.injection.module;

import android.app.Application;
import android.content.Context;

import com.shenzhen.socialcontact.alwayschat.base.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/4/26.
 */

@Module
public class ApplicationModule
{
    protected final Application mApplication;

    public ApplicationModule(Application mApplication)
    {
        this.mApplication = mApplication;
    }

    @Provides
    Application provideApplication()
    {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext()
    {
        return mApplication;
    }
}
