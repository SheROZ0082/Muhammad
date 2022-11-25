package com.example.HW4;

import java.io.Serializable;

public class Text  {


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Text(String text) {
        this.text = text;
    }

    private String text;
    private int ImageView;

    public int getImageView() {
        return ImageView;
    }

    public void setImageView(int imageView) {
        ImageView = imageView;
    }

    public Text(String text, int imageView) {
        this.text = text;
        ImageView = imageView;
    }
}
