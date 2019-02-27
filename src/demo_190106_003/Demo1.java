package demo_190106_003;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/6 15:02
 * Description: 实例变量与线程安全
 * 自定义线程类中的实例变量针对其他线程可以有共享与不共享之分，
 * 这在多个线程之间进行交互是很重要的技术点不共享数据的情况
 */
public class Demo1 extends Thread {

    private int count = 5;

    public Demo1(String name) {
        super();
        this.setName(name);//设置线程名称
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count --;
            System.out.println("由" +
                    this.currentThread().getName()
                    + " 计算，count=" + count
            );
        }
    }

    /**
     * 此示例并不存在多个线程访问同一个实例变量的情况
     * @param args
     */
    public static void main(String[] args) {
        Demo1 a = new Demo1("A");
        Demo1 b = new Demo1("B");
        Demo1 c = new Demo1("C");
        a.start();
        b.start();
        c.start();
    }

}
