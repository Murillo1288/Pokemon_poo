package testes;

import java.util.*;

public class Pokemon {

    public static final Scanner teclado = new Scanner(System.in);

    private String nome;
    private int vida;
    private int vidaAtual;
    protected int ataque;
    protected int ataqueEspecial;
    protected int velocidade;
    String tipo;
    String fraqueza;
    String eficacia;
    protected int exp;

    public Pokemon(String nome, int vida, String tipo, String fraqueza, String eficacia, int ataque, int ataqueEspecial, int velocidade) {
        setNome(nome);
        setVida(vida);
        setVidaAtual(vida);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.tipo = tipo;
        this.fraqueza = fraqueza;
        this.eficacia = eficacia;
        this.exp = 0;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido!");
            return;
        }

        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida <= 0) {
            System.out.println("A vida deve ser maior que 0!");
            return;
        }

        this.vida = vida;

        if (this.vidaAtual > vida) {
            this.vidaAtual = vida;
        }
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        if (vidaAtual < 0) {
            this.vidaAtual = 0;
        } else if (vidaAtual > this.vida) {
            this.vidaAtual = this.vida;
        } else {
            this.vidaAtual = vidaAtual;
        }
    }
    public void mostrarCategoria() {
        System.out.println(getNome() + " é um Pokémon.");
    }

    public void evoluir() {

        if (this instanceof PokemonInicial) {

            PokemonInicial inicial = (PokemonInicial) this;

            if (this.nome.equals("Charmander") && this.exp >= 100) {
                setNome("Charmeleon");
                setVida(120);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10);
                this.velocidade = 80;
                System.out.println("\n✨ O seu Charmander evoluiu para CHARMELEON!\n");

            } else if (this.nome.equals("Charmeleon") && this.exp >= 250) {
                setNome("Charizard");
                setVida(160);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10, 20);
                this.velocidade = 100;
                System.out.println("\n✨ O seu Charmeleon evoluiu para CHARIZARD!\n");

            } else if (this.nome.equals("Bulbasaur") && this.exp >= 100) {
                setNome("Ivysaur");
                setVida(120);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(5);
                this.velocidade = 60;
                System.out.println("\n✨ O seu Bulbasaur evoluiu para IVYSAUR!\n");

            } else if (this.nome.equals("Ivysaur") && this.exp >= 250) {
                setNome("Venusaur");
                setVida(160);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10);
                this.velocidade = 80;
                System.out.println("\n✨ O seu Ivysaur evoluiu para VENUSAUR!\n");

            } else if (this.nome.equals("Squirtle") && this.exp >= 100) {
                setNome("Wartortle");
                setVida(120);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(5, 15);
                this.velocidade = 58;
                System.out.println("\n✨ O seu Squirtle evoluiu para WARTORTLE!\n");

            } else if (this.nome.equals("Wartortle") && this.exp >= 250) {
                setNome("Blastoise");
                setVida(160);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10);
                this.velocidade = 78;
                System.out.println("\n✨ O seu Wartortle evoluiu para BLASTOISE!\n");

            } else if (this.nome.equals("Cyndaquil") && this.exp >= 100) {
                setNome("Quilava");
                setVida(90);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(5);
                this.velocidade = 80;
                System.out.println("\n✨ O seu Cyndaquil evoluiu para QUILAVA!\n");

            } else if (this.nome.equals("Quilava") && this.exp >= 250) {
                setNome("Typhlosion");
                setVida(120);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10, 20);
                this.velocidade = 100;
                System.out.println("\n✨ O seu Quilava evoluiu para TYPHLOSION!\n");

            } else if (this.nome.equals("Chikorita") && this.exp >= 100) {
                setNome("Bayleef");
                setVida(120);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(5, 15);
                this.velocidade = 60;
                System.out.println("\n✨ O seu Chikorita evoluiu para BAYLEEF!\n");

            } else if (this.nome.equals("Bayleef") && this.exp >= 250) {
                setNome("Meganium");
                setVida(160);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10);
                this.velocidade = 80;
                System.out.println("\n✨ O seu Bayleef evoluiu para MEGANIUM!\n");

            } else if (this.nome.equals("Totodile") && this.exp >= 100) {
                setNome("Croconaw");
                setVida(120);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10);
                this.velocidade = 58;
                System.out.println("\n✨ O seu Totodile evoluiu para CROCONAW!\n");

            } else if (this.nome.equals("Croconaw") && this.exp >= 250) {
                setNome("Feraligatr");
                setVida(160);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10);
                this.velocidade = 78;
                System.out.println("\n✨ O seu Croconaw evoluiu para FERALIGATR!\n");

            } else if (this.nome.equals("Torchic") && this.exp >= 100) {
                setNome("Combusken");
                setVida(120);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(5);
                this.velocidade = 55;
                System.out.println("\n✨ O seu Torchic evoluiu para COMBUSKEN!\n");

            } else if (this.nome.equals("Combusken") && this.exp >= 250) {
                setNome("Blaziken");
                setVida(160);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(20);
                this.velocidade = 80;
                System.out.println("\n✨ O seu Combusken evoluiu para BLAZIKEN!\n");

            } else if (this.nome.equals("Treecko") && this.exp >= 100) {
                setNome("Grovyle");
                setVida(120);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10);
                this.velocidade = 95;
                System.out.println("\n✨ O seu Treecko evoluiu para GROVYLE!\n");

            } else if (this.nome.equals("Grovyle") && this.exp >= 250) {
                setNome("Sceptile");
                setVida(160);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(10);
                this.velocidade = 120;
                System.out.println("\n✨ O seu Grovyle evoluiu para SCEPTILE!\n");

            } else if (this.nome.equals("Mudkip") && this.exp >= 100) {
                setNome("Marshtomp");
                setVida(120);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(5, 10);
                this.velocidade = 50;
                System.out.println("\n✨ O seu Mudkip evoluiu para MARSHTOMP!\n");

            } else if (this.nome.equals("Marshtomp") && this.exp >= 250) {
                setNome("Swampert");
                setVida(160);
                setVidaAtual(getVida());
                inicial.aumentarAtaque(25, 15);
                this.velocidade = 60;
                System.out.println("\n✨ O seu Marshtomp evoluiu para SWAMPERT!\n");
            }
        }
    }

    public static int ataqueJogador(Pokemon jogador, Pokemon inimigo) {
        System.out.println("1 - Ataque Normal\n2 - Ataque Especial\nOpção: ");
        int ataque = teclado.nextInt();

        while (ataque > 2 || ataque < 1) {
            System.out.println("Valor inválido! Digite novamente");
            System.out.println("1 - Ataque Normal\n2 - Ataque Especial\nOpção: ");
            ataque = teclado.nextInt();
        }

        int dano = 0;

        if (ataque == 2 && jogador.eficacia == inimigo.tipo) {
            System.out.println("\nVocê usou ataque especial em " + inimigo.getNome() + "! Seu ataque foi eficaz!");
            dano = (int) (jogador.ataqueEspecial * 1.30);
        } else if (ataque == 2 && jogador.eficacia != inimigo.tipo) {
            System.out.println("\nVocê usou ataque especial em " + inimigo.getNome() + "! Seu ataque não foi eficaz.");
            dano = (int) (jogador.ataqueEspecial * 0.70);
        } else if (ataque == 1) {
            System.out.println("\nVocê usou ataque em " + inimigo.getNome() + "!");
            dano = jogador.ataque;
        }

        inimigo.setVidaAtual(inimigo.getVidaAtual() - dano);

        System.out.println(jogador.getNome() + " causou " + dano + " de dano em " + inimigo.getNome() + "\n");

        return dano;
    }

    public static void defenderJogador(Pokemon jogador) {
        System.out.println(jogador.getNome() + " assumiu posição defensiva!\n");
    }

    public static int ataqueInimigo(Pokemon jogador, Pokemon inimigo, int ataqueInimigo, boolean defendendo) {
        int danoInimigo = 0;

        if (ataqueInimigo == 2 && jogador.fraqueza == inimigo.tipo) {
            System.out.println(inimigo.getNome() + " usou ataque especial! O ataque foi eficaz!");
            danoInimigo = (int) (inimigo.ataqueEspecial * 1.30);
        } else if (ataqueInimigo == 2 && jogador.fraqueza != inimigo.tipo) {
            System.out.println(inimigo.getNome() + " usou ataque especial! O ataque não foi eficaz.");
            danoInimigo = (int) (inimigo.ataqueEspecial * 0.70);
        } else if (ataqueInimigo == 1) {
            System.out.println(inimigo.getNome() + " usou ataque normal!");
            danoInimigo = inimigo.ataque;
        }

        if (defendendo) {
            System.out.println("(Defendido com sucesso! O dano foi reduzido)");
            danoInimigo -= 10;

            if (danoInimigo < 0) {
                danoInimigo = 0;
            }
        }

        jogador.setVidaAtual(jogador.getVidaAtual() - danoInimigo);

        System.out.println(inimigo.getNome() + " causou " + danoInimigo + " de dano em " + jogador.getNome() + "\n");

        return danoInimigo;
    }

    public static void batalha(Pokemon jogador, Pokemon inimigo) {
        Random random = new Random();
        int turno = 0;
        String condicao = "ganhou";

        while (jogador.getVidaAtual() > 0 && inimigo.getVidaAtual() > 0) {
            turno += 1;

            System.out.println("\n===== TURNO " + turno + " =====");
            System.out.println(jogador.getNome() + " (Vel: " + jogador.velocidade + "): \nVida: " + jogador.getVidaAtual() + "/" + jogador.getVida());
            System.out.println(inimigo.getNome() + " (Vel: " + inimigo.velocidade + "): \nVida: " + inimigo.getVidaAtual() + "/" + inimigo.getVida() + "\n");

            System.out.println("Escolha:\n1 - Atacar\n2 - Defender\nOpção: ");
            int escolhaBatalha = teclado.nextInt();

            while (escolhaBatalha < 1 || escolhaBatalha > 2) {
                System.out.println("Valor inválido! Digite novamente");
                System.out.println("Escolha:\n1 - Atacar\n2 - Defender\nOpção: ");
                escolhaBatalha = teclado.nextInt();
            }

            boolean defendendo = (escolhaBatalha == 2);
            int ataqueInimigo = random.nextInt(1, 3);

            if (jogador.velocidade >= inimigo.velocidade) {

                System.out.println("\n" + jogador.getNome() + " é mais rápido e age primeiro!");

                if (escolhaBatalha == 1) {
                    ataqueJogador(jogador, inimigo);

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    defenderJogador(jogador);

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (inimigo.getVidaAtual() <= 0) {
                    System.out.println("\n" + inimigo.getNome() + " foi derrotado!");
                    jogador.exp += 40;
                    jogador.evoluir();
                    jogador.setVidaAtual(jogador.getVida());
                    inimigo.setVidaAtual(inimigo.getVida());
                    condicao = "ganhou";

                    break;
                }

                System.out.println("Turno de contra-ataque de " + inimigo.getNome() + "\n");
                ataqueInimigo(jogador, inimigo, ataqueInimigo, defendendo);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (jogador.getVidaAtual() <= 0) {
                    System.out.println("\n" + jogador.getNome() + " foi derrotado!");
                    condicao = "perdeu";
                    break;
                }

            } else {

                System.out.println("\n" + inimigo.getNome() + " é mais rápido e ataca primeiro!");

                ataqueInimigo(jogador, inimigo, ataqueInimigo, defendendo);

                if (jogador.getVidaAtual() <= 0) {
                    System.out.println("\n" + jogador.getNome() + " foi derrotado!");
                    condicao = "perdeu";
                    break;
                }

                if (escolhaBatalha == 1) {
                    System.out.println("Contra-ataque de " + jogador.getNome() + "\n");
                    ataqueJogador(jogador, inimigo);

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println(jogador.getNome() + " usou a ação do turno para se defender.");
                }

                if (inimigo.getVidaAtual() <= 0) {
                    System.out.println("\n" + inimigo.getNome() + " foi derrotado!");
                    jogador.exp += 40;
                    jogador.evoluir();
                    jogador.setVidaAtual(jogador.getVida());
                    inimigo.setVidaAtual(inimigo.getVida());
                    condicao = "ganhou";

                    break;
                }
            }

            if (condicao == "perdeu") {
                break;
            }
        }
    }

    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Pikachu", 70, "Eletrico", "Terra", "Água", 30, 40, 90);
        Pokemon p2 = new Pokemon("Raichu", 120, "Eletrico", "Terra", "Água", 50, 60, 110);

        PokemonInicial p3 = new PokemonInicial("Charmander", 80, "Fogo", "Água", "Planta", 30, 40, 65);
        Pokemon p4 = new Pokemon("Charmeleon", 120, "Fogo", "Água", "Planta", 40, 50, 80);
        Pokemon p5 = new Pokemon("Charizard", 160, "Fogo", "Água", "Planta", 50, 70, 100);

        PokemonInicial p6 = new PokemonInicial("Bulbasaur", 90, "Planta", "Fogo", "Pedra", 35, 45, 45);
        Pokemon p7 = new Pokemon("Ivysaur", 120, "Planta", "Fogo", "Pedra", 40, 50, 60);
        Pokemon p8 = new Pokemon("Venusaur", 160, "Planta", "Fogo", "Pedra", 50, 60, 80);

        PokemonInicial p9 = new PokemonInicial("Squirtle", 90, "Água", "Planta", "Fogo", 35, 35, 43);
        Pokemon p10 = new Pokemon("Wartortle", 120, "Água", "Planta", "Fogo", 40, 50, 58);
        Pokemon p11 = new Pokemon("Blastoise", 160, "Água", "Planta", "Fogo", 50, 60, 78);

        PokemonInicial p12 = new PokemonInicial("Chikorita", 90, "Planta", "Fogo", "Água", 35, 35, 45);
        Pokemon p13 = new Pokemon("Bayleef", 120, "Planta", "Fogo", "Água", 40, 50, 60);
        Pokemon p14 = new Pokemon("Meganium", 160, "Planta", "Fogo", "Água", 50, 60, 80);

        PokemonInicial p15 = new PokemonInicial("Cyndaquil", 60, "Fogo", "Água", "Planta", 35, 45, 65);
        Pokemon p16 = new Pokemon("Quilava", 90, "Fogo", "Água", "Planta", 40, 50, 80);
        Pokemon p17 = new Pokemon("Typhlosion", 120, "Fogo", "Água", "Planta", 50, 70, 100);

        PokemonInicial p18 = new PokemonInicial("Totodile", 90, "Água", "Planta", "Fogo", 30, 40, 43);
        Pokemon p19 = new Pokemon("Croconaw", 120, "Água", "Planta", "Fogo", 40, 50, 58);
        Pokemon p20 = new Pokemon("Feraligatr", 160, "Água", "Planta", "Fogo", 50, 60, 78);

        PokemonInicial p21 = new PokemonInicial("Treecko", 90, "Planta", "Fogo", "Água", 35, 45, 70);
        Pokemon p22 = new Pokemon("Grovyle", 120, "Planta", "Fogo", "Água", 45, 55, 95);
        Pokemon p23 = new Pokemon("Sceptile", 160, "Planta", "Fogo", "Água", 55, 65, 120);

        PokemonInicial p24 = new PokemonInicial("Torchic", 80, "Fogo", "Água", "Planta", 35, 45, 45);
        Pokemon p25 = new Pokemon("Combusken", 120, "Fogo", "Água", "Planta", 40, 50, 55);
        Pokemon p26 = new Pokemon("Blaziken", 160, "Fogo", "Água", "Planta", 60, 70, 80);

        PokemonInicial p27 = new PokemonInicial("Mudkip", 90, "Água", "Planta", "Fogo", 35, 45, 40);
        Pokemon p28 = new Pokemon("Marshtomp", 120, "Água/Terra", "Planta", "Fogo", 40, 55, 50);
        Pokemon p29 = new Pokemon("Swampert", 160, "Água/Terra", "Planta", "Fogo", 65, 70, 60);

        Pokemon p30 = new Pokemon("Tinkatink", 120, "Aço", "Fogo", "Pedra", 25, 35, 58);
        Pokemon p31 = new Pokemon("Tinkatuff", 160, "Aço", "Fogo", "Pedra", 40, 50, 78);
        Pokemon p32 = new Pokemon("Tinkaton", 180, "Aço", "Fogo", "Pedra", 45, 55, 94);

        Pokemon p33 = new Pokemon("Riolu", 80, "Lutador", "Psiquico", "Normal", 30, 40, 60);
        Pokemon p34 = new Pokemon("Lucario", 140, "Lutador", "Psiquico", "Normal", 65, 75, 90);

        PokemonLendario p35 = new PokemonLendario("Darkrai", 150, "Sombrio", "Lutador", "Psiquico", 55, 70, 125);
        PokemonLendario p36 = new PokemonLendario("Mewtwo", 210, "Psiquico", "Sombrio", "Lutador", 65, 80, 130);
        PokemonLendario p37 = new PokemonLendario("Arceus", 240, "Normal", "Lutador", " ", 70, 80, 120);

        ArrayList<Pokemon> pokemons1 = new ArrayList<>();
        ArrayList<Pokemon> pokemons2 = new ArrayList<>();
        ArrayList<Pokemon> pokemons3 = new ArrayList<>();
        ArrayList<Pokemon> pokemons4 = new ArrayList<>();

        Collections.addAll(
            pokemons1,
            p3, p6, p9, p12, p15, p18, p21, p24, p27
        );

        Collections.addAll(
            pokemons2,
            p4, p7, p10, p13, p16, p19, p22, p25, p28
        );

        Collections.addAll(
            pokemons3,
            p5, p8, p11, p14, p17, p20, p23, p26, p29
        );

        Collections.addAll(
            pokemons4,
            p35, p36, p37
        );

        Random random = new Random();

        int escolha;
        int confirmarEscolha;
        int continuar_jogo = 1;
        Pokemon escolhido = null;

        while (continuar_jogo == 1) {

            escolhido = null;

            System.out.println(
                "\nEscolha sua geração: \n1 - Primeira Geração\n2 - Segunda Geração\n3 - Terceira Geração\n4 - Sair\nOpção: "
            );

            int geracao = teclado.nextInt();

            while (escolhido == null) {

                if (geracao == 1) {

                    System.out.print(
                        "\n======= PRIMEIRA GERAÇÃO =======" +
                        "\nEscolha entre: \n1 - Charmander\n2 - Bulbassaur\n3 - Squirtle\nOpção: "
                    );

                    escolha = teclado.nextInt();

                    while (escolha > 3 || escolha < 1) {
                        System.out.println("Valor inválido! Tente novamente");

                        System.out.print(
                            "Escolha entre: \n1 - Charmander\n2 - Bulbassaur\n3 - Squirtle\nOpção: "
                        );

                        escolha = teclado.nextInt();
                    }

                    if (escolha == 1) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nVocê escolheu o " + p3.getNome());

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(
                            "\n=====INFORMAÇÕES=====\nNome: " + p3.getNome() +
                            "\nVida: " + p3.getVida() +
                            "\nTipo: " + p3.tipo +
                            "\nAtaque: " + p3.ataque +
                            "\nAtaque Especial: " + p3.ataqueEspecial +
                            "\nVelocidade: " + p3.velocidade
                        );

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nConfirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                        confirmarEscolha = teclado.nextInt();

                        while (confirmarEscolha > 2 || confirmarEscolha < 1) {
                            System.out.println("Valor inválido! Tente novamente");
                            System.out.println("Confirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                            confirmarEscolha = teclado.nextInt();
                        }

                        if (confirmarEscolha == 1) {
                            escolhido = p3;
                        }

                    } else if (escolha == 2) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nVocê escolheu o " + p6.getNome());

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(
                            "\n=====INFORMAÇÕES=====\nNome: " + p6.getNome() +
                            "\nVida: " + p6.getVida() +
                            "\nTipo: " + p6.tipo +
                            "\nAtaque: " + p6.ataque +
                            "\nAtaque Especial: " + p6.ataqueEspecial +
                            "\nVelocidade: " + p6.velocidade
                        );

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nConfirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                        confirmarEscolha = teclado.nextInt();

                        while (confirmarEscolha > 2 || confirmarEscolha < 1) {
                            System.out.println("Valor inválido! Tente novamente");
                            System.out.println("Confirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                            confirmarEscolha = teclado.nextInt();
                        }

                        if (confirmarEscolha == 1) {
                            escolhido = p6;
                        }

                    } else if (escolha == 3) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nVocê escolheu o " + p9.getNome());

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(
                            "\n=====INFORMAÇÕES=====\nNome: " + p9.getNome() +
                            "\nVida: " + p9.getVida() +
                            "\nTipo: " + p9.tipo +
                            "\nAtaque: " + p9.ataque +
                            "\nAtaque Especial: " + p9.ataqueEspecial +
                            "\nVelocidade: " + p9.velocidade
                        );

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nConfirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                        confirmarEscolha = teclado.nextInt();

                        while (confirmarEscolha > 2 || confirmarEscolha < 1) {
                            System.out.println("Valor inválido! Tente novamente");
                            System.out.println("Confirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                            confirmarEscolha = teclado.nextInt();
                        }

                        if (confirmarEscolha == 1) {
                            escolhido = p9;
                        }
                    }

                } else if (geracao == 2) {

                    System.out.print(
                        "\n======= SEGUNDA GERAÇÃO =======" +
                        "\nEscolha entre: \n1 - Cyndaquil\n2 - Chikorita\n3 - Totodile\nOpção: "
                    );

                    escolha = teclado.nextInt();

                    while (escolha > 3 || escolha < 1) {
                        System.out.println("Valor inválido! Tente novamente");

                        System.out.print(
                            "Escolha entre: \n1 - Cyndaquil\n2 - Chikorita\n3 - Totodile\nOpção: "
                        );

                        escolha = teclado.nextInt();
                    }

                    if (escolha == 1) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nVocê escolheu o " + p15.getNome());

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(
                            "\n=====INFORMAÇÕES=====\nNome: " + p15.getNome() +
                            "\nVida: " + p15.getVida() +
                            "\nTipo: " + p15.tipo +
                            "\nAtaque: " + p15.ataque +
                            "\nAtaque Especial: " + p15.ataqueEspecial +
                            "\nVelocidade: " + p15.velocidade
                        );

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nConfirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                        confirmarEscolha = teclado.nextInt();

                        while (confirmarEscolha > 2 || confirmarEscolha < 1) {
                            System.out.println("Valor inválido! Tente novamente");
                            System.out.println("Confirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                            confirmarEscolha = teclado.nextInt();
                        }

                        if (confirmarEscolha == 1) {
                            escolhido = p15;
                        }

                    } else if (escolha == 2) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nVocê escolheu o " + p12.getNome());

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(
                            "\n=====INFORMAÇÕES=====\nNome: " + p12.getNome() +
                            "\nVida: " + p12.getVida() +
                            "\nTipo: " + p12.tipo +
                            "\nAtaque: " + p12.ataque +
                            "\nAtaque Especial: " + p12.ataqueEspecial +
                            "\nVelocidade: " + p12.velocidade
                        );

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nConfirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                        confirmarEscolha = teclado.nextInt();

                        while (confirmarEscolha > 2 || confirmarEscolha < 1) {
                            System.out.println("Valor inválido! Tente novamente");
                            System.out.println("Confirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                            confirmarEscolha = teclado.nextInt();
                        }

                        if (confirmarEscolha == 1) {
                            escolhido = p12;
                        }

                    } else if (escolha == 3) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nVocê escolheu o " + p18.getNome());

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(
                            "\n=====INFORMAÇÕES=====\nNome: " + p18.getNome() +
                            "\nVida: " + p18.getVida() +
                            "\nTipo: " + p18.tipo +
                            "\nAtaque: " + p18.ataque +
                            "\nAtaque Especial: " + p18.ataqueEspecial +
                            "\nVelocidade: " + p18.velocidade
                        );

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nConfirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                        confirmarEscolha = teclado.nextInt();

                        while (confirmarEscolha > 2 || confirmarEscolha < 1) {
                            System.out.println("Valor inválido! Tente novamente");
                            System.out.println("Confirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                            confirmarEscolha = teclado.nextInt();
                        }

                        if (confirmarEscolha == 1) {
                            escolhido = p18;
                        }
                    }

                } else if (geracao == 3) {

                    System.out.print(
                        "\n======= TERCEIRA GERAÇÃO =======" +
                        "\nEscolha entre: \n1 - Torchic\n2 - Treecko\n3 - Mudkip\nOpção: "
                    );

                    escolha = teclado.nextInt();

                    while (escolha > 3 || escolha < 1) {
                        System.out.println("Valor inválido! Tente novamente");

                        System.out.print(
                            "Escolha entre: \n1 - Torchic\n2 - Treecko\n3 - Mudkip\nOpção: "
                        );

                        escolha = teclado.nextInt();
                    }

                    if (escolha == 1) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nVocê escolheu o " + p24.getNome());

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(
                            "\n=====INFORMAÇÕES=====\nNome: " + p24.getNome() +
                            "\nVida: " + p24.getVida() +
                            "\nTipo: " + p24.tipo +
                            "\nAtaque: " + p24.ataque +
                            "\nAtaque Especial: " + p24.ataqueEspecial +
                            "\nVelocidade: " + p24.velocidade
                        );

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nConfirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                        confirmarEscolha = teclado.nextInt();

                        while (confirmarEscolha > 2 || confirmarEscolha < 1) {
                            System.out.println("Valor inválido! Tente novamente");
                            System.out.println("Confirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                            confirmarEscolha = teclado.nextInt();
                        }

                        if (confirmarEscolha == 1) {
                            escolhido = p24;
                        }

                    } else if (escolha == 2) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nVocê escolheu o " + p21.getNome());

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(
                            "\n=====INFORMAÇÕES=====\nNome: " + p21.getNome() +
                            "\nVida: " + p21.getVida() +
                            "\nTipo: " + p21.tipo +
                            "\nAtaque: " + p21.ataque +
                            "\nAtaque Especial: " + p21.ataqueEspecial +
                            "\nVelocidade: " + p21.velocidade
                        );

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nConfirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                        confirmarEscolha = teclado.nextInt();

                        while (confirmarEscolha > 2 || confirmarEscolha < 1) {
                            System.out.println("Valor inválido! Tente novamente");
                            System.out.println("Confirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                            confirmarEscolha = teclado.nextInt();
                        }

                        if (confirmarEscolha == 1) {
                            escolhido = p21;
                        }

                    } else {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nVocê escolheu o " + p27.getNome());

                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(
                            "\n=====INFORMAÇÕES=====\nNome: " + p27.getNome() +
                            "\nVida: " + p27.getVida() +
                            "\nTipo: " + p27.tipo +
                            "\nAtaque: " + p27.ataque +
                            "\nAtaque Especial: " + p27.ataqueEspecial +
                            "\nVelocidade: " + p27.velocidade
                        );

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("\nConfirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                        confirmarEscolha = teclado.nextInt();

                        while (confirmarEscolha > 2 || confirmarEscolha < 1) {
                            System.out.println("Valor inválido! Tente novamente");
                            System.out.println("Confirmar escolha? \n1 - SIM\n2 - NÃO\nOpção: ");
                            confirmarEscolha = teclado.nextInt();
                        }

                        if (confirmarEscolha == 1) {
                            escolhido = p27;
                        }
                    }

                } else {
                    break;
                }
            }

            if (escolhido != null) {
                escolhido.setVidaAtual(escolhido.getVida());
            }

            Pokemon inimigo = pokemons1.get(random.nextInt(pokemons1.size()));
            int quantidadeBatalha = 0;
            int escolhaContinuar = 1;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n======= MUNDO 1 =======");
            System.out.println("Pokémons que você poderá enfrentar:");

            for (Pokemon pokemon : pokemons1) {
                if (!pokemon.getNome().equals(escolhido.getNome())) {
                    System.out.println("- " + pokemon.getNome());
                }
            }
            System.out.println("- Darkrai (CHEFÃO)");

            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            while (escolhaContinuar == 1) {

                if (quantidadeBatalha == 6) {

                    System.out.println("\n======= MUNDO 2 =======");
                    System.out.println("Pokémons que você poderá enfrentar:");

                for (Pokemon pokemon : pokemons2) {
                    if (!pokemon.getNome().equals(escolhido.getNome())) {
                        System.out.println("- " + pokemon.getNome());
                    }
                }

                    System.out.println("- Mewtwo (CHEFÃO)");
                }
                if (quantidadeBatalha == 6) {

                    System.out.println("\n======= MUNDO 3 =======");
                    System.out.println("Pokémons que você poderá enfrentar:");

                for (Pokemon pokemon : pokemons3) {
                    if (!pokemon.getNome().equals(escolhido.getNome())) {
                        System.out.println("- " + pokemon.getNome());
                    }
                }

                    System.out.println("- Mewtwo (CHEFÃO)");
                }

                quantidadeBatalha += 1;

                if (quantidadeBatalha <= 5) {
                    inimigo = pokemons1.get(random.nextInt(pokemons1.size()));
                } else if (quantidadeBatalha == 6) {
                    System.out.println("\nALERTA: UM CHEFÃO APARECEU! ");
                    inimigo = pokemons4.get(0);
                } else if (quantidadeBatalha >= 7 && quantidadeBatalha <= 11) {
                    inimigo = pokemons2.get(random.nextInt(pokemons2.size()));
                } else if (quantidadeBatalha == 12) {
                    System.out.println("\nALERTA: CHEFÃO FINAL DO SEGUNDO MUNDO! ");
                    inimigo = pokemons4.get(1);
                } else if (quantidadeBatalha >= 13 && quantidadeBatalha <= 17) {
                    inimigo = pokemons3.get(random.nextInt(pokemons3.size()));
                } else if (quantidadeBatalha == 18) {
                    System.out.println("\nALERTA: CHEFÃO SUPREMO! ");
                    inimigo = pokemons4.get(2);
                }

                while (inimigo == escolhido) {

                    if (quantidadeBatalha <= 5) {
                        inimigo = pokemons1.get(random.nextInt(pokemons1.size()));
                    } else if (quantidadeBatalha >= 7 && quantidadeBatalha <= 11) {
                        inimigo = pokemons2.get(random.nextInt(pokemons2.size()));
                    } else if (quantidadeBatalha >= 13 && quantidadeBatalha <= 17) {
                        inimigo = pokemons3.get(random.nextInt(pokemons3.size()));
                    }
                }

                inimigo.setVidaAtual(inimigo.getVida());

                System.out.println("\n" + quantidadeBatalha + "ª BATALHA");

                batalha(escolhido, inimigo);

                if (escolhido.getVidaAtual() > 0) {
                    System.out.println("Deseja continuar? \n1 - SIM\n2 - NÃO\nOpção: ");
                    escolhaContinuar = teclado.nextInt();
                }

                if (escolhaContinuar == 2) {
                    System.out.println(
                        "\nVocê decidiu parar!\nTotal de lutas: " + quantidadeBatalha
                    );

                    continuar_jogo = 2;
                    break;
                }

                if (escolhido.getVidaAtual() <= 0) {

                    System.out.println(
                        "\n=======VOCÊ PERDEU=======\n" +
                        inimigo.getNome() +
                        " derrotou você!\nTotal de lutas: " +
                        quantidadeBatalha
                    );

                    System.out.println(
                        "\nDeseja recomeçar? \n1 - SIM\n2 - NÃO\nOpção: "
                    );

                    continuar_jogo = teclado.nextInt();

                    if (continuar_jogo == 1) {
                        break;
                    } else {
                        break;
                    }
                }

                if (quantidadeBatalha > 18) {
                    System.out.println(
                        "\n=======PARABÉNS=======\nVocê derrotou o Arceus e zerou o jogo!"
                    );

                    continuar_jogo = 2;
                    break;
                }
            }
        }
    }
}
class PokemonInicial extends Pokemon {

    public PokemonInicial(String nome, int vida, String tipo, String fraqueza, String eficacia, int ataque, int ataqueEspecial, int velocidade) {
        super(nome, vida, tipo, fraqueza, eficacia, ataque, ataqueEspecial, velocidade);
    }

    public void aumentarAtaque(int aumento) {
        ataque += aumento;
        ataqueEspecial += aumento;
    }

    public void aumentarAtaque(int aumentoAtaque, int aumentoEspecial) {
        ataque += aumentoAtaque;
        ataqueEspecial += aumentoEspecial;
    }

    @Override
    public void mostrarCategoria() {
        System.out.println(getNome() + " é um Pokémon inicial.");
    }
}

class PokemonLendario extends Pokemon {

    public PokemonLendario(String nome, int vida, String tipo, String fraqueza, String eficacia, int ataque, int ataqueEspecial, int velocidade) {
        super(nome, vida, tipo, fraqueza, eficacia, ataque, ataqueEspecial, velocidade);
    }

    @Override
    public void mostrarCategoria() {
        System.out.println(getNome() + " é um Pokémon lendário.");
    }

}