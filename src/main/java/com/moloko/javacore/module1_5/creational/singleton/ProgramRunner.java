package main.java.com.moloko.javacore.module1_5.creational.singleton;

/**
 * @author Jack Milk
 */
public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log write....");
        ProgramLogger.getProgramLogger().addLogInfo("Second log write....");
        ProgramLogger.getProgramLogger().addLogInfo("Third log write....");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
