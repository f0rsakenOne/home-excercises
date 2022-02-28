package io.codelex.loops.exercises;

public class AsciiFigure {
    public static void main(String[] args) {
        final int size = 7;
        for (int i = 0; i < size ; i++) {
            for (int j = size; j > i; j--) {
                System.out.print("////");
            }
            for (int k =0;k<2*i;k++){
                System.out.print("****");
            }
            for (int j = size; j > i; j--) {
                System.out.print("\\\\\\\\");
            }
            System.out.println();
        }
    }
}
