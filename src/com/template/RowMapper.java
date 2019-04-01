package com.template;

import java.sql.ResultSet;
/**
 * @description：
 * @author 鲁朋博(pengbo.lu@ucarinc.com)
 * @date  2019/3/31 19:26 创建
 */
public interface RowMapper<T> {

    public T mapRow(ResultSet rs, int rowNum) throws Exception;

}
