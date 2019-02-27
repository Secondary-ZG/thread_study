package demo190106003;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/6 15:18
 * Description: 实例变量与线程安全
 * 共享数据的情况
 */
public class Demo2 extends Thread {

    private int count = 5;

    /**
     * 此示例不要用for语句，因为使用同步后其他线程就得不到
     * 运行的机会了，一直由一个线程进行减法运算
     *
     */
    @Override
    public void run() {
        super.run();
        count --;
        System.out.println("由" +
                this.currentThread().getName()
                + " 计算，count=" + count
        );
    }

    /**
     * 由A 计算，count=3
     * 由C 计算，count=2
     * 由B 计算，count=3
     * 由D 计算，count=1
     * 由E 计算，count=0
     *
     * 从打印的结果中可以看出有两个线程同时对count进行了处理，
     * 产生了“非线程安全”问题，而我们想要得到的打印结果却不是
     * 重复的，而是一次递减的。在某些JVM中，i--操作要分成如下3步：
     *    1）取得原有i值.
     *    2）计算i-1.
     *    3）对i进行赋值.
     * 在这3个步骤中，如果有多个线程同时访问，那么一定会出现非线程安全问题
     * @param args
     */
    public static void main(String[] args) {
        Demo2 demo_2 = new Demo2();
        Thread a = new Thread(demo_2, "A");
        Thread b = new Thread(demo_2, "B");
        Thread c = new Thread(demo_2, "C");
        Thread d = new Thread(demo_2, "D");
        Thread e = new Thread(demo_2, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

}
