Feature: To Check Luma Jacket Product for both men and women
@womenjacket
Scenario Outline: To order women's jacket
Given User open the url in browser
When User click the signIn button
#Then User navigates to the login page "Customer Login Page"
When User enters username "<Username>" in the Username field
And User enters password "<Password>" in the Password field
And User clicks the SignIn button
Then User navigates to the home page "Home Page"
And User move on women
And User move on tops 
And User move on jackets 
#Then User should be redirect to the product page 
When User select juno jacket 
And User clicks size M 
And User clicks green color 
And User clicks Add To Cart button
And User clicks the shopping cart icon
And User clicks proceed to checkout button
#Then User redirect to the Order Page
When User clicks on Next button
#Then User should redirect to the Payment Page
When User clicks the Place Order button
Then  User redirect to the Thank you for your purchase page 
Examples:
| Username   | Password   |
| seleniumsquad2024@gmail.com   | SeleniumSquad@123   |

@menjacket
Scenario: To order Men's jacket
Given User open the url in browser
When User click the signIn button
#Then User navigates to the login page "Customer Login Page"
When User enters username "seleniumsquad2024@gmail.com" in the Username field
And User enters password "SeleniumSquad@123" in the Password field
And User clicks the SignIn button
Then User navigates to the home page "Home Page"
And User move on Men
And User move on tops 
And User move on mens jackets 
#Then User should be redirect to the product page 
When User select Montana Wind Jacket
And User clicks size M 
And User clicks green color 
And User clicks Add To Cart button
And User clicks the shopping cart icon
And User clicks proceed to checkout button
#Then User redirect to the Order Page
When User clicks on Next button
#Then User should redirect to the Payment Page
When User clicks the Place Order button
Then  User redirect to the Thank you for your purchase page 