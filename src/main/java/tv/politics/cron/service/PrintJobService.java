/**
 * 
 */
package tv.politics.cron.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Sample job as a "service" class. This class contains the job business logic. 
 * 
 * The rest of the application works to schedule the service.
 *
 */

@Service
public class PrintJobService {

	private static final Logger LOG = LoggerFactory.getLogger(PrintJobService.class);

    public void printJob() {
    	
        LOG.info("Classic print job logic ... ");
    }

}
