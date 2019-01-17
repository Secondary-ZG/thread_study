package demo_190116_004.example_02;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/16 5:01 PM
 * Description: 模拟servlet组件(线程安全)
 */
public class LoginServlet {

    private static String userNameRef;

    private static String passwordRef;

    synchronized public static void doPost(String userName, String password) {
        try{
            userNameRef = userName;
            if (userName.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("userName = " + userNameRef + " password = " + passwordRef);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
