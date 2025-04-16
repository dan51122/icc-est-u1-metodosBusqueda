public class main{
    public static void main(String[] args) {
        int[] numeros = {3, 8, 2, 9, 5, 3, 1, 5, 6, 7, 8}; // agarra la primera instancia del 3 osea 0
        int valor = 3;
        


        int posicion = busquedaLineal.buscar(numeros, valor);
    



        if (posicion != -1) {
            System.out.println(posicion);
        } else {
            System.out.println("El valor no se encuentra en el arreglo " + valor);
        }
    }


}
