package com.shenzhen.socialcontact.alwayschat.chat.ui.fragment.main;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shenzhen.socialcontact.alwayschat.R;
import com.shenzhen.socialcontact.alwayschat.chat.base.BaseFragment;
import com.shenzhen.socialcontact.alwayschat.chat.ui.adapter.MainViewPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/4/26.
 * <p>
 * 首页主要frgment
 */

public class MainFragment extends BaseFragment
{

    @BindView(R.id.main_tabs)
    TabLayout mainTabs;
    @BindView(R.id.main_viewpager)
    ViewPager mainViewpager;

    @Override
    protected void initDagger()
    {

    }

    @Override
    protected int getContentViewId()
    {
        return R.layout.layout_main_fragment;
    }

    @Override
    protected void initViewsAndEvents(View rootView)
    {
        setupViewPager();
        mainTabs.setupWithViewPager(mainViewpager);
    }

    private void setupViewPager()
    {
        MainViewPagerAdapter adapter = new MainViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new FollowLiveFragment(), "关注");
        adapter.addFragment(new HotLiveFragment(), "热门");
        adapter.addFragment(new NearbyLiveFragment(), "附近");
        mainViewpager.setAdapter(adapter);
    }

}
