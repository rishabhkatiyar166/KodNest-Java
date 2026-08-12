public class ppVariables {
    public static void main(String[] args) {
        int compTop = 17;
        int totTop = 20;
        int dayLrn = 3;
        int lrnDays = 5;
        int remTop = totTop - compTop;
        int WeakLrn = lrnDays * dayLrn;
        double proper = (double) compTop * 100 / totTop;
        System.out.println("Completed Topics: " + compTop);
        System.out.println("Remaining Topics: " + remTop);
        System.out.println("Weekly Learning Hours: " + WeakLrn);
        System.out.println("Progress Percentage: " + proper);
    }
}