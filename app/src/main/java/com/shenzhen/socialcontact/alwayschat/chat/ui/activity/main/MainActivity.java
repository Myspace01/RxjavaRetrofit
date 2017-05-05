package com.shenzhen.socialcontact.alwayschat.chat.ui.activity.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;

import com.shenzhen.socialcontact.alwayschat.R;
import com.shenzhen.socialcontact.alwayschat.chat.base.BaseActivity;
import com.shenzhen.socialcontact.alwayschat.chat.ui.fragment.main.MainFragment;
import com.shenzhen.socialcontact.alwayschat.chat.ui.fragment.main.MineFragment;
import com.shenzhen.socialcontact.alwayschat.widget.BottomMenu;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainContract.View
{
    @Inject
    MainPresent mainPresent;

    @BindView(R.id.botttom_home_item)
    BottomMenu botttomHomeItem;
    @BindView(R.id.directseeding_iv)
    ImageView directseedingIv;
    @BindView(R.id.botttom_mine_item)
    BottomMenu botttomMineItem;

    BottomMenu lastItme;

    /**
     * fragment管理
     */
    private FragmentManager mFragmentManager;
    private MainFragment mainFragment;
    private MineFragment mineFragment;
    private Fragment lastfragment;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentViewId()
    {
        return R.layout.activity_main;
    }

    @Override
    protected void injectDagger()
    {

        activityComponent().inject(this);
        mainPresent.attachView(this);
    }

    @Override
    protected void initViewsAndEvents()
    {
        mFragmentManager = getSupportFragmentManager();
        lastItme = botttomHomeItem;
        lastItme.selectMenu();
        mainFragment = new MainFragment();
        lastfragment = mainFragment;
        botttomHomeItem.setmFragment(mainFragment);
        mineFragment = new MineFragment();
        botttomMineItem.setmFragment(mineFragment);
        // 默认加载未支付
        showFragment(mainFragment);
    }


    @OnClick({R.id.botttom_home_item, R.id.directseeding_iv, R.id.botttom_mine_item})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.botttom_home_item:
                if (lastItme != botttomHomeItem)
                {
                    lastItme.unSelectMenu();
                    botttomHomeItem.selectMenu();
                    lastItme = botttomHomeItem;
                    showFragment(mainFragment);
                    lastfragment = mainFragment;
                }

                break;
            case R.id.directseeding_iv:
                break;
            case R.id.botttom_mine_item:
                if (lastItme != botttomMineItem)
                {
                    lastItme.unSelectMenu();
                    botttomMineItem.selectMenu();
                    lastItme = botttomMineItem;
                    showFragment(mineFragment);
                    lastfragment = mineFragment;
                }
                break;
        }
    }

    public void showFragment(Fragment fragment)
    {
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        if(lastfragment!=fragment);
        {
            transaction.hide(lastfragment);
            if (fragment.isAdded())
            {
                transaction.show(fragment).commit();
            }
            else
            {
                transaction.add(R.id.main_fl, fragment).show(fragment).commit();
            }
        }
    }
}
