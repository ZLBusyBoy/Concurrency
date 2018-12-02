/*
 * ThreadSafe.java  * Created on  2018/12/2
 * Copyright (c) 2018 YueTu
 * YueTu TECHNOLOGY CO.,LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * YueTu Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with YueTu Ltd.
 */
package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ling.zhang
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSafe {

    String value() default "";
}