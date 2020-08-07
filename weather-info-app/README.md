#Project Title
weather-info-app api

#Requirements
1. Save weather information of a city in MYSQL database
2. Verify if a given string is a Palindrome
3. Reverse a given string

##Pre-Requisites
Intellij Community Edition
Maven Plugin
Java 14 JDK
MYSQL
 
## Getting Started
Clone URL: https://github.com/jbn407/weather-info-app.git
Import the project as a Maven Project in IntelliJ IDE.

##Run Steps
Run as spring boot application.
Main class Path: weather-info-app\src\main\java\com\labs\weather\controllerWeatherInfoMain.java

#DB details
Port number: 8154
DB User: root
Pwd: root1234
DB Script file: "DB_Script.sql" is attached with the mail

#endpoints
1. Weather Info Controller
	POST: http://localhost:8154/weatherupdate/city?id=1269843&appid=bf66f24d4d4bf09e4d3472fe6fcf6ab9
									
	Success Response: Weather Info is saved to Database.

2. Palindrome Controller
	GET: http://localhost:8154/stringutils/ispalindrom?value=1223221

	Success Response: true

3. Reverse String Controller
	GET: http://localhost:8154/reversestring?value=Reverse

	Success Response: esreveR
Note: Postman Requests are attached with the mail as: "AccionLabs Test Assignment.postman_collection.json"

## Author
Bharath Javvaji
