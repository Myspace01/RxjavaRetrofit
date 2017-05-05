package com.shenzhen.socialcontact.alwayschat.net.okhttp;


import android.content.Context;

import com.shenzhen.socialcontact.alwayschat.base.ActivityContext;
import com.shenzhen.socialcontact.alwayschat.net.UrlConstants;

import javax.inject.Named;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * ApiCache，具有缓存功能的API
 * <p>
 * Created by SLAN on 2016/6/29.
 */
public class ApiCache
{
    private ApiCacheService mApiCacheService;
    private Context mContext;

    public ApiCache(@Named("apiCache") OkHttpClient mOkHttpClient, @ActivityContext Context context)
    {
        mContext = context;
        Retrofit retrofit = new Retrofit.Builder()//
                                                  .addConverterFactory(JacksonConverterFactory.create())//
                                                  .client(mOkHttpClient)//
                                                  .baseUrl(UrlConstants.DOMAIN)//
                                                  .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//
                                                  .build();
        mApiCacheService = retrofit.create(ApiCacheService.class);
    }

    public Observable handle(Observable observable)
    {
        return observable.unsubscribeOn(Schedulers.newThread()).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread());
    }

}
