package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.constant.ClientExceptionConstant;
import com.ltl.opencartadminstrationback.dto.in.*;
import com.ltl.opencartadminstrationback.dto.out.*;
import com.ltl.opencartadminstrationback.exception.ClientException;
import com.ltl.opencartadminstrationback.po.Administrator;
import com.ltl.opencartadminstrationback.service.AdministratorService;
import com.ltl.opencartadminstrationback.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private JWTUtil jwtUtil;

    /** @Author ltl
     * @Description //TODO
     * @Date 10:18 2020/3/1
     * @Param [administratorLoginInDTO]
     * @return com.ltl.opencartadminstrationback.dto.out.AdministratorLoginOutDTO
     **/
    @GetMapping("/login")
    public AdministratorLoginOutDTO login(AdministratorLoginInDTO administratorLoginInDTO) throws ClientException {
        Administrator administrator = administratorService.getByUsername(administratorLoginInDTO.getUsername());
        if (administrator == null){
            throw new ClientException(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRMSG);
        }
        String encPwdDB = administrator.getEncryptedPassword();
        BCrypt.Result result = BCrypt.verifyer().verify(administratorLoginInDTO.getPassword().toCharArray(), encPwdDB);

        if (result.verified) {
            AdministratorLoginOutDTO administratorLoginOutDTO = jwtUtil.issueToken(administrator);
            return administratorLoginOutDTO;
        }else {
            throw new ClientException(ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRCODE, ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRMSG);
        }
    }
    /** @Author ltl
     * @Description //TODO
     * @Date 10:19 2020/3/1
     * @Param [adminstratorId]
     * @return com.ltl.opencartadminstrationback.dto.out.AdministratorGetProfileOutDTO
     **/
    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){
        Administrator administrator = administratorService.getById(adminstratorId);
        AdministratorGetProfileOutDTO administratorGetProfileOutDTO = new AdministratorGetProfileOutDTO();
        administratorGetProfileOutDTO.setAdministratorId(administrator.getAdministratorId());
        administratorGetProfileOutDTO.setUsername(administrator.getUsername());
        administratorGetProfileOutDTO.setRealName(administrator.getRealName());
        administratorGetProfileOutDTO.setEmail(administrator.getEmail());
        administratorGetProfileOutDTO.setAvatarUrl(administrator.getAvatarUrl());
        administratorGetProfileOutDTO.setCreateTimestamp(administrator.getCreateTime().getTime());
        return administratorGetProfileOutDTO;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 10:21 2020/3/1
     * @Param [administratorUpdateProfileInDTO, administratorId]
     * @return void
     **/
    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO
    ,@RequestAttribute Integer administratorId){
        Administrator administrator = new Administrator();
        administrator.setAdministratorId(administratorId);
        administrator.setRealName(administratorUpdateProfileInDTO.getRealName());
        administrator.setEmail(administratorUpdateProfileInDTO.getEmail());
        administrator.setAvatarUrl(administratorUpdateProfileInDTO.getAvatarUrl());
        administratorService.update(administrator);
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
