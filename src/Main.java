import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: SEU NOME COMPLETO");
        System.out.println("Professor: Brenno Pimenta da Costa");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");
        System.out.println("Tema: Esportes");
        System.out.println();

        List<Questao> questoes = new ArrayList<>();

        int acertos = 0;

        questoes.add(new Questao("1) Qual esporte é conhecido como o esporte mais popular do mundo?",
                "Basquete",
                "Futebol",
                "Tênis",
                "Vôlei",
                "Natação",
                'B'));

        questoes.add(new Questao("2) Quantos jogadores cada time de futebol possui em campo no início de uma partida?",
                "9",
                "10",
                "11",
                "12",
                "13",
                'C'));

        questoes.add(new Questao("3) Em qual esporte é utilizada uma cesta para marcar pontos?",
                "Futebol",
                "Basquete",
                "Tênis",
                "Natação",
                "Atletismo",
                'B'));

        questoes.add(new Questao("4) Quantos sets um jogador precisa vencer para ganhar uma partida de tênis em um Grand Slam masculino?",
                "1",
                "2",
                "3",
                "4",
                "5",
                'C'));

        questoes.add(new Questao("5) Qual país é conhecido por ter criado o judô?",
                "Brasil",
                "Japão",
                "Estados Unidos",
                "França",
                "China",
                'B'));

        questoes.add(new Questao("6) Qual é o principal objetivo no vôlei?",
                "Chutar a bola para o gol",
                "Fazer a bola tocar no chão da quadra adversária",
                "Arremessar a bola em uma cesta",
                "Correr mais rápido que o adversário",
                "Derrubar o adversário",
                'B'));

        questoes.add(new Questao("7) Qual é a distância oficial de uma maratona?",
                "21,097 km",
                "30 km",
                "42,195 km",
                "50 km",
                "100 km",
                'C'));

        questoes.add(new Questao("8) Em qual esporte os atletas utilizam uma prancha e ondas do mar?",
                "Surfe",
                "Ciclismo",
                "Ginástica",
                "Boxe",
                "Esgrima",
                'A'));

        questoes.add(new Questao("9) Qual cartão é utilizado no futebol para expulsar um jogador?",
                "Azul",
                "Verde",
                "Amarelo",
                "Vermelho",
                "Branco",
                'D'));

        questoes.add(new Questao("10) Quantos pontos vale uma cesta convertida de fora da linha de três pontos no basquete?",
                "1 ponto",
                "2 pontos",
                "3 pontos",
                "4 pontos",
                "5 pontos",
                'C'));

        questoes.add(new Questao("11) Qual esporte é praticado em uma piscina e possui modalidades como nado livre e nado peito?",
                "Atletismo",
                "Natação",
                "Ciclismo",
                "Remo",
                "Handebol",
                'B'));

        questoes.add(new Questao("12) Qual é o nome dado ao local onde são disputadas partidas de futebol?",
                "Quadra",
                "Arena de gelo",
                "Campo",
                "Pista",
                "Tatame",
                'C'));

        questoes.add(new Questao("13) Em qual esporte os atletas utilizam luvas e tentam acertar golpes no adversário?",
                "Boxe",
                "Tênis",
                "Golfe",
                "Vôlei",
                "Natação",
                'A'));

        questoes.add(new Questao("14) Qual esporte utiliza uma bola oval e é muito popular em países como Estados Unidos e Inglaterra?",
                "Rugby",
                "Tênis de mesa",
                "Badminton",
                "Futebol de salão",
                "Beisebol",
                'A'));

        questoes.add(new Questao("15) Qual é a principal função do goleiro no futebol?",
                "Marcar os jogadores adversários",
                "Cobrar todos os escanteios",
                "Defender o gol e evitar que o adversário marque",
                "Atuar somente no ataque",
                "Fazer todos os lançamentos laterais",
                'C'));

        for (Questao questao : questoes) {
            questao.exibirQuestao();
            System.out.println("Qual a sua resposta: ");

            char resposta = scanner.next().toUpperCase().charAt(0);

            if (questao.verificarRespostaCorreta(resposta)) {
                System.out.println("Resposta Correta!");
                acertos++;
            } else {
                System.out.println("Resposta errada");
            }

            System.out.println();
        }

        System.out.println("Foram " + acertos + " acertos");

        double porcentagem = ((acertos * 100.0) / questoes.size());

        System.out.printf("Porcentagem de acertos: %.2f%% %n", porcentagem);

        System.out.println("Obrigado por participar do quiz");

        scanner.close();
    }
}

