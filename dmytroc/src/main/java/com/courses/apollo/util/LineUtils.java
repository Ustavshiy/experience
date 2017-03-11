package com.courses.apollo.util;

import com.courses.apollo.model.Fraction;
import com.courses.apollo.model.LineModel;

import java.util.ArrayList;

/**
 * Created by chopenkod on 10.03.17.
 */
public class LineUtils {

    public LineModel[] parllelFinder(LineModel straight, LineModel[] pretenders) {
        ArrayList<LineModel> resultStraightArray = new ArrayList<>();
        for (LineModel pretender : pretenders) {
            if (straight.getSlope() == pretender.getSlope()) {
                resultStraightArray.add(pretender);
            }
        }
        LineModel[] result = new LineModel[resultStraightArray.size()];
        resultStraightArray.toArray(result);
        return result;
    }

    public Fraction[] coordinatsCrossingFinder(LineModel[] lineModels) {
        Fraction[] coordinatesCrossing = new Fraction[lineModels.length];

        for (int i = 0; i < lineModels.length; i++) {
            double coordXCross;
            double coordYCross;
            if (lineModels[i].getSlope() == Double.POSITIVE_INFINITY
                    || lineModels[i].getSlope() == -1 * Double.POSITIVE_INFINITY) {
                coordinatesCrossing[i] = new Fraction(lineModels[i].getLine().getCoordXA(),
                        Double.POSITIVE_INFINITY, 0.0, Double.POSITIVE_INFINITY);
            } else if (lineModels[i].getSlope() == 0) {
                coordinatesCrossing[i] = new Fraction(Double.POSITIVE_INFINITY, 0.0,
                        Double.POSITIVE_INFINITY, lineModels[i].getLine().getCoordYA());
            } else {
                coordXCross = lineModels[i].getLine().getCoordXA()
                        - (lineModels[i].getLine().getCoordYA() / lineModels[i].getSlope());
                coordYCross = lineModels[i].getLine().getCoordYA()
                        - lineModels[i].getLine().getCoordXA() * lineModels[i].getSlope();
                coordinatesCrossing[i] = new Fraction(coordXCross, 0.0, 0.0, coordYCross);
            }
        }
        return coordinatesCrossing;
    }

    public Fraction linesCrossFinder(LineModel lineOne, LineModel lineTwo){
        Fraction fractionCross = new Fraction();
//        fractionCross.setCoordXA();
        return fractionCross;
    }
}
