package demo190116004.example_02;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/16 5:06 PM
 * Description: B模拟登录接口
 */
public class BLogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }

}
