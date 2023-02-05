
package Facturas;

import java.text.ParseException;
import java.util.Scanner;


public class App_facturas {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int cant_facturas_ = 0;
        int monto_total_gral= 0;
        int monto_iva_gral=0;
        
         System.out.println("---APLICACION FACTURAS---");
         System.out.println("-------------------------");
         System.out.print("INGRESAR CANTIDAD DE FACTURAS:\t");    
            
         int cant_facturas = sc.nextInt();

         Factura [] arregloFactura = new Factura[cant_facturas];
         
         
         
         for(int i=0;i <=arregloFactura.length-1; i++){
             System.out.println("FACTURA: "+(i+1));
             
             Factura fact = new Factura();
             cant_facturas_ = cant_facturas + 1;
             System.out.println(cant_facturas);
             fact.ingresar_datos();
             monto_total_gral = monto_total_gral + fact.getMonto_total();
             monto_iva_gral = monto_iva_gral + fact.getMonto_iva();
             arregloFactura[i] = fact; 
         }
         
         
         System.out.println("*****DETALLE FACTURA*****");
         System.out.println("Periodo\t\tFactura\t\tTimbrado\t\tMonto-Total\t\tIVA\t\tMonto-sin-IVA");
         System.out.println("----------------------------------------------------------------------------------------");
         for(Factura elemento: arregloFactura){
             System.out.println(elemento.toString());
         }
         System.out.println("----------------------------------------------------------------------------------------");
         System.out.println("CANTIDAD DE FACTURAS:\t"+cant_facturas_+"\nMONTO TOTAL GENERAL:\t"+monto_total_gral + "\nMONTO IVA GENERAL:\t" + monto_iva_gral);
              
    }
 }
      

