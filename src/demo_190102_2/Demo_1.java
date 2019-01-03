package demo_190102_2;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/2 9:16 AM
 * Description: 线程的随机性
 */
public class Demo_1 extends Thread{

    /**
     * 1、Thread.java中的start()方法通知"线程规划器"此线程已经准备就绪，
     * 等待调用线程对象的run()方法，这个过程其实就是让系统安排一个时间来
     * 调用Thread中的run()方法，也就是使线程得到运行，启动线程，具有异
     * 步执行的效果.
     * 2、如果调用代码thread.run()就不是异步执行了，而是同步，那么此线
     * 程对象并不交给"线程规划器"来处理，而是由main主线程来调用run()方
     * 法，也就是必须等run()方法中的代码执行完后才可以执行后面的代码.
     */
    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Demo_1 demo_1 = new Demo_1();
            demo_1.setName("Demo_1");
            demo_1.start();
            for (int i=0; i<10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
