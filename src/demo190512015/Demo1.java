package demo190512015;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-12 14:01
 * Description: suspend与resume方法的不同步实现
 */
public class Demo1 {

    public static void main(String[] args) throws InterruptedException {

        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread(() -> myObject.setValue("a", "aa"));

        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);

        Thread thread2 = new Thread(() -> myObject.printUserNamePassword());
        thread2.start();
    }

}
