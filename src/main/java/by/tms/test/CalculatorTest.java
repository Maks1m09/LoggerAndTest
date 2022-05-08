package by.tms.test;

import by.tms.entity.User;
import by.tms.service.CalculatorService;
import by.tms.service.UserService;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {


     @Test
    public void calTest (){
         CalculatorService calcService = new CalculatorService();
          Double result = calcService.calc(1,2,"sum",null);
          assertEquals ("Test passed",result.doubleValue(), 5.0 );

     }

    @Test
    public void addUser (){
         UserService userService = new UserService();
        boolean userAddOrNot = userService.add(new User("Maxim", "123", "Bylka"));
        assertEquals("Test passed", userAddOrNot, false);
    }

}
