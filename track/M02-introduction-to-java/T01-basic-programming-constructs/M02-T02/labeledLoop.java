public class labeledLoop {
    public static void main(String[] args) {
        outer: for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 3) {
                    break outer;
                }
                System.out.println("i: " + i + "j: " + j);
            }
        }
    }
}
