package Coches;

public class Coche {
    public String color;
    public String marca;
    public String modelo;
    public Integer speed = 0;

    public Coche(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void speedUp() {
        this.speed += 5;
        System.out.println("The current speed is " + this.speed);
    }
}
