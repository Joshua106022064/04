import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        int n=in.nextInt();
        for (int i=0;i<a.length();i++)
            System.out.print((char)((int)a.charAt(i)+n));
        System.out.println();
    }
}