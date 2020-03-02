import java.util.Scanner;

public class Printer {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Printer printer = new Printer();
        int paper = 0;
        if (paper == 0) {
            Printer.refill();
            System.out.println("Бумага заправлена");
            paper = paper + 1;
        }
        else if (paper == 1){
            System.out.println("Печать документа");
            Printer.print();
            paper = paper - 1;
        }
    }

   
    public static void print() {
    }

    public static void refill(){
        int paper = 0;
        if (paper == 0) {
            paper = paper + 1;
        }
        else if (paper == 1){
            System.out.println("Бумага уже заправлена");
        }
    }
}
