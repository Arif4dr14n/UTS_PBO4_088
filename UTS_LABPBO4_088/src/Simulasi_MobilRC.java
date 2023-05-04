class MobilRC{
    String nama;
    int k_baterai;
    int baterai;
    String merek;
    int jaraktempuh;

    MobilRC(String nama,int k_baterai, int baterai, String merek, int jaraktempuh){
        this.nama = nama;
        this.k_baterai = k_baterai;
        this.baterai = baterai;
        this.merek = merek;
        this.jaraktempuh = jaraktempuh;
    }

    void maju(){
        if (baterai <= 0){
            System.out.println("Batera mobil "+nama+" habis");
            System.out.println();
        }else{
            System.out.println("MobilRC "+nama+" bergerak maju");
            this.baterai -= 20;
            this.jaraktempuh += 10;
            System.out.println();
        }
    }

    void mundur(){
        if (baterai <= 0){
            System.out.println("Batera mobil "+nama+" habis");
            System.out.println();
        }else{
            System.out.println("MobilRC "+nama+" bergerak mundur");
            this.baterai -= 20;
            this.jaraktempuh += 10;
            System.out.println();
        }
    }

    void kiri(){
        if (baterai <= 0){
            System.out.println("Batera mobil "+nama+" habis");
            System.out.println();
        }else{
            System.out.println("MobilRC "+nama+" bergerak ke kiri");
            this.baterai -= 20;
            this.jaraktempuh += 10;
            System.out.println();
        }
    }

    void kanan(){
        if (baterai <= 0){
            System.out.println("Batera mobil "+nama+" habis");
            System.out.println();
        }else{
            System.out.println("MobilRC "+nama+" bergerak ke kanan");
            this.baterai -= 20;
            this.jaraktempuh += 10;
            System.out.println();
        }
    }

    void isiBaterai(){
        this.baterai += this.k_baterai;
    }

    void print(){
        System.out.println("Nama: "+nama);
        System.out.println("Kapasitas Baterai: "+k_baterai);
        System.out.println("Baterai saat ini: "+baterai);
        System.out.println("Merek: "+merek);
        System.out.println("Jarak Tempuh: "+jaraktempuh);
        System.out.println();
    }

}

public class Simulasi_MobilRC {
    public static void main(String[] args){
        MobilRC mobil1 = new MobilRC("Tamiya", 3000,0,"Honda", 0);
        mobil1.print();
        mobil1.isiBaterai();
        mobil1.print();
        mobil1.maju();
        mobil1.mundur();
        mobil1.kiri();
        mobil1.kanan();
        mobil1.print();
    }
}
