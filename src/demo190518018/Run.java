package demo190518018;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-18 09:38
 * Description: 线程的优先级具有规则性执行类
 */
public class Run {

    /**
     * 优先级高的先执行完
     * @param args
     */
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            Demo1 demo1 = new Demo1();
            demo1.setPriority(10);
//            demo1.setPriority(1);
            demo1.start();

            Demo2 demo2 = new Demo2();
            demo2.setPriority(1);
//            demo2.setPriority(10);
            demo2.start();
        }
    }

}
