import java.util.Random;
import java.util.SplittableRandom;

/**
 * Created by chamod on 9/18/17.
 */
public class ReservoirSampler<T> {
    private SplittableRandom splittableRandom;

    public ReservoirSampler() {
        splittableRandom = new SplittableRandom();
    }

    public boolean isAddable(double percentageOfQueueFilled) {
        double addableProbability = 1 - percentageOfQueueFilled;
        if (splittableRandom.nextDouble() <= addableProbability) {
            return true;
        }
        return false;
    }


}
