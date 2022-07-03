import java.util.ArrayList;

public class PlaninarskiDom {

    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> clanoviDoma;

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja, ArrayList<Planinar> clanoviDoma) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanoviDoma = clanoviDoma;
    }

    public void uclaniPlaninara(Planinar p) {
        clanoviDoma.add(p);
    }

    public int uspesnoPopeli() {

        int brojUspesnih = 0;

        for (int i = 0; i < clanoviDoma.size(); i ++) {
            if (clanoviDoma.get(i).brojPoena > 0) {
                brojUspesnih = brojUspesnih + 1;}
        }

        System.out.println("Broj uspešno popelih: " + brojUspesnih);
        return brojUspesnih;

    }

    public void izbaciPlaninara(int idPlaninara) {

        for (int i = 0; i < clanoviDoma.size(); i++) {
            if (clanoviDoma.get(i).getId() == idPlaninara) {clanoviDoma.remove(i);}
        }
    }

    public double mesecniPrihod() {
        double mesecniPrihod = 0;

        for (int i = 0; i < clanoviDoma.size(); i++) {
            mesecniPrihod = mesecniPrihod + clanoviDoma.get(i).clanarina();
        }

        System.out.println("Mesečni prihod: " + mesecniPrihod);

        return mesecniPrihod;

    }



}
