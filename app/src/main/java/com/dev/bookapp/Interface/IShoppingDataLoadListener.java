package com.dev.bookapp.Interface;



import com.dev.bookapp.Model.ShoppingItem;

import java.util.List;

public interface IShoppingDataLoadListener {
    void onShoppingDataLoadSuccess(List<ShoppingItem> shoppingItemList);

    void onShoppingDataLoadFailed(String message);
}
