public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(double valor) {
        if (valor > 0) {
            velocidade += valor;
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            velocidade -= valor;

            if (velocidade < 0) {
                velocidade = 0;
            }
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidade() {
        return velocidade;
    }
}
