1. import the projects in eclipse as a maven project.
2. maven update the project.
3. run file containing main in poonamweather
	package:io.weatherapp
	File: WeaherAppDataApplication.java (run as java application)
4. Using chrome postman plugin, POST data at http://localhost:8091/weatherinfo
   In postman plugin, underHeader, put key= Content-Type, value= application/json
   In body you can insert value as 
		 {
        
			"id": "2",
       
			"city": "Fremont",
        
			"date": "2017-08-06",
		
        "min": 65,
        
			"max": 78
    
		}
	
5. Run second project web Application 
	package: com.in28minutes.springboot.web
	File: SpringBootFirstWebApplication ( run as java application)
6. web application run on localhost:8080/weather

DataBase connection:
1. If you want to connect the microservice to  local mysql database, add the code to application.properties file (poonamweather)
	spring.jpa.hibernate.ddl-auto=create
	spring.datasource.url=jdbc:mysql://Poonam-PC:3306/test
	spring.datasource.username=root
	spring.datasource.password=