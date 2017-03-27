package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public class Abonent {
    /**
     * String capacity.
     */
    private final int stringCapacity = 100;
    /**
     * int bound.
     */
    private final int bound = 10_000_000;
    /**
     * ID.
     */
    private long id;
    /**
     * Abonent name.
     */
    private String name;
    /**
     * Tariff plan.
     */
    private String tariffPlan;
    /**
     * Phone number.
     */
    private PhoneNumber phoneNumber; // ссылка на внутренний класс

    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Inner class declaration.
     */
    private class PhoneNumber {
        /**
         * Country code.
         */
        private int countryCode;
        /**
         * net code.
         */
        private int netCode;
        /**
         * number.
         */
        private int number;

        public void setCountryCode(int countryCode) {
            // проверка на допустимые значения кода страны
            this.countryCode = countryCode;
        }

        public void setNetCode(int netCode) {
            // проверка на допустимые значения кода сети
            this.netCode = netCode;
        }

        public int generateNumber() {
            int temp = new java.util.Random().nextInt(bound);
            number = temp;
            return number;
        }
    } // окончание внутреннего класса

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTariffPlan() {
        return tariffPlan;
    }

    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    /**
     * Get phone number.
     *
     * @return String.
     */
    public String getPhoneNumber() {
        if (phoneNumber != null) {
            return ("+" + phoneNumber.countryCode + "-"
                    + phoneNumber.netCode + "-" + phoneNumber.number);
        } else {
            return "phone number is empty!";
        }
    }

    /**
     * Method set number.
     *
     * @param countryCode int.
     * @param netCode     int.
     */
    public void obtainPhoneNumber(int countryCode, int netCode) {
        phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(stringCapacity);
        str.append("Abonent '" + name + "':\n");
        str.append(" ID - " + id + "\n");
        str.append(" Tariff Plan - " + tariffPlan + "\n");
        str.append(" Phone Number - " + getPhoneNumber() + "\n");
        return str.toString();
    }
}