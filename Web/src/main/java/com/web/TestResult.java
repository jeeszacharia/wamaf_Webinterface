package com.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class TestResult
 */
public class TestResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DBManager objdb= new DBManager();
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String platForm=request.getParameter("Platform");
		System.out.println(platForm);
		String startDate=request.getParameter("StartDate");
		
		String endDate=request.getParameter("EndDate");
		
		List<TestResultDisplay> tempArray=objdb.displayWebResult(startDate, endDate);
		
//		for(TestResultDisplay objTestResult:tempArray){
//			System.out.println(objTestResult);
//		}
		
								
		request.setAttribute("tempArray", tempArray);
		//request.setAttribute("testResult", testResult);
				 
		 request.getRequestDispatcher("/TestResult.jsp").forward(request, response);
			

			
	}

}
