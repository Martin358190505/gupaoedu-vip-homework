package com.gupaoedu.vip.pattern.decorator.battercake.v2;

/**
 * 基础煎饼继承至煎饼抽象类
 * Created by Tom on 2019/3/17.
 */
public class BaseBattercake extends Battercake {
    protected String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }
}
