package com.kaungkhantthu.joketeller;

/**
 * Created by kaungkhantthu on 6/25/16.
 */
public class Jokes {
    int Image;
    String Title;
    String Content;
    Boolean soFunny=false;

    public Jokes(int image, String title, String content) {
        Image = image;
        Title = title;
        Content = content;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Boolean isSoFunny() {
        return soFunny;
    }

    public void setSoFunny(Boolean soFunny) {
        this.soFunny = soFunny;
    }
}
