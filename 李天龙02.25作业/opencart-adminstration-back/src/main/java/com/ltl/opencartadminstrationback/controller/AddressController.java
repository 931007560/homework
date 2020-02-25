package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.dto.in.AddressCreateInDTO;
import com.ltl.opencartadminstrationback.dto.out.AddressShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    /** @Author ltl
     * @Description //TODO
     * @Date 16:09 2020/2/24
     * @Param [addressId]
     * @return com.ltl.opencartadminstrationback.dto.out.AddressShowOutDTO
     **/
    @GetMapping("/getById")
    public AddressShowOutDTO getById(@RequestParam Integer addressId){
        return null;
    }


    /** @Author ltl
     * @Description //TODO
     * @Date 16:10 2020/2/24
     * @Param [administratorCreateInDTO]
     * @return java.lang.Integer
     **/
    @PostMapping("/create")
    public Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO){
        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:10 2020/2/24
     * @Param [addressCreateInDTO]
     * @return java.lang.Integer
     **/
    @PostMapping("/update")
    public Integer update(@RequestBody AddressCreateInDTO addressCreateInDTO){

        return null;
    }
}
