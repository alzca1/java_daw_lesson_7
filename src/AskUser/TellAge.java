package AskUser;

import java.io.Console;
public class TellAge {

    public static void main (String[] args){
        Console c = System.console();
        String name = c.readLine("Nombre usuario");
        char pwd[] = c.readPassword("Contraseña");
        String upwd = new String(pwd);

        // El usuario es Ilerna y la contraseña Online
        if (name.equals("Ilerna") && upwd.equals("Online")) {
            System.out.println("Usuario y contraseña validos");
        } else {
            System.out.println("Usuario o contraseña no validos");
        }
    }
    
}
