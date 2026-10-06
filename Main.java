public class Main {

        public static void main(String[] args) {

                Guerreiro guerreiro = new Guerreiro("Matilda", 120, 20, 15);

                Mago mago = new Mago("Elize", 80, 100, 30);

                Arqueiro arqueiro = new Arqueiro("Anne", 90, 20, 25);


                System.out.println("GUERREIRO");
                System.out.println("Nome: " + guerreiro.getNome());
                System.out.println("Classe: " + guerreiro.getClasse());
                System.out.println("Vida: " + guerreiro.getVidaAtual() + "/" + guerreiro.getVidaMaxima());
                System.out.println("Nível atual: " + guerreiro.getNivel());
                System.out.println("Moedas: " + guerreiro.getQuantidadeMoedas());
                System.out.println("Força: " + guerreiro.getForca());
                System.out.println("Armadura: " + guerreiro.getArmadura());

                guerreiro.golpear();
                guerreiro.receberDano();
                guerreiro.recuperarVida();
                guerreiro.ReceberMoedas(30);
                guerreiro.gastarMoedas(50);


                System.out.println("\n--- MAGO ---");
                System.out.println("Nome: " + mago.getNome());
                System.out.println("Classe: " + mago.getClasse());
                System.out.println("Vida: " + mago.getVidaAtual() + "/" + mago.getVidaMaxima());
                System.out.println("Nível atual: " + mago.getNivel());
                System.out.println("Moedas: " + mago.getQuantidadeMoedas());
                System.out.println("Mana: " + mago.getMana());
                System.out.println("Poder mágico: " + mago.getPoderMagico());

                System.out.println("\n--- MAGIAS ---");

                while (mago.getMana() >= 10) {
                        mago.lancarMagia();
                }

                mago.lancarMagia();
                mago.receberDano();
                mago.recuperarVida();
                mago.ReceberMoedas(30);


                System.out.println("\n--- ARQUEIRO ---");
                System.out.println("Nome: " + arqueiro.getNome());
                System.out.println("Classe: " + arqueiro.getClasse());
                System.out.println("Vida: " + arqueiro.getVidaAtual() + "/" + arqueiro.getVidaMaxima());
                System.out.println("Nível atual: " + arqueiro.getNivel());
                System.out.println("Moedas: " + arqueiro.getQuantidadeMoedas());
                System.out.println("Quantidade de flechas: " + arqueiro.getQuantidadeFlechas());
                System.out.println("Precisão: " + arqueiro.getPrecisao());

                System.out.println("\n--- ATAQUES ---");

                while (arqueiro.getQuantidadeFlechas() > 0) {
                        arqueiro.atirar();
                }

                arqueiro.atirar();

                arqueiro.receberDano();
                arqueiro.recuperarVida();
                arqueiro.ReceberMoedas(30);


                System.out.println("\n--- ESTADO FINAL ---");

                System.out.println("Guerreiro:" + guerreiro.getNome()
                        + " Vida:" + guerreiro.getVidaAtual()
                        + " Moedas:" + guerreiro.getQuantidadeMoedas());

                System.out.println("Mago:" + mago.getNome()
                        + " Vida:" + mago.getVidaAtual()
                        + " Moedas:" + mago.getQuantidadeMoedas()
                        + " Mana:" + mago.getMana());

                System.out.println("Arqueiro:" + arqueiro.getNome()
                        + " Vida:" + arqueiro.getVidaAtual()
                        + " Moedas:" + arqueiro.getQuantidadeMoedas()
                        + " Flechas:" + arqueiro.getQuantidadeFlechas());
        }
}
