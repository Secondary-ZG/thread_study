package demo190516017;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-18 09:10
 * Description: 线程优先级的继承特性的执行类
 */
public class Run {

    public static void main(String[] args) {
        System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());
        Demo1 demo1 = new Demo1();
        demo1.start();
    }

}
