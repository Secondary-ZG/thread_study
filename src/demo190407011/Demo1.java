package demo190407011;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-07 15:13
 * Description: 能停止的线程，暴力停止
 */
public class Demo1 extends Thread {

    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i ++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用stop()方法停止线程是非常暴力的
     * @param args
     */
    public static void main(String[] args) {
        try {
            Demo1 demo1 = new Demo1();
            demo1.start();
            Thread.sleep(8000);
            demo1.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
