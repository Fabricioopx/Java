public class Exercicio05_GPS_main { 
    
    public static void main(String[] args) {
        
        Exercicio05_GPS gps1 = new Exercicio05_GPS(); 
        Exercicio05_GPS gps2 = new Exercicio05_GPS("Hawaii");
        
        gps1.mostrar();
        gps2.mostrar(); 
        
        gps1.setIdioma("Spanish");
        
        gps1.mostrar();
        
        
        
        System.exit(0);
    }
    
}