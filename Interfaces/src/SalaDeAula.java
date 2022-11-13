import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalaDeAula {

    List<Participante> listTs = new ArrayList<>();

    public void addParticipante(Participante participante){
        listTs.add(participante);
    }

    public void imprimeLista(){
        for (Participante participante : listTs){
            System.out.println(participante.getNomeParticipante());
        }
    }

    public static void main(String[] args) {

        SalaDeAula salaDeAula = new SalaDeAula();

        salaDeAula.addParticipante(new Aluno(12345, "José", "Zé"));
        salaDeAula.addParticipante(new Aluno(23456, "Marcio", "Kabana"));
        salaDeAula.addParticipante(new Professor(11111, "Kadu", "Java"));

        Collections.sort(salaDeAula.listTs);

        salaDeAula.imprimeLista();

    }
}
