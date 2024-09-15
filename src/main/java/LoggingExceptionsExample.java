import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExceptionsExample {

    


    private static final Logger logger = LoggerFactory.getLogger(LoggingExceptionsExample.class);

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("An exception occurred", e);
        }
    }
}