package com.template.dao;
import com.template.JdbcTemplate;
import com.template.RowMapper;
import com.template.entity.Member;

import javax.sql.DataSource;
import javax.tools.JavaCompiler;
import java.sql.ResultSet;
import java.util.List;
/**
 * @description：
 * @author 鲁朋博(pengbo.lu@ucarinc.com)
 * @date  2019/3/31 19:26 创建
 */
public class MemberDao {

    //为什么不继承，主要是为了解耦
    private com.template.JdbcTemplate JdbcTemplate = new JdbcTemplate(null);

    public List<?> query(){
        String sql = "select * from t_member";
        return JdbcTemplate.executeQuery(sql,new RowMapper<Member>(){
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }


}
