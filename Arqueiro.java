public class Arqueiro extends Personagem {

    private int quantidadeFlechas;
    private int precisao;

    public Arqueiro(String nome, int vidaMaxima, int quantidadeFlechas, int precisao) {
        super(nome, "Arqueiro", vidaMaxima);
        this.quantidadeFlechas = quantidadeFlechas;
        this.precisao = precisao;
    }

    public int getQuantidadeFlechas() {
        return quantidadeFlechas;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void atirar() {
        if (quantidadeFlechas <= 0) {
            System.out.println(getNome() + " não possui flechas!");
            return;
        }

        quantidadeFlechas--;

        System.out.println(getNome() + " atirou uma flecha com precisão " + precisao + "!");
        System.out.println("Flechas restantes: " + quantidadeFlechas);
    }
}