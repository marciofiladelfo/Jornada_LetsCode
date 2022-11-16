import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hotel {

    private static List<Caes> listCaes = new ArrayList<>();

    public static void imprimeHospedes(){
        for (Caes caes : listCaes){
            System.out.println(caes.toString());
        }
    }

    public static void main(String[] args) {

        listCaes.add(new ViraLatas("Caramelo", "Caramelo", false));
        listCaes.add(new Labrador("Bidu", "Marron", true, 10));
        listCaes.add(new Pincher("Ragnar","Preto", true));

//        Collections.sort(hotel.listCaes, (a,b) -> a.getNome().compareTo(b.getNome()));
        Collections.sort(listCaes);

        imprimeHospedes();
    }
}
