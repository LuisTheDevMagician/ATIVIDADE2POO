public class Ingresso {
    private String tipo;
    private String localizacao;
    private Sala sala;
    private Filme filme;

    public Ingresso(String tipo, String localizacao , Sala sala, Filme filme) {
        this.tipo = tipo;
        this.localizacao = localizacao;
        this.sala = sala;
        this.filme = filme;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}
