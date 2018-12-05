package components;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Xavi
 */

public interface Component {
    
    Scanner DADES= new Scanner(System.in);
    
    public abstract void mostrarComponent();
    public void modificarComponent() throws ParseException;
    
    default Object demanarDades(String peticio, int tipus){
        
        int enter; String token, cadena; double decimal;
        
        System.out.println(peticio);
        
        switch (tipus) {
            
                case 1:
                    enter = DADES.nextInt();
                    DADES.nextLine();
                    return enter;
                case 2:
                    token = DADES.next();
                    DADES.nextLine();
                    return token;
                case 3:
                    decimal = DADES.nextDouble();
                    DADES.nextLine();
                    return decimal;
                case 4:
                    cadena = DADES.nextLine();
                    return cadena;
        }
        return null;
    }
    
}
