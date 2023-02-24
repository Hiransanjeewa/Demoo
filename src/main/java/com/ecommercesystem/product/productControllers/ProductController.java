package com.ecommercesystem.product.productControllers;

import com.ecommercesystem.product.services.ProductInfoService;
import com.ecommercesystem.product.productRepo.ProductRepo;
import com.ecommercesystem.product.entity.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("ecommerce")
public class ProductController {

       @Autowired
        private ProductInfoService productInfoService;
       @Autowired
       private ProductRepo productRepo;

            @PostMapping(path = "/product")
            @ResponseBody
            public List<product> ShowProduct(@RequestParam Integer item_id  ){
                return productInfoService.getItemPrice(item_id);
        }
    }
