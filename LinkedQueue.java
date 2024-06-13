// Implementação da LinkedQueue

import java.util.NoSuchElementException;

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public boolean isFull() {
        return false; // Fila encadeada nunca está cheia
    }

    @Override
    public int numElements() {
        return size;
    }

    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E data = front.getData();
        front = front.getNext();
        size--;
        if (isEmpty()) {
            rear = null; // A fila ficou vazia
        }
        return data;
    }

    @Override
    public E front() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front.getData();
    }

    @Override
    public E back() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return rear.getData();
    }
}
