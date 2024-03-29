package com.supcon.photopickerlib.photopicker.adapters;



import com.supcon.photopickerlib.photopicker.widget.BGASortableNinePhotoLayout;

import java.util.ArrayList;

import androidx.databinding.BindingAdapter;


/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:16/12/5 上午12:44
 * 描述:
 */
public class BGASortableNinePhotoLayoutAdapter {

    @BindingAdapter({"bga_snpl_delegate"})
    public static void setDelegate(BGASortableNinePhotoLayout sortableNinePhotoLayout, BGASortableNinePhotoLayout.Delegate delegate) {
        sortableNinePhotoLayout.setDelegate(delegate);
    }

    @BindingAdapter({"bga_snpl_data"})
    public static void setData(BGASortableNinePhotoLayout sortableNinePhotoLayout, ArrayList<String> data) {
        sortableNinePhotoLayout.setData(data);
    }

    @BindingAdapter({"bga_snpl_editable"})
    public static void setData(BGASortableNinePhotoLayout sortableNinePhotoLayout, boolean editable) {
        sortableNinePhotoLayout.setEditable(editable);
    }
}
