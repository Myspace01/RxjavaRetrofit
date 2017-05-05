package com.shenzhen.socialcontact.alwayschat.base;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Administrator on 2017/4/26.
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext
{
}
