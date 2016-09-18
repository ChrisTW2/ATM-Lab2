package worsley.chris.Lab2;

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
        user.setUsername();
    }
}
