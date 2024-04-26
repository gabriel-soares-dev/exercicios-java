import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellWithParameter {

    public static void main(String[] args) {
        try {
            String shPath = "myScript.sh";
            String param1 = "parametro1";
            
            ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", shPath, param1);
            Process process = processBuilder.start();
 
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.out.println("Ocorreu um erro na execução do script.");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
