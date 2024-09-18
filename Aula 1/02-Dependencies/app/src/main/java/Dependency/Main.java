package Dependency;

import com.google.common.io.Files;
import java.io.IOException;
import java.io.File;

public class Main {
    public void createFile() {
        String fileName = "Teste_de_TXT.txt";
        File file = new File(fileName);
        
        String content = "  De tudo, ao meu amor serei atento\n" +
                "    Antes, e com tal zelo, e sempre, e tanto\n" +
                "    Que mesmo em face do maior encanto\n" +
                "    Dele se encante mais meu pensamento.\n" +
                "\n" +
                "    Quero vivê-lo em cada vão momento\n" +
                "    E em louvor hei de espalhar meu canto\n" +
                "    E rir meu riso e derramar meu pranto\n" +
                "    Ao seu pesar ou seu contentamento.\n" +
                "\n" +
                "    E assim, quando mais tarde me procure\n" +
                "    Quem sabe a morte, angústia de quem vive\n" +
                "    Quem sabe a solidão, fim de quem ama\n" +
                "\n" +
                "    Eu possa me dizer do amor (que tive):\n" +
                "    Que não seja imortal, posto que é chama\n" +
                "    Mas que seja infinito enquanto dure.";
        try {
			Files.write(content.getBytes(), file);
		} catch (IOException exception) {
			return;
		}

    }

    public static void main(String[] args) {
        new Main().createFile();
        
    }
}
