package demo190117005;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/17 1:16 PM
 * Description: System.out.println()的异常
 */
public class Demo1 extends Thread {

    private int i= 5;

    @Override
    public void run() {
        System.out.println("i = " + (i--) + " ThreadName = " + Thread.currentThread().getName());
    }


    /**
     * 1、验证虽然println()这个方法在内部是同步的:
     *                      public void println(String x) {
     *                          synchronized (this) {
     *                              print(x);
     *                              newLine();
     *                          }
     *                      }
     * 但是i--的操作却是在进入println()之前发生的，所以有引发非线程安全的概率的。
     * @param args
     */
    public static void main(String[] args) {

        Demo1 demo_1 = new Demo1();

        Thread thread1 = new Thread(demo_1);
        Thread thread2 = new Thread(demo_1);
        Thread thread3 = new Thread(demo_1);
        Thread thread4 = new Thread(demo_1);
        Thread thread5 = new Thread(demo_1);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
