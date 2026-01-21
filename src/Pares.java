public class Pares {
    private Participante participante;
    private Participante amigoSecreto;

    public Pares(Participante participante, Participante amigoSecreto) {
        this.participante = participante;
        this.amigoSecreto = amigoSecreto;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Participante getAmigoSecreto() {
        return amigoSecreto;
    }
}
