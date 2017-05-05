package com.shenzhen.socialcontact.alwayschat.base;

/**
 * Created by Administrator on 2017/4/26.
 * 
 * In Dagger, an unscoped component cannot depend on a scoped component. it is a scoped component ({@code @Singleton}, we create a custom
 * scope to be used by all fragment components. Additionally, a component with a specific scope
 * cannot have a sub component with the same scope.
 */

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity
{
}
