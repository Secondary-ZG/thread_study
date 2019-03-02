package demo190302009;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-03-02 13:13
 * Description: 停止线程
 */
public class Demo1 extends Thread{

    private int length = 500000;

    @Override
    public void run(){
        super.run();
        for (int i=0; i<length; i++) {
            System.out.println("i = " + (i + 1));
        }
    }

    /**
     * 结果发现interrupt()方法并没有停止线程
     * @param args
     */
    public static void main(String[] args) {
        try {
            Demo1 demo1 = new Demo1();
            demo1.start();
            Thread.sleep(2000);
            demo1.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }

}
