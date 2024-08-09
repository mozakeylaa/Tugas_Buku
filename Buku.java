// Object Class
public class Buku{
    int id;
    int tahun;
    String judul;
    String pengarang;

    // Constructor
    // method yg bernama sama dgn Class
    public Buku() {
        id = 0;
        tahun = 0;
        judul = "Empty";
        pengarang = "Empty";
    }

    // Constructor Parameter
    public Buku(int id, int tahun, String judul, String pengarang) {
        //variabel = parameter
        this.id = id;
        this.tahun = tahun;
        this.judul = judul;
        this.pengarang = pengarang;
    }
}