package demo190428014;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-28 21:19
 * Description: 异常:独占锁
 */
public class Demo1 extends Thread{

    private long i = 0;
    @Override
    public void run(){
        while (true) {
            i++;
        }
    }

    /**
     * 输出 "main end"
     * @param args
     */
    public static void main(String[] args) {
        try {
            Demo1 demo1 = new Demo1();
            demo1.start();
            Thread.sleep(1000);
            demo1.suspend();
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
