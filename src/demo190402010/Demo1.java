package demo190402010;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-02 19:25
 * Description: 异常法停止线程
 */
public class Demo1 extends Thread{

    @Override
    public void run() {
        super.run();
        for(int i=0; i<500000; i++) {
            if (interrupted()) {
                System.out.println("已经是停止状态了！ 我要退出了！");
                break;
            }

            System.out.println("i = " + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            Demo1 demo1 = new Demo1();
            demo1.start();
            Thread.sleep(2000);
            demo1.interrupt();
        } catch(InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
