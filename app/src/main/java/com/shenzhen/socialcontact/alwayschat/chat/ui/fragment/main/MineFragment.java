package com.shenzhen.socialcontact.alwayschat.chat.ui.fragment.main;

import android.view.View;

import com.shenzhen.socialcontact.alwayschat.R;
import com.shenzhen.socialcontact.alwayschat.chat.base.BaseFragment;
import com.shenzhen.socialcontact.alwayschat.widget.pulltozoomview.PullToZoomScrollViewEx;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/4/26.
 */

public class MineFragment extends BaseFragment
{
    @BindView(R.id.mine_scrollView)
    PullToZoomScrollViewEx mineScrollView;

    @Override
    protected void initDagger()
    {

    }

    @Override
    protected int getContentViewId()
    {
        return R.layout.layout_mine_fragment;
    }

    @Override
    protected void initViewsAndEvents(View rootView)
    {
        View headerview=View.inflate(mContext,R.layout.widget_profile_headview,null);
        View zoomview=View.inflate(mContext,R.layout.widget_zoomview,null);
        View contentview=View.inflate(mContext,R.layout.widget_profile_contentview,null);

        mineScrollView.setHeaderView(headerview);
        mineScrollView.setZoomView(zoomview);
        mineScrollView.setScrollContentView(contentview);

    }
}
