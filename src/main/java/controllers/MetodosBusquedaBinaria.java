package controllers;

import models.Person;
import views.showConsole;

public class MetodosBusquedaBinaria {
    private Person[] people;
    private showConsole pantalla;

    public MetodosBusquedaBinaria(Person[] people) {
        this.people = people;
        this.pantalla = new showConsole();
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
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFind);
    
        if (indexPerson != -1) {
            pantalla.showMessage("Persona con nombre " + nameToFind + " encontrada.");
            pantalla.showMessage(people[indexPerson].toString());
        } else {
            pantalla.showMessage("Persona no encontrada.");
        }
    }
    
    private int findPersonByName(String name) {
        int bajo = 0;
        int alto = people.length - 1;
    
        while (alto >= bajo) {
            int central = bajo + (alto - bajo) / 2;
            int comparisonResult = people[central].getName().compareTo(name);
            if (comparisonResult == 0) {
                return central;
            } else if (comparisonResult < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return -1;
    }
}