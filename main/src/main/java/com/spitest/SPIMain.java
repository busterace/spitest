package com.spitest;

public class SPIMain {
    
    
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger();
        if (logger == null) {
            System.out.println("logger is null");
        } else {
            logger.info("hhhhhh");
        }
    }
}
