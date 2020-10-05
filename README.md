#androidAutomation
Base project.

General details of the implementation
The tests use  tests, pages. The complete structure of the project is the following:

+ tests
     Classes with diferents test to execute

+ Screens
     Page Elements and methods
+ Utils
     Classes of utils


Requirements
To run the project you need Java JDK 1.8 and Maven preferably with version 3.6

To run the project
You have to open the emulator or change file mobile_capabilities.json


Then the command can be executed:

mvn clean install -DskipTests

mvn clean test

Reporte

The report is in the folder test-output, you have to search the file .index to see report.

