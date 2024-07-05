public class Hello {
    public static void main(String[] args) {
        System.out.println("******** Hello from Java *********");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello: " + i);
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("***** Trigger based *****");
        }

        System.out.println("Jenkins auto trigger");
    }
}