package com.shenzhen.socialcontact.alwayschat.chat.share;

/**
 * 数据保存相关类
 * <p>
 * Created by Administrator on 2017/4/26.
 */
import com.cocosw.favor.AllFavor;
import com.cocosw.favor.Default;
import com.cocosw.favor.Favor;

/**
 * 数据保存在sharepreference中
 */

@AllFavor
public interface ShareData
{
    String DEVICE_ID = "deviceId";//设备序列号


    @Default("")
    @Favor(DEVICE_ID)
    void saveDeviceId(String deviceId);
    /**
     * 获取设备id
     *
     * @return 设备id
     */
    @Default("")
    @Favor(DEVICE_ID)
    String getDeviceId();
}
