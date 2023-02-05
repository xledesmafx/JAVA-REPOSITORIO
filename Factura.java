
package Facturas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Factura {
    Scanner sc = new Scanner(System.in);
    
    private String periodo;
    private int ruc_vend,nro_fact,timbrado,items,ruc_compr;
    private int contador = 0;
    private int monto_total_general= 0 ;
    private int monto_iva_general = 0;
    private int monto_iva, monto_no_iva, monto_total;
    private char tipo_doc;
    int anho;
    
    SimpleDateFormat formatter1=new SimpleDateFormat("yyyy/MM"); 
 
    public Factura() {
    }
    
    public void ingresar_datos() throws ParseException{
        this.setPeriodo(periodo);
        this.setRuc_vend(ruc_vend);
        this.setRuc_compr(ruc_compr);
        this.setItems(items);
        this.setTimbrado(timbrado);
        this.setTipo_doc(tipo_doc);
        this.setNro_fact(nro_fact);
        this.setMonto_total(monto_total);
        this.setMonto_iva(monto_iva);
        this.setMonto_no_iva(monto_no_iva);
    }

    @Override
    public String toString() {
        return anho + "\t\t" + nro_fact + "\t\t" + timbrado + "\t\t\t" + monto_total + "\t\t\t" + monto_iva + "\t\t" + monto_no_iva;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void setPeriodo(String periodo) throws ParseException {
        int anho;
        int mes;
        do{
        System.out.println("PERIODO yyyy/MM: ");
        periodo = sc.next();
        Date fecha_periodo=formatter1.parse(periodo);
        anho = fecha_periodo.getYear();
        mes = fecha_periodo.getMonth();
        }while(anho <2010 && mes <1 && mes > 12);
    }

    public void setRuc_vend(int ruc_vend) {
        System.out.println("RUC vendedor: ");
        this.ruc_vend = sc.nextInt();
    }

    public void setNro_fact(int nro_fact) {
        System.out.println("NUMERO FACTURA: ");
        this.nro_fact = sc.nextInt();
    }

    public void setTimbrado(int timbrado) {
        System.out.println("TIMBRADO: ");
        this.timbrado = sc.nextInt();
    }

    public void setItems(int items) {
        do{
        System.out.println("CANTIDAD DE ITEMS: ");
        this.items = sc.nextInt();
        }while(this.items <= 0 );
    }

    public void setRuc_compr(int ruc_compr) {
        do{
        System.out.println("RUC COMPRADOR");
        this.ruc_compr = sc.nextInt(); 
        }while(this.ruc_compr == this.ruc_vend);
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setMonto_total_general(int monto_total_general) {
        this.monto_total_general = monto_total_general;
    }

    public void setMonto_iva_general(int monto_iva_general) {
        this.monto_iva_general = monto_iva_general;
    }

    public void setMonto_iva(int monto_iva) {
        this.monto_iva = this.getMonto_total()/11;
    }

    public void setMonto_no_iva(int monto_no_iva) {
        this.monto_no_iva = this.getMonto_total()-this.getMonto_iva();
    }

    public void setMonto_total(int monto_total) {
        System.out.println("MONTO TOTAL: ");
        this.monto_total = sc.nextInt();
    }

    public void setTipo_doc(char tipo_doc) {
        do{
        System.out.println("TIPO DOCUMENTO C=crédito, D=debito: ");
        this.tipo_doc = sc.next().charAt(0);
        }while(this.tipo_doc != 'C' && this.tipo_doc != 'D');
    }

    public void setFormatter1(SimpleDateFormat formatter1) {
        this.formatter1 = formatter1;
    }

    public Scanner getSc() {
        return sc;
    }

    public String getPeriodo() {
        return periodo;
    }

    public int getRuc_vend() {
        return ruc_vend;
    }

    public int getNro_fact() {
        return nro_fact;
    }

    public int getTimbrado() {
        return timbrado;
    }

    public int getItems() {
        return items;
    }

    public int getRuc_compr() {
        return ruc_compr;
    }

    public int getContador() {
        return contador;
    }

    public int getMonto_total_general() {
        return monto_total_general;
    }

    public int getMonto_iva_general() {
        return monto_iva_general;
    }

    public int getMonto_iva() {
        return monto_iva;
    }

    public int getMonto_no_iva() {
        return monto_no_iva;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public char getTipo_doc() {
        return tipo_doc;
    }

    public SimpleDateFormat getFormatter1() {
        return formatter1;
    }

    
    
    
    
    
}
