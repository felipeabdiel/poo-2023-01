package main.java.com.github.felipeabdiel.t13.oddOrEven;

public class ParOuImpar {
    static int x = 0; // O valor de x pode ser alterado livremente.

    public static void main(String[] args) {
        if ((x % 2) == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }
    }
}
