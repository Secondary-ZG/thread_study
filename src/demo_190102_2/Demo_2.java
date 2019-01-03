package demo_190102_2;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/2 1:35 PM
 * Description: 执行start()方法
 */
public class Demo_2 extends Thread{

    private int i;

    public Demo_2(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Demo_2 d1 = new Demo_2(1);
        Demo_2 d2 = new Demo_2(2);
        Demo_2 d3 = new Demo_2(3);
        Demo_2 d4 = new Demo_2(4);
        Demo_2 d5 = new Demo_2(5);
        Demo_2 d6 = new Demo_2(6);
        Demo_2 d7 = new Demo_2(7);
        Demo_2 d8 = new Demo_2(8);
        Demo_2 d9 = new Demo_2(9);
        Demo_2 d10 = new Demo_2(10);
        Demo_2 d11 = new Demo_2(11);
        Demo_2 d12 = new Demo_2(12);
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
