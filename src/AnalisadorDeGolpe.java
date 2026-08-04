import java.util.Arrays;
import java.util.List;

public class AnalisadorDeGolpe {
    //Metodo da regra de negocio
    public static ResultadoAnalise analisar(String mensagem) {



        //Dicionario com palavras suspeitas
        List<String> palavraUrgencia = Arrays.asList("urgente", "bloqueado", "promoção", "última", "vencem hoje", "saldo", "senha");
        List<String> palavrasAcao = Arrays.asList("clique aqui", "pix", "dinheiro", "cartão", "código de segurança", "acesse", "acesse aqui", "visualizar", "valor");

        //converte em letras minusculas
        String mensagemLower = mensagem.toLowerCase();

        int pontosUrgencias = 0;
        int pontosAcao = 0;


        // Verifica a presença de palavras de urgência
        for(String palavra : palavraUrgencia) {
            if (mensagemLower.contains(palavra)) {
                pontosUrgencias++;
            }
        }

        // Verifica a presença de palavras de ação/dinheiro
        for(String palavra : palavrasAcao) {
            if (mensagemLower.contains(palavra)) {
                pontosAcao++;
            }
        }

        if (pontosUrgencias >= 1 && pontosAcao >= 1) {
            return new ResultadoAnalise (true, "ALERTA - mensagem suspeita de golpe (Urgência e solicitação financeira)");
        } else if (pontosAcao >= 2) {
            return new ResultadoAnalise (true, "ALERTA - mensagem suspeita devido a várias características de golpe");
        } else {
            return new ResultadoAnalise(false, "mensagem parece segura devido o analisador não ter encontrado nenhuma mensagem suspeita");
        }

    }


}
