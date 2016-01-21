package enhanceneurofuzzysystem;

//import java.util.function.Function;
//import org.apache.commons.math3.util.FastMath;

public class GaussianMembershipFunction { //implements Function<Double, Double> {

    private final double sigma;
    private final double c;

    public GaussianMembershipFunction(double sigma, double c) {
        this.sigma = sigma;
        this.c = c;
    }

//    @Override
    public Double apply(Double x) {
        return Math.exp(-Math.pow(x - c, 2) / (2 * Math.pow(sigma, 2)));
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (obj == this) {
//            return true;
//        }
//        if (!(obj instanceof GaussianMembershipFunction)) {
//            return false;
//        }
//        final GaussianMembershipFunction that = (GaussianMembershipFunction) obj;
//        return this.sigma == that.sigma && this.c == that.c;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = "GaussianMembershipFunction".hashCode();
//        hash <<= 2;
//        hash ^= (int) this.sigma;
//        hash <<= 2;
//        hash ^= (int) this.c;
//        return hash;
//    }
//
//    @Override
//    public String toString() {
//        return "Gaussian Membership Function [" + sigma + " " + c + "]";
//    }
    
//    public static void main(String[] args) {
//        GaussianMembershipFunction g = new GaussianMembershipFunction(2.5, 0.33);
//        System.out.println(g.apply(2.5));
//    }
}