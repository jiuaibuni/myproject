package com.bing.myproject.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author gby_dev
 * @date 2021-10-26
 */
@Data
public class ExportInfo {

    //@ExcelProperty注解可以使用value或者index进行匹配字段，不建议 index 和 name 同时用
    @ExcelProperty(value = "id", index = 0)
    private String order;

    @ExcelProperty(value = "name", index = 1)
    private String url;

    @ExcelProperty(value = "url", index = 2)
    private String num;

}
