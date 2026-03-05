/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas_pilas;
/**
 * @param <T> 
 */
public class DobleLista<T> {

    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;
    private int size;

    public DobleLista() {
        this.cabeza = null;
        this.cola = null;
        this.size = 0;
    }

    public void agregarInicio(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        size++;
    }

    public void agregarFinal(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (cola == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.anterior = cola;
            cola.siguiente = nuevo;
            cola = nuevo;
        }
        size++;
    }

    public T removerFinal() {
        if (cola == null) {
            throw new RuntimeException("ERROR: La lista doblemente enlazada esta vacia.");
        }
        T valor = cola.dato;
        if (cabeza == cola) {
            cabeza = null;
            cola = null;
        } else {
            cola = cola.anterior;
            cola.siguiente = null;
        }
        size--;
        return valor;
    }

    public int size() { return size; }

    public String imprimir() {
        if (cabeza == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        NodoDoble<T> actual = cabeza;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) sb.append(" <-> ");
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}
