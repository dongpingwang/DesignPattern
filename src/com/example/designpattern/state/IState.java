package com.example.designpattern.state;

/**
 * Author: Dongping Wang
 * Date: 2020/12/14
 * Description:状态接口
 */
public interface IState {
    void doing();
    void setContext(Context context);
}
