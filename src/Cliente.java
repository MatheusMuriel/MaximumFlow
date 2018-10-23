public class Cliente {
    protected int carga;
    protected int dinheiro;
    protected String nome;

    public Cliente(int carga, int dinheiro, String nome) {
        this.carga = carga;
        this.dinheiro = dinheiro;
        this.nome = nome;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
