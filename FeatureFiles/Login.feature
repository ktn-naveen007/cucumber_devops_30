Feature: Login to application

@Functional1
Scenario Outline: enter valid user name and password

Given I open "<browser>"
And I enter valid "<URL>" to invoke application


Examples: 
		| browser 		| URL  								| username | password |
		|Chrome    	| https://www.amazon.in	|naveen@gmail.com| yash1234|
