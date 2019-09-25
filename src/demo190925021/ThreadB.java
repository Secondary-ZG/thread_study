package demo190925021;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-06-22 14:44
 * Description:
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run(){
        super.run();
        hasSelfPrivateNum.addI("b");
    }
}
