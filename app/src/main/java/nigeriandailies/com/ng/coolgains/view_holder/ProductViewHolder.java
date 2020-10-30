package nigeriandailies.com.ng.coolgains.view_holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import nigeriandailies.com.ng.coolgains.R;
import nigeriandailies.com.ng.coolgains.interfac.ItemClickListner;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView imageView;
    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ItemClickListner listner;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.product_display_imageView);
        txtProductName = itemView.findViewById(R.id.product_display_name);
        txtProductDescription = itemView.findViewById(R.id.product_display_description);
        txtProductPrice = itemView.findViewById(R.id.product_display_price);


    }

    public void setItemClickListner(ItemClickListner listner){
        this.listner = listner;
    }

    @Override
    public void onClick(View view) {
        listner.onClick(view, getAdapterPosition(), false);

    }
}

