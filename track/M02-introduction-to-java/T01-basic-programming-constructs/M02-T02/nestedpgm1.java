public class nestedpgm1 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 2; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("i" + i + "j" + j);
            }
        }
    }
}
