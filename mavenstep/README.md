# STEP.exense tab testing
## What is step?
step is a unified platform for software automation that 
allows you to make the most out of automation artifacts 
while getting rid of specific tools.

## Installation
For this test you'll need to install [STEP](https://step.exense.ch/knowledgebase/3.18/getting-started/quick-setup/)
by following the official quick setup guide

Install Chrome and the appropriate version of [ChromeDriver](https://www.selenium.dev/documentation/webdriver/) on your laptop

Install the IDE, recommended IDE is [IntelliJ IDEA](https://www.jetbrains.com/ru-ru/idea/)

## Opening the project

To open project in IntelliJ IDEA right-click in the folder of the project
and press "Open Folder as a Project in IntelliJ Idea Community Edition"

## Prerequisites to running the tests
Before running the test make sure to change the path to your chromedriver in the TestBase.java file:
```java
System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");

// Instead of "C:\\chrome\\chromedriver.exe" write the path to where your chromedriver is located
```
Also make sure that your step controller is running

## Running the tests

In order to run the tests, open TestAllTabs.java in IntelliJ IDEA and press Shift+F10
You will see several instances of Chrome opening and testing the tabs
To check if the tests failed or passed press Alt-4 in IntelliJ IDEA and look at the Run status in the bottom left

## Support
If you have any questions write to: sholomitskyiv@gmail.com