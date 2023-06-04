package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContatosManager {
    public static void salvarContatos(List<Contato> contatos, String arquivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(arquivo);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(contatos);
            objOut.close();
            fileOut.close();
            System.out.println("Contatos salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os contatos: " + e.getMessage());
        }
    }

    public static List<Contato> recuperarContatos(String arquivo) {
        List<Contato> contatos = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(arquivo);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            contatos = (List<Contato>) objIn.readObject();
            objIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao recuperar os contatos: " + e.getMessage());
        }
        return contatos;
    }
}