Feature: Swag Labs E-Commerce Application testing
Scenario: Successful login valid credentials
Given User launch the browser
When User enters the valid username "username" in the user name field
And User enters the valid password "password" in the password field
And User much click the login button
Then user should be redirected to the products page "Swag labs"

Scenario: login failed for invalid credentials
Given User launch the browser
When User enters the invalid username "username" in the user name field
And User enters the valid password "password" in the password field
But User should get an error msg "epic sadface: Username and password do not match with any user in this service"
Then user should still on the login page "loginpage"

Scenario: login failed for invalid credentials
Given User launch the browser
When User enters the valid username "username" in the user name field
And User enters the invalid password "password" in the password field
But User should get an error msg "epic sadface: Username and password do not match with any user in this service"
Then user should still on the login page "loginpage"

Scenario: login failed for invalid credentials
Given User launch the browser
When User enters the invalid username "username" in the user name field
And User enters the invalid password "password" in the password field
But User should get an error msg "epic sadface: Username and password do not match with any user in this service"
Then user should still on the login page "loginpage"

Scenario: login failed for invalid credentials
Given User launch the browser
When User enters the empty username "username" in the user name field
And User enters the valid password "password" in the password field
But User should get an error msg "epic sadface: Username is required"
Then user should still on the login page "loginpage"

Scenario: login failed for invalid credentials
Given User launch the browser
When User enters the empty username "username" in the user name field
And User enters the empty password "password" in the password field
But User should get an error msg "epic sadface: Username and password is required"
Then user should still on the login page "loginpage"

Scenario: login failed for invalid credentials
Given User launch the browser
When User enters the valid username "username" in the user name field
And User enters the empty password "password" in the password field
But User should get an error msg "epic sadface: password is required"
Then user should still on the login page "loginpage"

Scenario: Products select page
Given To check products should be displayed
When user must add the sauce labs backpack product in to the cart
And User must click the wishlist button
And User must click the checkout button
And User must enter the required details like firstname lastname and zipcode
And User must click the continue button
Then User should be redirected to the order complete page "Thank you for your order" 

Scenario: Logout Page
When User must click the option button
And User must click the logout button
Then User should be redirected to the login page of the application