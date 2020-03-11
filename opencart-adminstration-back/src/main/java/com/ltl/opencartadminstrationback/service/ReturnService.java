package com.ltl.opencartadminstrationback.service;

import com.github.pagehelper.Page;
import com.ltl.opencartadminstrationback.dto.in.ReturnSearchInDTO;
import com.ltl.opencartadminstrationback.po.Return;

public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);

}
