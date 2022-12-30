package org.example.model;

public class Temperature {
    private double temp;
    private char symbol;

    public Temperature() {
        this.temp = 0.0;
        this.symbol = 'C';
    }


    public Temperature(double temp) {
        this.temp = temp;
    }

    public Temperature(char symbol) {
        this.symbol = symbol;
    }

    public Temperature(double temp, char symbol) {
        this.temp = temp;
        this.symbol = symbol;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "temp=" + temp +
                ", symbol=" + symbol +
                '}';
    }

    public Temperature toCelsius(Temperature temperature) throws Exception {
        if (temperature.getSymbol() != 'C') {
            temperature.setSymbol('C');
            temperature.setTemp(5 *(temperature.getTemp() - 32) / 9);
        } else {
            throw new Exception();
        }
        return temperature;
    }

    public Temperature toFahrenheit(Temperature temperature) throws Exception {
        if (temperature.getSymbol() != 'F') {
            temperature.setSymbol('F');
            temperature.setTemp(9 *(temperature.getTemp() / 5) + 32);
        } else {
            throw new Exception();
        }
        return temperature;
    }
}
