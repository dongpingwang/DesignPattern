package com.example.designpattern.proxy.force;

/**
 * Author: Dongping Wang
 * Date: 2020/11/8
 * Description:黄牛
 */
public class Scalper implements IMiPhone {

    private IMiPhone miFan;

    public Scalper(IMiPhone miFan) {
        this.miFan = miFan;
    }

    @Override
    public void buy() {
        miFan.buy();
    }

    @Override
    public IMiPhone getProxy() {
        return this;
    }
    
}
