
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Queue<String> araclar = new LinkedList<String>();
        Queue<String> arac = new LinkedList<String>();
        Scanner scn = new Scanner(System.in);
        
        araclar.offer("Murat");
        araclar.offer("Hasan");
        araclar.offer("Okan");
        araclar.offer("Ayşe");
        araclar.offer("Merve");
        araclar.offer("Ezgi");
        araclar.offer("Gizem");
        araclar.offer("Mehmet");
        araclar.offer("Oğuz");
        araclar.offer("Azer"); 
        araclar.offer("1 adet misafir araç");
        
        
        arac.offer("HONDA");
        arac.offer("BMW");
        arac.offer("CİTROEN");
        arac.offer("MERCEDES");
        arac.offer("RENULT");
        arac.offer("Alfa Romeo");
        arac.offer("Audi");
        arac.offer("Buick");
        arac.offer("Bentley");
        arac.offer("Cadillac"); 
        System.out.println("misafir aracın markasını giriniz");
        String arac_ekle = scn.nextLine();
        arac.offer(arac_ekle);
        
        
        
        
        
        
        System.out.println("Mahallemize hoşgeldiniz");
        System.out.println("coivd mesai saati uygulaması yapılıyor");
        Thread.sleep(3000);
        System.out.println("Mahallenin çalışanları evlerine gönderiliyor....");
        Thread.sleep(3000);
        System.out.println("Trafik yükleniyor....");
        Thread.sleep(2500);
        System.out.println("Mahalle çalışanları araçlarını park ediyor...");
        Thread.sleep(1000);
        int bosParkAlanı = 1+random.nextInt(11);
         System.out.println("Mahallenin boş park alanı = "+bosParkAlanı);
        while(bosParkAlanı != 0){
           
            System.out.println(araclar.poll()+" aracını park ediyor..");
            System.out.println("park edilen aracın markası = "+arac.poll());
            Thread.sleep(1000);
            bosParkAlanı--;

        }
        System.out.println("boş park alanı kalmadı...");





    }
    
}
