package project.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import project.core.dao.SampleDao;

@Component(service=Servlet.class,
property = {"sling.servlet.methods=" + HttpConstants.METHOD_GET , "sling.servlet.extensions=json" ,
		"sling.servlet.paths=" + "/bin/project/Sample"} )


public class Sample extends SlingAllMethodsServlet
{

	private static final long serialVersionUID = 1L;
	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException 
	{
		logger.info("In Servlet");
		String un = request.getParameter("username");
		logger.info("un="+un);
		String pw = request.getParameter("password");
		logger.info("pw="+pw);
			SampleDao dao = new SampleDao();
			
			String check = 	dao.authenticateUser(un, pw);
			logger.info("check="+check);
		response.setHeader("Content-Type","text/html");
		response.getWriter().println("check:"+check);
		response.getWriter().println("username:"+un);
		response.getWriter().println("password:"+pw);
		response.getWriter().close();
		
		logger.info("end of servlet");
	}
	
}
