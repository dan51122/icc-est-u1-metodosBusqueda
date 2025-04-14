public class MetodosBusqueda {


    public int busquedaLineal(int[] arreglo, int valor){
        for (int posicion = 0; posicion < arreglo.length; posicion++) {
            if (arreglo[posicion] == valor) {
                return posicion;
            }
        }
        return -1;
    }
}
