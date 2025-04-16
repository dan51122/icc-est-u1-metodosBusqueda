package controllers;
public class MetodosBusquedaBinaria {
    private Person[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Person[] people) {
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo busqueda binaria");
    }

    private int findPersonByCode(int code ) {
        int bajo = 0;
        int alto = people.length - 1;

        while (alto >= bajo) {
            int central = bajo + (alto - bajo) / 2;
            if (people[central].getCode() == code) {
                return central;
            } else if (people[central].getCode() > code) {
                alto = central -1;
            } else {
                bajo = central + 1;
            }
        }
        return -1; 
    
    }

    public void showPersonByName() {
        String codeToFind = pantalla.inputName();
        int indexPerson = findPersonByCode(codeToFind);

        if (indexPerson == -1) {
            pantalla.showMessage("Persona con codigo " + codeToFind + " encontrada.");
            pantalla.showMessage(people[indexPerson].toString());
        } else {
            pantalla.showMessage("Persona no encontrada.");
        }
    }

    private int findPersonByName(String name) {
        if (people[0].getame().equals(name)) {
            return 0;
        }
        if (people[0].getame().compareTo(name) > 0) {
            return 1;
        }
        
    }

    
}