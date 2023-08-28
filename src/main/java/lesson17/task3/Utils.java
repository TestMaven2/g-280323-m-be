package lesson17.task3;

import java.util.List;

@FunctionalInterface
public interface Utils {

    void copy(List<? extends LandAnimal> source, List<? super LandAnimal> destination);
}
