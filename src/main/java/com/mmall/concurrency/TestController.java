/*
 * TestController.java  * Created on  2018/12/2
 * Copyright (c) 2018 YueTu
 * YueTu TECHNOLOGY CO.,LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * YueTu Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with YueTu Ltd.
 */
package com.mmall.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ling.zhang
 */
@Controller
@Slf4j
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
