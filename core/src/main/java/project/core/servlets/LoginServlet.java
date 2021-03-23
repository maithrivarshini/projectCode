package project.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;


@Component(service=Servlet.class,
property = {"sling.servlet.methods=" + HttpConstants.METHOD_POST , "sling.servlet.extensions=json" ,
		"sling.servlet.paths=" + "/bin/project/LoginServlet"} )
public class LoginServlet extends SlingAllMethodsServlet
{
	private static final long serialVersionUID = 1L;
   
   
   @Override
protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	   String un = request.getParameter("username");
		String pw = request.getParameter("password");
		System.out.println("Hi");
		response.getWriter().write("Hello");
}
	
}

//<script>
//valiate()
//{
//
//}
//<script>
/*$.ajax({     
	type : "POST",     
   	url : '/bin/project/LoginServlet',     
       data : {         
        "username": $("user").val(),
       "password": $("pass").val() 
       },     
       success : function(data, textStatus, jqXHR) {         
         alert("Success !!");                           
       },     
       error : function(XMLHttpRequest, textStatus, errorThrown) {         
       alert("Error !!");    
       } 
       });*/
//onclick="return validate()"
//"sling.servlet.resourceTypes="+ "project/components/structure/login4","sling.servlet.selectors="+"login",

//var xmlhttp = new XMLHttpRequest();
//xmlhttp.onreadystatechange = function()
//{
//   if(xmlhttp.readyState == XMLHttpRequest.DONE)
//  {
//   console.log(xmlhttp.responseText);
//  }
//}
//xmlhttp.open("POST",'/bin/project/ServletTest',true);
//xmlhttp.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
//xmlhttp.send("hello");
// <div >kk</div>

//<script>
//$("#sbt").click(function()
//{
// console.log("hi");
// alert("hi");
// var xmlhttp = new XMLHttpRequest();
// xmlhttp.onreadystatechange = function()
//{
//   if(xmlhttp.readyState == XMLHttpRequest.DONE)
//  {
//   console.log(xmlhttp.responseText);
//  }
//}
//xmlhttp.open("POST",'/bin/project/LoginServlet',true);
//xmlhttp.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
//xmlhttp.send("hello");
//});
//</script>