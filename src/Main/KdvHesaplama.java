package Main;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double tutar,kdvOran1=0.18 ,kdvOran2=0.08, kdvliTutar, kdvTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret giriniz : ");
        tutar = input.nextDouble();

        kdvTutar =   tutar * kdvOran1;
        System.out.println(kdvTutar);


        boolean kosul1= tutar >=0;
        boolean kosul2 = tutar <=1000;
        boolean sonuc = kosul1 && kosul2;

        System.out.println("KDV'siz Tutar : "+tutar);
        kdvTutar=sonuc ? kdvOran1 : kdvOran2;
        kdvliTutar= kdvTutar + tutar;

        System.out.println("KDV Oranı : "+kdvOran1);
        System.out.println("KDV Tutar : "+kdvTutar);
        System.out.println("KDV'li Tutar : "+kdvliTutar);





    }



}
