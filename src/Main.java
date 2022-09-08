import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand=new Random();
        Scanner input=new Scanner(System.in);//kullanıcıdan konsol ekranına yazdıklarını alırız
        int gameLevel;
        int uRight=3;
        int guess;
        int uGuess;
        System.out.println("Tahmin oyununa hosgeldiniz");
        System.out.println("Toplamda 3 tahmin hakkiniz var");
        System.out.println("Oyun seviyeleri\n"+
                            "1-Kolay(0-10)\n"+
                             "2-Orta(0-100)\n"+
                             "3-Zor(0-1000)\n");

        System.out.println("Lutfen seviye secimi yapiniz: ");
        gameLevel=input.nextInt();

        if (gameLevel==1){
            guess=rand.nextInt(10);
            while (uRight>0){
                System.out.println("Bir sayi tahmin ediniz: ");
                uGuess=input.nextInt();
                if (uGuess==guess){
                    System.out.println("Tebrikler dogru tahmin: ");
                    break;
                }
                else if (uGuess>guess){
                    System.out.println("Girdiginiz tahmin yuksek");
                    uRight--;
                    System.out.println("Kalan hakkiniz: "+uRight);
                }
                else {
                    System.out.println("Girdiginiz tahmin kucuk");
                    uRight--;
                    System.out.println("Kalan hakkiniz: "+uRight);
                }
            }
            if (uRight==0){
                System.out.println("Bulmaniz gereken sayi: "+guess);
            }

        }else if (gameLevel==2){
            guess= rand.nextInt(100);

            while (uRight>0){
                System.out.println("Bir sayi tahmin ediniz: ");
                uGuess=input.nextInt();
                if (uGuess==guess){
                    System.out.println("Tebrikler dogru tahmin: "+guess);
                    break;
                }else if(uGuess>guess){
                    System.out.println("Girdiginiz tahmin yuksek");
                    uRight--;
                    System.out.println("Kalan hakkiniz: "+uRight);
                }
                else{
                    System.out.println("Girdiginiz tahmin kucuk: "+guess);
                    uRight--;
                    System.out.println("Kalan hakkiniz: "+uRight);
                }
            }
            if (uRight==0){
                System.out.println("Bulmaniz gereken sayi: "+guess);
            }
        }else if (gameLevel==3){
            guess=rand.nextInt(1000);
            while (uRight>0){
                System.out.println("Bir sayi tahmin ediniz: ");
                uGuess=input.nextInt();
                if (uGuess==guess){
                    System.out.println("Tebrikler dogru tahmin: "+guess);
                    break;
                }else if (uGuess>guess){
                    System.out.println("Girdiginiz tahmin buyuk: "+guess);
                    uRight--;
                    System.out.println("Kalan hakkiniz: "+uRight);
                }else {
                    System.out.println("Girdiginiz tahmin kucuk: "+guess);
                    uRight--;
                    System.out.println("Kalan hakkiniz: "+uRight);
                }
            }
            if (uRight==0){
                System.out.println("Bulmaniz gereken sayi: "+guess);
            }
        }else{
            System.out.println("Hatali tuslama yaptiniz:");
        }
    }
}
