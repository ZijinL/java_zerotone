public class ThreadStyle extends Thread {
    @Override
    public void run() {
        System.out.println("Hello THre35324325435243adStyle");
    }

    public static void main(String[] args) {
        new ThreadStyle().start();
    }
}
