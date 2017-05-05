package com.shenzhen.socialcontact.alwayschat.chat.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jakewharton.rxbinding.view.RxView;
import com.shenzhen.socialcontact.alwayschat.R;
import com.shenzhen.socialcontact.alwayschat.base.BaseView;
import com.shenzhen.socialcontact.alwayschat.chat.injection.component.ActivityComponent;

import com.shenzhen.socialcontact.alwayschat.chat.injection.component.DaggerActivityComponent;
import com.shenzhen.socialcontact.alwayschat.chat.injection.module.ActivityModule;
import com.shenzhen.socialcontact.alwayschat.manager.AppManager;
import com.shenzhen.socialcontact.alwayschat.util.StatusBarUtil;
import com.shenzhen.socialcontact.alwayschat.util.ToastSimple;

import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Administrator on 2017/4/26.
 * Class Note:
 * 1 所有的activity继承于这个类
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseView
{
    private Context mContext = null; //context
    private ActivityComponent mActivityComponent;

    public Subscription subscription;
    Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        mContext = this;


        AppManager.get().addActivity(this);

        if (getContentViewId() != 0)
        {
            setContentView(getContentViewId());
        }

        unbinder = ButterKnife.bind(this);


        // dagger2注解
        injectDagger();

        initViewsAndEvents();
    }

    @Override
    public void setContentView(int layoutResID)
    {
        super.setContentView(layoutResID);
        setStatusBarColor(R.color.material_deep_teal_500);//设置系统状态栏颜色
    }

    public ActivityComponent activityComponent()
    {
        if (null == mActivityComponent)
        {
            mActivityComponent = DaggerActivityComponent.builder().applicationComponent(BaseApp.get(this).getAppComponent()).activityModule(new 
                    ActivityModule(this)).build();
        }
        return mActivityComponent;
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        AppManager.get().finishActivity(this);

        unbinder.unbind();
        unSubscription();
    }

    public void unSubscription()
    {
        if (null != subscription && !subscription.isUnsubscribed())
        {
            subscription.unsubscribe();
        }
    }

    public void startActivity(Class<?> clazz)
    {
        Intent intent = new Intent(this, clazz);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void startActivity(Class<?> clazz, Bundle bundle)
    {
        Intent intent = new Intent(this, clazz);
        if (null != bundle)
        {
            intent.putExtra("bundle", bundle);
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public Observable eventClick(View view)
    {
        return eventClick(view, 1000);
    }

    public Observable eventClick(View view, int milliseconds)
    {
        return RxView.clicks(view).throttleFirst(milliseconds, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
    }

    public Bundle getBundle()
    {
        return getIntent().getBundleExtra("bundle");
    }

    /**
     * bind layout resource file
     */
    protected abstract int getContentViewId();

    /**
     * Dagger2 use in your application module(not used in 'base' module)
     */
    protected abstract void injectDagger();

    /**
     * init views and events here
     */
    protected abstract void initViewsAndEvents();


    /**
     * implements methods in BaseView
     */
    @Override
    public void showMessage(String msg, double seconds)
    {
        ToastSimple.show(msg, seconds);
    }

    @Override
    public void close()
    {
        finish();
    }

    @Override
    public void showProgress(String msg)
    {
        //DialogManager.INSTANCE.showProgressDialog(mContext, msg);
    }

    @Override
    public void showProgress(String msg, int progress)
    {
        //DialogManager.INSTANCE.showProgressDialog(mContext, msg, progress);
    }

    @Override
    public void hideProgress()
    {
        //DialogManager.INSTANCE.dismiss();
    }

    @Override
    public void showErrorMessage(String msg, String content)
    {
        //DialogManager.INSTANCE.showErrorDialog(mContext, msg, content, SweetAlertDialog::dismissWithAnimation);
    }

    //设置状态栏背景颜色
    private void setStatusBarColor(int color)
    {
        StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(color));
    }
}
