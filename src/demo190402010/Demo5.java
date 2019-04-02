package demo190402010;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-02 21:22
 * Description: 沉睡中停止线程（先interrupt在sleep）
 */
public class Demo5 extends Thread{

    private Integer max = 1000000;

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < max; i++) {
                System.out.println("i = " + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到了sleep！进入catch！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        demo5.start();
        demo5.interrupt();
        System.out.println("end");
    }

}
