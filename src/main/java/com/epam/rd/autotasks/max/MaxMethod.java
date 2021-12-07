package com.epam.rd.autotasks.max;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt opInt = OptionalInt.empty();

        if (values == null){
            return opInt;
        }

        IntStream intStream = IntStream.of(values);
        OptionalInt res = intStream.max();

        if (res.isPresent()) {
            return opInt = OptionalInt.of(res.getAsInt());
        } else {
            return opInt;
        }
    }
}
