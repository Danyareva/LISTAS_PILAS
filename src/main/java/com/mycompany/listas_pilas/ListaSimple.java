/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas_pilas;
/**
 * @param <T> 
 */
public class ListaSimple<T> {

    private Nodo<T> cabeza;
    private int size;

    public ListaSimple() {
        this.cabeza = null;
        this.size = 0;
    }

    public void agregarInicio(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        size++;
    }

    public void agregarFinal(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        size++;
    }

    public T removerInicio() {
        if (cabeza == null) {
            throw new RuntimeException("ERROR: La lista esta vacia. No se puede remover.");
        }
        T valor = cabeza.dato;
        cabeza = cabeza.siguiente;
        size--;
        return valor;
    }

    public boolean buscarValor(T valor) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(valor)) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    public int size() { return size; }

    public String imprimir() {
        if (cabeza == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = cabeza;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) sb.append(" -> ");
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}
