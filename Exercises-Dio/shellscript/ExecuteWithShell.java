import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteWithShell {
    public static void main(String[] args) {
        try {

            // Comando que você deseja executar
            String command = "ls";
            String type = "-a";

            // Cria o construtor de processo com o comando
            ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", type, command);

            // Inicia o processo
            Process process = processBuilder.start();

            // Lê a saída do comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Aguarda o término do processo e verifica se ocorreu algum erro
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.out.println("Ocorreu um erro na execução do comando.");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
