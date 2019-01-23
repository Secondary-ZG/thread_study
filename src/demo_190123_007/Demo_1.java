package demo_190123_007;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/19 3:59 PM
 * Description: sleep()方法
 * 方法sleep()的作用是在指定的毫秒数内让当前"正在执行的线程"休眠（暂停执行）。这个"正在执行的线程"是指
 * this.currentThread()返回的线程
 */
public class Demo_1 extends Thread {

    @Override
    public void run() {
        try{
            System.out.println("run threadName = " + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName = " + this.currentThread().getName() + " end");
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Demo_1 demo_1 = new Demo_1();
        System.out.println("begin = " + System.currentTimeMillis());
        demo_1.run();
        System.out.println("end = " + System.currentTimeMillis());
    }

}
