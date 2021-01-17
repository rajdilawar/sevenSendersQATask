# sevenSendersQATask - Jenkins Setup and configuration 



Instal Jenkins  on the Mac OS Big Sur 11.1

Step 1: Install Homebrew
brew --version


Step 2: Install Jenkins
brew install jenkins-lts

In case error:
Your CLT does not support macOS 11.
It is either outdated or was modified.
Please update your CLT or delete it if no updates are available.
Update them from Software Update in System Preferences or run:
softwareupdate --all --install --force

If that doesn't show you an update run:
sudo rm -rf /Library/Developer/CommandLineTools
sudo xcode-select --install

Alternatively, manually download them from:
https://developer.apple.com/download/more/


Step 3: Start the Jenkins server
brew services start jenkins-lts

This will start the Jenkins server in a few seconds. You can check if it is properly working by visiting http://localhost:8080/


Step 4:  Unlock Jenkins

cat /Users/rajdilawar/.jenkins/secrets/initialAdminPassword

Copy Admin password


Step 4: Start and Stop Jenkins service

Starting and stopping Jenkins

brew services stop jenkins-lts    STOP
brew services start jenkins-lts   START



How to Configure Jenkins

Step 1: Install plugins

Step 2: Create a Jenkins User

Step 3: Configure the Jenkins URL   (Save and continue http://localhost:8080/)


Step 4: Soon the server will be configured and ready for action.




# Schedule built periodically


Create Maven Plugin in Jenkin from manage jenkin
Add maven plugin to the jenkin from manage plugin
Add testNG plugin to jenkin from manage plugin
Restart jenkins

Create New Item from Items and use maven project
use source as local or git
in local use the absolute path for your POM
in git give url for your git repo
(I used local)
In gola write clean install
in post-built action use testNG report
TestNG XML report pattern --> **/testng-results.xml
restart jenkins

navigate to Manage Jenkins --> Global Tool configuration
1. Maven Configuration --> Use default maven config
2. In JDK
   Name: JAVA_HOME
   JAVA_HOME: /usr/libexec/java_home/ or your JAVA_HOME Path

Apply and save

Navigate to dashboard of jenkin
click on project/job you created
Click on built now


To Schedule Periodically:


We have already Added a new job in Jenkins, which we want to schedule periodically.

From Configure job, navigate to "Build Periodically" checkbox and in the Schedule text field added the expression:

Start build daily at 09:50 in the morning, Monday - Friday: 50 09 * * 1-5




