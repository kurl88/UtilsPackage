package com.concurrent.util.threadPool;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
public class ThreadPoolExecutorTest {
	
	   public static void main(String[] args) {  
	    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);  //相当于每次执行几个线程
	     for (int i = 0; i < 5; i++) {  
	     final int index = i;  
	    fixedThreadPool.execute(new Runnable() {  
	       public void run() {  
	       try {  
	         System.out.println(index);  
	        Thread.sleep(1000);  
	       } catch (InterruptedException e) {  
	         e.printStackTrace();  
	        }  
	      }  
	      });  
	   }  

	}  
}
