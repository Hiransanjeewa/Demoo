package com.ecommercesystem.product.services.wishlist;

import com.ecommercesystem.product.entity.product;
import com.ecommercesystem.product.productRepo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class wishListServiceImpl implements wishListService{

    private ProductRepo productRepo;

    @Override
    public String addToWishList(Integer item_id, Integer userid) {
        productRepo.addWish(item_id,userid);
        return "Item added to wishlist";
    }

    @Override
    public List<product> showWishList(Integer userid) {
        List<product> wishes= productRepo.showWishList(userid);
        return wishes;
    }

    @Override
    public String removeFromWishList(Integer item_id, Integer userid) {
        productRepo.removeWish(item_id,userid);
        return "Item removed from wishlist";
    }
}
