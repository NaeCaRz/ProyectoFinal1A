package Fichero;

import Principal.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Fichero {
    protected ArrayList<Usuario> user;
    private final String fileName = "C:/Files/escuela/ProyectoFinal fichero/users.txt";

    public Fichero(ArrayList<Usuario> user) {
        this.user = user;
    }

    public List<String> leerDatos() throws FileNotFoundException {
        List<String> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = " ";
            System.out.println(line);
            while ((line = br.readLine()) != null) {
                data.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void escribirDatos(Usuario user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            // Escribe en el archivo con un salto de línea
            writer.write(user.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirDatos(List<Usuario> users) {
        for (Usuario usuario : users) {
            escribirDatos(usuario);
        }
    }

    public void exportarFichero(ArrayList<Usuario> usuarios) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Usuario current : usuarios) {
                writer.write(current.toString());
                writer.newLine();
            }

            System.out.println("La informacion de los usuarios se ha exportado a " + fileName);

        } catch (IOException e) {
            System.out.println("Error al exportar la informacion de los usuarios: " + e.getMessage());
        }
    }

    // Método para limpiar el archivo TXT
    public void limpiarDatos() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Escribe "Nada" para borrar el fichero
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
