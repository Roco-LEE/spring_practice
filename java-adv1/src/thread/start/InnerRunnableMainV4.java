package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV4 {
    public static void main(String[] args) {
        log("main() start");

        Thread thread = new Thread(() -> log("run()")); // 람다식
        thread.start();

        log("main() end");
    }


}
