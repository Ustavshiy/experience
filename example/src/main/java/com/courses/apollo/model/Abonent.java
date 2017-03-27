package com.courses.apollo.model;

/**
 * Created by User on 27.03.2017.
 */
public class Abonent {

    private long id;
    private String name;
    private String tariffPlan;
    private PhoneNumber phoneNumber; // ссылка на внутренний класс

    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // объявление внутреннего класса
    private class PhoneNumber {
        private int countryCode;
        private int netCode;
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
            int temp = new java.util.Random().nextInt(10_000_000);
// проверка значения temp на совпадение в БД
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

    public String getPhoneNumber() {
        if (phoneNumber != null) {
            return ("+" + phoneNumber.countryCode + "-"
                    + phoneNumber.netCode + "-" + phoneNumber.number);
        } else {
            return ("phone number is empty!");
        }
    }

    // соответствует шаблону Façade
    public void obtainPhoneNumber(int countryCode, int netCode) {
        phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(100);
        s.append("Abonent '" + name + "':\n");
        s.append(" ID - " + id + "\n");
        s.append(" Tariff Plan - " + tariffPlan + "\n");
        s.append(" Phone Number - " + getPhoneNumber() + "\n");
        return s.toString();
    }
}
