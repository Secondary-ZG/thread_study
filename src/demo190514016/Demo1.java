package demo190514016;

import javafx.scene.layout.Priority;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-12 15:03
 * Description: 线程的优先级
 * 在操作系统中，系统可以划分优先级，优先级较高的得到的CPU的资源越多，也就是CPU优先执行优先较高的线程对象中的任务
 * 设置线程优先级有助于帮助"线程规划器"确定在下一次选择哪一个线程来优先执行
 * 设置线程的优先级使用setPriority()方法
 */
public class Demo1 extends Thread {

//    public final void setPriority(int newPriority){
//
//        ThreadGroup g;
//        checkAccess();
//        if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
//             throw new IllegalArgumentException();
//        }
//        if ((g = getThreadGroup()) != null) {
//             if (newPriority > g.getMaxPriority()) {
//                 newPriority = g.getMaxPriority();
//             }
//             setPriority0(Priority = newPriority);
//        }
//    }

//  JDK中使用3个常量来预置定义优先级的值
    public final static int MIN_PRIORITY = 1;
    public final static int NORM_PRIORITY = 5;
    public final static int MAX_PRIORITY = 10;


}
