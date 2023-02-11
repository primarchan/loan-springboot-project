package com.primarchan.loan.service;

import com.primarchan.loan.dto.CounselDTO.*;

public interface CounselService {

    Response create(Request request);

    Response get(Long counselId);

    Response update(Long counselId, Request request);

}
