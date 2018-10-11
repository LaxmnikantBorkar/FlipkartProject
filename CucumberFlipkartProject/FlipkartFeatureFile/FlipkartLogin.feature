Feature: Login functionality for Flipkart

Scenario Outline: Login functionality with valid credentials
Given invoke browser for Signin
When enter UserFName "<UserFName>"
When enter UPassword "<UPassword>"
Then click on SaveButton

Examples:
|UserFName|UPassword|
|borkar.laxmikant@gmail.com|Pune@12345|
 
