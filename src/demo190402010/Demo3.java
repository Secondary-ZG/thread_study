package demo190402010;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-02 20:55
 * Description: 异常法停止线程
 */
public class Demo3 extends Thread {

    private Integer max = 500000;

    /**
     * 使用异常的方法，暴力型的终止线程
     */
    @Override
    public void run() {
        super.run();
        try {
            for (int i=0; i<max; i++) {
                if (interrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i = " + (i + 1));
            }
            System.out.println("我在for下面");
        } catch (InterruptedException e) {
            System.out.println("进入了Demo3.java类run方法中的catch了！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            Demo3 demo3 = new Demo3();
            demo3.start();
            Thread.sleep(2000);
            demo3.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch!");
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
