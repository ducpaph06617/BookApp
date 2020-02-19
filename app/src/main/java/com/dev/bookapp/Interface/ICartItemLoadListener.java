package com.dev.bookapp.Interface;



import com.dev.bookapp.Database.CartItem;

import java.util.List;

public interface ICartItemLoadListener {
    void onGetAllItemFromCartSuccess(List<CartItem> cartItemList);
}
