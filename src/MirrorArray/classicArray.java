package MirrorArray;


public class classicArray {

    public int [][] classic () {

        int row = 3;
        int column = 3;
        int iterator = 0;
        int [] tab1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[][] tab = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = tab1[iterator];
                iterator++;
            }

        }
        for (int i = 0; i < row  ; i++) {
            for (int j = 0; j <row  ; j++) {
                System.out.printf("%s ", tab[i][j]);
            }
            System.out.printf("\n");
        }
        return tab;
    }
    public void mirror (int [][] tab){


    }


}
