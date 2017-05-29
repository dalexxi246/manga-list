package com.wh2soft.mangalist.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by wilmer on 5/28/17.
 */

public class Manga implements Parcelable {

    private String imgCoverPath;
    private boolean isHot;
    private boolean isSaved;
    private String[] categories;
    private String description;
    private String title;

    protected Manga(Parcel in) {
        imgCoverPath = in.readString();
        isHot = in.readByte() != 0;
        isSaved = in.readByte() != 0;
        categories = in.createStringArray();
        description = in.readString();
        title = in.readString();
    }

    public static final Creator<Manga> CREATOR = new Creator<Manga>() {
        @Override
        public Manga createFromParcel(Parcel in) {
            return new Manga(in);
        }

        @Override
        public Manga[] newArray(int size) {
            return new Manga[size];
        }
    };

    public String getImgCoverPath() {
        return imgCoverPath;
    }

    public boolean isHot() {
        return isHot;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public String[] getCategories() {
        return categories;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setImgCoverPath(String imgCoverPath) {
        this.imgCoverPath = imgCoverPath;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public void setSaved(boolean saved) {
        isSaved = saved;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(imgCoverPath);
        parcel.writeByte((byte) (isHot ? 1 : 0));
        parcel.writeByte((byte) (isSaved ? 1 : 0));
        parcel.writeStringArray(categories);
        parcel.writeString(description);
        parcel.writeString(title);
    }
}
