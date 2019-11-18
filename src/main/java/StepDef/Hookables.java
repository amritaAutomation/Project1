package StepDef;

import org.apache.log4j.Logger;

//import Result.ExtentReport;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookables {

	
	//log generTION
		Logger logobj=Logger.getLogger(Hookables.class);
		public static int count=0;
		@Before
		public void before(Scenario s)
		{
			logobj.info("Scenario Execution Started.Scenario Details are....");
			logobj.info("Suite Name:"+s.getSourceTagNames().toString());
			logobj.info("Scenario Name:"+s.getName()+"  ID:"+s.getId());
			
			System.out.println("Currently executing Scenario->"+s.getName());
			System.out.println("------------------");
			count++;
//			ExtentReport.TestSuiteStart("C:\\Self-Auto\\selfPro\\Reports\\LoginExtentReport.html", "Amrita");
//			ExtentReport.TestCaseStart(s.getName()," ");
		 
			
		}
		
		@After
		public void after(Scenario s)
		{		
			//logobj.info("Scenario Execution Completed");
			
			System.out.println("status->"+s.getStatus());
//			ExtentReport.TestCaseEnd();
//			ExtentReport.TestSuiteEnd();
			System.out.println("-------------------");
		}

	}


