package com.algaworks.excecoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    static void main(String[] args) {
        try {
            Path arquivo = Path.of("C:\\Users\\Uislan\\OneDrive\\Documentos\\AulaExcecoes\\teste.txt");
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo" + e.getMessage());
        }

    }
}
