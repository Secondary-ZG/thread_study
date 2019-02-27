package demo_190102_002;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/2 1:49 PM
 * Description: 实现Runnable接口
 * 1、如果欲创建的线程类已经有一个父类了，这时就不能再继承自Thread类了
 * 因为Java不支持多继承，所以就需要实现Runnable接口应对这样的情况
 */
public class Demo3 implements Runnable{

    @Override
    public void run() {
        System.out.println("运行中！");
    }

    /**
     * Thread.java类的8个构造函数中，有两个构造函数Thread(Runnable target)
     * 和Thread(Runnable target, String name)可以传递Runnable接口，说明
     * 构造函数支持传入一个Runnable接口的对象.
     *
     * 运行类如下:
     * @param args
     */
    public static void main(String[] args) {
        Runnable runnable = new Demo3();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }

    /**
     * 注：
     *   1、使用Thread类的方式来开发多线程应用程序在设计上是有局限性的，
     *   因为Java是单根继承，不支持多继承，所以为了改变这种限制，可以使
     *   用实现Runnable接口的方式来实现多线程技术。
     *   2、另外还需要说明的是，Thread.java类也实现了Runnable接口，
     *   那就意味着构造函数Thread(Runnable target)不光可以传入Runnable
     *   接口的对象，还可以传入一个Thread类的对象，这样完全可以将一个
     *   Thread对象中的run()方法交由其他的线程进行调用.
     */
}
