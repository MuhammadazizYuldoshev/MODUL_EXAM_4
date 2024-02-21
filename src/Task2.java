import java.io.IOException;
import java.util.logging.*;

public class Task2 {
    static Logger logger = Logger.getLogger(Task2.class.getName());
    public static void main(String[] args) {
        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getLoggerName() + " " + record.getLevel() +" : "  + record.getMessage() +  " " + record.getInstant();
            }
        };
        try {
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(formatter);
            consoleHandler.setLevel(Level.FINE);
            FileHandler fileHandler = new FileHandler("muhammadaziz.txt",1024 * 4,1,true);
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.FINE);
            logger.setLevel(Level.FINE);
            logger.addHandler(fileHandler);
            logger.addHandler(consoleHandler);
            logger.setUseParentHandlers(false);
            logger.fine("fine");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

