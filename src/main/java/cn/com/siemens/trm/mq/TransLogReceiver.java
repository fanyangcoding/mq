package cn.com.siemens.trm.mq;

import cn.com.siemens.trm.entities.TransLog;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "transLogQueue")
public class TransLogReceiver {

    @RabbitHandler
    public void process(TransLog transLog) {
        System.out.println(transLog.getLog_field());
    }
}
