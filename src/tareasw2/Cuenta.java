/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasw2;

/**
 *
 * @author Paolo
 */
public class Cuenta {
       
    private String type;
       private String accountNumber;
       private int amount;
       public Cuenta(String type,String accountNumber,int amount)
       {
              this.amount=amount;
              this.type=type;
              this.accountNumber=accountNumber;
       }
       public void debit(int debit) throws Exception
       {
              if(amount <= 500)
              {
                     throw new Exception("Mininum balance shuold be over 500");
              }
              amount = amount-debit;
              System.out.println("Now amount is" + amount);
       }
       public void transfer(Cuenta from,Cuenta to,int cerditAmount) throws Exception
       {
              if(from.amount <= 500)
              {
                     throw new Exception("Mininum balance shuold be over 500");
              }
              to.amount = amount+cerditAmount;
       }
       public void sendWarningMessage()
       {
              if(amount <= 500)
              {
                     System.out.println("amount should be over 500");
              }
       }

}
