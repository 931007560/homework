package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.dto.in.ProductCreateInDTO;
import com.ltl.opencartadminstrationback.dto.in.ProductUpdateInDTO;
import com.ltl.opencartadminstrationback.dto.out.PageOutDTO;
import com.ltl.opencartadminstrationback.dto.out.ProductListOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    /** @Author ltl
     * @Description //TODO
     * @Date 16:44 2020/2/24
     * @Param [productCode, productName, price, quantity, status, pageNum]
     * @return com.ltl.opencartadminstrationback.dto.out.PageOutDTO<com.ltl.opencartadminstrationback.dto.out.ProductListOutDTO>
     **/
    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(@RequestParam(required = false) String productCode,
                                                @RequestParam(required = false) String productName,
                                                @RequestParam(required = false) Double price,
                                                @RequestParam(required = false) Integer quantity,
                                                @RequestParam(required = false) Byte status,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){

        return null;
    }


    /** @Author ltl
     * @Description //TODO
     * @Date 16:42 2020/2/24
     * @Param [productCreateInDTO]
     * @return java.lang.Integer
     **/
    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){

        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:42 2020/2/24
     * @Param [productUpdateInDTO]
     * @return void
     **/
    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }
}
