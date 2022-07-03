import java.util.ArrayList;

public class RekreativniPlaninar extends Planinar{

    private double tezinaOpreme;
    private String nazivOkruga;
    private double maxUspon;

    public RekreativniPlaninar(int id, int brojPoena, String ime, String prezime, double tezinaOpreme, String nazivOkruga, double maxUspon) {
        super(id, brojPoena, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

   public double clanarina() {
    //koja iznosi 1000 - 1% za svaki brojPoena

       double clanarina = 1000 - (1000 * (this.brojPoena * 0.01));
       System.out.println("Članarina: " + clanarina);
       return clanarina;


   }

 public boolean uspesanUspon(Planina p) {
        boolean uspesanUspon;
        if ((this.maxUspon - this.tezinaOpreme * 50) > p.getVisina()) {uspesanUspon = true;}
        else {uspesanUspon = false;}

        if (uspesanUspon) {this.brojPoena = this.brojPoena + 1;}
        System.out.println("Uspešan uspon: " + uspesanUspon);

        return uspesanUspon;

  }





}
