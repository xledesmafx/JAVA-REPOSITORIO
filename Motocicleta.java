
import java.util.Locale;
import java.util.Scanner;


public class Motocicleta {
    Scanner sc = new Scanner(System.in);
    
    private String marca,nro_chasis,descripcion,tipo_moto;
    private int anho, cilindros, monto_alquiler = 0;
    //100 registros
    //()
    
    public void ingresarDatos(){
        this.setMarca(marca);
        this.setAnho(anho);
        this.setDescripcion(descripcion);
        this.setNro_chasis(nro_chasis);
        this.setTipo_moto(tipo_moto);
        this.setMonto_alquiler(monto_alquiler);
        this.setCilindros(cilindros);
    } 

    @Override
    public String toString() {
        return nro_chasis + "\t\t"
                + tipo_moto + "\t\t" + marca + "\t\t" + anho + "\t\t" + monto_alquiler ;
    }
    
    
    
    public void setMarca(String marca) {
        do{
        System.out.println("MARCA: ");
        String mark = sc.next();
        this.marca = mark.toUpperCase();
        }while(this.marca.equals(""));
    }

    public void setNro_chasis(String nro_chasis) {
        do{
        System.out.println("NRO CHASIS: 9A_AAAA-99A9_9AAA");
        this.nro_chasis = sc.next();
        }while(!this.nro_chasis.matches("[0-9][A-Z]_[A-Z]{4}-[0-9]{2}[A-Z][0-9]_[0-9][A-Z]{3}"));

    }

    public void setDescripcion(String descripcion) {
        do{
        System.out.println("DESCRIPCION DEL MOTOR: ");
        String descripcion_motor = sc.next();
        descripcion_motor.toLowerCase().replaceAll("_", " ").replaceAll("#", "");
        this.descripcion = descripcion_motor;
        }while(this.descripcion.equals(""));
    }

    public void setAnho(int anho) {
        System.out.println("ANHO DE FABRICACION: ");
        this.anho = sc.nextInt();
    }

    public void setCilindros(int cilindros) {
        do{
        System.out.println("CILINDROS: ");
        this.cilindros = sc.nextInt();
        }while(this.cilindros <= 2 ||  this.cilindros >= 12);
    }

    public void setMonto_alquiler(int monto_alquiler) {
        System.out.println("MONTO ALQUILER: ");
        this.monto_alquiler = sc.nextInt();
    }

    public void setTipo_moto(String tipo_moto) {
        do{
        System.out.println("TIPO MOTOR Tipo_E = eléctrica, Tipo_S = sport y Tipo_T = trail: ");
        this.tipo_moto = sc.next();
        }while(!this.tipo_moto.matches("Tipo_[EST]"));
        switch (tipo_moto) {
            case "Tipo_E":
                tipo_moto = "electrica";
                break;
            case "Tipo_S":
                tipo_moto = "sport"
                        break;
            case "Tipo_T":
                tipo_moto = "trail";
                break;
        }
        
    }
    
    
    
    
    
}
