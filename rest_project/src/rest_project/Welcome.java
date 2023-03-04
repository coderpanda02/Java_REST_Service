package rest_project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@SuppressWarnings("unused")
@Path("/welcome")
public class Welcome {
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String welcome_Plain() {
//
//		return "Welcome";
//	}
	
	
//	@GET
//	@Produces(MediaType.TEXT_XML)
//	@Path("{name}")
//	public String welcomeXml(@PathParam("name") String name) {
//		
//		return "<?xml version='1.0' encoding='UTF-8'?>"+
//				"<hello>Welcome "+name+"</hello>";
//	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{name}")
	public String welcomePlainText(@PathParam("name") String name) {
		
		return "Welcome "+name;
	}
	
	
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String welcomeHtml(@QueryParam("fname") String fname, @QueryParam("lname") String lname) {
//		
//		return "<html><head><title>Welcome from HTML</title></head>"+
//				"<body style='color:orange'><h1>Welcome "+fname+" "+lname+
//				"</h1></body></html>";
//	}
	
}
