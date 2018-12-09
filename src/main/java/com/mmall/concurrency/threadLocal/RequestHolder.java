/*
 * RequestHolder.java  * Created on  2018/12/9
 * Copyright (c) 2018 YueTu
 * YueTu TECHNOLOGY CO.,LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * YueTu Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with YueTu Ltd.
 */
package com.mmall.concurrency.threadLocal;

/**
 * @author ling.zhang
 */
public class RequestHolder {

    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void add(Long id){
        threadLocal.set(id);
    }

    public static Long getId(){
        return threadLocal.get();
    }

    public static void remove(){
        threadLocal.remove();
    }
}
