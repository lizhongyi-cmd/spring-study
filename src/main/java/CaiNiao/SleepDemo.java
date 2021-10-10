package CaiNiao;

import java.util.Date;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/10 4:06 下午
 * @Version 1.0
 */
public class SleepDemo {
    public static void main(String[] args) {
        try{
            System.out.println(new Date() + "\n");
            Thread.sleep(1000*3);
            System.out.println(new Date() + "\n");

        }catch (Exception e){
            System.out.println("捕获一个异常");
        }
    }
}
