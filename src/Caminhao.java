import java.util.Arrays;

public class Caminhao {

    protected int tamanho; //Quanto de carga pode levar
    protected int valor; //Quanto custa para levar
    protected String nome; //nome de identificação

    public Caminhao(int tamanho, int valor, String nome) {
        this.tamanho = tamanho;
        this.valor = valor;
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

