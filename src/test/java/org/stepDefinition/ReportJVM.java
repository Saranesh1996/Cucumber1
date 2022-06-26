package org.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportJVM {
 public static void reportGeneration(String JsonReport) {
	// TODO Auto-generated method stub
//1. Mention the target folder location
	 File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Cucumber1\\JVM");
	 
//2.WE WILL ADD SOME EXTRA DETAILS IN THI REPORT(USING CONFIGURATION CLASS)
	 Configuration c = new Configuration(f, "amazon & facebook");
	 c.addClassifications("platform", "windows");
	 c.addClassifications("versions", "10");
	 
	 c.addClassifications("BrowserName", "ChromeBrowser");
	 c.addClassifications("version", "100");
	 
	 //3.ADD JSON FILE BY USING LIST<STRING>
	 List<String> li = new ArrayList<String>();
	 li.add(JsonReport);
	 
	 
	 //4.CREATE OBJECT FOR THIS REPORTBUILDER CLASS
	 ReportBuilder rs = new ReportBuilder(li, c);
	 
	 //5. using that object creation, we call generateReports() method.
	 rs.generateReports();
	 
}
}
