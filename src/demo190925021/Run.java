package demo190925021;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-06-22 14:45
 */
public class Run {

    /**
     * 此示例是两个线程分别访问同一个类的两个不同实例的相同名称的同步方法，效果却是以异步的方式运行的.
     * 本例由于创建了2个业务对象，在系统中产生了2个锁，所以运行结果是异步的，打印的效果是先打印b再打印a.
     * @param args
     */
    public static void main(String[] args) {

        HasSelfPrivateNum hasSelfPrivateNum1 = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNum2 = new HasSelfPrivateNum();

        ThreadA threadA = new ThreadA(hasSelfPrivateNum1);
        threadA.start();

        ThreadB threadB = new ThreadB(hasSelfPrivateNum2);
        threadB.start();
    }

    /**
     * 从上面的实例的运行结果来看，虽然在HasSelfPrivateNum.java中使用了synchronized关键字，但是打印的顺序
     * 却是不同步的，是交叉的. 因为关键字synchronized取得的锁都是对象锁，而不是把一段代码或者方法当作锁，所以
     * 在上面的实例中，哪个线程先执行带synchronized关键字的方法，哪个线程就持有该方法所属对象的锁Lock，那么其
     * 他线程只能呈等待状态，前提是多个线程访问的是同一个对象.如果多个线程访问多个对象，JVM会创建多个锁.
     */

}
