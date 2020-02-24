package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.dto.in.*;
import com.ltl.opencartadminstrationback.dto.out.AdministratorGetProfileOutDTO;
import com.ltl.opencartadminstrationback.dto.out.AdministratorListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.PageOutDTO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"administrator crud"})
@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    /** @Author ltl
     * @Description //TODO
     * @Date 16:13 2020/2/24
     * @Param [username, password]
     * @return java.lang.String
     **/
    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password){
        return null;
    }


    /** @Author ltl
     * @Description //TODO
     * @Date 16:14 2020/2/24
     * @Param [administratorId]
     * @return com.ltl.opencartadminstrationback.dto.out.AdministratorGetProfileOutDTO
     **/
    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer administratorId){

        return null;
    }


    /** @Author ltl
     * @Description //TODO
     * @Date 16:16 2020/2/24
     * @Param [administratorUpdateProfileInDTO]
     * @return void
     **/
    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }


    /** @Author ltl
     * @Description //TODO
     * @Date 16:20 2020/2/24
     * @Param [pageNum]
     * @return com.ltl.opencartadminstrationback.dto.out.PageOutDTO<com.ltl.opencartadminstrationback.dto.out.AdministratorListOutDTO>
     **/
    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){

        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:22 2020/2/24
     * @Param [administratorCreateInDTO]
     * @return java.lang.Integer
     **/
    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:25 2020/2/24
     * @Param [administratorUpdateInDTO]
     * @return void
     **/
    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:30 2020/2/24
     * @Param [email]
     * @return void
     **/
    @GetMapping("/sendPasswordResetCodeToEmail")
    public void sendPasswordResetCodeToEmail(@RequestParam String email){

    }
    /** @Author ltl
     * @Description //TODO
     * @Date 16:35 2020/2/24
     * @Param [administratorResetPwdEmailInDTO]
     * @return void
     **/
    @PostMapping("/resetPasswordByEmail")
    public void resetPasswordByEmail(@RequestBody AdministratorResetPwdEmailInDTO administratorResetPwdEmailInDTO){

    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:36 2020/2/24
     * @Param [mobile]
     * @return void
     **/
    @GetMapping("/sendPasswordResetCodeToMobile")
    public void sendPasswordResetCodeToMobile(@RequestParam String mobile){

    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:37 2020/2/24
     * @Param [administratorResetPwdMobileInDTO]
     * @return void
     **/
    @PostMapping("/resetPassword")
    public void resetPasswordByMobile(@RequestBody AdministratorResetPwdMobileInDTO administratorResetPwdMobileInDTO){

    }
}
