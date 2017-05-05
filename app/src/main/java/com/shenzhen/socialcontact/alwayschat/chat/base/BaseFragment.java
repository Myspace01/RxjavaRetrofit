package com.shenzhen.socialcontact.alwayschat.chat.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shenzhen.socialcontact.alwayschat.base.BaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import rx.Subscription;

/**
 * Created by Administrator on 2017/4/26.
 */

public abstract class BaseFragment extends Fragment implements BaseView
{
    protected Activity mContext;
    Unbinder unbinder;
    public Subscription subscription;
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        mContext = getActivity();

        initDagger();
    }

    protected abstract void initDagger();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        
        if (getContentViewId() != 0)
        {
            View view = inflater.inflate(getContentViewId(), null);
           
            return view;
        }
        else
        {
            return super.onCreateView(inflater, container, savedInstanceState);
        }

    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
       
        unbinder = ButterKnife.bind(this, view);
        initViewsAndEvents(view);
    }


    public void startActivity(Class<?> clazz)
    {
        Intent intent = new Intent(mContext, clazz);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void startActivity(Class<?> clazz, Bundle bundle)
    {
        Intent intent = new Intent(mContext, clazz);
        if (null != bundle)
        {
            intent.putExtra("bundle", bundle);
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    protected abstract int getContentViewId();

    protected abstract void initViewsAndEvents(View rootView);


    @Override
    public void onDestroy()
    {
        super.onDestroy();
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




    @Override
    public void showMessage(String msg, double seconds)
    {

    }

    @Override
    public void close()
    {

    }

    @Override
    public void showProgress(String msg)
    {

    }

    @Override
    public void showProgress(String msg, int progress)
    {

    }

    @Override
    public void hideProgress()
    {

    }

    @Override
    public void showErrorMessage(String msg, String content)
    {

    }
    
    
}
