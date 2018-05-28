package homework;

public class Exercise7 {
    public static void main(String[] args) {
        int[] sir={1,2,3,4,5,6};

        boolean isSorted(int[]sir, int start){
            int start=0;
            if(start==sir.length-1) {
                return true;
            }
            if (sir[start]<=sir[start+1]) {
                return isSorted(sir, start + 1);
            }
            else {
                return false;
            }
            }
            System.out.println("the array is sorted " +isSorted);
        }
    }

