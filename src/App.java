
import Models.Persona;
import Views.ViewConsole;
import Controllers.PersonaController;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona ("Juan", 25),
            new Persona ("Maria", 30),
            new Persona ("Carlos", 22),
            new Persona ("Ana", 28),
            new Persona ("Luis", 35),
            new Persona ("Sofia", 27),
            new Persona ("Miguel", 40),
            new Persona ("Laura", 32),
            new Persona ("Pedro", 29),
            new Persona ("Elena", 26),
        };


      
        
        PersonaController pC= new PersonaController();
        ViewConsole vC = new ViewConsole();
        vC.printMessage("Arreglo personas");
        vC.printPersonsArray(personas);
        vC.printMessage("Arreglo personas ordenado");
        pC.ordenarPorEdad(personas);
        vC.printPersonsArray(personas);

        vC.printMessage("buscar persona con edad 40");
        Persona personaBuscada = pC.buscarPorEdad(personas, 40);
        if (personaBuscada == null){
            vC.printMessage("No se encontró ninguna persona con edad 40.");
        }else{
            vC.printMessage("se encontro persona con edad 40");
            vC.printMessage(personaBuscada.toString());
        }
        vC.printMessage("buscar persona con edad 99");
        Persona personaBuscadaos = pC.buscarPorEdad(personas, 99);
        if (personaBuscadaos == null){
            vC.printMessage("No se encontró ninguna persona con edad 99.");
        }else{
            vC.printMessage("se encontro persona con edad 99");
            vC.printMessage(personaBuscadaos.toString());
        }
        

        //4.imprimimos el arreglo ordenado
        //5.Mensaje = Buscar persona con edad 40
        //6.imprimir resultados de busqueda y la persona si se encontro
        //7.Mensaje = Buscar persona con edad 99
        //8.imprimir resultado de busqueda y la persona si se encontro

     

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}

