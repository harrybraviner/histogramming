package braviner.histogramming;

public class Sketch {

    private final double alpha;
    private final double gamma;

    public Sketch(double alpha) {
        if (alpha <= 0.0) {
            throw new IllegalArgumentException("Parameter alpha must be positive.");
        }

        this.alpha = alpha;

        gamma = (1.0 + alpha) / (1.0 - alpha);
    }

    public void insert(double value) {
        throw new RuntimeException("Not implemented");
    }

    public double quantile(double q) {
        if (q < 0.0 || q > 1.0) {
            throw new IllegalArgumentException("q must lie in [0, 1]");
        }

        throw new RuntimeException("Not implemented");
    }

}
