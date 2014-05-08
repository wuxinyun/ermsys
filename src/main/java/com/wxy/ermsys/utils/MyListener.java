package com.wxy.ermsys.utils;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
        private int count;

        @Override
        public void contextInitialized(ServletContextEvent sce) {
                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {                 
                        @Override
                        public void run() { 
                                count++;
                                System.err.println(DateUtil.getCurrentDate()+" 第 "+count+" 次执行！！");
                        }
                };
                timer.schedule(timerTask, 10*1000, 10*1000);
        }

        @Override
        public void contextDestroyed(ServletContextEvent sce) {
                
        }
      

}
