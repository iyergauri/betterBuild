package com.android.betterbuild;

import java.util.List;

/**
 * Created by Gauri on 9/10/2017.
 */

public interface IExercise {
    String getName();
    void addToLog(int reps, int sets, int weight, int time);
    List<IPoint> getLog();
}
