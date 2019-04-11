package demo190407011;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-07 16:42
 * Description: 使用return停止线程
 */
public class Demo4 extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了！");
                return;
            }

            System.out.println("timer = " + System.currentTimeMillis());
        }
    }

    /**
     * 虽然return的方法可以停止线程，但是还是推荐使用"抛异常"的方法来实现线程的停止，因为在catch块中还可以将异常向上抛，使线程停止的事件
     * 得以传播。
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Demo4 demo4 = new Demo4();
        demo4.start();
        Thread.sleep(2000);
        demo4.interrupt();
    }

}
