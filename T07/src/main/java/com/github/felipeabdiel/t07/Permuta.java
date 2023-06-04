package com.github.felipeabdiel.t07;

public class Permuta {
    public static void Permutacao(String p, String S) {
        if (S.lenght() == 1){
            System.out.println(p+S);
        }
        else{
            String Slinha;
            String pLinha;

            for(int i=0; i<S.lenght(); i++){
                Slinha = S.substring(0,i) + S.substring(i+1);
                pLinha = p + S.charAt(i)
            }
        }
    }

    public static void main(String[] args) {
        Permutacao(new String(), args[0]);
    }
}
