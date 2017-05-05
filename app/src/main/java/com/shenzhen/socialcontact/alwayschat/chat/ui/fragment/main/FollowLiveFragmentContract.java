package com.shenzhen.socialcontact.alwayschat.chat.ui.fragment.main;

import com.shenzhen.socialcontact.alwayschat.base.BasePresenter;
import com.shenzhen.socialcontact.alwayschat.base.BaseView;
import com.shenzhen.socialcontact.alwayschat.chat.bean.PlayBean;

import java.util.List;

import rx.Subscription;

/**
 * Created by Lizhuo on 2017/4/28.
 */

public interface FollowLiveFragmentContract
{
    interface View extends BaseView
    {
        void getPlayUsersCallBack(List<PlayBean> playBeanList);
    }

    interface Presenter extends BasePresenter<FollowLiveFragmentContract.View>
    {
        Subscription getPlayUsers();
    }
}
