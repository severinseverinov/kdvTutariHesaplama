import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        double tutar,kdvOran,kdvTutar,kdvliTutar;

        Scanner input=new Scanner(System.in);

        while(true) {
            System.out.print("Lütfen ücret tutarını giriniz : ");
            tutar = input.nextDouble();
            if(tutar>0){break;}
            System.out.println("Lütfen ücret tutarını 1'den büyük giriniz.");
        }

        if(tutar<1000){kdvOran=0.18;}
        else {kdvOran=0.08;}

        kdvTutar=kdvOran*tutar;
        kdvliTutar=kdvTutar+tutar;

        System.out.println("KDV'siz Fiyat = "+tutar);
        System.out.println("KDV Oranı = %"+(kdvOran*100));
        System.out.println("KDV Tutarı = "+kdvTutar);
        System.out.println("KDV'li Fiyat = "+kdvliTutar);
    }
}
