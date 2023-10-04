import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        String[] String = new String[max];
        for (int i = 0; i < max; i++){
            String[i] = sc.next();
        }
    }

    public void permutation(String[] String, int start){
        if (start == String.length - 1){
            System.out.println(String[start]);
        }
        else{
            for (int i = 0; i < String.length; i++){
                change(String, start, 1);
            }
        }
    }
    public void change(String[] String, int start, int variable){
        if ()
    }
}