import java.util.List;

public class Sorteio {

    private List<Participante> participantes;

    public Sorteio(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public List<Participante> sortear() {
        List<Participante> sorteioList = new java.util.ArrayList<>(this.participantes);
        List<Participante> sorteados = new java.util.ArrayList<>();
        while (true) {
            int sorteado = new java.util.Random().nextInt(sorteioList.size());
            Participante participanteSorteado = sorteioList.get(sorteado);
            if (!sorteados.contains(participanteSorteado)) {
                sorteados.add(participanteSorteado);
                sorteioList.remove(sorteado);
            }
            if (sorteioList.isEmpty()) {
                break;
            }
        }
        return sorteados;
    }

    public List<Pares> realizarSorteio() {
        List<Pares> paresSorteados = new java.util.ArrayList<>();
        List<Participante> sorteio = new java.util.ArrayList<>();
        sorteio = this.sortear();
        int i = 0;
        while (i<sorteio.size()) {
            if (sorteio.get(i).equals(participantes.get(i))) {
                sorteio = this.sortear();
                i = 0;
            } else {
                i++;
            }
        }
        for (i = 0; i < participantes.size(); i++) {
            paresSorteados.add(new Pares(participantes.get(i), sorteio.get(i)));
        }
        return paresSorteados; // Retornar a lista de pares após o sorteio
    }
}