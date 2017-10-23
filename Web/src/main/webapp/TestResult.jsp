<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<%@ page import = "java.util.*" %>
<%@ page import = "com.web.*" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sample Table</title>
</head>
<body>
 


<table border="1">



<thead>Automation Results

<tr>
    <th>Test Scenario ID</th>
    <th>Module</th>
    <th>Test Step ID</th>
    <th>Step Description</th>
    <th>Status</th>
    <th>Date</th>
    
</tr>

<tr>

<% 
ArrayList<TestResultDisplay> stArray=(ArrayList)request.getAttribute("tempArray");

//for (int j=0;j<6;j++){
 //out.print("<tr></tr>");

for(TestResultDisplay objTestResult:stArray){
	
	out.print("<td>"+objTestResult.getTestScenarioID()+"</td>");
	out.print("<td>"+objTestResult.getModule()+"</td>");
	out.print("<td>"+objTestResult.getTestStepID()+"</td>");
	out.print("<td>"+objTestResult.getStepDescription()+"</td>");
	out.print("<td>"+objTestResult.getStatus()+"</td>");
	out.print("<td>"+objTestResult.getDate()+"</td>");
	out.print("<tr></tr>");
//}
}

//String stArray=(String)request.getAttribute("testResult");
    
//for (int j=0;j<14;j++){
//    out.print("<tr></tr>");    
    
    
//for (int i=0;i<6;i++){

 //  out.print("<td>"+stArray.get(i)+"</td>");
//   out.print("<td>"+stArray+"</td>");
        
 // }

        

//} 
%>
</tr>
   

</thead>


<tbody>




<!--<tr>
    <td>Ashmy</td>
    <td>David</td>
    <td></td>
    <td>02455678890</td>
</tr>

<tr>
    <td>Nivya</td>
    <td>Varghese</td>
    <td></td>
    <td>0786555678</td>
</tr>

<tr>
    <td>Jees</td>
    <td>Zacharia</td>
    <td></td>
    <td>023459678</td>
</tr>

  -->



</tbody>


</table>


    </body>
</html> 



</body>
</html>