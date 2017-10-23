package com.web;

public class TestResultDisplay {
	
public TestResultDisplay(){
		
		
	}
	
	public TestResultDisplay(String testScenarioID, String module, int testStepID, String stepDescription,
			String status, String date) {
		super();
		TestScenarioID = testScenarioID;
		Module = module;
		TestStepID = testStepID;
		StepDescription = stepDescription;
		Status = status;
		Date = date;
	}

	private String TestScenarioID;
	private String Module;
	private int TestStepID;
	private String StepDescription;
	private String Status;
	private String Date;
	
	
	
	
	
	public String getTestScenarioID() {
		return TestScenarioID;
	}
	public void setTestScenarioID(String testScenarioID) {
		TestScenarioID = testScenarioID;
	}
	public String getModule() {
		return Module;
	}
	public void setModule(String module) {
		Module = module;
	}
	public String getTestStepID() {
		return TestStepID;
	}
	public void setTestStepID(String testStepID) {
		TestStepID = testStepID;
	}
	public String getStepDescription() {
		return StepDescription;
	}
	public void setStepDescription(String stepDescription) {
		StepDescription = stepDescription;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	@Override
	public String toString(){
		return "\nTestScenarioID: " + TestScenarioID + "\nModule: " + Module +
				"\nTestStepID: " + TestStepID + "\n StepDescription: " + StepDescription +"\nStatus:"+Status+"\nDate"+Date;
	}
	

}
