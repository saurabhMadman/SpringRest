# SpringRest 

This is Service API which return Student List in Json.
# Endpoint:/api/students
# Intellij IDE for Development
# Tomcat 10
# Build Tool : Maven

# Setting up Tomcat Server on Windows. 
1. Install tomcat: https://tomcat.apache.org/download-10.cgi
![image](https://user-images.githubusercontent.com/32073819/126066834-a8e4d61e-d5f2-4154-9866-30f9e11b791d.png)
2. Go to run --> Edit Configuration --> Add new instance of tomcat if you havent have any or use the existing one.
![image](https://user-images.githubusercontent.com/32073819/126066970-b99ca28e-d71f-472b-926b-a5b905013239.png)
 ![image](https://user-images.githubusercontent.com/32073819/126066990-5c6cad02-4fbe-42bf-9d04-81749260a204.png)
 
Now you Are good to Go.:-)

STEPS: 
1.	Maven Dependency Setup
2.	Configuration Setup.
3.	Designing RestController .

# POM.XML
For All dependency you visit and download it from : # https://search.maven.org/ 

 <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>war</packaging>
    <name>demo</name>
    <description>Demo project for Spring</description>
    <properties>
        <java.version>1.8</java.version>
    </properties>
    <dependencies>
        <!-- Add Spring MVC and REST support -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.0.5.RELEASE</version>
            <!-- Add Servlet support forSpring's AbstractAnnotationConfigDispatcherServletInitializer -->
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
        </dependency>
       <!-- Jackson -->
        <dependency>
            <groupId>javax.servlet.jsp</groupId>
            <artifactId>javax.servlet.jsp-api</artifactId>
            <version>2.3.1</version>
        </dependency>
    </dependencies>
  
    <build>
        <finalName>spring-rest-demo</finalName>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-war-plugin</artifactId>
                    <version>3.2.0</version>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>
</project>

# PROJECT SETUP AND CONFIGURATION  
 
 ![image](https://user-images.githubusercontent.com/32073819/126065716-bcd0b45a-cc57-4eed-8d7d-f2705fb08acf.png)
 
# Demo Configuration class

package com.example.demo.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.example")
public class DemoConfigurationClass {
}

@EnableWebMvc : Spring Mvc Enable Annotation. 
@ComponentScan : Root Directory


Rest of the code is in Repo.
Enjoy Coding!!!!!!
 


