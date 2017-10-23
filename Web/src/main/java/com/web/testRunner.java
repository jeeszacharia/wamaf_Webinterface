package com.web;

import java.util.ArrayList;
import java.util.Iterator;

public class testRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strDate="10/02/2017";
		String endDate="10/04/2017";
		
		DBManager obj= new DBManager();
	ArrayList arra= new ArrayList();
	
	arra=(ArrayList) obj.displayWebResult(strDate, endDate);
		
//		for(TestResultDisplay testResult:obj.displayWebResult(strDate, endDate)){
//			
//			System.out.println(testResult);
//			
//		}
	
	
	for(ArrayList temp:arra){
		
	}
		

	}

}
