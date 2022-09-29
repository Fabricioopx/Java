public class Exercicio05_GPS { 
    
    private String idioma;
    private String rota;
    
    //metodo default
    public Exercicio05_GPS (){
        this.idioma = "English";
        this.rota = "California";
    }
    
    //metodo idioma portugues
    public Exercicio05_GPS (String rota){
        this.idioma = "Portugues - BR";
        this.rota = rota;
    } 
    
    public void mostrar(){
        
        System.out.println("\nIdioma: " + getIdioma() + "\nRota: " + getRota());
        
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
    
    
    
}