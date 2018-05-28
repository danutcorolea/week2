package homework;

public class Exercise8 {
    public static void main(String[] args){
        int[]temp=new int[100];
        int i=0;
        int numar=10;

        while (numar>0){
            temp[i]=numar%2;
            i++;
            numar=numar/2;
        }

        for(int j=i-1   ;j>=0;j--){
            System.out.println("Numarul in baza 2 este" +temp[j]);
        }
        }
}
