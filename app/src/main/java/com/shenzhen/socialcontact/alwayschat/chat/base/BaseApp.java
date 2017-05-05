package com.shenzhen.socialcontact.alwayschat.chat.base;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.shenzhen.socialcontact.alwayschat.base.Chat;
import com.shenzhen.socialcontact.alwayschat.chat.injection.component.ApplicationComponent;
import com.shenzhen.socialcontact.alwayschat.chat.injection.component.DaggerApplicationComponent;
import com.shenzhen.socialcontact.alwayschat.chat.injection.module.ApiModule;
import com.shenzhen.socialcontact.alwayschat.chat.injection.module.ApplicationModule;
import com.shenzhen.socialcontact.alwayschat.chat.share.Share;
import com.shenzhen.socialcontact.alwayschat.manager.AppManager;
import com.shenzhen.socialcontact.alwayschat.util.ApkUtils;
import com.shenzhen.socialcontact.alwayschat.util.ToastSimple;
import com.socks.library.KLog;
import com.taobao.hotfix.HotFixManager;
import com.taobao.hotfix.util.PatchStatusCode;

/**
 * Created by Administrator on 2017/4/26.
 */

public class BaseApp extends Application
{
    private ApplicationComponent mAppComponent;

    private static final String TAG = "chat";// Log TAG

    @Override
    protected void attachBaseContext(Context base)
    {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate()
    {
        super.onCreate();


        Chat.Ext.init(this);
        Chat.Ext.setDebug(true);

        // init KLog
        KLog.init(true, TAG);
//        KLog.init(false, TAG);

        initPostInfo();
    }

    /**
     * 初始化手机信息
     */
    private void initPostInfo()
    {
        String manufacturer = android.os.Build.MANUFACTURER;// 制造商

        KLog.d("型号： " + android.os.Build.MODEL);
        KLog.d("制造： " + manufacturer);
        KLog.d("序列号1： " + android.os.Build.SERIAL);

        Share.get().saveDeviceId(android.os.Build.SERIAL);

    }

    public ApplicationComponent getAppComponent()
    {
        if (null == mAppComponent)
        {
            mAppComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).apiModule(new ApiModule(this)).build();
        }
        return mAppComponent;
    }

    public static BaseApp get(Context context)
    {
        return (BaseApp) context.getApplicationContext();
    }

    public void setAppComponent(ApplicationComponent mAppComponent)
    {
        this.mAppComponent = mAppComponent;
    }

    /**
     *
     */
    private void hotFix()
    {
        HotFixManager.getInstance().setContext(this).setAppVersion(ApkUtils.getVersionName()).setAppId("81559-1").setAesKey(null).setSupportHotpatch(true)
                .setEnableDebug(true).setPatchLoadStatusStub((mode, code, info, handlePatchVersion) ->
        {
            // 补丁加载回调通知
            if (code == PatchStatusCode.CODE_SUCCESS_LOAD)
            {
                // TODO: 10/24/16 表明补丁加载成功
                ToastSimple.show("应用升级成功中...", 5);
            }
            else if (code == PatchStatusCode.CODE_ERROR_NEEDRESTART)
            {
                // TODO: 10/24/16 表明新补丁生效需要重启. 业务方可自行实现逻辑, 提示用户或者强制重启, 建议: 用户可以监听进入后台事件, 然后应用自杀
                ToastSimple.show("应用升级成功，请重启应用", 5);
                AppManager.get().AppExit(this);
            }
            else if (code == PatchStatusCode.CODE_ERROR_INNERENGINEFAIL)
            {
                // 内部引擎加载异常, 推荐此时清空本地补丁, 但是不清空本地版本号, 防止失败补丁重复加载
                //HotFixManager.getInstance().cleanPatches(false);
            }
            else
            {
                // TODO: 10/25/16 其它错误信息, 查看PatchStatusCode类说明
            }
        }).initialize();
    }
}
