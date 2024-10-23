//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme("Terminator", "Ação", 120);

        Sala sala = new Sala("1", 30, filme);

        Ingresso ingresso = new Ingresso("Metade", "A23", sala, filme);

        Cliente cliente = new Cliente("Luis", "300.200.100-60", "Rua Principal", ingresso);


        sala.setAlterarCapacidade(cliente);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Tipo de Ingresso: " + cliente.getIngresso().getTipo());
        System.out.println("Filme: " + cliente.getIngresso().getFilme().getTitulo());
        System.out.println("Sala: " + cliente.getIngresso().getSala().getNumero());
        System.out.println("qtde clientes: " + sala.getClientes().size());
        System.out.println("Assento: " + cliente.getIngresso().getLocalizacao());
        System.out.println("Capacidade disponivel: " + cliente.getIngresso().getSala().getCapacidade());


        System.out.printf("_______________________________________________________________________\n");



        Ingresso ingresso2 = new Ingresso("Cheia", "A33", sala, filme);

        Cliente cliente2 = new Cliente("Leandro", "400.200.100-60", "Rua Principal", ingresso2);

        sala.setAlterarCapacidade(cliente2);

        System.out.println("Cliente: " + cliente2.getNome());
        System.out.println("Tipo de Ingresso: " + cliente2.getIngresso().getTipo());
        System.out.println("Filme: " + cliente2.getIngresso().getFilme().getTitulo());
        System.out.println("Sala: " + cliente2.getIngresso().getSala().getNumero());
        System.out.println("qtde clientes: " + sala.getClientes().size());
        System.out.println("Assento: " + cliente2.getIngresso().getLocalizacao());
        System.out.println("Capacidade disponivel: " + cliente2.getIngresso().getSala().getCapacidade());




    }
}