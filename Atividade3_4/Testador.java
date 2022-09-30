public class Testador {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Catatau", 2);
        cachorro.correr();
        cachorro.latir();

        Cavalo cavalo = new Cavalo("Pé de Pano", 8);
        cavalo.correr();
        cavalo.relinchar();

        Preguica preguica = new Preguica("Baiano", 5);
        preguica.subirArvore();
        preguica.gritar();
    }
}
