package Sam;

import com.company.BikeFactory;
import com.company.Body;
import com.company.Wheel;

//factory
public class SamCheonLeeBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamCheonLeeBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamCheonLeeWheel();
    }
}
