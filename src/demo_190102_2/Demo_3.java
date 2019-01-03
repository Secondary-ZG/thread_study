package demo_190102_2;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/2 1:49 PM
 * Description: 实现Runnable接口
 * 1、如果欲创建的线程类已经有一个父类了，这时就不能再继承自Thread类了
 * 因为Java不支持多继承，所以就需要实现Runnable接口应对这样的情况
 */
public class Demo_3 implements Runnable{

    @Override
    public void run() {
        System.out.println("运行中！");
    }

    /**
     * Thread.java类的构造函数:
     *      I、、
     * @param args
     */
    public static void main(String[] args) {
        Runnable runnable = new Demo_3();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
