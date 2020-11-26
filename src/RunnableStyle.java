public class RunnableStyle implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
