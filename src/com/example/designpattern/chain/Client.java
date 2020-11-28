package com.example.designpattern.chain;

/**
 * Author: Dongping Wang
 * Date: 2020/11/28
 * Description:情景类
 */
public class Client {

    public static void main(String[] args) {
        // 开战请求
        IWar war = new War(IWar.LEVEL_COMPANY);
        // 处理链
        Regiment regiment = new Regiment(IWar.LEVEL_REGIMENT);
        Battalion battalion = new Battalion(IWar.LEVEL_BATTALION);
        Company company = new Company(IWar.LEVEL_COMPANY);
        regiment.setNext(battalion);
        battalion.setNext(company);
        // 执行请求
        regiment.war(war.getLevel());
    }
}
