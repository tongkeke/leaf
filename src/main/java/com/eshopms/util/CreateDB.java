package com.eshopms.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import com.mysql.jdbc.Connection;

public class CreateDB {
	public static void main(String[] args) {
		// 装载配置文件
		Configuration cfg = new Configuration().configure();
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String username = "root";
		String password = "12345";
		try {
			con = (Connection) DriverManager.getConnection(url, username,
					password);
		} catch (SQLException se) {
			System.out.println("数据库连接失败！");
			se.printStackTrace();
		}

		SchemaExport export = new SchemaExport(cfg, con);
		export.create(true, true);
	}
}