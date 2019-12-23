package tv.politics.cron.trigger;

import org.quartz.JobDetail;

import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *Provides the scheduling "trigger" instance with the .build() method
 *
 *Triggers can be used to "group" job instances for scheduling
 *
 *One trigger can be used for many jobs, and receive custom params
 *
 */


@Configuration
public class PrintJobTrigger {

  @Bean
  public Trigger trigger(JobDetail job) {
    return TriggerBuilder.newTrigger().forJob(job).withIdentity("PrintJobTrigger", "Group1")
        .withDescription("Schedule once trigger instance").build();
  }

}
