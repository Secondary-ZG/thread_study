package demo_181230_001;

/**
 * Java Class
 * Created By Secondary
 * On 2018/12/30 4:17 PM
 * Description: 使用多线程
 */
public class Demo1 {

    /**
     * 1、在控制台中输出的main其实就是一个名称叫做main的线程在执行mian()方法中的代码
     * 2、并且控制台输出的mian和main方法没有任何关系，仅仅是名称相同而已
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("此线程名称为:" + Thread.currentThread().getName());
    }

}
