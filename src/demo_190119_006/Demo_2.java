package demo_190119_006;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/19 1:09 PM
 * Description:run方法启动获取currentThread名称
 */
public class Demo_2 extends Thread {

    public Demo_2() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Demo_2 demo_2 = new Demo_2();
        demo_2.run();
    }

}
