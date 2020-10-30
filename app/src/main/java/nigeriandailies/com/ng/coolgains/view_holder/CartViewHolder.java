package nigeriandailies.com.ng.coolgains.view_holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import nigeriandailies.com.ng.coolgains.R;
import nigeriandailies.com.ng.coolgains.interfac.ItemClickListner;

public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtProductName, txtProdctPrice,  txtProductQuantity;

    private ItemClickListner itemClickListner;

    public CartViewHolder(@NonNull View itemView) {
        super(itemView);

        txtProductName = itemView.findViewById(R.id.cart_product_name);
        txtProdctPrice = itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity= itemView.findViewById(R.id.cart_product_quantity);
    }

    //    Called when a view has been clicked.
//     @param v The view that was clicked.
    @Override
    public void onClick(View view) {
        itemClickListner.onClick(view, getAdapterPosition(),false);

    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;

    }
}

