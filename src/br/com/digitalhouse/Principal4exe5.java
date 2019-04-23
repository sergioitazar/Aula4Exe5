package br.com.digitalhouse;

public class Principal4exe5 {
    public static void main(String[] args) {

        int [] numeros = new int[]{1,2,3,4,5,6};

        int soma = 0;
        int par = 0;
        for (int i=0; i < numeros.length; i++) {
            par = (numeros[i] % 2);
            if (par == 0) {
                soma = numeros[i] + soma;
            }
        }
        System.out.println("Total da soma = " + soma);
    }
}
