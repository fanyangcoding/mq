package cn.com.siemens.trm.mq;

import cn.com.siemens.trm.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ReceiverApplicationTests {
    @Test
    public void testRabbitMQReceiver() {

    }
}
