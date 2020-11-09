package com.example.designpattern.proxy.comm;

/**
 * Author: Dongping Wang
 * Date: 2020/11/8
 * Description:黄牛
 */
public class Scalper implements IMiPhone {

    private IMiPhone miFan;

    public Scalper() {
        this(new MiFan());
    }

    private Scalper(IMiPhone miFan) {
        this.miFan = miFan;
    }

    @Override
    public void buy() {
        miFan.buy();
        addMoney();
        System.out.println("给你买个红米K30s至尊纪念版");
    }

    private void addMoney() {
        System.out.println("加价300!");
    }

    private void ad(){
        System.out.println("我的QQ是6666，下次找我更优惠哈");
    }
}
