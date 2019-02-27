package demo_190102_002;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/2 1:35 PM
 * Description: 执行start()方法
 */
public class Demo2 extends Thread{

    private int i;

    public Demo2(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Demo2 d1 = new Demo2(1);
        Demo2 d2 = new Demo2(2);
        Demo2 d3 = new Demo2(3);
        Demo2 d4 = new Demo2(4);
        Demo2 d5 = new Demo2(5);
        Demo2 d6 = new Demo2(6);
        Demo2 d7 = new Demo2(7);
        Demo2 d8 = new Demo2(8);
        Demo2 d9 = new Demo2(9);
        Demo2 d10 = new Demo2(10);
        Demo2 d11 = new Demo2(11);
        Demo2 d12 = new Demo2(12);
        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
        d6.start();
        d7.start();
        d8.start();
        d9.start();
        d10.start();
        d11.start();
        d12.start();
    }

}
