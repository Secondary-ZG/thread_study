package demo_190116_004;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/16 4:39 PM
 * Description: 线程同步
 */
public class Demo_1 extends Thread {

    private int count = 5;

    /**
     * 1、通过在run方法前加入synchronized关键字，使线程在执行run方法时，以排队的方式进行处理，
     * 当一个线程调用run前，先判断run方法有没有被上锁，如果上锁证明有其他的线程在调用此run方法，
     * 必须等其他线程对run方法调用结束后才可以执行run方法，这样也就实现了排队调用run方法的目的
     * 也就达到了按顺序对count变量减1的效果了。2、synchronized关键字可以在任意对象及方法上加
     * 锁，而加锁的这段代码被称为"互斥区"或"临界区"。
     * 3、当一个线程想要执行同步方法里面的代码时，线程首先尝试去拿这把锁，如果能够拿到这把锁，
     * 那么这个线程就可以执行synchronized里面的代码，如果不能拿到这把锁，那么这个线程就会不断
     * 去尝试拿这把锁，直到拿到为止，而且是多个线程同时去争抢这把锁
     */
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由" +
                this.currentThread().getName()
                + " 计算，count=" + count
        );
    }

    public static void main(String[] args) {
        Demo_1 demo_1 = new Demo_1();
        Thread a = new Thread(demo_1, "A");
        Thread b = new Thread(demo_1, "B");
        Thread c = new Thread(demo_1, "C");
        Thread d = new Thread(demo_1, "D");
        Thread e = new Thread(demo_1, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

}
