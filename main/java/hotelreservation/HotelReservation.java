package main.java.hotelreservation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by bosskai on 2014/11/13.
 */
public class HotelReservation {
    public String bestChoice(List<Hotel> hotelList, String date, final int customerType) throws Exception {
        List<String> listDate = parseDate(date);

        Collections.sort(hotelList,new Comparator(){
//            @Override
            public int compare(Hotel o1, Hotel o2) throws Exception {
                int i = o1.calculatePrice(listDate, customerType).compareTo(o2.calculatePrice(listDate, customerType));
//                arg0.getRating().compareTo(arg0.getRating());
                return 0;
            }
        });

          return "";
    }

    private List<String> parseDate(String date) {
        List<String> listDate = new ArrayList<String>();
        return listDate;
    }

}
