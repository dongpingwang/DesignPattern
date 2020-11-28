package com.example.designpattern.chain;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description: 战争，对应请求
 */
public interface IWar {
    int LEVEL_REGIMENT = 2;
    int LEVEL_BATTALION = 1;
    int LEVEL_COMPANY = 0;

    int getLevel();
}
