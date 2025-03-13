Feature: To Buy Luma Gear Product 

Scenario: To order overnight Duffle bag
Given User open the url in browser
When User click the signIn button
#Then User navigates to the login page "Customer Login Page"
When User enters username "seleniumsquad2024@gmail.com" in the Username field
And User enters password "SeleniumSquad@123" in the Password field
And User clicks the SignIn button
Then User navigates to the home page "Home Page"
And User move on Gear
And User move on Bags 
#Then User should be redirect to the product page 
When User click on Overnight Duffle 
#And verify product page displayed 
And User enters qty "5"
And User clicks Add To Cart button
And User clicks the shopping cart icon
And User clicks proceed to checkout button
#Then User redirect to the Order Page
When User clicks on Next button
When User clicks the Place Order button
Then  User redrect to the Thank you for your purchase page 

