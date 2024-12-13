package Materia;
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import Models2.Pantalla;

import java.util.Scanner;

import Controller.MenuController;
import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Queues.Queue;
import Materia.Queues.QueueGeneric;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        //runStackGeneric();
        //runQueue();
        //runQueueGeneric();
        //runControllerMannager();
        runSignValidator();
        runStackSorter();
    }
    private static void runControllerMannager(){
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }

    public static void runStack(){

        Stack stack = new Stack();

        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        stack.printStack();
        int cont = stack.getSize();
        System.out.println("Tamanio: " + cont);

        System.out.println(stack.getSize2());


        System.out.println("Cima    ->" + stack.peek());
        System.out.println("Retirar ->" + stack.pop());
        System.out.println("Cima    ->" + stack.peek());
        System.out.println("Retirar ->" + stack.pop());
        System.out.println("Cima    ->" + stack.peek());

    }

    public static void runStackGeneric() {
        StackGeneric<Pantalla> router = new StackGeneric<>();
        
        router.push(new Pantalla(1, "Home page", "/home"));
        router.push(new Pantalla(1, "Menu page", "/home/menu"));
        router.push(new Pantalla(1, "Users page", "/home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        System.out.println("Regreso a " + ((router.popNode().getNext().getValue())).getRuta());
        System.out.println("Estoy en " + router.peek().getRuta());
        
        router.push(new Pantalla(1, "Settings Page", "/home/menu/settings"));

        System.out.println("Pantalla = " + router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());
        router.printStack();
    }
    public static void runQueue(){
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);
        
        cola.printQueue();
        int cont = cola.getSize();
        System.out.println("Tamanio: " + cont);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());



    }
        
    public static void runQueueGeneric(){
        System.out.println("-------------");
        QueueGeneric<Pantalla> cola = new QueueGeneric<>();

        cola.enqueue(new Pantalla(1, "Home page", "/home"));
        cola.enqueue(new Pantalla(1, "Menu page", "/home/menu"));
        cola.enqueue(new Pantalla(1, "Users page", "/home/menu/users"));

        System.out.println("Estoy en " + cola.dequeue().getRuta());
        System.out.println("Regreso a " + ((cola.popNode().getNext().getValue())).getRuta());
        System.out.println("Estoy en " + cola.peek().getRuta());
        
        cola.enqueue(new Pantalla(1, "Settings Page", "/home/menu/settings"));

        System.out.println("Pantalla = " + cola.getSize());
        System.out.println("Estoy en " + cola.peek().getRuta());
        cola.printQueueGeneric();
    }

    public static void runSignValidator() {
        SignValidator validator = new SignValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena con paréntesis, corchetes o llaves para validar:");
        String input = scanner.nextLine();
        if (validator.isValid(input)) {
            System.out.println("La cadena ingresada esta correctamente cerrada.");
        } else {
            System.out.println("La cadena no esta cerrada correctamente.");
        }

        scanner.close();
    }
    
    public static void runStackSorter() {
        // Crear una instancia de StackGeneric y agregar elementos
        StackGeneric<Integer> stack = new StackGeneric<>();
        stack.push(7);
        stack.push(11);
        stack.push(24);
        stack.push(22);
        stack.push(3);
        stack.push(5);

    
        System.out.println("Pila antes de ordenar: " + stack);
    
        // Usar StackSorter para ordenar la pila
        StackSorter sorter = new StackSorter();
        sorter.sortStack(stack);
    
        System.out.println("Pila después de ordenar: " + stack);
    }
    
}
