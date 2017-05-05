package com.shenzhen.socialcontact.alwayschat.chat.ui.fragment.main;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.shenzhen.socialcontact.alwayschat.R;
import com.shenzhen.socialcontact.alwayschat.base.Chat;
import com.shenzhen.socialcontact.alwayschat.chat.base.BaseActivity;
import com.shenzhen.socialcontact.alwayschat.chat.base.BaseFragment;
import com.shenzhen.socialcontact.alwayschat.chat.bean.PlayBean;
import com.shenzhen.socialcontact.alwayschat.chat.ui.adapter.FollowLiveFragmentListAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by Lizhuo on 2017/4/27.
 * <p>
 * 关注
 */

public class FollowLiveFragment extends BaseFragment implements FollowLiveFragmentContract.View
{
    private List<PlayBean> mPlayBeanListHolderList;
    private FollowLiveFragmentListAdapter mAdapter;

    @Inject
    FollowLiveFragmentPresent fragmentPresent;

    @BindView(R.id.follow_live_mRv)
    RecyclerView followLiveMRv;

    @Override
    protected void initDagger()
    {
        ((BaseActivity) getActivity()).activityComponent().inject(this);
        fragmentPresent.attachView(this);
    }

    @Override
    protected int getContentViewId()
    {
        return R.layout.follow_live_fragment;
    }

    @Override
    protected void initViewsAndEvents(View rootView)
    {
        mPlayBeanListHolderList = new ArrayList<>();
        followLiveMRv.setLayoutManager(new GridLayoutManager(Chat.app(), 2));
        mAdapter = new FollowLiveFragmentListAdapter(getContext());
        subscription = fragmentPresent.getPlayUsers();

    }

    @Override
    public void getPlayUsersCallBack(List<PlayBean> playBeanList)
    {
        mPlayBeanListHolderList.addAll(playBeanList);
        mAdapter.setData(mPlayBeanListHolderList);
        followLiveMRv.setAdapter(mAdapter);
    }
}
