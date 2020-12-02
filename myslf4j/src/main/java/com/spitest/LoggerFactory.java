package com.spitest;

import java.util.Iterator;
import java.util.ServiceLoader;

public class LoggerFactory {
    
    public static Logger getLogger() {
        Logger logger = null;
        ServiceLoader<Logger> load = ServiceLoader.load(Logger.class);
        Iterator<Logger> iterator = load.iterator();
        if (iterator.hasNext()) {
            logger = iterator.next();
        }
        return logger;
    }
}
