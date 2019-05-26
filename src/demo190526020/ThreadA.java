package demo190526020;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-26 15:55
 * Description: 线程A类
 */
public class ThreadA extends Thread{

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }

}
