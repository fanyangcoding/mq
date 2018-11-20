package cn.com.siemens.trm.mq;

import cn.com.siemens.trm.entities.TransState;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "transStatusQueue")
public class TransStateReceiver {

    @RabbitHandler
    public void process(TransState transState) {
        System.out.println(transState.getLogdate());
    }
}
