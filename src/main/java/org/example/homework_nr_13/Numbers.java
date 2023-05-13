package org.example.homework_nr_13;

import org.example.homework_nr_13.exceptions.IllegalArgumentException;
import org.example.homework_nr_13.exceptions.InvalidRangeException;

public class Numbers {

    public int x;
    public int y;

    public Numbers(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int divisionBy () throws IllegalArgumentException {
        if (y== 0)
            throw new IllegalArgumentException("Warning! Division by 0");
        else {
            return x/y;
        }
    }


    }

