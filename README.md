# sevenSendersQATask

Code is written in Java Maven using TestNG framework with pageObject model.

I used IntelliJ as IDE and MacOS as operating system

I set up class file in the .bashProfile for Maven, selenium Driver and project

Use maven lifecycle to run/compile and install dependencies like mvn clean test-compile

I create separate configuration file, loading the configuration load  time

I create an init method where I am initializing
a. Driver object
b. Configurations
c. Type of browser can be defined in the init file
d. Driver basic functionalities like maximize, minimize, and deleting cookies after each test run using selenium manage


Each page in the website is represented in POM as PageObejct and Each method for the test is defined in each test class...

Methods can be called to different test classes by calling its constructor. 

