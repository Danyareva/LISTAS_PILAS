/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listas_pilas;

/**
 *
 * @author greyt
 */
public class LISTAS_PILAS {
    public static void main(String[] args) {

        System.out.println("LISTA SIMPLE");

        ListaSimple<Integer> ls = new ListaSimple<>();
        ls.agregarInicio(10);
        ls.agregarInicio(5);
        System.out.println("agregarInicio(10), agregarInicio(5):");
        System.out.println("  Lista: " + ls.imprimir() + "  size=" + ls.size());

        ls.agregarFinal(20);
        System.out.println("\nagregarFinal(20):");
        System.out.println("  Lista: " + ls.imprimir());

        System.out.println("\nbuscarValor(10): " + ls.buscarValor(10));
        System.out.println("buscarValor(99): " + ls.buscarValor(99));

        System.out.println("\nremoverInicio(): " + ls.removerInicio());
        System.out.println("  Lista: " + ls.imprimir());

        System.out.println("\nremoverInicio(): " + ls.removerInicio());
        System.out.println("removerInicio(): " + ls.removerInicio());
        System.out.println("  Lista: " + ls.imprimir() + " <- vacia");

        System.out.println("\nremoverInicio() en lista vacia:");
        try {
            ls.removerInicio();
        } catch (RuntimeException e) {
            System.out.println("  Excepcion -> " + e.getMessage());
        }
        System.out.println("     PRUEBAS - LISTA DOBLEMENTE ENLAZADA");

        DobleLista<String> dl = new DobleLista<>();
        dl.agregarFinal("A");
        dl.agregarFinal("B");
        dl.agregarInicio("Z");
        System.out.println("agregarFinal(A), agregarFinal(B), agregarInicio(Z):");
        System.out.println("  Lista: " + dl.imprimir());

        System.out.println("\nremoverFinal(): " + dl.removerFinal());
        System.out.println("  Lista: " + dl.imprimir());

        System.out.println("\nremoverFinal(): " + dl.removerFinal());
        System.out.println("removerFinal(): " + dl.removerFinal());
        System.out.println("  Lista: " + dl.imprimir() + " <- vacia");

        System.out.println("\nremoverFinal() en lista vacia:");
        try {
            dl.removerFinal();
        } catch (RuntimeException e) {
            System.out.println("  Excepcion -> " + e.getMessage());
        }
        System.out.println("           PRUEBAS - PILA (STACK)");

        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println("push(1), push(2), push(3):");
        System.out.println("  Pila:  " + pila.imprimir());
        System.out.println("  peek() -> " + pila.peek());

        System.out.println("\npop(): " + pila.pop());
        System.out.println("pop(): " + pila.pop());
        System.out.println("  isEmpty(): " + pila.isEmpty());

        System.out.println("\npop() ultimo: " + pila.pop());
        System.out.println("  isEmpty() ahora: " + pila.isEmpty());

        System.out.println("\npop() en pila vacia:");
        try {
            pila.pop();
        } catch (RuntimeException e) {
            System.out.println("  Excepcion -> " + e.getMessage());
        }
    }
}
