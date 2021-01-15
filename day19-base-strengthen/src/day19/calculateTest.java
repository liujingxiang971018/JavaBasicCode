package day19;

import day19.demo01junit.calculate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculateTest {
    /*
    * 初始化方法：用于资源申请，所有测试方法在执行之前都会先执行该方法
    * */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /*
    * 释放资源的方法：用于测试方法结束之后，都会自动执行该方法
    * */
    @After
    public void close(){
        System.out.println("close...");
    }


    //必须添加注解
    @Test
    public void testAdd(){
//        System.out.println("我被执行");
    //1、创建对象
         calculate c=new calculate();
         //2、调用方法
         int result=c.Add(1,2);
         int re=c.Sub(1,2);
/*        System.out.println(result);
        System.out.println(re);*/
//        3、断言：我断言这个结果为3,
        Assert.assertEquals(3,result);
    }
}
