#Project Title
weather-info-app api

#Requirements
1. Save weather information of a city in MYSQL database
2. Verify if a given string is a Palindrome
3. Reverse a given string
 
## Getting Started
Import this project as a Maven Project in IntelliJ IDE.

##Pre-Requisites
Intellij Community Edition
Maven Plugin
Java 14 JDK
MYSQL

##Run Steps
Run as spring boot application.

#DB details
Port number: 8154
DB User: root
Pwd: root1234

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

## Author
Bharath Javvaji