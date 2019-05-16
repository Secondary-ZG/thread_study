package demo190119006;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/19 1:12 PM
 * Description: 线程传参动态获取currentThread名称
 */
public class Demo3 extends Thread {

    public Demo3() {
        System.out.println("Demo1---begin");
        System.out.println("Thread.currentThread.getName() = " + Thread.currentThread().getName());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("Demo1---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread.getName() = " + Thread.currentThread().getName());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("run---end");
    }

    public static void main(String[] args) {
        Demo3 demo_3 = new Demo3();
        Thread thread = new Thread(demo_3);
        thread.setName("A");
        thread.start();
    }
}
