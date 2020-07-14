package com.xiahao.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xiahao on 2020/7/14.
 */
class JDBCUtils {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(in);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        System.out.println(dataSource);
    }
}
