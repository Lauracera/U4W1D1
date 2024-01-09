//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ESERCIZIO 1
        System.out.println("Moltiplicazione: " + Moltiplicazione(2, 3));
        System.out.println("Concatenzaione: " + Concatenazione("Ciao, ", "sono Laura"));


        }

        public static int Moltiplicazione(int x, int y){
        return x*y;
    }
    public static String Concatenazione(String a, String b){
        return a + " " + b;
    }
}