public class Mago extends Personagem {

    private int mana;
    private int poderMagico;

    public Mago(String nome, int vidaMaxima, int mana, int poderMagico) {
        super(nome, "Mago", vidaMaxima);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void lancarMagia() {
        if (mana < 10) {
            System.out.println(getNome() + " não possui mana suficiente!");
            return;
        }

        mana -= 10;

        System.out.println(getNome() + " lançou uma magia com poder " + poderMagico + "!");
        System.out.println("Mana restante: " + mana);
    }
}
