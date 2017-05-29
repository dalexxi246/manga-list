package com.wh2soft.mangalist.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.wh2soft.mangalist.model.Manga;

public class MangaItemListViewModel extends BaseObservable {

    private Manga manga;
    private Context context;

    public MangaItemListViewModel(Manga manga, Context context) {
        this.manga = manga;
        this.context = context;
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }

    public void onItemClick(View view) {
        // context.startActivity(MangaDetailActivity.launchDetail(view.getContext(), manga));
    }

    public String getImgCoverPath() {
        return manga.getImgCoverPath();
    }

    public int getHotVisibility() {
        return manga.isHot() ? View.VISIBLE : View.GONE;
    }

    public int getSaveVisibility() {
        return manga.isSaved() ? View.VISIBLE : View.GONE;
    }

    public boolean isMoreThan3Categories() {
        return getCategories().length > 3;
    }

    public String[] getCategories() {
        return manga.getCategories();
    }

    public String getDescription() {
        return manga.getDescription();
    }

    public String getTitle() {
        return manga.getTitle();
    }

    public void setManga(Manga manga) {
        this.manga = manga;
        notifyChange();
    }
}
