package com.supcon.photopickerlib.photopicker.adapters;


import com.supcon.photopickerlib.photopicker.widget.BGANinePhotoLayout;


import java.util.ArrayList;

import androidx.databinding.BindingAdapter;


/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:16/12/5 上午12:44
 * 描述:
 */
public class BGANinePhotoLayoutAdapter {

    @BindingAdapter({"bga_npl_delegate"})
    public static void setDelegate(BGANinePhotoLayout ninePhotoLayout, BGANinePhotoLayout.Delegate delegate) {
        ninePhotoLayout.setDelegate(delegate);
    }

    @BindingAdapter({"bga_npl_data"})
    public static void setData(BGANinePhotoLayout ninePhotoLayout, ArrayList<String> data) {
        ninePhotoLayout.setData(data);
    }
}
