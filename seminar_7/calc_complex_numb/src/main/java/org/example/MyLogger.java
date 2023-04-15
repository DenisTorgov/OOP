package org.example;

import java.util.logging.Logger;

public class MyLogger implements Log{
    Logger lg ;
    @Override
    public void LogIt(String oper) {
        Logger.getLogger(oper).info("Result " + oper);
    }
}
