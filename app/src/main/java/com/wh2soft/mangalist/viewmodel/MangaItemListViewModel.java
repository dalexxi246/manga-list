package com.wh2soft.mangalist.viewmodel;

import com.wh2soft.mangalist.databinding.ItemMangaListBinding;

import java.util.Observable;

public class MangaItemListViewModel extends Observable {

    ItemMangaListBinding i;

    public MangaItemListViewModel(){
        i.imgCover.getBaseline();
        i.symHot.endBatchEdit();
        i.symSaved.endBatchEdit();
        i.textCat1.endBatchEdit();
        i.textCat2.endBatchEdit();
        i.textCat3.endBatchEdit();
        i.textCatMore.endBatchEdit();
        i.textDescription.endBatchEdit();
        i.textTitle.endBatchEdit();
    }
}
