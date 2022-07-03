import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Planina p1 = new Planina("Kopaonik", "Srbija", 2500);
        Planina p2 = new Planina("Zlatibor", "Srbija", 1599);
        Planina p3 = new Planina("Radan", "Srbija", 1200);

        RekreativniPlaninar r1 = new RekreativniPlaninar(001, 5, "Marko", "Markovic",
                20, "Toplički", 2600);
        RekreativniPlaninar r2 = new RekreativniPlaninar(002, 3, "Janko", "Jankovic",
                33, "Zlatiborski", 2100);
        RekreativniPlaninar r3 = new RekreativniPlaninar(003, 2, "Petar", "Petrovic",
                22, "Sremski", 1000);

        r1.uspesanUspon(p1);
        r1.uspesanUspon(p2);
        r1.uspesanUspon(p3);

        r1.clanarina();
        r2.clanarina();
        r3.clanarina();


        System.out.println("----------");


        ArrayList <Alpinista> tim = new ArrayList<>();
        Alpinista a1 = new Alpinista(004, 10, "Nenad", "Nenadović",tim, 10);
        Alpinista a2 = new Alpinista(005, 10, "Marija", "Đokić",tim, 11);
        Alpinista a3 = new Alpinista(006, 10, "Milica", "Milutinović",tim, 5);

        tim.add(a1);
        tim.add(a2);
        tim.add(a3);

        a1.clanarina();

        a1.uspesanUspon(p1);
        a1.uspesanUspon(p2);


        System.out.println("----------");

       ArrayList<Planinar> clanoviDoma = new ArrayList<>();
       PlaninarskiDom pd1 = new PlaninarskiDom("Jela", 2007, clanoviDoma);


        pd1.uclaniPlaninara(a1);
        pd1.uclaniPlaninara(a2);
        pd1.uclaniPlaninara(a3);


        pd1.izbaciPlaninara(004);

        pd1.mesecniPrihod();

        pd1.uspesnoPopeli();














    }
}
