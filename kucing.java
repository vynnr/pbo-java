class Kucing {
    private String nama;
    private int umur;
    private String ras;
    
    public Kucing(String nama, int umur, String ras) {
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
    }
    
    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
    
    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan + ".");
    }
    
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kitty", 3, "Persia");
        kucing.tidur();
        kucing.makan("ikan");
    }
}