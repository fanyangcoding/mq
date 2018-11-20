package cn.com.siemens.trm.mq;

import cn.com.siemens.trm.entities.JobLog;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "jobLogQueue")
public class JobLogReceiver {
    @RabbitHandler
    public void process(JobLog jobLog) {
        System.out.println(jobLog.getLog_field());

    }
}
