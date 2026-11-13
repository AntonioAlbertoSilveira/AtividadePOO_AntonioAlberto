public class Principal {
    public static void main(String[] args) {

        // Ativ 1-Fatura
        Fatura fatura = new Fatura(100, "Teclado", 3, 50.0);

        System.out.println("Numero: " + fatura.getNumeroItem());
        System.out.println("Descricao: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preco: R$ " + fatura.getPrecoUnitario());
        System.out.println("Valor da fatura: R$ " + fatura.calcular_valor_fatura());



        // Ativ 2-Elevador
        Elevador elevador = new Elevador(5, 10);
        elevador.entrar();
        elevador.entrar();
        elevador.subir();
        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas: " + elevador.getPessoas());


        // Ativ 3-Pessoa
        Pessoa pessoa = new Pessoa("Jeferson", 20, "12345678900");
        pessoa.exibirDados();


        // Ativ 4-Produto
        Produto produto = new Produto("Mouse", 80.0, 10);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor total: R$ " + produto.calcularTotal());


        // Ativ 5-Conta banco
        ContaBancaria conta = new ContaBancaria(123, "Antonio");
        conta.depositar(1000);
        conta.sacar(300);
        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());


        // Ativ 6-Carro
        Carro carro = new Carro("Toyota", "Yaris", 2022);
        carro.acelerar(60);
        carro.frear(20);
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");


        // Ativ 7-Livro
        Livro livro = new Livro(" Miguel de Cervantes", "Dom Quixote", 1605);
        livro.emprestar();
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Disponivel: " + livro.isDisponivel());


        // Ativ 8-Funcionario
        Funcionario funcionario = new Funcionario("Pedro", 3000, "Analista");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salario base: R$ " + funcionario.getSalarioBase());
        System.out.println("Salario liquido: R$ " + funcionario.calcularSalarioLiquido());


        // Ativ 9-Retangulo
        Retangulo retangulo = new Retangulo(5, 10);
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());


        // Ativ 10-Aluno
        Aluno aluno = new Aluno(1234, "Lucas", 8.5);
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Media: " + aluno.getMediaFinal());
        System.out.println("Aprovado: " + aluno.verificarAprovacao());


        // Ativ 11-Filme
        Filme filme = new Filme("Oppenheimer", "Christopher Nolan", 2023, 181);
        filme.exibirInformacoes();


        // Ativ 12-Celular
        Celular celular = new Celular("Iphone", "15", 8000, 256);
        celular.exibirResumo();

    }
}