public abstract class Planinar {


    private int id;
    int brojPoena;
    String ime;
    String prezime;


    public Planinar(int id, int brojPoena, String ime, String prezime) {
        this.id = id;
        this.brojPoena = brojPoena;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public abstract double clanarina();

   public abstract boolean uspesanUspon(Planina p);

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id = " + id +
                "\nbrojPoena = " + brojPoena +
                "\nime = " + ime +
                "\nprezime = " + prezime +
                "\nclanraina = " + clanarina();




    }
}
