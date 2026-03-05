/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas_pilas;
/**
 * @param <T> 
 */
public class Pila<T> {

    private Nodo<T> tope;
    private int size;

    public Pila() {
        this.tope = null;
        this.size = 0;
    }

    public void push(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
        size++;
    }

    public T pop() {
        if (tope == null) throw new RuntimeException("ERROR: Pila vacia. No se puede hacer pop().");
        T valor = tope.dato;
        tope = tope.siguiente;
        size--;
        return valor;
    }

    public T peek() {
        if (tope == null) throw new RuntimeException("ERROR: Pila vacia. No se puede hacer peek().");
        return tope.dato;
    }

    public boolean isEmpty() { return tope == null; }

    public int size() { return size; }

    public String imprimir() {
        if (tope == null) return "[]";
        StringBuilder sb = new StringBuilder("[tope -> ");
        Nodo<T> actual = tope;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) sb.append(" -> ");
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}
