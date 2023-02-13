package com.primarchan.loan.service;

import com.primarchan.loan.dto.ApplicationDTO.*;

public interface ApplicationService {

    Response create(Request request);

    Response get(Long applicationId);

    Response update(Long applicationId, Request request);

    void delete(Long applicationId);

}
