package demo190519019;

import java.util.Random;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-19 15:13
 * Description: 线程的优先级具有随机性
 * 上一个案例介绍了线程中优先级较高的先执行完run()方法中的任务，但是这个结果不能说的太肯定
 * 因为线程的优先级还具有"随机性"，也就是说优先级较高的线程不一定每一次都先执行完
 */
public class Demo1 extends Thread{

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();

        long addResult = 0;

        for (int j = 0; j<10; j++) {
            for (int i = 0; i<50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("🌟 🌟 🌟 🌟 🌟 demo1 use time = " + (endTime - beginTime));
    }

}
