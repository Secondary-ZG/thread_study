package demo190416013;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-16 21:04
 * Description: suspend与resume方法的缺点--独占
 */
public class SynchronizedDemo1 {

    /**
     * 在使用suspend和resume方法时，如果使用不当，极易造成公共的同步对象的独占，使得其他线程无法访问公共同步对象
     */
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远 suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        try {
            final SynchronizedDemo1 synchronizedDemo1 = new SynchronizedDemo1();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    synchronizedDemo1.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread2启动了，但进入不了printString()方法！只打印1个begin");
                    System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了");
                    synchronizedDemo1.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
