package org.cai;

/**
 * 本次训练内容：模拟现场唤醒，暂停
 *
 * @Author: caisijun
 * @Date: 2020/11/20 0020
 */
public class t1 {

    /*
    训练课题：两个线程 依次打印 A1B2C3D4
     */
    public static Object sentry = new Object();

    /**
     * 打印 A B C D
     */
    static void thread_w() {
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
    static synchronized void thead_n() {
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

    /**
     * 运行结果：A1B2C3D4
     * @param args
     */
    public static void main(String[] args) {
        thread_w();
        thead_n();
    }
}
