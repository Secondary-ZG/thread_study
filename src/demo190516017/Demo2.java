package demo190516017;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-16 20:46
 * Description:线程优先级的继承特性
 */
public class Demo2 extends Thread {

    @Override
    public void run() {
        System.out.println("Demo2 run priority = " + this.getPriority());
    }

}
