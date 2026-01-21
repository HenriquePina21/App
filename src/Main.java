import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Participante> participantes = new java.util.ArrayList<>();
        participantes.add(new Participante("Ana", "ana@example.com"));
        participantes.add(new Participante("Bruno", "bruno@example.com"));
        participantes.add(new Participante("Carla", "carla@example.com"));

        Sorteio sorteio = new Sorteio(participantes);
        List<Pares> paresSorteados = sorteio.realizarSorteio();

        for (Pares pares : paresSorteados) {
            System.out.println(pares.getParticipante().getNome() + " -> " + pares.getAmigoSecreto().getNome());
        }
    }
}