package task7;

public class Solution {
    public void numSeq(int numberN){
        for(int i = 1; i * i < numberN; i++){
            System.out.print(i * i + ", ");
        }
        System.out.println("\b\b");

        for(int j = 1; j * j < numberN; j++) {
            if ((j * j) % 4 == 0 || (j * j) % 8 == 1 || (j * j) % 9 == 3 || (j * j) % 3 == 1)
                System.out.print(j * j + ", ");
        }
        System.out.println("\b\b");
    }

}
