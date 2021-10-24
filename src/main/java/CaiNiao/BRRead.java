package CaiNiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/10 5:11 下午
 * @Version 1.0
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按q退出！");

        do{
            c = (char) br.read();
            System.out.println(c);

        }while (c != 'q');
    }
}
