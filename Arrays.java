package androidegitim2.adigeleon.com.androidegitim2;

import android.widget.Switch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Adigeleon on 19.09.2017.
 */

public class Arrays {
    public static void main(String[] args) {
        String[] isimler = new String[3];
        isimler[0] = "hasan";
        isimler[1] = "Haşim";
        isimler[2] = "Hakkı";
        for ( int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i] + isimler[i]);
        }

        int[] sayilar = {0,1,2,3,4};
        int adana = sayilar[0]+sayilar[2];


        for( int i=sayilar.length-1;i>=0;i--){
            System.out.println(sayilar[i]);
        }

        ArrayList<String> sarkicilar = new ArrayList<String>();
        sarkicilar.add(0,"hasan");
        sarkicilar.add(1,"ali");
        sarkicilar.add(2,"feyza");
        sarkicilar.add(3,"kartal");
        sarkicilar.add(4,"deniz");

        System.out.println(  sarkicilar.toArray().length);

        for(int i = 0; i<   sarkicilar.toArray().length; i++){
            System.out.println(sarkicilar.toArray()[i]);
        }



        HashSet<String> myset = new HashSet<String >();
           myset.add("haci abi");
        myset.add("haci abisad");
        myset.add("haci abicds");
        System.out.println(myset.size());

        HashMap<String,String> myHashMap = new HashMap<String,String>();
        myHashMap.put("haşim","kahramanmaraş");
        myHashMap.put("Fatih","kırşehir");
        myHashMap.put("Bekir","adana");

        System.out.println(myHashMap.get("haşim"));

        int day = 1;
        String gun = " ";
        while (day < 8){

            switch (day){
                case 1:
                    gun = "Pazartesi";
                    System.out.println(gun);
                    break;
                case 2:
                    gun = "Salı";
                    System.out.println(gun);
                    break;
                case 3:
                    gun = "Çarşamba";
                    System.out.println(gun);
                    break;
                case 4:
                    gun = "Perşembe";
                    System.out.println(gun);
                    break;
                case 5:
                    gun = "Cuma";
                    System.out.println(gun);
                    break;
                case 6:
                    gun = "Cumartesi";
                    System.out.println(gun);
                    break;
                default:
                    gun = "Pazar";
                    System.out.println(gun);
            }
            day++;
        }


    }



}
