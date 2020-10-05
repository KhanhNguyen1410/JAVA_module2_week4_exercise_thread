public class Main {
    public static void main(String[] args) {
        ThreadSimple t1 = new ThreadSimple(4,14);
        ThreadSimple t2 = new ThreadSimple(15,25);
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        t4.start();
    }
}
