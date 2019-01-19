package demo_190119_006;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/19 2:06 PM
 * Description: Thread.currentThread和this的差异比较
 */
public class Demo_5 extends Thread {

    public Demo_5() {
        System.out.println("Demo_5---begin");
        System.out.println("Thread.currentThread.getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread.isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("Demo_5---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread.getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread.isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("run---end");
    }

    public static void main(String[] args) {
        Demo_5 demo_5 = new Demo_5();
        Thread thread = new Thread(demo_5);
        System.out.println("main begin thread isAlive = " + thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main end thread isAlive = " + thread.isAlive());
    }

}
