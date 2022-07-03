import java.util.ArrayList;

public class Alpinista extends Planinar {

    private ArrayList<Alpinista> tim;
    private int godineIskustva;

    public Alpinista(int id, int brojPoena, String ime, String prezime, ArrayList<Alpinista> tim, int godineIskustva) {
        super(id, brojPoena, ime, prezime);
        this.tim = tim;
        this.godineIskustva = godineIskustva;
    }

    public double clanarina() {
        //koja iznosi 1000 - 4% za svaki brojPoena

        double clanarina = 1000 - (1000 * (this.brojPoena * 0.04));
        System.out.println("Članarina: " + clanarina);
        return clanarina;
    }

    public boolean uspesanUspon(Planina p) {

        boolean uspesanUspon;
        int brojUspesnih = 0;

      for (int i = 0; i < this.tim.size() - 1; i++) {
            if (this.tim.get(i).godineIskustva >= 5) {
                brojUspesnih = brojUspesnih + 1;}
        }

        if (brojUspesnih > 0) {uspesanUspon = true;}
        else {uspesanUspon = false;}

        System.out.println("Uspešan uspon: " + uspesanUspon);

        if (uspesanUspon) {this.brojPoena = this.brojPoena + 1;}

        return uspesanUspon;

    }

}
