
public class App_Motocicleta {
    
    public static void main(String[] args) {
        System.out.println("---CARGAR DATOS MOTOCICLETAS---");
        
        Motocicleta [] arregloMotocicleta = new Motocicleta[2];
        for(int i = 0; i <= arregloMotocicleta.length-1;i++){
            Motocicleta m1 = new Motocicleta();
            if(i <= arregloMotocicleta.length){
            m1.ingresarDatos();
            arregloMotocicleta[i] = m1;
            }else
                System.out.println("SE SOBREPASO EL TAMANHO DEL ARREGLO");
        }

        
        System.out.println("___MOTO S.A___");
        System.out.println("###########################################################################################");
        System.out.println("LINEA\t\tCHASIS\t\tTIPO_MOTO\t\tMARCA\t\tANHO\t\tMONTO");
        for(Motocicleta elemento:arregloMotocicleta){
            int i = 0;
            i = i + 1;
            System.out.println(i+ "\t\t" + elemento.toString());
        }
    }
}
