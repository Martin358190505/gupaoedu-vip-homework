package com.gupaoedu.vip.pattern.proxy.staticproxy;

import com.gupaoedu.vip.pattern.proxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class Son implements Person{

    public int findLove(){
        System.out.println("儿子要求：肤白貌美大长腿");
        return 0;
    }

    public void findJob(){

    }

    public void eat(){

    }

}
