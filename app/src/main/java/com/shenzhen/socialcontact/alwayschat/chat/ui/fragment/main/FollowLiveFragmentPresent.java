package com.shenzhen.socialcontact.alwayschat.chat.ui.fragment.main;

import android.content.Context;

import com.shenzhen.socialcontact.alwayschat.base.ActivityContext;
import com.shenzhen.socialcontact.alwayschat.net.okhttp.Api;

import javax.inject.Inject;

import rx.Subscription;

/**
 * Created by Lizhuo on 2017/4/28.
 */

public class FollowLiveFragmentPresent implements FollowLiveFragmentContract.Presenter
{
    private FollowLiveFragmentContract.View mView;
    private Context mContext;

    @Inject
    Api api;

    @Inject
    public FollowLiveFragmentPresent(@ActivityContext Context mContext)
    {
        this.mContext = mContext;
    }

    @Override
    public void attachView(FollowLiveFragmentContract.View view)
    {
        this.mView = view;
    }

    @Override
    public void detachView()
    {
        mView = null;
    }

    @Override
    public Subscription getPlayUsers()
    {
        return api.getPlayUsers(response -> mView.getPlayUsersCallBack(response));
    }
}
