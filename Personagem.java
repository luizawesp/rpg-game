public class Personagem {
    private String nome;
    private String classe;
    private int vidaAtual;
    private int vidaMaxima;
    private int nivel;
    private int quantidadeMoedas;

    public Personagem(String nome, String classe, int vidaMaxima) {
        this.nome = nome;
        this.classe = classe;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.nivel = 1;
        this.quantidadeMoedas = 100;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getNivel() {
        return nivel;
    }

    public int getQuantidadeMoedas() {
        return quantidadeMoedas;
    }

    public void SubirNivel() {
        nivel += 1;
    }

    public void ReceberMoedas(int moedasganhas) {
        quantidadeMoedas = quantidadeMoedas + moedasganhas;
    }

    public void gastarMoedas(int moedasgastas) {
        if (quantidadeMoedas < moedasgastas) {
            System.out.println("Ação proibida.");
            return;
        }

        quantidadeMoedas -= moedasgastas;
    }

    public void receberDano() {
        if (vidaAtual <= 0) {
            System.out.println("Ação proibida");
            return;
        }

        vidaAtual -= 30;

        if (vidaAtual < 0) {
            vidaAtual = 0;
        }
    }

    public void recuperarVida() {
        if (vidaAtual >= vidaMaxima) {
            System.out.println("Ação proibida");
            return;
        }

        vidaAtual += 15;

        if (vidaAtual > vidaMaxima) {
            vidaAtual = vidaMaxima;
        }
    }
}
