/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airshow.util;

/**
 *
 * @author claudio
 */
public class Prova {

    static Prova create(int a, int b) {
        return new Prova(a, b);
    }

    int a;
    int b;

    private Prova(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
