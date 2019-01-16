package demo_190116_004.example_01;

/**
 * Java Class
 * Created By Secondary
 * On 2019/1/16 5:05 PM
 * Description: A模拟登录接口
 */
public class ALogin extends Thread{

    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }

}
