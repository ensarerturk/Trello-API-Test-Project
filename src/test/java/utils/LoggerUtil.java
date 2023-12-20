package utils;

import org.junit.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

    public static void info(String message) {
        logger.info(message);
    }

    public static void assertWithLogging(String message) {
        logger.error(message);
        Assert.fail();
    }

    public static void assertEquals(Object actual, Object expected) {
        info("Expected: " + expected + "\nActual: " + actual);
        Assert.assertEquals(actual, expected);
    }
}
