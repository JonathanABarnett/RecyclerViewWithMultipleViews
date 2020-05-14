package com.alaythiaproductions.recyclerviewwithmultipleviews.models;

public class News {

    private String newsTitle, newsArticle;

    public News(String newsTitle, String newsArticle) {
        this.newsTitle = newsTitle;
        this.newsArticle = newsArticle;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsArticle() {
        return newsArticle;
    }

    public void setNewsArticle(String newsArticle) {
        this.newsArticle = newsArticle;
    }
}
