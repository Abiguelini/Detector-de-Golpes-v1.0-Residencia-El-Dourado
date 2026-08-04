import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho principal do sistema
        System.out.println("==================================================");
        System.out.println("          🛡 DETECTOR DE GOLPES v1.0 🛡         ");
        System.out.println("==================================================\n");

        // Cenário 1: Seguro
        String mensagemSegura = "Olá! Vamos sair pra beber algo na CB?";
        ResultadoAnalise resultado = AnalisadorDeGolpe.analisar(mensagemSegura);

        System.out.println("[ CENÁRIO 1: MENSAGEM DO DIA A DIA ]");
        System.out.println("Mensagem: \"" + mensagemSegura + "\"");
        System.out.println("É golpe?  " + (resultado.isGolpe() ? " NÃO" : " SIM"));
        System.out.println("Motivo:   " + resultado.getJustificativa());
        System.out.println("--------------------------------------------------\n");


        // Cenário 2: Golpe (Ajustado para bater a regra de negócio)
        String mensagemSuspeita = "urgente faça o pix para essa chave";
        ResultadoAnalise resultadoVerdadeiro = AnalisadorDeGolpe.analisar(mensagemSuspeita);

        System.out.println("[ CENÁRIO 2: TENTATIVA DE PHISHING ]");
        System.out.println("Mensagem: \"" + mensagemSuspeita + "\"");
        System.out.println("É golpe?  " + (resultadoVerdadeiro.isGolpe() ? " SIM" : " NÃO"));
        System.out.println("Motivo:   " + resultadoVerdadeiro.getJustificativa());
        System.out.println("--------------------------------------------------\n");


        // Cenário 3: Interativo via Teclado
        System.out.println("[ CENÁRIO 3: TESTE AO VIVO NO TECLADO ]");
        System.out.print("Digite a mensagem para ser analisada: ");
        String msg = scanner.nextLine();

        ResultadoAnalise testeTeclado = AnalisadorDeGolpe.analisar(msg);

        System.out.println("\n>> RESULTADO DA ANÁLISE <<");
        System.out.println("Mensagem: \"" + msg + "\"");
        System.out.println("É golpe?  " + (testeTeclado.isGolpe() ? " SIM" : " NÃO"));
        System.out.println("Motivo:   " + testeTeclado.getJustificativa());
        System.out.println("==================================================");

        // Boa prática: liberar o recurso do teclado no fim do programa
        scanner.close();
    }
}