package demo190526020;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-26 16:01
 * Description: run类
 */
public class Run {

    /**
     * 本实例是两个线程同时访问一个并非同步的方法，如果两个线程同时操作业务对象中的实例变量，则有可能出现"非线程安全"问题，
     * 解决此问题只需要在方法前加上关键字synchronized，即表示此方法为同步方法
     * @param args
     */
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA aThread = new ThreadA(numRef);
        aThread.start();

        ThreadB bThread = new ThreadB(numRef);
        bThread.start();
    }

}
