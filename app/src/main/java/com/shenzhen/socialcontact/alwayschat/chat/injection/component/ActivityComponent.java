package com.shenzhen.socialcontact.alwayschat.chat.injection.component;

import com.shenzhen.socialcontact.alwayschat.base.PerActivity;
import com.shenzhen.socialcontact.alwayschat.chat.injection.module.ActivityModule;
import com.shenzhen.socialcontact.alwayschat.chat.ui.activity.main.MainActivity;
import com.shenzhen.socialcontact.alwayschat.chat.ui.fragment.main.FollowLiveFragment;
import com.shenzhen.socialcontact.alwayschat.net.okhttp.Api;
import com.shenzhen.socialcontact.alwayschat.net.okhttp.ApiCache;

import dagger.Component;

/**
 * Created by Administrator on 2017/4/26.
 * 注射
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent
{
    Api getApi();

    ApiCache getApiCache();

    void inject(MainActivity activity);

    void inject(FollowLiveFragment followLiveFragment);

}
