package helpers;

import org.apache.log4j.Logger;

public class log{


    private static Logger log=Logger.getLogger(log.class.getName());
    public static void startTestCase(String testCaseName){ log.info("test Case Started");}
    public static void endTestCase(String testCaseName){ log.info("test Case ended");}
    public static void info(String message){ log.info(message);}
    public static void error(String message){ log.error(message);}
    public static void error2(String message){ log.error(message);}

}
