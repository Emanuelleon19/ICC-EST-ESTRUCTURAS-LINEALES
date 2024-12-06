package Materia;
import Materia.Stacks.Stack;
import Materia.Stacks.StackGeneric;
import Models2.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        runStack();
        runStackGeneric();
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
}
