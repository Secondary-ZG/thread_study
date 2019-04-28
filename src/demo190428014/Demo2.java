package demo190428014;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-28 21:29
 * Description: 异常:独占锁
 */
public class Demo2 extends Thread{

    private long i = 0;
    @Override
    public void run(){
        while (true) {
            i++;
            System.out.println(i);
        }
    }

    /**
     * 程序不再输出"main end"
     * 原因是：当程序运行到println()方法内部停止时，同步锁未被释放，这样导致当前PrintStream对象的println()方法一直呈"暂停"状态，并且
     * "锁未释放"，而main()方法中的System.out.println("main end");迟迟不能打印
     * @param args
     */
    public static void main(String[] args) {
        try {
            Demo2 demo2 = new Demo2();
            demo2.start();
            Thread.sleep(1000);
            demo2.suspend();
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
