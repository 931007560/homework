package com.ltl.opencartadminstrationback.controller;

import com.github.pagehelper.Page;
import com.ltl.opencartadminstrationback.dto.in.ProductCreateInDTO;
import com.ltl.opencartadminstrationback.dto.in.ProductSearchInDTO;
import com.ltl.opencartadminstrationback.dto.in.ProductUpdateInDTO;
import com.ltl.opencartadminstrationback.dto.out.PageOutDTO;
import com.ltl.opencartadminstrationback.dto.out.ProductListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.ProductShowOutDTO;
import com.ltl.opencartadminstrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum) {
        Page<ProductListOutDTO> page = productService.search(productSearchInDTO, pageNum);

        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);
    }

    @PostMapping("/delete")
    public void delete(Integer productId){
        productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
        productService.batchDelete(productIds);
    }

}
