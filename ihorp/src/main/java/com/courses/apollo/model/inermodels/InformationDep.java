package com.courses.apollo.model.inermodels;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to test inner classes.
 */
public class InformationDep {

    public InformationDep() {
        trainRoutes = new ArrayList<>();
    }

    /**
     * Name of Information Department.
     */
    private String name;

    /**
     * List of train routes.
     */
    private List<TrainRoute> trainRoutes;

    /**
     * Inner class of train routes.
     */
    private class TrainRoute {

        /**
         * Index id of route.
         */
        private Integer id;

        /**
         * Name of Route.
         */
        private String nameRoute;

        /**
         * The time taken to drive the route. Measured in seconds.
         */
        private Integer travelTime;

        /**
         * Cost of the route.
         */
        private Double travelCost;

        public String getNameRoute() {
            return nameRoute;
        }

        public void setNameRoute(String nameRoute) {
            this.nameRoute = nameRoute;
        }

        public int getTravelTime() {
            return travelTime;
        }

        public void setTravelTime(int travelTime) {
            this.travelTime = travelTime;
        }

        public double getTravelCost() {
            return travelCost;
        }

        public void setTravelCost(double travelCost) {
            this.travelCost = travelCost;
        }

        @Override
        public String toString() {
            String string = "ID of Route: " + id.toString() + "; Name of Route: " + nameRoute + "; Time to travel: "
                    + travelTime.toString() + "min; Travel cost: " + travelCost.toString();
            return string;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the string with routes.
     * @return string with all train routes.
     */
    public String getTrainRoutes() {
        String trainRoutesString = new String();
        for (TrainRoute i: trainRoutes) {
            trainRoutesString += i.toString() + "\n";
        }
        return trainRoutesString;
    }

    /**
     * Add the route to route list.
     * @param name name of route.
     * @param time route travel time.
     * @param cost cous of route.
     */
    public void addTrainRoute(String name, int time, double cost) {
        TrainRoute trainRouteTmp = new TrainRoute();
        trainRouteTmp.id = trainRoutes.size();
        trainRouteTmp.setNameRoute(name);
        trainRouteTmp.setTravelTime(time);
        trainRouteTmp.setTravelCost(cost);
        trainRoutes.add(trainRouteTmp);
    }

    /**
     * Get the route name.
     * @param idRoute id of route.
     * @return name of route.
     */
    public String getNameRoute(int idRoute) {
        return trainRoutes.get(idRoute).getNameRoute();
    }

    /**
     * Set the route name.
     * @param idRoute id of route.
     * @param name of route.
     */
    public void setNameRoute(int idRoute, String name) {
        trainRoutes.get(idRoute).setNameRoute(name);
    }

    /**
     *
     * @param idRoute id of route.
     * @return travel time.
     */
    public int getTravelTime(int idRoute) {
        return trainRoutes.get(idRoute).getTravelTime();
    }

    /**
     *
     * @param idRoute id of route.
     * @param time route time travel.
     */
    public void setTravelTime(int idRoute, int time) {
        trainRoutes.get(idRoute).setTravelTime(time);
    }

    /**
     *
     * @param idRoute id of route.
     * @return travel cost.
     */
    public Double getTravelCost(int idRoute) {
        return trainRoutes.get(idRoute).getTravelCost();
    }

    /**
     *
     * @param idRoute id of route.
     * @param cost of route.
     */
    public void setTravelCost(int idRoute, Double cost) {
        trainRoutes.get(idRoute).setTravelCost(cost);
    }
}
