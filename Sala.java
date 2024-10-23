import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String numero;
    private int capacidade;
    private Filme filme;
    private List<Cliente> clientes;

    public Sala(String numero, int capacidade, Filme filme) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.filme = filme;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setAlterarCapacidade(Cliente cliente) {
        this.clientes.add(cliente);
        this.capacidade = capacidade - 1;
   }



}
