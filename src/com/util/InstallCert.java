package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InstallCert {
    public static void main(String[] args) {
        cha(2, 36, "重庆", "一分");
    }

    public static void cha(int cha, int ru, String oldname, String newname) {
        Connection con = jdbcUtil.getConnection();
        System.out.println(con);
        String url = "SELECT  lid_title,lid_desc,lid_image_url,content FROM lottery_information_detail WHERE lic_id=2 AND lc_id="
                + cha + " LIMIT 0,8";
        try {
            Statement sts = con.createStatement();
            ResultSet rs = sts.executeQuery(url);
            while (rs.next()) {
                chas(ru, bian(rs.getString(1), oldname, newname), bian(rs.getString(2), oldname, newname), bian(rs.getString(3), oldname, newname), bian(rs.getString(4), oldname, newname));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String bian(String name, String oldname, String newname) {
        return name.replaceAll(oldname, newname);
    }

    public static void chas(int id, String lid_title, String lid_desc, String lid_image_url, String content) {
        Connection con = jdbcUtil.getConnection();
        String url = "INSERT INTO lottery_information_detail(lic_id,lc_id,lid_title,lid_desc,lid_image_url,content)value(2,?,?,?,?,?)";
        try {
            PreparedStatement sts = con.prepareStatement(url);
            sts.setInt(1, id);
            sts.setString(2, lid_title);
            sts.setString(3, lid_desc);
            sts.setString(4, lid_image_url);
            sts.setString(5, content);
            int rs = sts.executeUpdate();
            if (rs == 1) {
                System.out.println("id:" + id + "成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}