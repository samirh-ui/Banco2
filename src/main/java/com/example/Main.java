package com.example;

public class Main {
    public static void main(String[] args) {
         {

        CuentaAhorro cuenta = new CuentaAhorro(15000, 12);

        cuenta.consignar(5000);
        cuenta.retirar(2000);
        cuenta.retirar(1000);
        cuenta.retirar(1000);
        cuenta.retirar(1000);
        cuenta.retirar(1000);

        cuenta.extractoMensual();

        cuenta.imprimir();

    }
    }
}