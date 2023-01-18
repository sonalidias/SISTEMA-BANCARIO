import java.util.Scanner;
public class utilidades{

    static Scanner sc = new Scanner(System.in);
    
    public static void limpador(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    public static void print(String msg){
        System.out.print(msg);
    }

    public static void println(String msg){
        System.out.println(msg);
    }


}
