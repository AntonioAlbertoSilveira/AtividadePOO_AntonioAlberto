public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    public Elevador() {
        inicializar(0, 0);
    }

    public Elevador(int capacidade, int totalAndares) {
        inicializar(capacidade, totalAndares);
    }

    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = Math.max(0, capacidade);
        this.totalAndares = Math.max(0, totalAndares);
        this.andarAtual = 0;
        this.pessoas = 0;
    }

    public void entrar() {
        if (pessoas < capacidade) {
            pessoas++;
            System.out.println("Pessoa entrou no elevador.");
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void sair() {
        if (pessoas > 0) {
            pessoas--;
            System.out.println("Pessoa saiu do elevador.");
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        } else {
            System.out.println("Ja esta no ultimo andar!");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
        } else {
            System.out.println("Ja esta no terreo!");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual >= 0 && andarAtual <= totalAndares) {
            this.andarAtual = andarAtual;
        }
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        if (totalAndares >= andarAtual && totalAndares >= 0) {
            this.totalAndares = totalAndares;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade >= pessoas) {
            this.capacidade = capacidade;
        }
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        if (pessoas >= 0 && pessoas <= capacidade) {
            this.pessoas = pessoas;
        }
    }
}
