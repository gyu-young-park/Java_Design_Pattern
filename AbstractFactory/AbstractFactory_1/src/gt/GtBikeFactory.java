package gt;

import com.company.BikeFactory;
import com.company.Body;
import com.company.Wheel;

public class GtBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBikeBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtBikeWheel();
    }
}
