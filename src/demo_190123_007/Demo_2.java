package demo_190123_007;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/23 1:55 PM
 * Description: 直接调用run()方法实例
 */
public class Demo_2 extends Thread {

    @Override
    public void run() {
        try{
            System.out.println("run ThreadName = " + this.currentThread().getName() + " begin = " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run ThreadName = " + this.currentThread().getName() + " end = " + System.currentTimeMillis());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    //由于main线程和Demo_2线程是异步执行的，所以先打印main线程中的"begin"和"end"，然后在执行Demo_2线程中的run()方法，打印"run begin"和"run end"
    public static void main(String[] args) {
        Demo_2 demo_2 = new Demo_2();
        System.out.println("begin = " + System.currentTimeMillis());
        demo_2.start();
        System.out.println("end = " + System.currentTimeMillis());
    }

}
