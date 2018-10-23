import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File arquivoDeEntrada = new File("input.txt");
        ReadFile(arquivoDeEntrada);
    }

    public static void ReadFile(File file) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;


            for(int i = 1; (st=br.readLine()) != null; i++){

                System.out.println(st);

            }

        }catch (java.io.FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
