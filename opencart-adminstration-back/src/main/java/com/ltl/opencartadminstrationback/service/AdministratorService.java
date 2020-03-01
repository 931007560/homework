package com.ltl.opencartadminstrationback.service;


import com.ltl.opencartadminstrationback.po.Administrator;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);

}
