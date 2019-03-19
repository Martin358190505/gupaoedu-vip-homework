package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.HaierTelevision;
import com.gupaoedu.vip.pattern.factory.TCLTelevision;
import com.gupaoedu.vip.pattern.factory.ITelevision;

/**
 * 小作坊式的工厂模型
 * Created by Tom.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();

//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("com.gupaoedu.vip.pattern.factory.JavaCourse");
//        course.record();

//        CourseFactory factory = new CourseFactory();
//        ICourse course = factory.create(JavaCourse.class);
//        course.record();
    	
    	TelevisionFactory factory = new TelevisionFactory();
    	ITelevision television1=factory.create(HaierTelevision.class);
    	television1.playVideo();
    	ITelevision television2=factory.create(TCLTelevision.class);
    	television2.playVideo();
    }
}
