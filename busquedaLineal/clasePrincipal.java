
public class clasePrincipal
{
       public static void main(String[] args) 
       {
        int [] arregloInt = {3, 37, 45, 57, 93, 120};

        busquedaLineal buscador = new busquedaLineal();

        int posicion = buscador.searchList(arregloInt, 45);

        if (posicion == -1)
           System.out.println("El valor " + 45 + " no se encontró ");
        else 
           System.out.println("El valor "+ 45 +" se encontró en la posición "+ posicion);

        }


}

