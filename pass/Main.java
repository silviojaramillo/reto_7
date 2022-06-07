package pass;
public class Main  {
    public static void main(String[] args) {
        long time_start, time_end;
        time_start = System.nanoTime();
        /*PassCode date = new PassCode();*/
        PassCodeString date1 = new PassCodeString();
        /*date.show();*/
        date1.show();
        time_end = System.nanoTime();
        System.out.println("El programa ha tardado  "+
                ( time_end - time_start ) +" nanosegundos");
    }


}