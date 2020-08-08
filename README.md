# Spring Cloud Config - Server and Client demo application

	Spring Cloud Config provide both server-side and client-side support to externalized configuration in distributed systems.
	
	A Sample application to show how we can use config-server as well config-client(s).
	 
## Steps to Setup
1. Clone the application
	https://github.com/arivuselvanchinnasamy/spring-cloud-config.git
	
2. Build
   Execute the below command under spring-cloud-config directory. 
   
   mvn clean install  
  
3. Run the Spring Cloud Config Server
	java -jar config-server/target/config-server-0.0.1-SNAPSHOT.jar

4. Run the Catalog-Service (Config Client) application
	java -jar catalog-service/target/catalog-service-0.0.1-SNAPSHOT.jar
	
5. Run the Customer-Service (Config Client) application
	java -jar customr-service/target/customer-service-0.0.1-SNAPSHOT.jar
	
## Test

1) Config Server
	
	http://localhost:8888/customer-service/dev
	
	http://localhost:8888/customer-service/test
	
	http://localhost:8888/catalog-service/dev
	
	http://localhost:8888/catalog-service/test	
	
2) Catalog-Service

	http://localhost:8500/
	
	Sample Response:
		{
		jpaDatabase: "MYSQL",
		dbUserName: "root",
		dbUrl: "jdbc:mysql://localhost:3306/catalog",
		dbPassword: "root"
		}
3) Customer-Service
	
	http://localhost:8600/
	
	Sample Response:
		{
		jpaDatabase: "MYSQL",
		dbUserName: "root",
		dbUrl: "jdbc:mysql://localhost:3306/customers",
		dbPassword: "root"
		}
 