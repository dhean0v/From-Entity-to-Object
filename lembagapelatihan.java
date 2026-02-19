public class LembagaPelatihan {
    private int idLembaga;
    private String namaLembaga;
    private String jenisLembaga;
    private String kontakEmail;

    public LembagaPelatihan(int idLembaga, String namaLembaga, String jenisLembaga, String kontakEmail) {
        this.idLembaga = idLembaga;
        this.namaLembaga = namaLembaga;
        this.jenisLembaga = jenisLembaga;
        this.kontakEmail = kontakEmail;
    }

    public int getIdLembaga() {
        return idLembaga;
    }

    public String getNamaLembaga() {
        return namaLembaga;
    }

    public String getJenisLembaga() {
        return jenisLembaga;
    }

    public String getKontakEmail() {
        return kontakEmail;
    }

    public void setNamaLembaga(String namaLembaga) {
        this.namaLembaga = namaLembaga;
    }

    public void setJenisLembaga(String jenisLembaga) {
        this.jenisLembaga = jenisLembaga;
    }

    public void setKontakEmail(String kontakEmail) {
        this.kontakEmail = kontakEmail;
    }

    public void tampilkanData() {
        System.out.println("ID Lembaga   : " + idLembaga);
        System.out.println("Nama Lembaga : " + namaLembaga);
        System.out.println("Jenis        : " + jenisLembaga);
        System.out.println("Email        : " + kontakEmail);
    }

    public static void main(String[] args) {
        LembagaPelatihan lp = new LembagaPelatihan(
                12,
                "Lembaga Coding",
                "IT",
                "infocoding@gmail.com"
        );
        lp.tampilkanData();
    }
}

    

 