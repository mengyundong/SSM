package net.xdclass.demoproject;


import java.sql.*;

public class JdbcApp {
    public static void main(String [] args) throws ClassNotFoundException, SQLException {
        /**
         * -加载JDBC驱动程序
         * -创建数据库的连接
         * -创建preparedStatement
         * -执行SQL语句
         * -处理数据集
         * -关闭JDBC对象资源
         */
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://192.168.253.128:3306/xdclass_ssm?useUnicode=true&characterEncoding=utf-8&useSSL=false";

        String username = "root";
        String password = "mengyundong";
        //获取连接对象，并连接数据库
        Connection connection = DriverManager.getConnection(url,username,password);
        //获取语句对象
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from video");
        while (resultSet.next()) {
            System.out.println("视频标题："+resultSet.getString("title"));
        }
        statement.close();


    }
}
