import java.util.*;;

public class Q04_CompareStringBufferWithStrinBuilder {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            buffer.append("hello");
        }
        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            builder.append("hello");
        }
        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time take by StringBuilder is: " + timeBuilder + "\nTime taken by StringBuffer is: "+ timeBuffer);
    }

}
