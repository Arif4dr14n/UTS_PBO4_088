class bilangan{
    int nilai;

    bilangan(int nilai){
        this.nilai = nilai;
    }

    int Faktorial(int nilai){
        if (nilai == 1 || nilai == 0)
            return 1;
        else
            return (nilai * Faktorial(nilai - 1));
    }
}

public class Faktorial_Recursive {
    public static void main(String[] args){
        bilangan bilangan1 = new bilangan(5);
        System.out.println("Nilai Faktorial: "+bilangan1.Faktorial(bilangan1.nilai));
    }
}
