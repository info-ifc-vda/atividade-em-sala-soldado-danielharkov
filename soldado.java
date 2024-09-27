package batalhao;
class Soldado {
    // Atributos //PENSAR SOBRE O CONTROLE NO NUMERO DE INSTÂNCIAS
    private String nome;
    private int posicao;

    // Construtor
    public Soldado(String nome, int posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    // Sobrecarga para movimentar o soldado
    public void movimentar() {
        this.posicao += 5; // Distância padrão de movimentação
        System.out.println(nome + " se moveu 5 metros. Nova posição: " + this.posicao);
    }

    // Movimentar com uma distância específica
    public void movimentar(int distancia) {
        this.posicao += distancia;
        System.out.println(nome + " se moveu " + distancia + " metros. Nova posição: " + this.posicao);
    }

    // Sobrecarga para atacar
    public void atacar() {
        atacar("fuzil"); // Ataca com fuzil como padrão
    }

    // Atacar com uma arma específica
    public void atacar(String arma) {
        System.out.println(nome + " atacou com " + arma + "!");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    // Método main para teste
    public static void main(String[] args) {
        // Criando uma instância de Soldado
        Soldado soldado1 = new Soldado("Soldado Fabio Java da Silva", 0);

        // Movimentando o soldado
        soldado1.movimentar();  // Movimenta com distância padrão
        soldado1.movimentar(10); // Movimenta 10 metros

        // Atacando
        soldado1.atacar(); // Ataca com fuzil (padrão)
        soldado1.atacar("baioneta"); // Ataca com baioneta

        // Testando getters e setters
        System.out.println("Nome do soldado: " + soldado1.getNome());
        System.out.println("Posição do soldado: " + soldado1.getPosicao());

        soldado1.setNome("Soldado Beta");
        soldado1.setPosicao(20);

        System.out.println("Novo nome do soldado: " + soldado1.getNome());
        System.out.println("Nova posição do soldado: " + soldado1.getPosicao());
    }
}
