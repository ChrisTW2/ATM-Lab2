package worsley.chris.ATM.Lab2;

/**
 * Created by christopherworsley on 9/18/16.
 */
public class Bank {
    UserManager userManager = new UserManager();
    TransactionManager transactionManager = new TransactionManager();

    private double checkingInterestRate = 2.2;
    private double savingsInterestRate = 2.3;
    private double investmentInterestRate = 2.4;


    public UserManager getUserManager(){
        return userManager;
    }
    public TransactionManager transactionManager(){
        return transactionManager;
    }

    public double  getCheckingInterestRate(){
        return checkingInterestRate;
    }
    public double getSavingsInterestRate(){
        return savingsInterestRate;
    }
    public double getInvestmentInterestRate(){
        return investmentInterestRate;
    }

}
