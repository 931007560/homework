package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.dto.in.*;
import com.ltl.opencartadminstrationback.dto.out.AdministratorGetProfileOutDTO;
import com.ltl.opencartadminstrationback.dto.out.AdministratorListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.AdministratorShowOutDTO;
import com.ltl.opencartadminstrationback.dto.out.PageOutDTO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"administrator crud"})
@RestController
@RequestMapping("/administrator")
public class AdministratorController {
    /** @Author ltl
     * @Description //TODO
     * @Date 16:36 2020/2/25
     * @Param [administratorLoginInDTO]
     * @return java.lang.String
     **/
    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:36 2020/2/25
     * @Param [adminstratorId]
     * @return com.ltl.opencartadminstrationback.dto.out.AdministratorGetProfileOutDTO
     **/
    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){
        return null;
    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:36 2020/2/25
     * @Param [administratorUpdateProfileInDTO]
     * @return void
     **/
    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:36 2020/2/25
     * @Param [email]
     * @return java.lang.String
     **/
    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){

        return null;
    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:37 2020/2/25
     * @Param [administratorResetPwdInDTO]
     * @return void
     **/
    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:37 2020/2/25
     * @Param [pageNum]
     * @return com.ltl.opencartadminstrationback.dto.out.PageOutDTO<com.ltl.opencartadminstrationback.dto.out.AdministratorListOutDTO>
     **/
    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:37 2020/2/25
     * @Param [administratorId]
     * @return com.ltl.opencartadminstrationback.dto.out.AdministratorShowOutDTO
     **/
    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
        return null;
    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:37 2020/2/25
     * @Param [administratorCreateInDTO]
     * @return java.lang.Integer
     **/
    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:37 2020/2/25
     * @Param [administratorUpdateInDTO]
     * @return void
     **/
    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:37 2020/2/25
     * @Param [adminstratorId]
     * @return void
     **/
    @PostMapping("/delete")
    public void delete(@RequestBody Integer adminstratorId){

    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:38 2020/2/25
     * @Param [administratorIds]
     * @return void
     **/
    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorIds){

    }

}
