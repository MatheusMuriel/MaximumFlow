import java.util.List;
import java.util.ArrayList;

public class Grafo {

    public Grafo(){
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();
    }

    protected Vertice adicionaVertice(String nome, int peso, int valor, String tipo){
        tiposVertices _tipo = tiposVertices.valueOf(tipo);
        Vertice v = new Vertice(nome, peso, valor, _tipo);
        vertices.add(v);
        return v;
    }

    protected Aresta adicionaAresta(Vertice origem, Vertice destino){
        Aresta a = new Aresta(origem, destino);
        origem.adicionaLigacao(a);
        arestas.add(a);
        return a;
    }

    public String toString() {
        String saida = "";
        for (Vertice v : vertices){
            saida += v.nome + " --> ";
            for (Aresta a : v.ligacoes){
                Vertice vAux = a.destino;
                saida += vAux.nome+ ", ";
            }
            saida += "\n";
        }
        return saida;
    }

    List<Vertice> vertices;
    List<Aresta>  arestas;
    public class Vertice{
        String nome;
        int peso;
        int valor;
        tiposVertices tipo;
        List<Aresta> ligacoes;

        Vertice(String nome, int peso, int valor, tiposVertices tipo){
            this.nome = nome;
            this.peso = peso;
            this.valor = valor;
            this.tipo = tipo;
            this.ligacoes = new ArrayList<Aresta>();
        }

        protected void adicionaLigacao(Aresta a){
            ligacoes.add(a);
        }

    }
    public class Aresta{
        Vertice origem;
        Vertice destino;

        protected Aresta(Vertice origem, Vertice destino){
            this.origem = origem;
            this.destino = destino;
        }

    }
    public enum tiposVertices {
        cliente, caminhao;
    }
}