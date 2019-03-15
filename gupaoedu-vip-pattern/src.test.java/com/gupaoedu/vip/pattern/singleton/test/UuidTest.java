/**
 * 
 */
package com.gupaoedu.vip.pattern.singleton.test;

import java.util.UUID;

/**
 * ClassName: UuidTest 
 * @Description: TODO
 * <p>Title: UuidTest.java</p>
 * @author: chenyufeng
 * @version V1.0
 * @see     java.lang.Class  
 * @since   JDK{jdk1.6} 
 */
public class UuidTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        UUID uuid=UUID.randomUUID();
        String uuidNew=uuid.toString().toUpperCase().replace("-", "");
        System.out.println(uuidNew);
        System.out.println(uuidNew.length());//去掉-的话是32位的

    }

}
