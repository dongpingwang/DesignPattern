package com.example.designpattern.adpter;

/**
 * Author: Dongping Wang
 * Date: 2020/12/6
 * Description:
 */
public class EarPhoneAdapter extends EarPhoneAdatee implements IEarPhone {

    @Override
    public void listenMusic() {
        convert();
        new EarPhone_TypeC().listenMusic();
    }

}
