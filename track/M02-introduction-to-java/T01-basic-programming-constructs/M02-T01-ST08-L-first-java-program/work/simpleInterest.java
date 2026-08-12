public class simpleInterest {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;
        double simInt = principal * rate * time / 100.0;
        double bmi = weight / (height * height);
        double toAm = principal + simInt;
        int marks = 78 + 84 + 69 + 91 + 88;
        double percentage = marks * 100.0 / 500;
        System.out.println("Simple Interest: " + simInt);
        System.out.println("Total Amount: " + toAm);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + marks);
        System.out.println("Percentage: " + percentage);
    }
}