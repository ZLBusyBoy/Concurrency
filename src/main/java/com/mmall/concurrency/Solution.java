/*
 * Solution.java  * Created on  2018/12/3
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

import org.springframework.util.StringUtils;

/**
 * @author ling.zhang
 */
public class Solution {

    public static void main(String[] args) {
        String abcabcbb = "dvdf";
        System.out.println(lengthOfLongestSubstring(abcabcbb));
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 1){
            return 0;
        }
        char[] chars = s.toCharArray();
        char[] maxChar = new char[chars.length];
        int cursor = 0;
        int maxLength = 0;
        for (char element :chars){
            if (maxLength == 0 && cursor == 0){
                maxChar[cursor] = element;
                cursor++;
                if (cursor > maxLength) {
                    maxLength = cursor;
                }
            }else {
                for (int i=0;i<cursor;i++){
                    char old = maxChar[i];
                    if (old == element){
                        maxChar = new char[chars.length];
                        if (cursor > maxLength) {
                            maxLength = cursor;
                        }
                        maxChar[0] = element;
                        cursor=1;
                        break;
                    }else {
                        if (i+1 >= cursor){
                            maxChar[cursor] = element;
                            cursor++;
                            if (cursor > maxLength) {
                                maxLength = cursor;
                            }
                            break;
                        }
                        continue;
                    }
                }

            }
        }
        return maxLength;
    }
}
