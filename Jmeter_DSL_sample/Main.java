package org.example;

 import org.apache.jmeter.engine.StandardJMeterEngine;
 import org.apache.jmeter.reporters.Summariser;
 import org.apache.jmeter.save.SaveService;
 import org.apache.jmeter.testelement.TestElement;
 import org.apache.jmeter.util.JMeterUtils;
 import org.apache.jmeter.threads.ThreadGroup;
 import org.apache.jmeter.visualizers.SummaryReport;
 import org.apache.jorphan.collections.HashTree;
 import org.apache.jmeter.reporters.ResultCollector;
 import org.apache.jmeter.control.LoopController;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
 
        StandardJMeterEngine jmeter = new StandardJMeterEngine();
 
        JMeterUtils.loadJMeterProperties("C:\\apache-jmeter-5.4.3\\bin\\jmeter.properties");
        JMeterUtils.setJMeterHome("C:\\apache-jmeter-5.4.3\\");
        JMeterUtils.initLocale();

        //JMeterUtils.initLogging();// Deprecated
        // Initialize JMeter SaveService
        SaveService.loadProperties();

        // Load existing .jmx Test Plan
       File in = new File("C:\\Projs\\Jmeter_Testplans\\1\\Thread_Group.jmx");

        HashTree testPlanTree = SaveService.loadTree(in);
        
        //System.out.println("Here1");
        Summariser summer = null;

        String summariserName = JMeterUtils.getPropDefault("summariser.name", "summary");
        if (summariserName.length() > 0) {
            summer = new Summariser(summariserName);
        }

        String logFile= "C:\\Projs\\Jmeter_Testplans\\1\\test_run.log";
        ResultCollector logger = new ResultCollector(summer);
        logger.setFilename(logFile);
        testPlanTree.add(testPlanTree.getArray()[0], logger);

        jmeter.configure(testPlanTree);

        //System.out.println("Here2");

        jmeter.run();

        //System.out.println("Here3");
       

    }
}