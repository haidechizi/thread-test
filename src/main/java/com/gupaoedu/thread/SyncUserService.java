package com.gupaoedu.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SyncUserService {

    private UserDao userDao;

   private  ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), new ThreadPoolExecutor.CallerRunsPolicy());

    // 使用线程
    public void syncUser() {
        // 从接口中获取用户列表信息
        List<User> users = new ArrayList<>();
        for (User user : users) {
            executor.execute(new SyncUserThread(user));
        }
    }


    // 使用线程
    public void syncUser1() {
        // 从接口中获取用户列表信息
        List<User> users = new ArrayList<>();
        for (User user : users) {
            // 串行操作
            userDao.insert(user);
        }
    }
}
