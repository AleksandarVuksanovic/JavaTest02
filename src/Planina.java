import java.util.ArrayList;

public class Planina {

        private String ime;
        private String nazivDrzave;
        double visina;

    public Planina(String ime, String nazivDrzave, double visina) {
        this.ime = ime;
        this.nazivDrzave = nazivDrzave;
        this.visina = visina;
    }
    
    public double getVisina() {
        return visina;
    }

   public Planina getNajvisaPlanina(ArrayList<Planina> planine) {

        double visinaPlanine = 0;
        int index = 0;

        for (int i = 0; i < planine.size(); i++) {
            if (planine.get(i).getVisina() < visinaPlanine ) {
                visinaPlanine = planine.get(i).getVisina();
                index = i;}
        }

       return planine.get(index);

    }


}
