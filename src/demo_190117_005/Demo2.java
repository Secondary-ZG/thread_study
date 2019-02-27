package demo_190117_005;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/17 1:42 PM
 * Description: currentThread()方法
 */
public class Demo2 extends Thread {

    /**
     * main方法被名为main的线程调用
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }

}
