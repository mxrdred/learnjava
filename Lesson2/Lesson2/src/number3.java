public class number3 {

    public static void main(String[] args) throws Exception {

        int n = 10;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    
}