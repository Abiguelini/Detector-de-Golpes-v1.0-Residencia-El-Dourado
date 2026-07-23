import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String txt = "Inicio do trabalho";
        System.out.println(txt);
        Scanner sc = new Scanner(System.in);
        System.out.println("qual tua idade?");
        int valor =  sc.nextInt();
        System.out.println("Tenho " + valor +" anoos");


    }

}