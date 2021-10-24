package CaiNiao;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/23 11:50 上午
 * @Version 1.0
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        MyThread myThread = new MyThread();
        myThread.run();
        while (true){
            System.out.println("main方法正在执行！");
        }
    }

}

class MyThread {
    public void run(){
        while(true){
            System.out.println("mythread 类的run方法正在运行");
        }
    }
}
