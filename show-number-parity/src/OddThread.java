public class OddThread extends Thread {
    public  void  run(){
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
