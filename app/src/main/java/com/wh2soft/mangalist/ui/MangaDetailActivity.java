package com.wh2soft.mangalist.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wh2soft.mangalist.model.Manga;

public class MangaDetailActivity extends AppCompatActivity {

    public static final String EXTRA_MANGA = "extra_manga";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static Intent launchDetail(Context context, Manga manga) {
        Intent intent = new Intent(context, MangaDetailActivity.class);
        intent.putExtra(EXTRA_MANGA, manga);
        return intent;
    }
}
