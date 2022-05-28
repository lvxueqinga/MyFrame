package com.test.model;

import lombok.Data;

@Data
public class CaseResult {

    private  int product_id;
    private String case_name;
    private String case_result;
    private Boolean is_delete;

}
