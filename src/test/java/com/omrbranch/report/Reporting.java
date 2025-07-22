package com.omrbranch.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {
public static void generateJvmReports(String jsonfile) throws FileNotFoundException, IOException
{
	//Mention path to store jvm report
	
	File file=new File(getProjectPath()+getPropertyFileValue("jvmPath"));
	System.out.println(file);
	//Create Design add data in K,V
	Configuration configuration=new Configuration(file,"OMR Branch Project");
	configuration.addClassifications("OS", "Windows 11");
	configuration.addClassifications("Browser", "Chrome");
	
	configuration.addClassifications("Browser Version", "13");
	
	configuration.addClassifications("Testing", "Regression");
	configuration.addClassifications("Sprint", "33");
	//Create Obj for ReportBuilder Class
	List<String> jsonFiles = new ArrayList<>();
	jsonFiles.add(jsonfile);
	ReportBuilder builder=new ReportBuilder(jsonFiles, configuration);
	//Build JVM report
	builder.generateReports();
}
}
