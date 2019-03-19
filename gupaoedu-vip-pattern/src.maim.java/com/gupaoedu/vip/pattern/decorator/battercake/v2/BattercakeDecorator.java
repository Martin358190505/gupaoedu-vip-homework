package com.gupaoedu.vip.pattern.decorator.battercake.v2;

/**
 * 煎饼装饰者继承至煎饼抽象，所以它还是一个煎饼，同事他持有一个煎饼的引用
 * Created by Tom on 2019/3/17.
 */
public abstract class BattercakeDecorator extends Battercake {

    //静态代理，委派 它引用了原有的一个煎饼
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
