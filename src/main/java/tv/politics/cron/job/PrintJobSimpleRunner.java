/**
 * 
 */
package tv.politics.cron.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tv.politics.cron.service.PrintJobService;

/**
 * The "{{job}} class" implements the Job interface (from Quartz) and serves as a runner for a job "service."
 * 
 * The job "service" provides the underlying job logic.
 *
 */
@Component
public class PrintJobSimpleRunner implements Job {
	
	@Autowired 
	private PrintJobService printJobService;
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		printJobService.printJob();
		
	}

}
