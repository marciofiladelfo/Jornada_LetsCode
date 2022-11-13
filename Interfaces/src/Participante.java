public interface Participante extends Comparable<Participante> {
    String getNomeParticipante();
    int compareTo(Participante participante);
}
