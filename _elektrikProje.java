package task3;

import java.util.Scanner;

public class _elektrikProje {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float aylikFatura;
        int elektriktuketim;
        float birimF;
        int ilkEndx; // eski okuma
        int sonEndx; // yeni okuma

        System.out.print("İlk indexi giriniz=");
        ilkEndx=scanner.nextInt();
        System.out.print("Son indexi giriniz=");
        sonEndx=scanner.nextInt();
        elektriktuketim=sonEndx-ilkEndx;

        if (elektriktuketim<=100)
            birimF=1.1F;
        else if (elektriktuketim < 200) {
            birimF=1.3F;
        } else if (elektriktuketim < 300) {
            birimF=1.5F;
        } else if (elektriktuketim < 400) {
            birimF=1.7F;
        } else if (elektriktuketim < 500) {
            birimF=1.9F;
        }else
            birimF=2.3F;
        aylikFatura=elektriktuketim*birimF;

        System.out.println("aylikFatura = " + aylikFatura);

    }
}

