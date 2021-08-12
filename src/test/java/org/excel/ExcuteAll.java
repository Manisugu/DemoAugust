package org.excel;


import org.junit.runner.Result;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ExcelRead.class,ExcelWrite.class})
public class ExcuteAll {
	
	public static void main(String[] args) {
		
		Result r =  JUnitCore.runClasses(ExcelRead.class,ExcelWrite.class);
		
		System.out.println(r.getIgnoreCount());
		System.out.println(r.getRunCount());
		System.out.println(r.getRunTime());
		System.out.println(r.wasSuccessful());
		System.out.println(r.getFailureCount());
		
		List<Failure> failures = r.getFailures();
		for (Failure x : failures) {
			System.out.println(x);
		}
	
	
	}
}
