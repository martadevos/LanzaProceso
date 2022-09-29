package LanzaProceso;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("src/LanzaProceso/HolaMundo.java");
        pb.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\LanzaProceso\\src\\LanzaProceso\\LanzaProceso\\bin"));
        System.out.println("Voy a lanzar el proceso");
        pb.inheritIO();
        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
