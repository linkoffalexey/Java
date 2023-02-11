package ru.example.lesson03.HomeWork;

public class HomeTask2 {
    public static void main(String[] args) {
        int[][][] arr = new int[][][]{{{1, 2}, {5, 10}}, {{-1, 80}, {3, 4}, {7, -5}}};
        System.out.println(getMaxMassive(arr));
    }

    public static int getMaxMassive(int[][][] mass) {
        int i=0;
        int j=0;
        int k = 0;
        int max = mass[i][j][k];
        for (i = 0; i < mass.length; i++) {
            for (j = 0; j < mass[i].length; j++){
                for (k = 0; k < mass[i][j].length; k++){
                    if (mass[i][j][k]>max){
                        max = mass[i][j][k];
                }
            }
            }
        }
        return max;
    }
}
