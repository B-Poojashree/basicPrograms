public class PingPong {
    static boolean isPingTurn = true;

    public static void main(String[] args) {
        PingPong p = new PingPong();

        Thread printPing = new Thread(() -> {
            while (true) {
                p.printPing();
            }
        });

        Thread printPong = new Thread(() -> {
            while (true) {
                p.printPong();
            }
        });

        printPing.start();
        printPong.start();
    }

       synchronized void printPing() {
        if (isPingTurn) {
            System.out.println("Ping");
            isPingTurn = false;
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }

        synchronized void printPong() {
        if (!isPingTurn) {
            System.out.println("Pong");
            isPingTurn = true;
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
