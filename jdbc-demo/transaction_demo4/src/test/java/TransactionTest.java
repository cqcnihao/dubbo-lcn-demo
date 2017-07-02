
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by lorne on 2017/6/7.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext.xml","/applicationContext_db_mysql.xml", "/applicationContext_dubbo_provider.xml"})
public class TransactionTest {

    @Test
    public void test(){
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
