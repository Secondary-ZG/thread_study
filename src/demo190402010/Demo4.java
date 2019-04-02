package demo190402010;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-02 21:11
 * Description: 沉睡中停止线程 (清楚停止状态)
 */
public class Demo4 extends Thread {

    private Integer max = 500000;

    @Override
    public void run() {
        super.run();
        try{
            System.out.println("run begin");
            Thread.sleep(200000);
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch！" + this.isInterrupted());
            e.printStackTrace();
        }
    }

    /**
     * 从打印的结果来看，如果在sleep状态下停止某一个线程，会进入catch语句，并且清楚停止状态值，使之变成false
     * @param args
     */
    public static void main(String[] args) {
        try{
            Demo4 demo4 = new Demo4();
            demo4.start();
            Thread.sleep(200);
            demo4.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch!");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

}
