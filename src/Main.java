import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int head;

        Scanner input=new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz : ");
        head=input.nextInt();

        if(head < 5 ){
            System.out.print("Kayak Yapmaya Gidebilirsiniz. ");
        }
        else if((head >=5 ) || (head <= 15)){
            System.out.print("Sinemaya Gidebilirsiniz. ");
        }
        else if((head >= 15) || (head <=25)){
            System.out.println("Pikniğe Gidebilirsiniz");
        }
        else{
            System.out.println("Yüzmeye Gidebilirsiniz");
        }

    }
}