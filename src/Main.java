import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        File arquivoDeEntrada = new File("input.txt");
        ReadFile(arquivoDeEntrada);

        System.out.println(VariaveisGlobais.listaClientes + "" + VariaveisGlobais.listaCaminhoes);

    }

    /**
     * Metodo que le linha por linha os dados de um arquivo
     * @param file Arquivo a ser lido
     */
    public static void ReadFile(File file) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;

            for(int i = 1; (st=br.readLine()) != null; i++){
                processaEntrada(st, i);
            }

        }catch (java.io.FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Metodo para processar a entrada pega pelo metodo ReadFile
     *  A primeira linha contém dois números separados n (número de clientes) e m (número de caminhões disponíveis)
     *  Cada linha i das n subsequentes linhas, contém dois números separados por espaço que representam os valores a_i e p_i do cliente.
     *  Cada linha j das m subsequentes linhas, contém dois números separados por espaço que representam os valores x_j e y_j do caminhão.
     *
     * @param linha Linha atual que foi lida
     * @param iteradorAtual Iterado que esta sendo usado no for do metodo ReadFile
     */
    public static void processaEntrada(String linha, int iteradorAtual){

        //Primeira linha
        if (iteradorAtual == 1){
            int indiceEspaco = linha.indexOf(' ');
            VariaveisGlobais.QUANT_CLIENTES = Integer.valueOf(linha.substring(0, indiceEspaco));
            VariaveisGlobais.QUANT_CAMINHOES = Integer.valueOf(linha.substring(indiceEspaco+1));

            //Criando as listas
            VariaveisGlobais.listaClientes = new ArrayList<Cliente>();
            VariaveisGlobais.listaCaminhoes = new ArrayList<Caminhao>();

        }else{

            if (iteradorAtual <= VariaveisGlobais.QUANT_CLIENTES+1){
                int indiceEspaco = linha.indexOf(' ');
                int carga = Integer.valueOf(linha.substring(0,indiceEspaco));
                int dinheiro = Integer.valueOf(linha.substring(indiceEspaco+1));
                String nome = "Cliente" + (VariaveisGlobais.listaClientes.size()+1);
                Cliente cAux = new Cliente(carga, dinheiro, nome);
                VariaveisGlobais.listaClientes.add(cAux);
            }else{
                int indiceEspaco = linha.indexOf(' ');
                int tamanho = Integer.valueOf(linha.substring(0,indiceEspaco));
                int valor = Integer.valueOf(linha.substring(indiceEspaco+1));
                String nome = "Caminhao" + (VariaveisGlobais.listaCaminhoes.size()+1);
                Caminhao cAux = new Caminhao(tamanho, valor, nome);
                VariaveisGlobais.listaCaminhoes.add(cAux);
            }

            //Percorre os clientes
//            for (int i = 1; i < VariaveisGlobais.QUANT_CLIENTES; i++){
//                int indiceEspaco = linha.indexOf(' ');
//                int carga = Integer.valueOf(linha.substring(0,indiceEspaco));
//                int dinheiro = Integer.valueOf(linha.substring(indiceEspaco+1));
//                String nome = "Cliente" + i;
//                Cliente cAux = new Cliente(carga, dinheiro, nome);
//                VariaveisGlobais.listaClientes.add(cAux);
//            }

            //Percorre os caminhoes
//            for (int i = 1; i < VariaveisGlobais.QUANT_CAMINHOES; i++){
//                int indiceEspaco = linha.indexOf(' ');
//                int tamanho = Integer.valueOf(linha.substring(0,indiceEspaco));
//                int valor = Integer.valueOf(linha.substring(indiceEspaco+1));
//                String nome = "Caminhao" + i;
//                Caminhao cAux = new Caminhao(tamanho, valor, nome);
//                VariaveisGlobais.listaCaminhoes.add(cAux);
//            }

        }

    }

}
