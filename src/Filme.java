public class Filme {
    private String titulo;
    private String diretor;
    private int ano;
    private int duracao;

    public Filme(String titulo, String diretor, int ano, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de lancamento: " + ano);
        System.out.println("Duracao: " + duracao + " minutos");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAno() {
        return ano;
    }

    public int getDuracao() {
        return duracao;
    }
}