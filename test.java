import java.util.Scanner;
class test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Y=input.nextInt();
        for(int i=1;i<=12;i++){
             int hasil=i*Y;
            System.out.println(i+"x"+Y+"="+hasil);
        }
        input.close();
    }
}