package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }


    @Override
    public Object getSpecificData() {
        StringBuilder texto = new StringBuilder();
        texto.append("Localización: ");
        texto.append(getLocation());
        texto.append("\n");

        texto.append("Fecha de caducidad: ");
        texto.append(getFormattedDate(getExpirationDate()));
        texto.append("\n");

        return texto.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }


    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }
}