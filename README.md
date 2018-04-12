"# SpringBoot_Mybatis_JPA" 

A empty project configured with Mybatis, JPA, MySQL

## What need modify

1. generatorConfig.xml

- `classPathEntry`
- `jdbcConnection`
- `avaModelGenerator`
- `sqlMapGenerator`
- `javaClientGenerator`

1. Add `JPA` annotation on Model Class
2. modify application.properties 
```
// Data source
          spring.datasource.type=com.alibaba.druid.pool.DruidDataSource
          spring.datasource.url=jdbc:mysql://localhost:3306/stock?useSSL=false
          spring.datasource.username=test1
          spring.datasource.password=teset1
          spring.datasource.driver-class-name=com.mysql.jdbc.Driver
       
//mybatis
       
       mybatis.type-aliases-package=com.maolintu.matisplusjpa.model
       
       mybatis.mapper-locations=classpath:mapper/*.xml
```
   

1. Add `@component` annotation in Class xxxMapper.java
2. Add `@MapperScan("com.maolintu.matisplusjpa.mapper")` annotation in Entry Class


