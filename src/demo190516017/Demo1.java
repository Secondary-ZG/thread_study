package demo190516017;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-16 20:43
 * Description:线程优先级的继承特性
 */
public class Demo1 extends Thread {

    @Override
    public void run(){
        System.out.println("HasSelfPrivateNum run priority = " + this.getPriority());
        Demo2 demo2 = new Demo2();
        demo2.start();
    }
}
