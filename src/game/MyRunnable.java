package game;

import java.util.Date;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"start . time is"+new Date());
        threadSleep();
        System.out.println(Thread.currentThread().getName()+"end . time is"+new Date());
    }
    private void threadSleep(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
