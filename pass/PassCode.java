package pass;

import java.util.Random;
public class PassCode {
    int value = 0;
    String cadena = "";
    String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "!", "#", "$" ,"%", "&" ,"'" , "(", ")", "*" ,"+", ",", "-", "." ,"/", "0", "1" ,"2", "3", "4" ,"5", "6" ,"7", "8", "9", ":", ";","=", "?", "@","[", "]", "^", "_" ,"`", "{", "|", "}", "~"};
    Random r = new Random();
    public int randomNumber(){
        value = r.nextInt(a.length);
        return value;
    }
    public String addString(){
        for (int i = 0; i <= 12; i++) {
            int element = randomNumber();
            if(element <= 26){
                String letter = a[element].toUpperCase();
                cadena = cadena + letter;
            }else {
                cadena = cadena + a[randomNumber()];
            }

        }
        return cadena;
    }
    void show(){
        System.out.println(addString());
    }
}
