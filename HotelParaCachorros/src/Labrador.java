import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Labrador extends Caes{
    private int idade;
    public Labrador(String nome, String cor, Boolean rabo, int idade) {
        super(nome, cor, "RoufRouf", rabo);
        this.idade = idade;
    }
}
