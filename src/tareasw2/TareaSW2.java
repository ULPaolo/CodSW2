
package tareasw2;


public class TareaSW2 {

         public static void main(String[] args) throws Exception {
              Cuenta acc = new Cuenta("Personal","AC1234",1000);
              acc.debit(500);
              acc.sendWarningMessage();
              //acc.debit(500);
    }
    
}
