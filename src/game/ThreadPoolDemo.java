package game;

import java.util.concurrent.*;

public class ThreadPoolDemo {
//    核心线程数量,就是当任务数量没有达到阻塞队列最大值时可以开启的线程数量
    private static final int CORE_POOL_SIZE = 5;
//    当任务达到阻塞队列的最大值时开启的最大线程数量
    private static final int MAX_POOL_SIZE = 10;
//    阻塞队列的大小
    private static final int QUEUE_CAPACITY = 10;
//    非核心线程存活的时间
    private static final Long KEEP_ALIVE_TIME = 1L;
    public static void main(String[] args) {
//        利用Executors类创建Java官方帮你定义好的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        executorService.
//        阿里推荐自己定义线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
//                时间单位,分
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        for(int i=0;i<30;i++){
            MyRunnable myRunnable = new MyRunnable();
            threadPoolExecutor.execute(myRunnable);
        }
//        关闭线程池,关闭之后不允许有新的任务加入
        threadPoolExecutor.shutdown();
        while (!threadPoolExecutor.isTerminated()){
        }
        System.out.println("threadpool is shutdown");
    }
}
