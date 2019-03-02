package demo190302009;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-03-02 13:23
 * Description: 判断线程是否是停止状态
 */
public class Demo2 extends Thread {

    private int length = 500000;

    @Override
    public void run(){
        super.run();
        for (int i=0; i<length; i++) {
            System.out.println("i = " + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            Demo2 demo2 = new Demo2();
            demo2.start();
            Thread.sleep(1000);
            demo2.interrupt();
            System.out.println("是否停止 1 ？ = " + demo2.isInterrupted());
            System.out.println("是否停止 2 ？ = " + demo2.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
