package com.ecommercesystem.product.services.wishlist;

import com.ecommercesystem.product.entity.product;

import java.util.List;

public interface wishListService {

    String addToWishList(Integer item_id,Integer userid);
    List<product> showWishList(Integer userid);
    String removeFromWishList(Integer item_id,Integer userid);
}
