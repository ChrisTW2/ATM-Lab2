package worsley.chris.Lab2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import worsley.chris.ATM.Lab2.User;
import worsley.chris.ATM.Lab2.UserManager;

/**
 * Created by christopherworsley on 9/18/16.
 */
public class UserTest {
    User user = new User();

    @Test
    public void userTest(){
        user.setUsername("Crank");
        String expected = "Crank";
        String actual = user.getUsername();

        Assert.assertEquals("Expecting Crank as username", expected, actual);
    }
    @Test
    public void passwordTest(){
        user.setPassword("Coder");
        String expected = "Coder";
        String actual = user.getPassword();

        Assert.assertEquals("Expecting Crank as username", expected, actual);
    }
}
