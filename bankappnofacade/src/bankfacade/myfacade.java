package bankfacade;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;

public class myfacade {
 private ArrayList<CustomerIf> customers = new ArrayList();
  myfacade(){
    ArrayList<AccountIf> cust1Accounts = new ArrayList();
    AccountIf account = new BankAccount(12345);
    account.deposit(500);
    cust1Accounts.add(account);
    account = new BankAccount(12346);
    account.deposit(1000);
    cust1Accounts.add(account);
    CustomerIf customer1 = new BankCustomer("John", cust1Accounts);
    customers.add(customer1);
     
     
     ArrayList<AccountIf> cust2Accounts = new ArrayList();
     account = new BankAccount(789456);
        account.deposit(1500);
        cust2Accounts.add(account);
        account = new BankAccount(456123);
        account.deposit(2000);
        cust2Accounts.add(account);
        CustomerIf customer2 = new BankCustomer("Jay", cust2Accounts);
        customers.add(customer2);
  }
  
    
     public void  doDeposit(double amt, CustomerIf cust, int accNo){
      cust.getAccount(accNo).deposit(amt);
     }

     public AccountIf  getBankAccount(CustomerIf cust, int accNo){
      return cust.getAccount(accNo);
     }

     public CustomerIf  getBankCustomer(String custName){
      for(CustomerIf cus : customers){
        if(cus.getCustomerName().equals(custName)){
           return cus;
          }
        }
       return null;
     }


    
     
    
    
}