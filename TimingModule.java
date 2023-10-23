import java.util.ArrayList;
import java.util.List;



public  class TimingModule {
    private long startTime;
    private List<double[]> timingValues = new ArrayList<>();


    public void reset() {
        startTime = System.nanoTime();
    }

    public void capture() {
        long endTime = System.nanoTime();
        long f1Time = endTime - startTime;

        // Convert nanoseconds to milliseconds
        double f2Time = (double) f1Time / 1_000_000.0;
        double[] timingEntry = {f2Time};
        timingValues.add(timingEntry);


    }
    public double[][] getTimingValues() {
        return timingValues.toArray(new double[0][]);
    }

    public static void main(String[] args) {
        Main yourObject = new Main();
        yourObject.SPS();
    }
}
