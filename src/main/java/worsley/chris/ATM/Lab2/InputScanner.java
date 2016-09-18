package worsley.chris.ATM.Lab2;

import java.util.Scanner;

/**
 * Created by christopherworsley on 9/18/16.
 */
public class InputScanner {
    private Scanner scanner = new Scanner(System.in);
    private String userInput;

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
    public String getUserInput(){
        return userInput;
    }
}
