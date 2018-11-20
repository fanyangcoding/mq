package cn.com.siemens.trm.mq;

import cn.com.siemens.trm.entities.JobState;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "jobStatusQueue")
public class JobStateReceiver {

    @RabbitHandler
    public void process(JobState jobState) {
        System.out.print(jobState.getLogdate());
    }
}
