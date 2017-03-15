package com.qay.qbase.dagger.app;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

/**
 * Created by Qay on 2017/3/15.
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface QualifiedScope {
    /** The name. */
    String value() default "";
}
