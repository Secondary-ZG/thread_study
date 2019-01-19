package demo_190119_006;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/19 1:04 PM
 * Description: start()方法启动获取currentThread名称
 */
public class Demo_1 extends Thread {

    public Demo_1() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Demo_1 demo_1 = new Demo_1();
        demo_1.start();
    }

}
