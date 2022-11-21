package main.administracao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import main.Cachorro;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class RegistroContabil {

    public static List<RegistroContabil> livroContabil = new ArrayList<>();
    private Cachorro cachorro;
    private Double valorFinal;

    public static void addRegistroContabil(Cachorro cachorro, Double valorFinal) {
        livroContabil.add(new RegistroContabil(cachorro, valorFinal));
    }
}
