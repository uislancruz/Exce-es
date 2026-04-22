package com.algaworks.cadastro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ServicoCadastroAnuncio {
    public void cadastrar(String codigo, String descricao){
        Path arquivo = Path.of("C:\\Users\\Uislan\\OneDrive\\Documentos\\abc", codigo + ".txt");

        try{
            Files.writeString(arquivo, descricao);
        } catch (IOException e) {

            throw new CadastroAnuncioException("Erro na escrita do arquivo de anuncio", e);

//            //é melhor usar alguma bibliote de logging parra fazer isso
//            System.out.println("Erro ao criar o arquivo");
//            e.printStackTrace();

        }
    }
}
