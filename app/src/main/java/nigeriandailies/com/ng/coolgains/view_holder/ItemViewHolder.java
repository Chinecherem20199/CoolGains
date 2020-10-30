package nigeriandailies.com.ng.coolgains.view_holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import nigeriandailies.com.ng.coolgains.R;
import nigeriandailies.com.ng.coolgains.interfac.ItemClickListner;

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView imageView;
    public TextView txtProductName, txtProductDescription, txtProductPrice, txtProductState;
    public ItemClickListner listner;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.product_seller_imageView);
        txtProductName = itemView.findViewById(R.id.product_seller_name);
        txtProductDescription = itemView.findViewById(R.id.product_seller_description);
        txtProductPrice = itemView.findViewById(R.id.product_seller_price);
        txtProductState = itemView.findViewById(R.id.product_state);



    }

    public void setItemClickListner(ItemClickListner listner){
        this.listner = listner;
    }

    @Override
    public void onClick(View view) {
        listner.onClick(view, getAdapterPosition(), false);

    }
}


