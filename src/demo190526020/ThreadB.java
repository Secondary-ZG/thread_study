package demo190526020;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-26 15:58
 * Description: 线程B类
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
