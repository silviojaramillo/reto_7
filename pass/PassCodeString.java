package pass;

import java.util.Random;
public class PassCodeString {
    int value = 0;
    String a = "abcdefghijklmnñopqrstuvwxyz!#$%&'()*+,-./012345,6789:;=?@[]^_`{|}~";
    String cadena = "";
    Random r = new Random();
    public int randomNumber(){
        value = r.nextInt(a.length());
        return value;
    }
    public String addString(){
        for (int i = 0; i <= 12; i++) {
            int element = randomNumber();
            if(element <= 26){
                String letter = a.substring(element,
                        element+1).toUpperCase();
                cadena = cadena + letter;
            }else {
                int second = randomNumber();
                cadena = cadena + a.substring(second, second+1);
            }

        }
        return cadena;
    }
    void show(){
        System.out.println(addString());
    }
}
