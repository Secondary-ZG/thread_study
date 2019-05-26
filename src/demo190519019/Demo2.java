package demo190519019;

import java.util.Random;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-19 15:17
 * Description: 线程的优先级具有随机性
 */
public class Demo2 extends Thread {

    @Override
    public void run() {

        long beginTime = System.currentTimeMillis();
        long addResult = 0;

        for (int j=0; j<10; j++) {
            for (int i=0; i<50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("🌟 🌟 🌟 🌟 🌟 demo2 use time = " + (endTime - beginTime));

    }

}
