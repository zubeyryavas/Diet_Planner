import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your age.");
        int age = scanner.nextInt();

        System.out.println("Type your sex(as 'man' or 'woman').");
        String sex = scanner.next();

        System.out.println("Enter your height(cm).");
        int height= scanner.nextInt();

        System.out.println("Enter your body weight(kg).");
        double body_weight = scanner.nextDouble();

        System.out.println("Enter your estimated body fat (without '%').");
        double body_fat = scanner.nextDouble();

        System.out.println("Enter your desired body fat (without '%').");
        double desired_body_fat = scanner.nextDouble();

        System.out.println("Type '1' if you are sedentary.");
        System.out.println("Type '2' if you are lightly active(1-3 days workout).");
        System.out.println("Type '3' if you are moderately active(3-5 days workout).");
        System.out.println("Type '4' if you are very active(6-7 days workout).");
        System.out.println("Type '5' if you are extra active(physical job and 6-7 days workout).");
        int _case= scanner.nextInt();

        Maintenance_Calories maintenance_calories = new Maintenance_Calories(age,height,body_weight,sex,_case);
        System.out.println(maintenance_calories.toString());

        Plan plan = new Plan(body_weight,body_fat,desired_body_fat,maintenance_calories.calculate_maintenance_calories());
        plan.calculate_all();
    }
}
