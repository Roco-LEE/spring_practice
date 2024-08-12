package thread.control;

import util.ThreadUtils;

import static util.ThreadUtils.sleep;

public class CheckedExceptionMain {
    public static void main(String[] args){
        
    }

    static class CheckedRunnable implements Runnable {
        @Override
        public void run(){
            sleep(1000);
        }
    }
}
