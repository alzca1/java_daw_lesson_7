package AskUser;

import java.util.Scanner;

public class AskUserPass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Por favor, ingrese su edad");
        int edad = sc.nextInt();

        System.out.println("Gracias, " + nombre + ". En 10 años usted tendrá " + (edad + 10) + " años");
    }
}
