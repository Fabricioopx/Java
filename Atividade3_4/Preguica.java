public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void subirArvore() {
        System.out.println("**Preguiça subindo árvore**");
    }

    public void gritar() {
        System.out.println("**Preguiça gritando**");
        super.emitirSom("audio/sloth-scream.wav");
    }
}
