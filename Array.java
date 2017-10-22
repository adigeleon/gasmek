package adigeleon.com.gasmekegitim1;

/**
 * Created by Adigeleon on 22.10.2017.
 */
//Arkadaşlar bu kısımda daha önceki derslerde gördüğümüz genel uygulamaların tamamını anlatacağım
public class Array {
    public static void main(String[] args) {
        //değişken tanımlama

        int a = 6;  //genel integer değer tanımlama
        double b = 7.6969696; // double tanımlama
        float pi=3.14f; // float tanımlama
        String isim = "Gasmek Eğitim Merkezi"; // String tanımlama
        final int sayi=15; // Sabit (constant) tanımlama
        String soyisim = "Cumhuriyet";
        System.out.println(a);  // elimizdeki değişkenleri konsoldan yazdırmak için bu komutu kullanırız
        System.out.println(b);  // bu işlemi yaptırmak için parantez içine değişken ismini yazmamız yeterlidir.
        System.out.println(pi);
        System.out.println(isim);
        System.out.println(sayi);


        System.out.println(isim+ "" + soyisim);  //String değerleri birleştirmek için '+' işareti kullanılır
        System.out.println(isim +"\n"+soyisim);  //String değerleri alt alta yazdırmak için kullanılır.

        //******************************************Aritemetik Operatorler*********************************************
        //burada genel aritmetik operatörlerden bahsettim
        //toplama,çıkarma,çarpma,bölme
        int birincisayi = 10;
        int ikincisayi = 15;

        int toplam,fark,carpim;
        float bolum;

        toplam = birincisayi+ikincisayi; //toplama  işlemi
        fark= ikincisayi - birincisayi; // çıkarma işlemi
        carpim= birincisayi*ikincisayi;//çarpma işlemi
        bolum = ikincisayi/birincisayi; // bölme işlemi -- burada dikkat etmemiz gereken 15/10 işleminin sonucu 1.5 olduğu için bolum değişkenini float tanımladık

        System.out.println("birincisayi ve ikincisayinin toplamı = " + toplam);
        System.out.println("birincisayi ve ikincisayinin farkı = " + fark);
        System.out.println("birincisayi ve ikincisayinin çarpımı = " + carpim);
        System.out.println("birincisayi ve ikincisayinin bölünmesi  = " + bolum);



        //Diziler

        String[] myArray = new String[4]; // String array tanımlama
        myArray[0] = "Java"; // arraya index atama
        myArray[1] = "Python";
        myArray[2] = "Javascript";
        myArray[3] = "Angular";


        int [] sayilar = {15,18,19,23,69,87,14,33,66,99};  // integer array tanımlama




        // buradaki değişşkenleri ya da sayilar[?] indexi değiştirerek kendiniz deneyiniz
        //if-else işlemleri
        if(sayilar[3] == 15){
            System.out.println("sonuç doğru");
        }
        else if (sayilar[3] == 18){
            System.out.println("sonuç doğru");
        }
        else if (sayilar[3] == 19){
            System.out.println("sonuc doğru");
        }
        else if (sayilar[3] == 23){
            System.out.println("sonuc doğru");
        }

        else {
            System.out.println("sende bişey bilmiyorsun kardeş");
        }

        if (sayilar[4]<sayilar[3]){
            System.out.println(sayilar[4]+ " sayisi " +sayilar[3]+" sayisindan küçüktür");
        }
        else {
            System.out.println(sayilar[4]+ " sayisi " +sayilar[3]+" sayisindan büyüktür");

        }


        if (sayilar[5]!=sayilar[7]){
            System.out.println(sayilar[5]+ " sayisi " +sayilar[7]+" sayisina eşit değildir");
        }






        // döngüler

        //****** For döngüsü *****


        for(int i = 0; i<5;i++){ // bu for döngüsünün sonunda konsolda 5 kere yazılmış "gasmek yazısı görürsünüz"
            System.out.println("gasmek");

        }



        // arrayin elemanlarını yazdırma


        for (int i = 0;i<sayilar.length;i++){ // bu işlemin sonucunda sayilar arrayinin elemanlarını baştan sona doğru yazdırır
            System.out.println(sayilar[i]);
        }


        for (int i = sayilar.length-1;i<=0;i--){ //bu işlem sonucunda sayilar arrayinin elemanlarını sondan başa doğru yazdırırız


            System.out.println(sayilar[i]);
        }

        // For döngüsü kuıllanılarak yapılan bazı işlem örnekleri

        // kuvvet alma örn 5^4

        int taban = 5;

        for (int i=0;i<3;i++){
            taban = taban*5;
        }

        System.out.println(taban);

        //arrayin elemanlarını toplama
        int[] degerlerim = {1,3,5,7,9};
        int arraytoplam=0;
        for (int i=0;i<degerlerim.length;i++){

            arraytoplam=arraytoplam+degerlerim[i];
            System.out.println(arraytoplam);
        }














































    }
}
