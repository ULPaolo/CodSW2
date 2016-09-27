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
       
       private String tipo;
       private String numeroCuenta;
       private int monto;
       public Cuenta(String tipo,String numeroCuenta,int monto)
       {
              this.monto=monto;
              this.tipo=tipo;
              this.numeroCuenta=numeroCuenta;
       }
       public void debito(int debito) throws Exception
       {
              if(cuentaDebajoDe())
              {
                     throw new Exception("Balance mínimo debe ser de 500");
              }
              monto = monto-debito;
              System.out.println("El monto actual es " + monto);
       }
       public void transferencia(Cuenta from,Cuenta to,int montoEnviado) throws Exception
       {
              if(from.cuentaDebajoDe())
              {
                     throw new Exception("Balance mínimo debe ser 500");
              }
              to.monto = monto+montoEnviado;
       }
       public void sendWarningMessage()
       {
              if(cuentaDebajoDe())
              {
                     System.out.println("El monto debe ser mayor a 500");
              }
       }
       
         private boolean cuentaDebajoDe(){
             return monto<=500;
       }

}
