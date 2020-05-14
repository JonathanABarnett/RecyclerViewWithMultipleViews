package com.alaythiaproductions.recyclerviewwithmultipleviews.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alaythiaproductions.recyclerviewwithmultipleviews.Item;
import com.alaythiaproductions.recyclerviewwithmultipleviews.R;
import com.alaythiaproductions.recyclerviewwithmultipleviews.models.Ad;
import com.alaythiaproductions.recyclerviewwithmultipleviews.models.News;
import com.alaythiaproductions.recyclerviewwithmultipleviews.models.Trip;

import java.util.List;

public class TripsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Item> items;

    public TripsAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 0 = Trip, 1 = Ad, 2 = News
        if (viewType == 0) {
            return new TripViewHolder(
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_trip, parent, false)
            );
        } else if (viewType == 1) {
            return new AdViewHolder(
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_ads, parent, false)
            );
        } else {
            return new NewsViewHolder(
                    LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_news, parent, false)
            );
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 0) {
            Trip trip = (Trip) items.get(position).getObject();
            ((TripViewHolder) holder).setTripData(trip);
        } else if (getItemViewType(position) == 1) {
            Ad ad = (Ad) items.get(position).getObject();
            ((AdViewHolder) holder).setAdData(ad);
        } else {
            News news = (News) items.get(position).getObject();
            ((NewsViewHolder) holder).setNewsData(news);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    static class TripViewHolder extends RecyclerView.ViewHolder {

        private ImageView tripImageView;
        private TextView tripTitleTextView, tripLengthTextView;

        public TripViewHolder(@NonNull View itemView) {
            super(itemView);

            tripImageView = itemView.findViewById(R.id.trip_imageview);
            tripTitleTextView = itemView.findViewById(R.id.trip_title_textview);
            tripLengthTextView = itemView.findViewById(R.id.trip_length_textview);
        }

        void setTripData(Trip trip) {
            tripImageView.setImageResource(trip.getTripImage());
            tripTitleTextView.setText(trip.getTripTitle());
            tripLengthTextView.setText(trip.getTripLength());
        }
    }

    static class AdViewHolder extends RecyclerView.ViewHolder {

        private TextView adTitleTextView, adDescriptionTextView;

        public AdViewHolder(@NonNull View itemView) {
            super(itemView);
            adTitleTextView = itemView.findViewById(R.id.ads_title_textview);
            adDescriptionTextView = itemView.findViewById(R.id.ads_description_textview);
        }

        void setAdData (Ad ad) {
            adTitleTextView.setText(ad.getAdTitle());
            adDescriptionTextView.setText(ad.getAdDescription());
        }
    }

    static class NewsViewHolder extends  RecyclerView.ViewHolder {

        private TextView newsTitleTextView, newsArticleTextView;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            newsTitleTextView = itemView.findViewById(R.id.news_title_textview);
            newsArticleTextView = itemView.findViewById(R.id.news_article_textview);
        }

        void setNewsData(News news) {
            newsTitleTextView.setText(news.getNewsTitle());
            newsArticleTextView.setText(news.getNewsArticle());
        }
    }
}
