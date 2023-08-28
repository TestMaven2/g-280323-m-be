package lesson17.task1;

import java.util.function.Function;

public class MyFunction implements Function<Double, Long> {

    @Override
    public Long apply(Double valueToRound) {
        System.out.println("Переданное значение - " + valueToRound);
        return Math.round(valueToRound);
    }
}