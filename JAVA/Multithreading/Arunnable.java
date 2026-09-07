package JAVA.Multithreading;

public class Arunnable implements Runnable{

    private final String text;
    Arunnable(String text){
        this.text = text;
    }

    @Override 
    public void run(){
        for(int i = 1; i<=5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(text);
                // System.out.println(Thread.currentThread().getName()+ " running..." + i);
            }
            catch(InterruptedException e){
                System.out.println("thread was interrupted...");
            }
        }
    }

}
