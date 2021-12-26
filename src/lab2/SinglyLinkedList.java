/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author saum
 */

//SinglyLinkedList Class
public class SinglyLinkedList<E> {

    //Node Class
    private static class Node<E> {
        
        private E element;
        private Node<E> next;
        
        //constructor
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        //getter for element stored
        public E getElement() {
            return element;
        }
        
        //getter for next node
        public Node<E> getNext() {
            return next;
        }

        //setter for next node
        public void setNext(Node<E> n) {
            next = n;
        }

    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    //constructor
    public SinglyLinkedList() {
    }

    //returns size of list
    public int size() {
        return size;
    }

    //returns true if empty
    public boolean isEmpty() {
        System.out.println(size);
        return size == 0;
    }

    //returns first element
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    //returns last element
    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    //adds a node to the end
    public void addNode(E element) {
        Node n = new Node(element, null);
        if (isEmpty()) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    //converts to string
    @Override
    public String toString() {
        Node temp = head;
        String ans = "";

        if (isEmpty()) {
            ans = "List is Empty";
        } else {
            while (temp != null) {
                ans += temp.element;
                temp = temp.next;
            }
        }
        return ans;
    }

}
