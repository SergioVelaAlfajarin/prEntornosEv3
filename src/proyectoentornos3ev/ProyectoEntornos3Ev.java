package proyectoentornos3ev;

import Interfaz.VentanaIndex;
import gestores.GestorUsuario;
import modelo.Usuario;

import java.util.Date;
import java.util.Scanner;

public class ProyectoEntornos3Ev {


    public static void menu(){

        System.out.println("1.- Agregar un nuevo Usuario.");
        System.out.println("2.- Buscar un usuario.");
        System.out.println("3.- Borrar un usuario.");
        System.out.println("4.- Salir");
    }

    public static void eleecciones(int num){

        switch(num){

            case 1:
                agregarUsuario();
                break;

            case 2:
                buscarUsuario();
                break;

            case 3:
                borrarUsuario();
                break;

            case 4:
                System.out.println("Fin del programa.");
                break;

            default:
                 throw new RuntimeException("Error:Numero fuera de rango");

        }

    }

    public static void agregarUsuario(){

        System.out.println("Introduzca su nombre:");
        String nombre= pideCadena();

        System.out.println("Introduzca su primer apellido.");
        String PApellidio= pideCadena();

        try{
            GestorUsuario.addUsuario(new Usuario(nombre, PApellidio));
            System.out.println("Se ha agregado correctamente.");
        }catch (RuntimeException r){
            System.out.println(r.getMessage());
        }
    }

    public static void borrarUsuario(){

        System.out.println("Introduzca su id de usuario:");
        int id = pideNumero();
        try{
            GestorUsuario.borraUsuario(id);
            System.out.println("Se ha borrado correctamente.");
        }catch (RuntimeException r){
            System.out.println(r.getMessage());
        }
    }

    public static void buscarUsuario(){

   String a = GestorUsuario.listarTodosLosUsuarios();

        System.out.println(a);

        System.out.println("Introduzca su nombre completo.");
        String nombreCompleto = pideCadena();

            Usuario u = GestorUsuario.buscaUsuario(nombreCompleto);

       if(u!= null){
           System.out.println(u);
       }else{
           System.out.println("Error: No se ha podido encontrar al usuario.");
       }

    }


    public static void main(String[] args) {
        VentanaIndex ventana = new VentanaIndex();
        ventana.setVisible(true);
        
        /*
        int opciones;
        do{
            menu();
            System.out.println("--- Introduzca Una De Las Opciones: ---");
            opciones = pideNumero();
            try {
                eleecciones(opciones);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(opciones!=4);
        */

    }

    //Pedir un int
    public static int pideNumero(){
        //Terminara con el return
        while(true){
            try{
                String num;
                num = pideCadena();
                return Integer.parseInt(num);
            }catch(Exception e){
                System.out.println("Error:No has introducido un numero.");
            }
        }
    }

    //Pedir un String
    public static String pideCadena(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine().toLowerCase().trim();
    }

}
