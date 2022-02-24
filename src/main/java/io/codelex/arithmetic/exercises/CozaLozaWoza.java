package io.codelex.arithmetic.exercises;

public class CozaLozaWoza {
    public static void main(String[] args) {
        StringBuilder clw = new StringBuilder();
        for (int i = 1; i <= 110; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 11 == 0) {
                clw.append("CozaLoza ").append("\n");
            } else if (i % 3 == 0 && i % 5 == 0) {
                clw.append("CozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0 && i % 11 == 0) {
                clw.append("CozaWoza ").append("\n");
            } else if (i % 3 == 0 && i % 7 == 0) {
                clw.append("CozaWoza ");
            } else if (i % 3 == 0 && i % 11 == 0) {
                clw.append("Coza ").append("\n");
            } else if (i % 3 == 0) {
                clw.append("Coza ");
            } else if (i % 5 == 0 && i % 11 == 0) {
                clw.append("Loza ").append("\n");
            } else if (i % 5 == 0) {
                clw.append("Loza ");
            } else if (i % 7 == 0) {
                clw.append("Woza ");
            } else if (i % 11 == 0) {
                clw.append(i).append("\n");
            } else clw.append(i).append(" ");
        }
        System.out.println(clw);
    }
}
