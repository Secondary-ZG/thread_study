package demo190402010;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-02 19:32
 * Description: 线程停止仍旧执行之后的代码
 */
public class Demo2 extends Thread {

    Integer max = 500000;

    @Override
    public void run() {
        super.run();
        for (int i=0; i<max; i++) {
            if (interrupted()) {
                System.out.println("已经是停止状态了！我要退出了！");
                break;
            }
            System.out.println("i = " + (i + 1));
        }
        System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
    }

    public static void main(String[] args) {

        try {
            Demo2 demo2 = new Demo2();
            demo2.start();
            Thread.sleep(2000);
            demo2.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

}
