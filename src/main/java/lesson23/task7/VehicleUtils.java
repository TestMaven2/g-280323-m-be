package lesson23.task7;

import java.util.List;

public class VehicleUtils {

    // PECS - Producer extends Consumer super
    public static void move(List<? extends Car> from, List<? super Car> to) {
        to.addAll(from);
        from.clear();
    }
}
