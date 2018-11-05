package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.util.jdbcUtil;

@Service
public class ShiWuTestDao {
    public void lessMoney(Integer money, Integer id) {
        String sql = "UPDATE test set salary=salary-? WHERE id=?";
        Connection con = jdbcUtil.getConnection();
        //ResultSet rs = null;
        int x = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, money);
            ps.setInt(2, id);
            x = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void moreMoney(Integer money, Integer id) {
        String sql = "UPDATE test set salary=salary+? WHERE id=?";
        Connection con = jdbcUtil.getConnection();
        //ResultSet rs = null;
        int x = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, money);
            ps.setInt(2, id);
            x = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
