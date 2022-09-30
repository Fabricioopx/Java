public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void correr() {
        System.out.println("**Cavalo correndo**");
    }
    
    public void relinchar() {
        System.out.println("**Cavalo relinchando**");
        super.emitirSom("audio/horse-neigh.wav");
    }

}