public class lembagapelatihan {
    int idLembaga;
    String namaLembaga;
    String jenisLembaga;
    String kontakEmail;

    public void mengisiData(int id, String nama, String jenis, String email) {
        idLembaga = id;
        namaLembaga = nama;
        jenisLembaga = jenis;
        kontakEmail = email;
    }
    public void tampilkanData() {
        System.out.println("ID: " + idLembaga);
        System.out.println("Nama: " + namaLembaga);
        System.out.println("Jenis: " + jenisLembaga);
        System.out.println("Email: " + kontakEmail);
    }
    public static void main(String[] args) {
        lembagapelatihan lp = new lembagapelatihan();
        lp.mengisiData(12, "Lembaga Coding", "IT", "infocoding@gmail.com");
        lp.tampilkanData();
    }
}


    

 