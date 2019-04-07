package demo190407011.example01;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-04-07 15:47
 * Description: 实体类
 */
public class SynchronizedObject {

    private String userName = "a";
    private String password = "aa";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized public void printString(String userName, String password) {
        try {
            this.userName = userName;
            Thread.sleep(100000);
            this.password = password;
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
