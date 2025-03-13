package view;

public class Thread_ID {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                // Obter o ID da thread (compatível com JDK 18+)
                int id = (int) Thread.currentThread().threadId(); 
                System.out.println("Thread ID: " + id);
            });
            thread.start();
        }
    }
}
