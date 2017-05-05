package com.shenzhen.socialcontact.alwayschat.chat.ui.activity.main;

import android.content.Context;

import com.shenzhen.socialcontact.alwayschat.base.ActivityContext;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/4/26.
 */

public class MainPresent implements MainContract.Presenter
{
    private MainContract.View mView;
    private Context mContext;

    @Inject
    public MainPresent(@ActivityContext Context mContext)
    {
        this.mContext = mContext;
    }
    
    


    @Override
    public void attachView(MainContract.View view)
    {
        mView = view;
       
    }

    @Override
    public void detachView()
    {
        mView = null;
    }

    
}
