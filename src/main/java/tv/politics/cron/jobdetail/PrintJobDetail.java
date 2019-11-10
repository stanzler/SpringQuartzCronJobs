/**
 * 
 */
package tv.politics.cron.jobdetail;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tv.politics.cron.job.PrintJobSimpleRunner;

/**
 *Provides the job instance with the .build() method
 *
 */

@Configuration
public class PrintJobDetail {
	
	@Bean
	public JobDetail jobDetail() {
	    return JobBuilder.newJob().ofType(PrintJobSimpleRunner.class)
	      .storeDurably()
	      .withIdentity("PrintJobDetail", "Group1")  
	      .withDescription("Fire once PrintJob instance")
	      .build();
	    
	}

}
