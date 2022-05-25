!!!
**Notes:**
* After you make any change you need to restart the application using the **Build & Restart application** command from the second item from the right side bar
* Make sure to run test cases using **Run Test** button in order to validate your solution
!!!
  
The following is an error check algorithm used for testing if a card numberis valid. Given a card number:
1. From the last digit moving backwards, double every second digit
2. If the doubled number is greater than 9, add it’s two digits together
3. Sum all card digits together (taking the value of step 2 for every second digit)
4. If the summed total’s end digit is a zero, it is a valid card number
  
### REST Endpoint
There is a ```CardNumberValidationController``` class in the project, leveraging Spring:
  
1. Register ```CardNumberValidationService``` as a service so it can be autowired
2. Register ```CardNumberValidationController``` as a REST controller so it is detected by the ApplicationContext
3. Add the endpoint **GET** `/card/number/{number}` to the controller that allows card numbers to be RESTfully validated via the ```CardNumberValidationService``` algorithm implemented earlier. The response is a boolean
  
### Test cases
There is a ```CardNumberValidationServiceTest``` class, it has the following two example card numbers declared as statics. Make sure to implement tests using these example numbers to ensure your algorithm is working correctly:  
  
* 4242424242426742 - Valid
* 1111111111111111 - Invalid
  
### Reason  
Open the file `SOLUTION.md` and:
1. Explain how your implementation works
2. If you were given more time, how might you change your implementation to be better?

!!!
**Notes:**
* After you make any change you need to restart the application using the **Build & Restart application** command from the second item from the right side bar
* Make sure to run test cases using **Run Test** button in order to validate your solution
!!!
