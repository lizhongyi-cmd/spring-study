package CaiNiao;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/24 3:36 下午
 * @Version 1.0
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        while (true){
            System.out.println("main 方法正在执行！");
        }


    }

     static class MyThread extends Thread {
        public void run(){
            while(true) {
                System.out.println("mythread 类的run方法正在执行！");
            }
        }
    }
}

