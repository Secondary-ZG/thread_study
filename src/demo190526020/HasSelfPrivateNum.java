package demo190526020;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-26 15:49
 * Description: 对象及变量的并发访问
 * synchronized同步方法（方法内的变量为线程安全的）
 */
public class HasSelfPrivateNum {
    private String str = "a";

    public void addI(String userName){
        try{
            int num = 0;
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
