package main.administracao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.Cachorro;

@Getter
@Setter
@AllArgsConstructor
public class Checkout {

    private Cachorro cachorro;
    private Double estadia;
    private Double comida;
    private Double banho;
    private Double tosa;

    public double getValorFinal(Calculo calculo){
        return calculo.getValorFinal(this);
    }
}
