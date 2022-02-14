## Amazon-selenium-test
A simple selenium test with selenium written in Java and gherkin to search for a shoe\ on the Amazon website

## Prerequisites
Install latest version of JDK\
Install apache-maven - https://devwithus.com/install-maven-windows/
 
# Getting Started
These instructions will get you a copy of the project up and running on your local machine.

## Installation
Clone the repository onto your local machine using git clone https://github.com/Calliernie/AmazonTest.git

After cloning, do the following:

- cd AmazonTest
- change path to the feature file in the RunCucumberTest.java file
- open a terminal and run mvn clean(to check that all dependencies are properly configured)
- run mvn test(to install all dependencies defined in the pom.xml file and run the test)
  
##### NB: As stated in the prerequisites, you need to have maven installed to be able to use the maven commands
##### Maven downloads all required dependencies when the "mvn test" command is run
