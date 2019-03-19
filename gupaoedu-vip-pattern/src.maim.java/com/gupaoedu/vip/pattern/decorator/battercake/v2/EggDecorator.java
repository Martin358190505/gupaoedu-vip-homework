package com.gupaoedu.vip.pattern.decorator.battercake.v2;

/**
 * 鸡蛋装饰者他继承至煎饼装饰者，所以他还是一个煎饼
 * Created by Tom on 2019/3/17.
 */
public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
