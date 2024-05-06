import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DOSEN
 */
public class MhsNilaiUjianHer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String a[], b[];
        double c[], d[], total=0, rata=0;
        int i, n;
        
        //deklarasi proses input
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        
        //berikan batasan indeks array
        System.out.print("masukan Jumlah Looping : ");
        n=Integer.parseInt(input.readLine());
        
        //deklarasi array
        a=new String[n];
        b=new String[n];
        c=new double[n];
        d=new double[n];
        
        //Input Looping
        for(i=0;i<n;i++){
            System.out.print("Masukan Nim:" );
            a[i]=input.readLine();
            
            System.out.print("Masukan Nama:");
            b[i]=input.readLine();
            
            System.out.print("Masukan Nilai Akhir:");
            c[i]=Double.parseDouble(input.readLine());
            
            System.out.print("Masukan Nilai Her:");
            d[i]=Double.parseDouble(input.readLine());
            
            System.out.println("-------------------");
            NilaiUjianHer ObjLoopArray =new NilaiUjianHer(a[i],b[i],c[i],d[i]);
        }
        
        
        //Output Looping
        for(i=0;i<n;i++){
            NilaiUjianHer ObjLoopArray =new NilaiUjianHer(a[i],b[i],c[i],d[i]);
            System.out.println("-------------------");
            System.out.println("Loop Ke:"+i);
            ObjLoopArray.getCetak();
            
            
            System.out.println("-------------------");
            total=total+ObjLoopArray.getNilaiHasil();
            rata=total/n;
        }
        
        //cetak
        System.out.println("Total :"+total);
        System.out.println("Rata-rata :"+rata);
    }
    
}
