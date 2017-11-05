package androidegitim2.adigeleon.com.androidegitim2;

/**
 * Created by Adigeleon on 19.09.2017.
 */

public class Variables {

    public static void main(String[] args) {


        int a = 12;
        int b = 15;
        int c = a+b;
        System.out.println("my new integer value is " + c);
        System.out.println("deneme java series");
        double d = 12.121221;
        System.out.println(d*c);
        int age;
        float pi =  3.14f;
        double si = 3.14;
        System.out.println(pi*2);
        System.out.println(si*2);

        char burda = 'a';
        System.out.println(burda);

       final String isim = "Haşim";
        String soyisim = "Arıslan";
      //  isim = "hasan";
        String AdSoyad = isim + soyisim;
        System.out.println(AdSoyad);

        boolean isAlive = true;
        System.out.println(isAlive);
        if(isAlive == true){
            System.out.println(isim + ' ' + soyisim);
        }
    }


}
