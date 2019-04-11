package demo190411012;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-11 21:44
 * Description: 暂停线程（suspend与resume的方法的使用）
 */
public class Demo1 extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }

    /**
     * 介绍如何使用suspended和resume方法
     * @param args
     */
    public static void main(String[] args) {
        try {
            Demo1 demo1 = new Demo1();
            demo1.start();
            Thread.sleep(5000);
            //A段
            demo1.suspend();
            System.out.println("A = " + System.currentTimeMillis() + " i = " + demo1.getI());
            Thread.sleep(5000);
            System.out.println("A = " + System.currentTimeMillis() + " i = " + demo1.getI());

            //B段
            demo1.resume();
            Thread.sleep(5000);

            //C段
            demo1.suspend();
            System.out.println("B = " + System.currentTimeMillis() + " i = " + demo1.getI());
            Thread.sleep(5000);
            System.out.println("B = " + System.currentTimeMillis() + " i = " + demo1.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
