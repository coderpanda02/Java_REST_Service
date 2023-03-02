# Java_REST_Service
building RESTfull service in Java using Jersey JAR files.

Jersey JAR files download link : https://eclipse-ee4j.github.io/jersey


While running the project if error occurs like -

  http status code 404 - not found, msg : The requested resource [/rest_project/rest/welcome/name] is not available is shown

	--> change the url pattern in <servlet-mapping> in web.xml file and run the project again. 
		  It can happen if the url pattern /rest is already used in previous project.
	    like, if once  /rest  is used, use  /rest1  next time -> /rest1/welcome/name  in the url bar.
