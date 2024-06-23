import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Расскажите о вашем друге");
        System.out.println("Как зовут вашего друга?");
        String name = sc.nextLine();
        System.out.println("Сколько лет вашему другу?");
        int age = sc.nextInt();
        System.out.println("Моему другу " + name + " сейчас " + age + " лет");
    }
}
