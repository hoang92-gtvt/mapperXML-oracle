package com.example.mapperxml.config;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

@Configuration
//@MapperScan("com.example.mapperxml.userdemo.dao")
public class MybatisConfig {

//    @Bean(name = "dataSoure")
//    public DataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/demomybatic");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123456");
//        System.out.println("tao duoc datasoure");
//        return dataSource;
//    }

//    @Bean(name = "OracleUniversalConnectionPool")
//    @Primary
//    public DataSource getDataSource() {
//        PoolDataSource pds = null;
//        try {
//            pds = PoolDataSourceFactory.getPoolDataSource();
//
//            pds.setConnectionFactoryClassName("oracle.jdbc.OracleDrive");
//            pds.setURL("jdbc:oracle:thin:@localhost:1521:database2");
//            pds.setUser("hr");
//            pds.setPassword("h123");
//            pds.setMinPoolSize(Integer.valueOf("1"));
//            pds.setInitialPoolSize(10);
//            pds.setMaxPoolSize(Integer.valueOf("200"));
//
//        } catch (SQLException ea) {
//            System.err.println("Error connecting to the database: " + ea.getMessage());
//        }
//
//        return pds;
//    }

//
//    @Bean(name="dataSoure")
//    public DataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("oracle.jdbc.OracleDrive");
//        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:database2");
//        dataSource.setUsername("hr");
//        dataSource.setPassword("h123");
//        System.out.println("tao duoc datasoure");
//        return dataSource;
//    }


//    @Bean(name = "sqlSessionFactoryBean")
//    public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(getDataSource());
//
//        PathMatchingResourcePatternResolver pathMyBatisConfig = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setConfigLocation(pathMyBatisConfig.getResource("classpath:/config/mybatis-config.xml"));
//
//
//        sqlSessionFactoryBean.setVfs(SpringBootVFS.class);
//
//        PathMatchingResourcePatternResolver pathM3R = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(pathM3R.getResources("classpath*:mybatis/*.xml"));
//        System.out.println("tao duoc sql session");
//        return sqlSessionFactoryBean;
//    }
//
//
//    @Bean(name = "mapper")
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer =
//                new MapperScannerConfigurer();
//        mapperScannerConfigurer.setBasePackage("com.example.demo");
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
//
//        System.out.println("tao duoc mapper");
//        return mapperScannerConfigurer;
//    }
//
//    @Bean(name = "transactionManager")
//    public DataSourceTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(getDataSource());
//    }


}
