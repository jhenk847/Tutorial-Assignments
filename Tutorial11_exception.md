# Tutorial on Java Package and Exception Handling 

In this tutorial you are going to practice how you can create your own package and how you can import that package in your program. 
Also, you are going to practice how to create your own exceptions and you can throw it in your methods. The actual tasks are 
described in the following sections.

## Task 1
Import the project from the repository “Tutorial Assignments”. Create a new package name MyExceptions. Now create a new class 
named *InsufficientFundsException* that extends the exception class to create your own exception as we have seen during the lecture class.
The code is given below for you:

```
// File Name InsufficientFundsException.java
import java.io.*;

public class InsufficientFundsException extends Exception {
   private double amount;
   
   public InsufficientFundsException(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
}
```

Now, create another package called MyPackage and add a class named *CheckingAccount* that throws the InsufficientFundsException. 
The class also has the following implementations:
- It has two private members **balance** and **number** to represent current account balance and the account number respectively.
- A getter function for each of the variable **balance** and **number**.
- A method **void deposit(double amount)** that adds the amount to the current balance.
- A method **void withdraw(double amount)** that deducts the withdraw amount from the current balance if the amount is less than or
equals to the balance, otherwise it throws an InsufficientFundsException with the amount that is needed to complete the withdraw 
operation. 
- Remember to import the packages you need in your classes even if it is your own package.
- Remember to catch all necessary exceptions where required.
- Create a AccountDemo class inside your own package *MyPackage* to demonstrate your work. You may use the following code in your
demo class:
```
public static void main(String [] args) {
   CheckingAccount c = new CheckingAccount(101);
   System.out.println("Depositing $500...");
   c.deposit(500.00);
   
   try {
      System.out.println("\nWithdrawing $100...");
      c.withdraw(100.00);
      System.out.println("\nWithdrawing $600...");
      c.withdraw(600.00);
   } catch (InsufficientFundsException e) {
      System.out.println("Sorry, but you are short $" + e.getAmount());
      e.printStackTrace();
   }
}
```


## Task 2

You are given a file named **ListOfNumbers** inside the package **Tutorial11**. Add a *readList* method to ListOfNumbers.java. 
This method should read in int values from a file, print each value, and append them to the end of a **vector**. 
You should catch all appropriate errors. You will also need a text file containing numbers to read in.

## Submission Due
By March 31st

## Grading

- 2 points for completing both tasks on time. 
