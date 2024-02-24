package com.xuecheng.base.execption;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestErrorResponse {
    private String errMessage;
}
