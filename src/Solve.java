import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        String myStr ="I TRY HARD";
       char c ='H';
        System.out.printf("So lan xuat hien cua %c la %d",c,checkXuatHien(c,myStr));
    }

    public static int checkXuatHien(char x,String str){
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)== x){
                count++;
            }
        }
        return count;
    }
}
