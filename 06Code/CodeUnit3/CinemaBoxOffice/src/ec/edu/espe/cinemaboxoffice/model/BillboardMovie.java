/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.util.Date;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class BillboardMovie extends Movie {
    private String sinopsis; 
    private Date date;
    private float price;
    private CinemaRoom room;

    public BillboardMovie(String title, String gender, String ageRestriction, 
            int duration, String namePoster, String sinopsis, Date date, float 
                    price, CinemaRoom room) {
        super(title, gender, ageRestriction, duration, namePoster);
        this.date = date;
        this.price = price;
        this.room = room;
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "MovieBillboard{" + super.toString() + "date=" + date + ", "
                + "price=" + price + ", room=" + room + '}';
    }

    @Override
    public String getTitle() {
        return title;
    }    

    @Override
    public String getSinopsis() {
        return sinopsis;
    }

    @Override
    public String getDate() {
        return date.toLocaleString();
    }
    
    @Override
    public Date getDateMovie() {
        return date;
    }

    @Override
    public String getPrice() {
        return price+"";
    }

    @Override
    public CinemaRoom getRoom() {
        return room;
    }
   
    public float getPriceValue() {
        return price;
    }

    @Override
    public Date getDateNextPremier() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
