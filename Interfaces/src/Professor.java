import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professor implements Participante, Pessoa{
    private Integer matricula;
    private String nome;
    private String disciplina;

    @Override
    public String getNomeParticipante() {
        return this.getNome() + "-" + this.getDisciplina();
    }

    @Override
    public int compareTo(Participante participante) {
        return this.getNomeParticipante().compareTo(participante.getNomeParticipante());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", apelido='" + disciplina + '\'' +
                '}';
    }
}
