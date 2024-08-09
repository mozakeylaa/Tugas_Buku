// Class Driver
public class BukuTester {
    public static void main(String[] args) {
        // object
        Buku moza = new Buku();
        Buku felli = new Buku();
        Buku yola = new Buku();
        Buku dinda = new Buku();
        Buku rizza = new Buku();
        // object dgn constructor parameter
        Buku fadhil = new Buku(768, 2008, "Cinta", "Sammy");
        
        // mengubah nilai variabel
        moza.id = 124;
        moza.tahun = 2022;
        moza.judul = "Jarak";
        moza.pengarang = "Agysca Maura";
        System.out.println(moza.id);
        System.out.println(moza.tahun);
        System.out.println(moza.judul);
        System.out.println(moza.pengarang);

        felli.id = 907;
        felli.tahun = 2011;
        felli.judul = "Love";
        felli.pengarang = "Caca Aura";
        System.out.println(felli.id);
        System.out.println(felli.tahun);
        System.out.println(felli.judul);
        System.out.println(felli.pengarang);

        yola.id = 542;
        yola.tahun = 2019;
        yola.judul = "World";
        yola.pengarang = "Reyta Titis";
        System.out.println(yola.id);
        System.out.println(yola.tahun);
        System.out.println(yola.judul);
        System.out.println(yola.pengarang);

        dinda.id = 341;
        dinda.tahun = 2017;
        dinda.judul = "Batu";
        dinda.pengarang = "Adelia Citra";
        System.out.println(dinda.id);
        System.out.println(dinda.tahun);
        System.out.println(dinda.judul);
        System.out.println(dinda.pengarang);

        rizza.id = 764;
        rizza.tahun = 2015;
        rizza.judul = "Kartu";
        rizza.pengarang = "Nakheisa";
        System.out.println(rizza.id);
        System.out.println(rizza.tahun);
        System.out.println(rizza.judul);
        System.out.println(rizza.pengarang);

        fadhil.id = 764;
        fadhil.tahun = 2015;
        fadhil.judul = "Kartu";
        fadhil.pengarang = "Nakheisa";
        System.out.println(fadhil.id);
        System.out.println(fadhil.tahun);
        System.out.println(fadhil.judul);
        System.out.println(fadhil.pengarang);


        
    }
}
