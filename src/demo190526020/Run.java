package demo190526020;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-26 16:01
 * Description: run类
 */
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA aThread = new ThreadA(numRef);
        aThread.start();

        ThreadB bThread = new ThreadB(numRef);
        bThread.start();
    }

}
