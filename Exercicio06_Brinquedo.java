public class Exercicio06_Brinquedo {
    
    private String nome; 
    private String[] faixaEtaria = {"0 a 2","3 a 5", "6 a 10", "acima de 10"}; 
    private float preco; 
    private int i; // contador
    
    public Exercicio06_Brinquedo(){
        
    }
    
    public Exercicio06_Brinquedo(String nome){
        
        this.nome = nome;
        
    }
    
    public Exercicio06_Brinquedo(String nome, float preco){
        
        this.nome = nome ; 
        this.preco = preco;
    }
    
    public void mostrar(){ 
        
        System.out.println("\n>> Brinquedo << " + "\n\nNome: " + getNome() +
                "\nFaixa Etaria: " + getFaixaEtaria() + "\nPreço: " + getPreco());
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        if(this.i < 4 && this.i >= 0)
        return faixaEtaria[this.i];
        else 
            return "Faixa Etaria inexistente!";
    }

    public void setFaixaEtaria(int i) {
        if (i>=0 && i<4) {
            
        this.faixaEtaria[this.i] = faixaEtaria[i];
        }
        else 
            System.out.println("Faixa Etaria inexistente!");
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
    
}