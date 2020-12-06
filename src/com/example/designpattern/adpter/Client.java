package com.example.designpattern.adpter;

/**
 * Author: Dongping Wang
 * Date: 2020/12/6
 * Description:情景类
 */
public class Client {
    public static void main(String[] args) {

        // 前几年手机都用3.5mm耳机听歌，旧代码是这样的
        // EarPhone_35MM earPhone35MM = new EarPhone_35MM();
        // earPhone35MM.listenMusic();
        // 现在手机基本没有3.5mm耳机孔了，需要用转换器将3.5mm接口转换成type-c
        EarPhoneAdapter earPhone =  new EarPhoneAdapter();
        earPhone.listenMusic();
    }
}
