Building RESTfull service in Java using Jersey JAR files.

# Jersey JAR files download link : 
  https://eclipse-ee4j.github.io/jersey

# Steps to download Jersey JARs : 
	visit the link  above -> go to download section -> click on how to download -> check version (I have used 2.39 here) 
	-> click on Jersey JAX-RS 2.1 RI bundle (for version 2.39) to download the jar files.


# While running the project if error occurs like -

  http status code 404 - not found, msg : The requested resource [/rest_project/rest/welcome/name] is not available :

	change the url pattern in <servlet-mapping> in web.xml file and run the project again.
	like, if once  /rest  is used, use  /rest1  next time.
	It can happen if the url pattern /rest is already used in previous project.
