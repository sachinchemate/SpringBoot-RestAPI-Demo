# SpringBoot-RestAPI-Demo
Creating Sample project/skeleton for those who want to use spring boot and expose any service as Restfull API.
Learning:
1. SpringBoot app using gradle (you don't have to worry about dependency, starter Jar will take care of all the dependent jars)
2. How default application.properties gets used by SpringBoot
	a. I Have change port and context path for demo
3. How we can read properties using annotation.
4. easy way to expose as REST API using RestController annotation.

5. here are the REST api which we have expose:
	http://localhost:9090/RestAPIDemo/api/access
	http://localhost:9090/RestAPIDemo/api/
6. Junit using Mockito

How to Use:
1. Clone this project as it is and do gradle refresh
2. Run your project as SpringBoot app or Java app and On Application startup, you can hit above URL's and verify its working or not.
