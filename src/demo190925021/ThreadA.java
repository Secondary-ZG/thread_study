package demo190925021;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-06-22 14:41
 * Description:
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;

    ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run(){
        super.run();
        hasSelfPrivateNum.addI("a");
    }

}
