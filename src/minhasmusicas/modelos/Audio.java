package minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducao;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) { //possível cadastrar um novo nome como título
        this.titulo = titulo;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){    //metodo
        this.totalCurtidas++;
    }

    public void reproduz(){    //metodo
        this.totalDeReproducao++;
    }
}