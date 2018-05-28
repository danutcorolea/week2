package homework;

public class Exercise6 {
    public static void main(String[] args){
        int[] sir = {34,34,1,9,9,39,39,88};

        for (int i = 1; i < sir.length; i++) {
                if (sir[i] == sir[i - 1]) {

                    System.out.println(" numbers that appear on consecutive positions in the array " +sir[i]);

                }

            }

        }

    }

