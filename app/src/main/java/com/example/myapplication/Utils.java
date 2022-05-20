package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

public class Utils {

     ///////////////////////////////////////////////////////////////////////////////////////////

    public static void getFullPic(final Context context, Object imageUrl, final ImageView imgProfile, int defaultImage, String timeStamp, final boolean isCircular) {
        Glide.with(context).asBitmap().load(imageUrl).centerCrop().placeholder(defaultImage).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(new BitmapImageViewTarget(imgProfile) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                circularBitmapDrawable.setCircular(isCircular);
                imgProfile.setImageDrawable(circularBitmapDrawable);
            }
        });
    }
    public static void getwithoutFullPic(final Context context, Object imageUrl, final ImageView imgProfile, int defaultImage, String timeStamp, final boolean isCircular) {
        Glide.with(context).asBitmap().load(imageUrl).placeholder(defaultImage).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(new BitmapImageViewTarget(imgProfile) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                circularBitmapDrawable.setCircular(isCircular);
                imgProfile.setImageDrawable(circularBitmapDrawable);
            }
        });
    }


}