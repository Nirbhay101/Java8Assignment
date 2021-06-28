package com.java8Exercises.Java8;

public class RunnablePrintThread {
	public static void main(String args[]) {
	      
	      new Thread(() -> { 
	         for(int i=1; i <= 5; i++) {
	            System.out.println("Executing runnable with lambda "+i+" time "+Thread.currentThread().getName());
	            try {
	               Thread.sleep(500);
	            } catch(Exception e) {
	               e.printStackTrace();
	            }
	         }
	      }).start();
	      	
	        Thread t1 = new Thread(new RunnablePrintThread().new RunnableImpl());
	        
	        t1.start();   
	}
    private class RunnableImpl implements Runnable {
  	  
        public void run()
        {
            System.out.println("Executing runnable without lambda "+Thread.currentThread().getName());
        }
    }  
}
