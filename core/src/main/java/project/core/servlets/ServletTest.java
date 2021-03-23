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
		"sling.servlet.paths=" + "/bin/project/ServletTest"} )
public class ServletTest extends SlingAllMethodsServlet
{
  
	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().write("Hello");
	}
}

