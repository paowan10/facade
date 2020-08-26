/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param tanankorn 
     */
    public static void main(String[] args) {
        myfacade object = new myfacade();
        AccountIf account;
        
        CustomerIf customer1 = object.getBankCustomer("John");
        System.out.println("Customer and account information");
        System.out.println("Name = " + customer1.getCustomerName());
        System.out.println("Has " + customer1.getNumAccounts() + " accounts");
        
        account = object.getBankAccount(customer1, 12345);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
        account = object.getBankAccount(customer1, 12346);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
        
        System.out.println("Do Deposit Account 12346");
        object.doDeposit(2000, customer1, 12346);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
         
        System.out.println("All Account");
        ArrayList<AccountIf> accounts1 = object.getBankCustomer("John").getllAccounts();
        for(AccountIf accounted : accounts1) {
            System.out.println("Account number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
        }
        
        CustomerIf customer2 = object.getBankCustomer("Jay");
        System.out.println("Customer and account information");
        System.out.println("Name = " + customer2.getCustomerName());
        System.out.println("Has " + customer2.getNumAccounts() + " accounts");
        
        account = object.getBankAccount(customer2, 789456);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
        account = object.getBankAccount(customer2, 456123);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
        
        System.out.println("Do Deposit Account 789456");
        object.doDeposit(2000, customer2, 789456);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
         
        System.out.println("All Account");
        ArrayList<AccountIf> accounts2 = object.getBankCustomer("Jay").getllAccounts();
        for(AccountIf accounted : accounts2) {
            System.out.println("Account number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
        }
    }
    
}
