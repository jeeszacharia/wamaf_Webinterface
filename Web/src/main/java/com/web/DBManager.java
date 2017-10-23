package com.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DBManager  {
	
	// ArrayList<TestResultDisplay> testResult=new ArrayList<TestResultDisplay>();
	//static ArrayList tempArray= new ArrayList();
	List<TestResultDisplay> testResult;
	
	TestResultDisplay objTestResult;
	
	public static boolean checklogin(GetterAndSetter sets){
		
		Connection conn= ConnectionManager.getInstance().getConnection();
		ResultSet myresultset;
		boolean loginSuccess = false;
		
		try{
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String sqlQuery=("SELECT *FROM wamaf.registration where UserName=? and Password=?");
			
			
			
			PreparedStatement prepstmt = conn.prepareStatement(sqlQuery);
			
			prepstmt.setString(1, sets.getUserName());
			prepstmt.setString(2, sets.getPassWrod());		
		
			
			myresultset=prepstmt.executeQuery();
			if(myresultset.next()){
				
				loginSuccess=true;
				
							
				}else{
					
					loginSuccess=false;
				}
				
			}catch(Exception exc){
				exc.printStackTrace();
				
			}
				
		ConnectionManager.getInstance().closeConnection();
		return loginSuccess;
			
				
		}
	
	
	public List<TestResultDisplay> displayWebResult(String startDate,String endDate){
		
		Connection conn= ConnectionManager.getInstance().getConnection();
		ResultSet myresultset;
		String startdate=startDate;
		String enddate=endDate;
		
//		List<TestResultDisplay> testResult;
						
		try{
			
						
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String sqlQuery=(" SELECT wamaf.test_case_web.test_scenarioID,wamaf.test_case_web.test_scenario,wamaf.test_step_web.test_step_id,wamaf.test_step_web.steps,wamaf.test_result_web.status,wamaf.test_result_web.date FROM wamaf.test_result_web INNER JOIN wamaf.test_step_web ON wamaf.test_result_web.test_step_id=wamaf.test_step_web.test_step_id"
					+ " INNER JOIN wamaf.test_case_web ON wamaf.test_step_web.tc_id=wamaf.test_case_web.tc_id WHERE date>=STR_TO_DATE(?,'%m/%d/%Y') AND date <=STR_TO_DATE(?,'%m/%d/%Y')");			
			
			
			PreparedStatement prepstmt = conn.prepareStatement(sqlQuery);
			
		prepstmt.setString(1,startDate);
			prepstmt.setString(2,endDate);		
					
			myresultset=prepstmt.executeQuery();
			
			testResult= new ArrayList<TestResultDisplay>();
			while(myresultset.next()){
				
				objTestResult=new TestResultDisplay();
													
				
//				tempArray.add(myresultset.getString("test_scenarioID"));
//				tempArray.add(myresultset.getString("test_scenario"));
//				tempArray.add(myresultset.getString("test_step_id"));
//				tempArray.add(myresultset.getString("steps"));
//				tempArray.add(myresultset.getString("status"));
//				tempArray.add(myresultset.getString("date"));
												
				objTestResult.setTestScenarioID(myresultset.getString("test_scenarioID"));
				objTestResult.setModule(myresultset.getString("test_scenario"));
				objTestResult.setTestStepID(myresultset.getInt("test_step_id"));
				objTestResult.setStepDescription(myresultset.getString("steps"));
				objTestResult.setStatus(myresultset.getString("status"));
				objTestResult.setDate(myresultset.getString("date"));
				
						
								
				testResult.add(objTestResult);
													
				
				}
			return testResult;	
				
		}catch(Exception exc){
			exc.printStackTrace();
		}finally{
			
			ConnectionManager.getInstance().closeConnection();
		}
		return null;
		
	}
	
//	@Override
//	public String toString(){
//		String TotalBooks="\n";
//		
//		Iterator  i = testResult.iterator();
//		while(i.hasNext()){
//			TestResultDisplay b = (TestResultDisplay) i.next();
//			TotalBooks = TotalBooks + b.toString();
//			//System.out.println(TotalBooks);
//		}
//		return TotalBooks;
	
	
}
