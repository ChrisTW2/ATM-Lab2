package worsley.chris.ATM.Lab2;

import java.util.HashMap;

/**
 * Created by christopherworsley on 9/18/16.
 */
public class UserManager extends Enums {

    private HashMap<String, String> userNameAndPassword = new HashMap<String, String>();

    private AccountOpenCloseFrozen accountOpenCloseFrozen;

    private AccountType accountType;

    public UserManager(){
    }

    public void setUserNameAndPassword(User userName, User password){
        userNameAndPassword.put(userName.getUsername(), password.getPassword());
    }
    public HashMap<String, String> getUserNameAndPassword(){
        return userNameAndPassword;
    }
    public void setOpenCloseFrozen(AccountOpenCloseFrozen accountOpenCloseFrozen){
       this.accountOpenCloseFrozen = accountOpenCloseFrozen;
    }
    public AccountOpenCloseFrozen getOpenCloseFrozen(){
        return accountOpenCloseFrozen;
    }
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public AccountType getAccountType(){
        return accountType;
    }



}
