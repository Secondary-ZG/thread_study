package demo_190119_006;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/19 1:33 PM
 * Description: isAlive()方法
 */
public class Demo_4 extends Thread {

    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }

    /**
     * 1、方法isAlive()的作用是测试线程是否处于活动状态
     * 2、什么是活动状态呢？
     *      活动状态就是线程已经启动尚未终止
     * 3、线程处于运行或者准备开始运行的状态，就认为线程是存活的
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {

//        注：
//          System.out.println("end  = " + this.isAlive());
//          虽然代码打印的值是true，但此职是不确定的。打印true是因为demo_4线程还没有执行完毕，所以输出true
        Demo_4 demo_4 = new Demo_4();
        System.out.println("begin = " + demo_4.isAlive());
        demo_4.start();
        System.out.println("end = " + demo_4.isAlive());

//        System.out.println("分----------割------------线");

//        此段代码中的运行结果为false，因为demo_4对象已经在1秒之内执行完毕了
//        Demo_4 demo_41 = new Demo_4();
//        System.out.println("begin = " + demo_41.isAlive());
//        demo_41.start();
//        Thread.sleep(1000);
//        System.out.println("end = " + demo_41.isAlive());
    }
}
