package com.example.designpattern.proxy.force;

/**
 * Author: Dongping Wang
 * Date: 2020/11/8
 * Description:米粉
 */
public class MiFan implements IMiPhone {

    private Scalper scalper;

    @Override
    public void buy() {
        if (hasProxy()) {
            System.out.println("加价300!");
            System.out.println("给你买个红米K30s至尊纪念版");
        } else {
            System.out.println("自己完全抢不到啊，吼吼吼");
            System.out.println("找黄牛吧，呜呜呜~~");
        }
    }

    @Override
    public IMiPhone getProxy() {
        scalper = new Scalper(this);
        return scalper;
    }

    private boolean hasProxy() {
        return scalper != null;
    }

}
