package com.primarchan.loan.service;

import com.primarchan.loan.dto.TermsDTO.*;

import java.util.List;

public interface TermsService {

    Response create(Request request);

    List<Response> getAll();

}
