package com.shenzhen.socialcontact.alwayschat.net.okhttp;


import com.shenzhen.socialcontact.alwayschat.chat.bean.PlayBean;
import com.shenzhen.socialcontact.alwayschat.net.BaseResponse;
import com.shenzhen.socialcontact.alwayschat.net.UrlConstants;

import java.util.List;

import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Administrator on 2017/4/26.
 *
 */
public interface ApiService
{
    /**
     * 登录接口
     */
    //@POST(UrlConstants.LOGIN)
    //Observable<BaseResponse<LoginResponse>> login(@Query("deviceId") String deviceId, @Query("userName") String userName, @Query("password") String password);

    @POST(UrlConstants.GETPLAYUSER)
    Observable<BaseResponse<List<PlayBean>>> getPlayUsers();
    
}
