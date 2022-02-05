package CaiNiao;

/**
 * @作者: lizhongyi
 * @功能描述：线程优先级
 * @日期: 2021/10/24 5:12 下午
 * @版本 1.0
 */
public class ThreadDemo7 {
    public static void main(String[] args) {
        Thread minPriority = new Thread(new MinPriority(),"优先级较低的线程");
        Thread maxPriority = new Thread(new MaxPriority(),"优先级较高的线程");
        minPriority.setPriority(1);
        maxPriority.setPriority(10);
        minPriority.start();
        maxPriority.start();

    }
    static class MaxPriority implements Runnable{
        public void run(){
            for(int i=0; i<10;i++){
                System.out.println(Thread.currentThread().getName() + "正在输出：" + i);
            }
        }
    }
    static class MinPriority implements Runnable{
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "正在输出：" + i);
            }
        }
    }
}
