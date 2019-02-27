package demo190227008;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-02-27 14:08
 * Description: getId()方法
 */
public class Demo1 {

    /**
     * 从打印的运行结果来看，当前执行代码的线程名称为main, 线程id为1
     * @param args
     */
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }

}
