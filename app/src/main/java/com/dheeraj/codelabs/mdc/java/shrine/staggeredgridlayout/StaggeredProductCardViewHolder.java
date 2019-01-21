package com.dheeraj.codelabs.mdc.java.shrine.staggeredgridlayout;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

public class StaggeredProductCardViewHolder extends RecyclerView.ViewHolder {

    public NetworkImageView productImage;
    public TextView productTitle;

    StaggeredProductCardViewHolder(@NonNull View itemView) {
        super(itemView);
        productImage = itemView.findViewById(com.dheeraj.codelabs.mdc.java.shrine.R.id.product_image);
        productTitle = itemView.findViewById(com.dheeraj.codelabs.mdc.java.shrine.R.id.product_title);
    }
}
