public class Main {
    public static void main(String[] args) {
        // Teste da LinkedStack
        LinkedStack<Integer> stack = new LinkedStack<>();
        System.out.println("Pilha: Iniciando os testes");

        System.out.println("Empilhando elementos 1, 2, 3");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Topo da pilha: " + stack.top());
        System.out.println("Número de elementos na pilha: " + stack.numElements());

        System.out.println("Desempilhando elemento: " + stack.pop());
        System.out.println("Topo da pilha após desempilhar: " + stack.top());
        System.out.println("Número de elementos na pilha após desempilhar: " + stack.numElements());

        System.out.println("Desempilhando todos os elementos restantes");
        while (!stack.isEmpty()) {
            System.out.println("Desempilhando: " + stack.pop());
        }
        System.out.println("Pilha está vazia? " + stack.isEmpty());

        // Teste da LinkedQueue
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        System.out.println("\nFila: Iniciando os testes");

        System.out.println("Enfileirando elementos 1, 2, 3");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Primeiro elemento da fila: " + queue.front());
        System.out.println("Último elemento da fila: " + queue.back());
        System.out.println("Número de elementos na fila: " + queue.numElements());

        System.out.println("Desenfileirando elemento: " + queue.dequeue());
        System.out.println("Primeiro elemento da fila após desenfileirar: " + queue.front());
        System.out.println("Número de elementos na fila após desenfileirar: " + queue.numElements());

        System.out.println("Desenfileirando todos os elementos restantes");
        while (!queue.isEmpty()) {
            System.out.println("Desenfileirando: " + queue.dequeue());
        }
        System.out.println("Fila está vazia? " + queue.isEmpty());
    }
}
