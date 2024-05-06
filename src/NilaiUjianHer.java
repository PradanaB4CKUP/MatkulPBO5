public class NilaiUjianHer {
    String Nim, Nama;
    double NilaiAkhir, NilaiHer, NilaiHasil;
    char Grade;

    public NilaiUjianHer(String x, String y, double a, double b){
        Nim=x;
        Nama=y;
        NilaiAkhir=a;
        NilaiHer=b;
    }

    public double getNilaiAkhir(){
        return (NilaiAkhir*0.3);
    }

    public double getNilaiHer(){
        return (NilaiHer*0.7);
    }

    public double getNilaiHasil(){
        NilaiHasil=getNilaiAkhir()+getNilaiHer();
        return NilaiHasil;
    }

    public char getGrade(){
        if(NilaiHasil>79){
            Grade='B';
        }else if(NilaiHasil<=79 && NilaiHasil>69){
            Grade='C';
        }else if(NilaiHasil<=69 && NilaiHasil>59){
            Grade='D';
        }else{
            Grade='E';
        }
        return Grade;
    }

    public void getCetak(){
        System.out.println("Hasil Nilai Her : " +getNilaiHasil());
        System.out.println("Hasil Grade Her : "+getGrade());
    }
}
