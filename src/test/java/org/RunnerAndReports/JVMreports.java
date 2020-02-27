package org.RunnerAndReports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreports {
	public static void generateReprts(String json) {

		File f=new File("C:\\Users\\SHIVA\\Desktop\\core java\\BlueAir\\target\\JVM");
		Configuration con=new Configuration(f, "BlueAir");
		con.addClassifications("Report", "JVM");
		con.addClassifications("Browser", "chrome");
		con.addClassifications("BrowserVersion", "79");
		con.addClassifications("Sprint", "5");
		con.addClassifications("OS", "Windows");
		
		List<String> jsonfiles = new ArrayList <String>();
		jsonfiles.add(json);
		ReportBuilder r=new ReportBuilder(jsonfiles, con);
		r.generateReports();
		
	}

}
