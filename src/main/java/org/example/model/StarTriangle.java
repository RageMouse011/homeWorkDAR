package org.example.model;

public class StarTriangle {
    private int width;
    private String symbol = "[*]";


    public StarTriangle(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        StringBuffer temp = new StringBuffer();

        while (width > 0) {
            temp.append(symbol);
            temp.append("\n");
            width--;
            symbol+="[*]";
        }
        String result = temp.toString();
        return result;
    }
}
