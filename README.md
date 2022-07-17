# xero_assignment
CONTENTS OF THIS FILE
---------------------

 * INTRODUCTION
 * PRE_REQUISITES
 * INFRASTRUCTURE AND ENVIRONMENT SETUP
 * TECHNOLOGIES
 * TEST EXECUTION
 * TEST REPORTING


INTRODUCTION
------------
•	Xero invoice system provide user to create Quote and Invoices.
URL : xero.com

PRE_REQUISITES
------------
•	Sign up for a free Xero trial
•	Login to your personal email account to accept an invitation to join the Xero trial

INFRASTRUCTURE AND ENVIRONMENT SETUP
------------
•	The device which is going to be used to run the automation suite, should be set as TRUSTED device in the site in order to skip the multifactor authentication and continue the test execution 
•	When setting the multifactor authentication, should be use “Use a backup method instead” option to continue the workflow without any blocker by providing security questions and answers 
•	Maven, Java installation in the machine



TECHNOLOGIES
------------
•	Selenium | Java | Maven |Cucumber |Junit 

TEST EXECUTION
------------
• Open as a maven project
• Run as a Junit test. 
• Runner file :  src.test.java.com.xero.util.TestRunner.java

TEST REPORTING
------------
• Mainly 3 reports will be generated under target folder
  cucumber-html-report
  cucumber-report.json
  cumber-report.xml

IMPORTANT
------------
• Execution will not be successful when the daily rate limit of creating quotes has been exceeded. Test will discontinue after this page
https://github.com/bhagyaJay1/xero_assignment/blob/main/DailyRateLimitExceeded.png
