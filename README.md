# sevenSendersQATask

Code is written in Java Maven using TestNG framework using pageObject model.

Used IntelliJ as IDE and MacOS as operating system.

* Set up a classpath in the .bashProfile for Maven, selenium Driver, and java for the project.
* Used maven lifecycle to run/compile and install dependencies.
* Created a separate configuration file to store the test data, urls, and browser value. 
* Created an init method where it initialize. 

  
  * Driver object  
  * Configurations  
  * Type of browser can be defined in the init method.
  * Driver basic functionalities like maximize, minimize, and deleting cookies after each test run using selenium manage


* Each page in the website is represented in POM as PageObejct and Each method for the test is defined in every test class.
* Methods can be called to different test classes by calling its constructor.
* Test are defined by using __"@Test"__ annotation from TestNG. 
* Reports can be generated using __surefire plugin__