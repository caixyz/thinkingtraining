package org.cai;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 训练内容：模拟现场唤醒，暂停
 *
 * @Author: caisijun
 * @Date: 2020/11/20 0020
 */
public class ThreadSync {
    private static native void registerNatives();
    /*
        训练课题：两个线程 依次打印 A1B2C3D4
     */

    /**
     * 用于互斥
     */
    private static Object sentry = new Object();

    /**
     * fair :true（公平）,false(不公平)
     * 公平：多个线程使用锁时，将依次开锁
     * 不公平：多线程使用锁时，将先到先得，即第一个拿到锁的使用完后，再传递给第二个使用
     */
    private static ReentrantLock lock = new ReentrantLock(true);

    /**
     * 打印 A B C D
     */
    static void thread_synchronized_w() {
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    synchronized (sentry) {
                        sentry.notify();
                        if (i == 0) System.out.print("A");
                        if (i == 1) System.out.print("B");
                        if (i == 2) System.out.print("C");
                        if (i == 3) System.out.print("D");
                        try {
                            sentry.wait();
                        } catch (Exception ex) {
                        }
                        sentry.notify();
                    }
                }
            }
        }).start();
    }

    /**
     * 打印 1 2 3 4
     */
    static synchronized void thead_synchronized_n() {
        new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i < 5; i++) {
                    try {
                        synchronized (sentry) {
                            sentry.notify();
                            System.out.print(i);
                            sentry.wait();
                            sentry.notify();
                        }
                    } catch (Exception ex) {
                    }
                }
            }
        }).start();
    }

    static void thead_lock_w() {
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    lock.lock();
                    try {
                        //假设不加 线程休眠，其他的线程无法加入到锁队列，导致无法公平分配锁
                        Thread.sleep(1000);
                        if (i == 0) System.out.print("A");
                        if (i == 1) System.out.print("B");
                        if (i == 2) System.out.print("C");
                        if (i == 3) System.out.print("D");
                    }catch (Exception ex){}finally {
                        lock.unlock();
                        //System.out.println("排队取锁长度："+lock.getQueueLength());
                    }

                }
            }
        }).start();
    }

    static void thead_lock_n() {
        new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i < 5; i++) {
                    try {
                        lock.lock();
                        System.out.println(i);

                    } finally {
                        lock.unlock();
                        //System.out.println("排队取锁长度："+lock.getQueueLength());
                    }
                }
            }
        }).start();
    }

    /**
     * 运行结果：A1B2C3D4
     *
     * @param args
     */
    public static void main(String[] args) {
        //1.synchronized 运行结果：A1B2C3D4
        /*thread_synchronized_w();
        thead_synchronized_n();*/

        //2.lock
        // 运行结果：
        // A1
        //B2
        //C3
        //D4
        thead_lock_w();
        thead_lock_n();
    }
}
