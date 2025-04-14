public class App {
    public static void main(String[] args) throws Exception {
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
