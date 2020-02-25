package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.dto.in.ProductCreateInDTO;
import com.ltl.opencartadminstrationback.dto.in.ProductSearchInDTO;
import com.ltl.opencartadminstrationback.dto.in.ProductUpdateInDTO;
import com.ltl.opencartadminstrationback.dto.out.PageOutDTO;
import com.ltl.opencartadminstrationback.dto.out.ProductListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    /** @Author ltl
     * @Description //TODO
     * @Date 16:30 2020/2/25
     * @Param [productSearchInDTO, pageNum]
     * @return com.ltl.opencartadminstrationback.dto.out.PageOutDTO<com.ltl.opencartadminstrationback.dto.out.ProductListOutDTO>
     **/
    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:31 2020/2/25
     * @Param [productId]
     * @return com.ltl.opencartadminstrationback.dto.out.ProductShowOutDTO
     **/
    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:31 2020/2/25
     * @Param [productCreateInDTO]
     * @return java.lang.Integer
     **/
    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:31 2020/2/25
     * @Param [productUpdateInDTO]
     * @return void
     **/
    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:31 2020/2/25
     * @Param [productId]
     * @return void
     **/
    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){

    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:31 2020/2/25
     * @Param [productIds]
     * @return void
     **/
    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){

    }

}
