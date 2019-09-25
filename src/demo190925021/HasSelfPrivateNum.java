package demo190925021;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-06-22 14:37
 * Description: 多个对象多个锁
 */
public class HasSelfPrivateNum {

    synchronized void addI(String userName) {
        try {
            int num = 0;
            String str = "a";
            if (str.equals(userName)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(userName + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
