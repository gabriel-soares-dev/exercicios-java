package jeps;

import java.io.*;

public class ExemploJEP415 {

    public static void main(String[] args){
        
        // Dados serializados (exemplo)
        byte[] dadosSerializados = obterDadosSerializados();

        // Aplicando filtro de desserialização
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(dadosSerializados));
            MeuObjeto objetoDesserializado = (MeuObjeto) ois.readObject();
            System.out.println("Objeto desserializado: " + objetoDesserializado);
        } catch (Exception e) {
            System.err.println("Erro ao desserializar objeto: " + e.getMessage());
        }
    }
    
    private static byte[] obterDadosSerializados() {
        // Simulação de dados serializados (substitua com seus próprios dados)
        MeuObjeto meuObjeto = new MeuObjeto("Exemplo de objeto serializado");
        try {
            // Serialização do objeto
            java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
            java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
            oos.writeObject(meuObjeto);
            return baos.toByteArray();
        } catch (IOException e) {
            System.err.println("Erro ao serializar objeto: " + e.getMessage());
            return new byte[0];
        }
    }

    // Classe de exemplo (deve ser serializável)
    static class MeuObjeto implements java.io.Serializable {
        private String nome;

        public MeuObjeto(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "MeuObjeto{" +
                    "nome='" + nome + '\'' +
                    '}';
        }
    }
}