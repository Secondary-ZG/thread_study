package demo_181230_1;

/**
 * Java Class
 * Created By Secondary
 * On 2018/12/30 4:22 PM
 * Description: 继承Thread类(线程调用的随机性)
 */
public class Demo_2 extends Thread {

    /**
     * 1、在Java的JDK开发包中，已经自带了对多线程技术的支持，可以很方便的进行多线程编程.
     * 2、实现多线程的方式主要有两种：
     *     1）继承Thread类.
     *     2) 实现Runnable接口.
     * 3、使用继承Threadl类的方式创建线程时，最大的局限就是不支持多继承，因为Java语言的
     * 特点就是单根继承，所以为了支持多继承，完全可以已实现Runnable接口的方式，一边
     * 继承一边实现.
     */
    @Override
    public void run(){
        super.run();
        System.out.println("Demo_2");
    }

    /**
     * 1、在控制台输出的结果可以发现Demo_2.java类中的run()方法执行的时间比较晚，这也说明
     * 在使用多线程技术时，代码的运行结果与代码执行顺序或调用顺序是无关的.
     * 2、线程是一个子任务，CPU以不确定的方式，或者说是以随机的时间来调用线程中的run()方法
     * 所以就会出现此结果.
     * 注意:如果多次调用start()方法，则会出现异常
     * @param args
     */
    public static void main(String[] args) {
        Demo_2 demo_2 = new Demo_2();
        demo_2.start();
        System.out.println("运行结束!");
    }

}
