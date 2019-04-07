package demo190407011;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-07 15:25
 * Description: 方法stop()与java.lang.ThreadDeath 异常
 */
public class Demo2 extends Thread {

    @Override
    public void run() {

        try {
            //调用stop()方法时会抛出java.lang.TreadDeath异常，但在通常情况下，此异常不需要显示地捕捉
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入到catch()方法了");
            e.printStackTrace();
        }

    }

    /**
     * 方法stop()已经被作废，因为如果强制让线程停止则有可能使一些清理性的工作得不到完成。另外一个情况就是
     * 对锁定的对象进行了"解锁"，导致数据得不到同步的处理，出现数据不一致的问题。
     * @param args
     */
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.start();
    }

}
