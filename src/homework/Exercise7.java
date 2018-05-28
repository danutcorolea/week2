package homework;

public class Exercise7 {
    public static void main(String[] args) {
        int[] sir={1,2,3,4,7,6};
        int start=0;
        boolean result=isSorted(sir,start);
        System.out.println("the array is " +result);

        }

    private static boolean isSorted(int[]sir, int start){

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
    }

