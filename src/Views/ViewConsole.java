package Views;
import Models.Persona;

public class ViewConsole {
    public void printPersonsArray(Persona[] personas){
        for(int i = 0; i < personas.length; i++){
            System.out.println(personas[i]+ " - " );
        }
        System.out.println();
    }

    public void printMessage(String message){
        System.out.println(message);
    }
    
}
