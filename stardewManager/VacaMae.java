package stardewManager;

import java.util.ArrayList;
import java.util.List;

public class VacaMae extends Vaca{
    private List<Bezerro> filhos = new ArrayList<>();

    public void procriar(Bezerro filho){
        filhos.add(filho);
    }

    public VacaMae(int id, String name, String race, int age, String status, List<Bezerro> filhos) {
        super(id, name, race, age, status);
        this.filhos = filhos;
    }

    public VacaMae(int id, String name, String race, int age, String status) {
        super(id, name, race, age, status);
    }
}
