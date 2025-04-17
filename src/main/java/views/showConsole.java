package views;
import java.util.Scanner;
public class showConsole {

    private Scanner scanner;

    public showConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner(){
        System.out.println("*********Metodos De Busqueda***********");
    }

    public int inputCode(){
        System.out.println("Ingrese un codigo");
        int code = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea que deja nextInt()
        return code;
    }

    public String inputName(){
        System.out.println("Ingrese un nombre");
        String name = scanner.nextLine();
        return name;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}