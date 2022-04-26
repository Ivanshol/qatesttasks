# STEP.exense tab testing
## What is step?
STEP is a unified platform for software automation that 
allows you to make the most out of automation artifacts 
while getting rid of specific tools.

## Purpose of the project
This project is designed to automatically test the STEP page tabs and check if they load correctly.
This project uses Maven + Selenium webdriver.

## Installation
For this test you'll need to install [STEP](https://step.exense.ch/knowledgebase/3.18/getting-started/quick-setup/)
by following the official quick setup guide, and download a step controller

Install [MongoDB](https://www.mongodb.com/docs/manual/installation/)

Install [JDK 11](https://www.oracle.com/cis/java/technologies/javase/jdk11-archive-downloads.html)

Install Chrome and the appropriate version of [ChromeDriver](https://www.selenium.dev/documentation/webdriver/) on your laptop

Install the IDE, recommended IDE is [IntelliJ IDEA](https://www.jetbrains.com/ru-ru/idea/)

## Setting up the project

After installing everything you will need to add JAVA_HOME to your environment variables, look [here](https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html) for the information on how to do that

You will also need to [create a basic mongoDB instance](https://medium.com/stackfame/run-mongodb-as-a-service-in-windows-b0acd3a4b712)

In the step controller folder open step-controller/bin/stepController.bat with any text editor, and type in the jdk path according to example written in the bat file

In IntelliJ IDEA create a Maven project and open the pom.xml file, you are going to need to add dependencies for the project to work:
1. [Junit](https://mvnrepository.com/artifact/junit/junit)
2. [Junit jupiter API](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)
3. [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.1.3)

In order to add dependencies to your project simply copy the maven text that you see on the site and paste it inside the
< dependencies > tag in your pom.xml file

If the project does not recognize the dependency try to restart IntelliJ IDEA

## Opening the project

To open project in IntelliJ IDEA right-click in the folder of the project
and press "Open Folder as a Project in IntelliJ Idea Community Edition"

## Prerequisites to running the tests
Before running the test make sure to change the path to your chromedriver in the TestBase.java file:
```java
System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");

// Instead of "C:\\chrome\\chromedriver.exe" write the path to where your chromedriver is located
```
Make sure that your step controller is running. In order for it to run simply open the startConrtoller.bat file in your STEP controller folder

## Running the tests

In order to run the tests, open TestAllTabs.java in IntelliJ IDEA and press Shift+F10
You will see several instances of Chrome opening and testing the tabs
To check if the tests failed or passed press Alt-4 in IntelliJ IDEA and look at the Run status in the bottom left

## Support
If you have any questions, please write to: sholomitskyiv@gmail.com
