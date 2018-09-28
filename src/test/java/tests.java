import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pingan.com.entity.DES3Util;
import pingan.com.entity.Demo;

/**
 * Created by hp on 2018/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class tests {
    @Test
    public void ss(){
        System.out.println(DES3Util.na());
    }
}
