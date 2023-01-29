package Giris;
import java.util.Scanner;
public class UcakBiletiFiyati {
    public static void main(String[] args) {
        int distance,age,flighttype;
        double ticket;
        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz:");
        distance=inp.nextInt();
        System.out.print("Yaşınızı Giriniz:");
        age=inp.nextInt();
        System.out.print("Yolculuk Tipini Giriniz: (Tek Yön İçin-1,Gidiş,Dönüş İçin-2)");
        flighttype=inp.nextInt();
        ticket=0.1*distance;
        if((distance>0 && age>0) && (flighttype==1 || flighttype==2)){
            if(flighttype==2){
            if(age<=12){
                System.out.println("Bilet tutarı:"+ (ticket*0.5)*0.8*2);
            }else if(age>12 && age<24){
                System.out.println("Bilet tutarı:"+ (ticket*0.9)*0.8*2);
            }else if(age>65){
                System.out.println("Bilet tutarı:"+ (ticket*0.7)*0.8*2);
            }else{
                System.out.println("Bilet tutarı:"+ ticket*0.8*2);
            }
            }else if(flighttype==1){
                if(age<=12){
                    System.out.println("Bilet tutarı:"+ (ticket*0.5));
                }else if(age>12 && age<24){
                    System.out.println("Bilet tutarı:"+ (ticket*0.9));
                }else if(age>65){
                    System.out.println("Bilet tutarı:"+ (ticket*0.7));
                }else{
                    System.out.println("Bilet tutarı:"+ ticket);
                }

            }
        }else{
            System.out.println("Hatalı Giriş Yaptınız.");
        }
}
}
