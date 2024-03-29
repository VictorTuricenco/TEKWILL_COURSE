package org.example.homework_nr_14;

import java.io.Serializable;

public class Variables <T extends Comparable, V extends Animal & Serializable, K extends Number>{

    private T var1;
    private V var2;
    private K var3;

    public Variables(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T getVar1() {
        return var1;
    }

    public V getVar2() {
        return var2;
    }

    public K getVar3() {
        return var3;
    }

    public void printClassName() {
        System.out.println(var1.getClass().getSimpleName());
        System.out.println(var2.getClass().getSimpleName());
        System.out.println(var3.getClass().getSimpleName());
    }
}
