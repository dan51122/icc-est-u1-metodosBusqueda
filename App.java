import controllers.MetodosBusqueda;
import models.Person;
import views.showConsole;
import controllers.MetodosBusquedaBinaria;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas = new Person[7];

        personas[0] = new Person(100, "Juan");
        personas[1] = new Person(101, "Maria");
        personas[2] = new Person(102, "Carlos");
        personas[3] = new Person(103, "Sofia");
        personas[4] = new Person(104, "Luis");
        personas[5] = new Person(105, "Ana");
        personas[6] = new Person(106, "Miguel");


    
        MetodosBusqueda mB = new MetodosBusqueda(personas);
        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);

        mBB.showPersonByName();
        int codigoBuscar = 103;
        int resultado = mB.findPersonByCode(codigoBuscar);
        showConsole console = new showConsole(); 
    
        if (resultado != -1) {
            System.out.println("Persona encontrada: " + personas[resultado]);
        } else {
            System.out.println("Persona con codigo " + codigoBuscar + " no encontrada.");
        }
        




        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        int [] arreglo = {2, 4, 6, 8, 9, 3, 4, 6, 1};
        int valor = 6;
        int resultado = metodosBusqueda.busquedaLineal(arreglo, valor);
        if(resultado>0){
            System.out.println("El numero " + valor + ", esta en la posición " + resultado);
        } else;
        System.out.println(" el numero no esta en la lista :(");

    }
}
