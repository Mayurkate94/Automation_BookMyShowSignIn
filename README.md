# Automation_BookMyShowSignIn
The accompanying Java code illustrates an automation script that navigates the BookMyShow website and executes a number of tasks automatically using the Selenium WebDriver technology. The script mimics a user situation in which they sign in with their email address, get an OTP from their Yopmail inbox, and confirm that they successfully signed in. Here is a detailed explanation of the code:

1. The first import statement is: The script starts by importing the required classes from the Java libraries and Selenium framework.

2. WebDriver Initialization: The script configures implicit wait timeouts and specifies the path to the ChromeDriver executable to set up the Chrome WebDriver.

3. Accessing the BookMyShow website : The explore main page of the BookMyShow website is reached by the WebDriver.

4. Choosing a City: It selects "Bengaluru" as the city to investigate by clicking on the "Change Location" feature.

5. Sign In: To begin the sign-in procedure, the script clicks on the "Sign In" icon.

6. Continue with Email: This option is selected once the "Sign In" button has been selected.

7. Entering Your Email: The "Continue" button is clicked after the script inserts the email address "selauto@yopmail.com".

8. When you open Yopmail: In order to access the inbox, the WebDriver visits the Yopmail website.

9. Getting to Inbox: To access the inbox, it types "selauto@yopmail.com" into the email address field and presses the submit button.

10. Obtaining OTP Email: The script moves to the iframe holding the most recent email in the inbox after waiting for 10 seconds (you may need to tweak the duration).

11. Obtaining the OTP: The OTP is extracted from the most recent email's content and stored for later use.

12. Going back to BookMyShow: For the next step in the sign-in procedure, the script goes back to the BookMyShow website.

13. Entering the OTP: It then clicks the "Verification Sign In" button after entering the retrieved OTP in the appropriate input area.

14. Validating Sign-In: The script gets the "Hi, Guest" element's displayed text. If this text is discovered, a message confirming a successful sign-in is printed; otherwise, a failure message is printed.

15. Cleanup of the browser: In order to release system resources, the WebDriver is closed.
