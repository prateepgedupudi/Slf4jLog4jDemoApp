import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */

/**
 * @author prateep.gedupudi
 *
 */
public class Slf4jLog4jDemo {
	static Logger logger = LoggerFactory.getLogger(Slf4jLog4jDemo.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("Sample Info");
		logger.debug("Sample Debug");
		logger.error("Sample Error");
		logger.trace("Sample Trace");
		logger.warn("Sample Warn");
		
		org.apache.log4j.Logger logger4j = org.apache.log4j.Logger.getRootLogger();
		logger4j.setLevel(org.apache.log4j.Level.toLevel("DEBUG"));
		
		logger.info("Sample Info After setLevel");
		logger.debug("Sample Debug After setLevel");
		logger.error("Sample Error After setLevel");
		logger.trace("Sample Trace After setLevel");
		logger.warn("Sample Warn After setLevel");
		
		

	}

}
