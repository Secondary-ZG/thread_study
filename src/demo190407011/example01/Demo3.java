package demo190407011.example01;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-07 16:03
 * Description:
 */
public class Demo3 extends Thread {

    private SynchronizedObject synchronizedObject;

    public Demo3(SynchronizedObject synchronizedObject) {
        super();
        this.synchronizedObject = synchronizedObject;
    }

    @Override
    public void run() {
        synchronizedObject.printString("b", "bb");
    }

    /**
     * 使用stop()释放锁将会给数据造成不一致性的结果。如果出现这种情况，程序处理的数据就有可能遭到破坏，最终导致程序执行的流程错误。
     * 由于stop()方法已经在JDK中被标明是"作废/过期"的方法，显然他在功能上具有缺陷，所以不建议在程序中使用stop()方法
     * @param args
     */
    public static void main(String[] args) {
        try {
            SynchronizedObject synchronizedObject = new SynchronizedObject();
            Demo3 demo3 = new Demo3(synchronizedObject);
            demo3.start();
            Thread.sleep(500);
            demo3.stop();
            System.out.println(synchronizedObject.getUserName() + " " + synchronizedObject.getPassword());
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
