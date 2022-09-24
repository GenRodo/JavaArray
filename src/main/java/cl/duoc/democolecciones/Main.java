package cl.duoc.democolecciones;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
//El daniel se la come a dos manos 
        
        /*String listaDePalabras = "";
        int contadorDePalabras = 0;
        
        listaDePalabras += "El ";
        contadorDePalabras++;
        
        listaDePalabras += "Daniel ";
        contadorDePalabras++;
        
        listaDePalabras += "se ";
        contadorDePalabras++;
        
        listaDePalabras += "la ";
        contadorDePalabras++;
        
        listaDePalabras += "come ";
        contadorDePalabras++;
        
        listaDePalabras += "a ";
        contadorDePalabras++;
        
        listaDePalabras += "dos ";
        contadorDePalabras++;
        
        listaDePalabras += "manos ";
        contadorDePalabras++;
        
        System.out.println(listaDePalabras);
        System.out.println("Hola " + contadorDePalabras);*/
        
        // LA MANERA DE ARRIBA ES MANUAL
        // LA MANERA DE ABAJO ES CON LISTAS
        
        //Array <Aqui se meten clases> Las clases empiezan con mayusculas
        String palabra = "que bien";
        
        ArrayList <String> lista = new ArrayList<>(); //se  guardan solo String (guarda "char") en el Array - Se usa clase Integer (viene a ser una libreria de los numeros) para usar "int"
        
        lista.add ("Hola"); //Tienen posiciones, pero no interesan
        //lista.add (0, "Antes del hola"); //CON POSICION
        //lista.add (-1, "Antes del hola"); NO FUNCIONA CON NUMEROS NEGATIVOS
        lista.add ("¿como");
        lista.add ("estas?");
        lista.add (2, "Genesis");
        lista.add(palabra);
        
        

        //IMPRIMIR SIN BORRAR
        
        System.out.println(lista);
        
        //SE BORRA
        
        lista.remove("Hola");
        
        //IMPRIMIR CON BORRADO
        
        System.out.println(lista);
        
        // MODIFICA
        
        int posicion = lista.indexOf("Genesis"); // busca posicion
        
        lista.remove("Genesis");
        lista.add(posicion, "Marcos");
        
        System.out.println(lista);
        
        //CONTADOR
        
        System.out.println("Son "+ lista.size() + " palabras"); 
        System.out.println("Son "+ lista.size() + " PENES QUE LE GUSTAN AL DANIEL");
        
        
        //lista.clear(); //BORRA TODO
        
        System.out.println(lista);
        
       // lista.removeAll(lista);//BORRA LAS COINCIDENCIAS "5 = 5" BORRADO
        
        ArrayList<String> listaAEliminar = new ArrayList(); //LISTA NUEVA PARA CENSURAR ESPECIFICAMENTE ALGO EJEMPLO NOMBRES
        
        listaAEliminar.add("Genesis");
        listaAEliminar.add("Pepe");
        listaAEliminar.add("Juan");
        
        lista.removeAll(listaAEliminar);
        
        System.out.println(lista);
        
        /*
        ArrayList<String> nuevaLista = (ArrayList<String>) lista.clone(); // Se copia archivo, sirve para modificar una y las otras se mantienen igual
        ArrayList<String> nuevaLista2 = (ArrayList<String>) lista.clone();
        ArrayList<String> nuevaLista3 = (ArrayList<String>) lista.clone();
        */
        System.out.println(lista.contains("Marco")); // Si contiene algo - devuelve BOOLEANO
        
        //lista.ensureCapacity(posicion); // TE DEJA AGREGAR ELEMENTOS VACIOS
        
        // MANTENER LA LISTAS SUPER SIMPLES 
        
        String busqueda = lista.get(1); // DEVUELVE LA POSICION
        System.out.println(busqueda);
    }
    
}
