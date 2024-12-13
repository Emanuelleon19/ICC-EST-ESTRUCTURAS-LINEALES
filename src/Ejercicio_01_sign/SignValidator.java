package Ejercicio_01_sign;

import Materia.Stacks.StackGeneric;

public class SignValidator {
    public boolean isValid(String s) {
        StackGeneric<Character> stack = new StackGeneric<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Agregar al stack si es un carácter de apertura
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Eliminar del stack si coincide con el carácter de cierre
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Caso inválido
            }
        }
        
        return stack.isEmpty(); // Es válido si no quedan elementos en la pila
    }
}