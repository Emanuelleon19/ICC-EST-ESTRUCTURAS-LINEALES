package Ejercicio_02_sorting;

import Materia.Stacks.StackGeneric;

public class StackSorter {
    public void sortStack(StackGeneric<Integer> stack) {
        StackGeneric<Integer> tempStack = new StackGeneric<>();
        
        while (!stack.isEmpty()) {
            int current = stack.pop(); // Obtener el elemento del tope de la pila original
            
            // Mover elementos más grandes al stack original para dejar espacio al menor
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            
            tempStack.push(current); // Insertar el elemento en su posición ordenada
        }
        
        // Mover los elementos de vuelta a la pila original para mantener el orden
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
