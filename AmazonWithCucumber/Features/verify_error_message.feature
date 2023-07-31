Feature: Login functionality

Background:
Given a user is on the landing page
When he hovers the pointer over Hello Sign-in menu
And he clicks on Sign-in button in the sub-menu

@TC_002 @login_functionality
Scenario: A user with invalid credentials must get an error message while logging in
And he enters invalid email address in the Email text-box
And he clicks on Continue button
Then he must see the error message - "We cannot find an account with that email address"

Scenario Outline: A user with multiple invalid credentials must get an error message while logging in
And he enters an invalid email address "<emailId>" in the Email text-box
And he clicks on Continue button
Then he must see the error message - "We cannot find an account with that email address"

Examples:
|emailId|
|ironman6644@gmail.com|
|captainamerica6644@gmail.com|
|hulk6644@gmail.com|
|thor6644@gmail.com|
|hawkeye6644@gmail.com|