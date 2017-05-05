package com.shenzhen.socialcontact.alwayschat.chat.share;

import com.cocosw.favor.FavorAdapter;
import com.shenzhen.socialcontact.alwayschat.base.Chat;


/**
 * 数据保存相关类
 * <p>
 * Created by Administrator on 2017/4/26.
 */

public class Share
{
    public static ShareData get()
    {
        return new FavorAdapter.Builder(Chat.app()).build().create(ShareData.class);
    }
}
