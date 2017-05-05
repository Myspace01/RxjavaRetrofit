package com.shenzhen.socialcontact.alwayschat.net.okhttp;

import android.content.Context;

import com.shenzhen.socialcontact.alwayschat.base.ActivityContext;
import com.shenzhen.socialcontact.alwayschat.chat.bean.PlayBean;
import com.shenzhen.socialcontact.alwayschat.chat.share.Share;
import com.shenzhen.socialcontact.alwayschat.net.UrlConstants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Named;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by Administrator on 2017/4/26.
 *
 */
@SuppressWarnings("unchecked")
public class Api
{
    private ApiService mApiService;
    private Context mContext;


    public Api(@Named("api") OkHttpClient mOkHttpClient, @ActivityContext Context context)
    {
        mContext = context;
        Retrofit retrofit = new Retrofit.Builder()//
                .addConverterFactory(JacksonConverterFactory.create())//
                .client(mOkHttpClient)//
                .baseUrl(UrlConstants.DOMAIN)//
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//
                .build();
        mApiService = retrofit.create(ApiService.class);
    }

    /**
     * .do接口统一请求参数
     *
     * @return
     */
    private Map<String, String> common()
    {
        Map<String, String> map = new HashMap<>();
        map.put("deviceId", Share.get().getDeviceId());
        return map;
    }

    private Observable handle(Observable observable)
    {
        return observable.unsubscribeOn(Schedulers.newThread()).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread());
    }

//    public Subscription chk_user(String order_money, String os_type, String qrcode_key, String order_sn, String store_id, String version, String sign,
//                                 HttpOnNextListener next)
//    {
//        return handle(mApiService.chk_user(order_money, os_type, qrcode_key, order_sn, store_id, version, sign)).subscribe(new ProgressSubscriber(next, 
//                mContext, true));
//    }

    public Subscription getPlayUsers(HttpOnNextListener<List<PlayBean>> next)
    {
        return handle(mApiService.getPlayUsers()).subscribe(new ProgressSubscriber<>(next, mContext, false));
    }

}
