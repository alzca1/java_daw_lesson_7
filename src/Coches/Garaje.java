package Coches;

public class Garaje {

    public static void main(String[] args) {
        Coche coche1 = new Coche("Azul", "Nissan", "Almera");
        System.out.println(coche1.marca);
        System.out.println("The current speed is "+coche1.speed);

        coche1.speedUp();
    }

}
