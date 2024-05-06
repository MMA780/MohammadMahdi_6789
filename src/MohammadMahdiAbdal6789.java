import java.util.Scanner;

public class MohammadMahdiAbdal6789 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Tamrin_Abdal_6();
        Tamrin_Abdal_7();
        Tamrin_Abdal_8();
        Tamrin_Abdal_9();
    }

    private static void Tamrin_Abdal_6() {
        System.out.println("لطفا عدد 1 تا 3 را وارد کنید (1 برای دایره، 2 برای مستطیل و 3 برای مثلث):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("لطفا شعاع دایره را وارد کنید:");
                double radius = scanner.nextDouble();
                System.out.println("محیط دایره: " + (Math.PI * radius * radius));
                break;
            case 2:
                System.out.println("لطفا طول و عرض مستطیل را وارد کنید:");
                double length = scanner.nextDouble(), width = scanner.nextDouble();
                System.out.println("محیط مستطیل: " + (length * width));
                break;
            case 3:
                System.out.println("لطفا ارتفاع و پایه مثلث را وارد کنید:");
                double height = scanner.nextDouble(), base = scanner.nextDouble();
                System.out.println("محیط مثلث: " + (0.5 * height * base));
                break;
            default:
                System.out.println("انتخاب نامعتبر.");
        }
    }

    private static void Tamrin_Abdal_7() {
        System.out.println("لطفا عدد معادل یک ماه از 1 تا 12 را وارد کنید:");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("فروردین");
                break;
            case 2:
                System.out.println("اردیبهشت");
                break;
            case 3:
                System.out.println("خرداد");
                break;
            case 4:
                System.out.println("تیر");
                break;
            case 5:
                System.out.println("مرداد");
                break;
            case 6:
                System.out.println("شهریور");
                break;
            case 7:
                System.out.println("مهر");
                break;
            case 8:
                System.out.println("آبان");
                break;
            case 9:
                System.out.println("آذر");
                break;
            case 10:
                System.out.println("دی");
                break;
            case 11:
                System.out.println("بهمن");
                break;
            case 12:
                System.out.println("اسفند");
                break;
            default:
                System.out.println("عدد نامعتبر.");

        }
    }

    private static void Tamrin_Abdal_8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("لطفا عدد صحیح مثبت n را وارد کنید:");
        int n = scanner.nextInt();
        System.out.println("مکعب توان 3 اعداد 1 تا " + n + " عبارتند از:");

        for (int i = 1; i <= n; i++) {
            System.out.println("عدد " + i + " به توان 3: " + (i * i * i));
        }
    }

    private static void Tamrin_Abdal_9() {
        System.out.println("لطفا عدد صحیح مثبت n را وارد کنید:");
        int n = scanner.nextInt();

        int jam = 0;
        System.out.print("اعداد فرد از 1 تا " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                jam += i;
            }
        }
        System.out.println("\nجمع اعداد فرد: " + jam);

    }
}
