package com.alaythiaproductions.recyclerviewwithmultipleviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.alaythiaproductions.recyclerviewwithmultipleviews.adapters.TripsAdapter;
import com.alaythiaproductions.recyclerviewwithmultipleviews.models.Ad;
import com.alaythiaproductions.recyclerviewwithmultipleviews.models.News;
import com.alaythiaproductions.recyclerviewwithmultipleviews.models.Trip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.main_recyclerview);

        List<Item> items = new ArrayList<>();

        Trip trip1 = new Trip(R.drawable.bali, "Bali", "September 10, 2020 - 12 Days");
        Trip trip2 = new Trip(R.drawable.egypt, "Egypt", "December 3, 2020 - 8 Days");
        Trip trip3 = new Trip(R.drawable.scotland, "Scotland", "July 21, 2020 - 9 Days");
        Trip trip4 = new Trip(R.drawable.iceland, "Iceland", "August 31, 2020 - 6 Days");

        Ad ad1 = new Ad("Beaches on Beaches", "The whitest sands around");
        Ad ad2 = new Ad("Pyramids!", "Did Aliens create the pyramids?");
        Ad ad3 = new Ad("Castles, Castles Everywhere", "Yell \"FREEEEEDOM\" as much as you want");
        Ad ad4 = new Ad("Where's the Ice?", "Forests, Mountains, Lakes, Rivers. No ice.");

        News news1 = new News("Bali's Day of Quiet Reflection", "It was early afternoon on 25 March in Bali, and for the first time in a long time I could hear myself think. There were no scooters zooming by, no noodle sellers peddling their wares, not even the occasional sound of a plane flying overhead. " +
                "In their absence, I noticed the buzz of a dragonfly and a frog’s ribbit as I sat quietly on my porch, trying to get into the spirit of Nyepi – the island’s New Year’s Day, or “Silent Day” – when for 24 hours Balinese people stay quietly in their homes and reflect on the year gone by and gear up for the one to come.");
        News news2 = new News("We Are Not Alone", "Reporting on Apr 4, 2020, the prime minister of Archeology has not" +
                " approved the release of information which details explicit conclusion of the existence of" +
                " alien life. The pyramids were not a man-made construction, but rather, a gift to human society" +
                " to help remember the life outside of this world.");
        News news3 = new News("Boring History", "Scotland (Scots: Scotland, Scottish Gaelic: Alba) is a country that is part of the United Kingdom. Covering the northern third of the island of Great Britain,[17][18][19] mainland Scotland has a 96 mile (154 km) border with England to the southeast and is otherwise surrounded by the Atlantic Ocean to the north and west, the North Sea to the northeast and the Irish Sea to the south. In addition, Scotland includes more than 790 islands;[20] principally within the Northern Isles and the Hebrides archipelagos.");
        News news4 = new News("The Big Picture", "Located in the North-Atlantic ocean close by the Arctic Circle, Iceland is very much a bridge between continents. It takes approximately five hours to fly from New York to Reykjavík, and three hours from London. Thanks to the Gulf Stream, Iceland enjoys a cool, temperate maritime climate, with refreshing summers and surprisingly mild temperatures in winter. Icelandic culture has been shaped by isolation and the extreme forces of nature. These conditions have created a resilient people, where family ties are close, the sense of tradition is strong, and the bond with nature is tight. Here you can learn about our unique little island.");


        items.add(new Item( 0, trip1));
        items.add(new Item(1, ad1));
        items.add(new Item(2, news1));

        items.add(new Item( 0, trip2));
        items.add(new Item(1, ad2));
        items.add(new Item(2, news2));

        items.add(new Item( 0, trip3));
        items.add(new Item(1, ad3));
        items.add(new Item(2, news3));

        items.add(new Item( 0, trip4));
        items.add(new Item(1, ad4));
        items.add(new Item(2, news4));

        recyclerView.setAdapter(new TripsAdapter(items));
    }
}
