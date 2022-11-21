package main.administracao;

import java.util.List;

public class Financeiro {

    public static void getRelatorioFinanceiro(List<RegistroContabil> registroContabilList){
        registroContabilList.forEach(
                x -> System.out.println("Registro Contabil do cachorro: " +
                        x.getCachorro() + " valor: R$" + x.getValorFinal())
        );
    }
}
