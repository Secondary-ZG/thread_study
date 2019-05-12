package demo190512015;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-05-12 10:37
 * Description:suspend与resume方法的缺点--不同步
 */
public class MyObject {

    private String userName = "1";
    private String password = "11";

    public void setValue(String u, String p){
        this.userName = u;
        String threadName = "a";
        if (threadName.equals(Thread.currentThread().getName())) {
            System.out.println("停止a线程");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUserNamePassword(){
        System.out.println(userName + " " + password);
    }

}
