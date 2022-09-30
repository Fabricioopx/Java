import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Animal {
    public String nome;
    public int idade;

    public Animal(String nome, int idade) {
		this.nome = nome;
        this.idade = idade;
	}

    /**
     * @param filePath deve ser um arquivo do tipo .wav
     */
    public static void emitirSom(String filePath) {
        File f = new File(filePath);
        
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(f));
            clip.start();

            // reproduzir o áudio por 3000 milisegundos (3 segundos)
            try {
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            clip.stop();
        } catch (Exception e){
            System.out.println("Ocorreu um erro ao tentar reproduzir o áudio:");
            e.printStackTrace();
        }
    }
}