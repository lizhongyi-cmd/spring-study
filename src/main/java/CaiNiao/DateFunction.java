package CaiNiao;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/10 3:56 下午
 * @Version 1.0
 */
public class DateFunction {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //转换时间格式
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为：" + ft.format(date));


    }
}
