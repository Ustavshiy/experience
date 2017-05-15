package com.courses.apollo.util.figures;

import com.courses.apollo.model.figure.Figure;
import com.courses.apollo.model.figure.Pixel;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dell on 13.05.2017.
 */
public class FigureUtil {
    Integer[][] sheet;
    Set<Figure> figures = new HashSet<>();

    public void figureSaver() {

    }

    public void getUniqueFigures(File file) {

        IOFigures ioFigures = new IOFigures();
        sheet = ioFigures.sheetReader(file);
        for (int i = 0; i < sheet.length; i++) {
            for (int j = 0; j < sheet[i].length; j++) {
                if (sheet[i][j] == 1) {
                    Figure figure = new Figure();
                    getNeighbors(figure, j, i);
                    simplifyFigure(figure);
                    figureAdder(figure);
                }
            }
        }
    }

    public void getNeighbors(Figure figure, int x, int y) {
        sheet[x][y] = 0;
        figure.addPixel(new Pixel(x, y));
        if (x < sheet.length && sheet[x + 1][y] == 1) {
            getNeighbors(figure, x + 1, y);
        }
        if (y < sheet[x].length && sheet[x][y + 1] == 1) {
            getNeighbors(figure, x, y + 1);
        }
        if (x != 0 && sheet[x - 1][y] == 1) {
            getNeighbors(figure, x - 1, y);
        }
        if (y != 0 && sheet[x][y - 1] == 1) {
            getNeighbors(figure, x, y - 1);
        }
    }

    public void simplifyFigure(Figure figure) {
        int minX = sheet[0].length;
        int minY = sheet.length;
        for (Pixel pixel : figure.getFigureSet()) {
            if (pixel.getxValue() < minX){
                minX = pixel.getxValue();
            }
            if (pixel.getyValue() < minY){
                minY = pixel.getyValue();
            }
        }
        for (Pixel pixel: figure.getFigureSet()) {
            pixel.setxValue(pixel.getxValue()-minX);
            pixel.setyValue(pixel.getyValue()-minY);
        }
    }

    public void figureAdder(Figure newFigure) {
        for (Figure figure : figures) {
            if (!figureMatcher(figureToMatrix(figure),figureToMatrix(newFigure))){
                figures.add(newFigure);
            }
        }
    }
    public boolean figureMatcher(Integer[][] exsistFigure, Integer[][] newFigure) {
        //rotate recursive;
        return false;
    }

    public Integer[][] figureToMatrix (Figure figure){
        int maxX = 0;
        int maxY = 0;
        for (Pixel pixel : figure.getFigureSet()) {
            if (pixel.getxValue() > maxX){
                maxX = pixel.getxValue();
            }
            if (pixel.getyValue() > maxY){
                maxY = pixel.getyValue();
            }
        }
        Integer[][] figureMatrix = new Integer[maxX][maxY];
        for (Pixel pixel : figure.getFigureSet()) {
            figureMatrix[pixel.getxValue()][pixel.getyValue()] = 1;
        }
        return figureMatrix;
    }

    public void drawFigure() {

    }
}