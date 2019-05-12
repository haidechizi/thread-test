package com.gupaoedu.thread;

public class SyncUserThread implements Runnable {

    private User user;

    public SyncUserThread(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        // 同步用户
    }
}
