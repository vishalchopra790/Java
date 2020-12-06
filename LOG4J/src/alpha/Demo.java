package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class Demo {
    private static Logger log=  LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am deugging");
		log.info("We are the boss");
		log.error("Failure");
		log.fatal("fatal error");

	}

}
