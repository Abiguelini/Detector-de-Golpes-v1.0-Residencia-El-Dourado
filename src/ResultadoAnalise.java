public class ResultadoAnalise {

    private boolean isGolpe;
    private String justificativa;

    // Construtor
    public ResultadoAnalise(boolean isGolpe, String justificativa) {
        this.isGolpe = isGolpe;
        this.justificativa = justificativa;
    }

    // Getters para permitir a leitura segura dos dados
    public boolean isGolpe() {
        return this.isGolpe;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    @Override
    public String toString() {
        return "ResultadoAnalise{" +
                "é Golpe=" + isGolpe +
                ", justificativa='" + justificativa + '\'' +
                '}';
    }
}