#   course-server


###  **技术选型** 

- 核心框架：Spring Boot

- 持久层框架：yfsql

  

 **软件需求** 

- JDK1.8
- MySQL5.5+
- Tomcat8+
- Maven3.0+

<br>

### 本地部署



1.git下载https://github.com/57307407/Course-server.git项目,完成后导入到ide中 <br>
2.eclipse File import... Maven Existing Projects into Workspace 选择项目的根路径。<br>
3.IDE会下载maven依赖包，自动编译 如果有报错 请update project... jdk环境配置。<br>
4.执行doc/course.sql文件，初始化数据【按需导入表结构及数据】<br>
5.最后修改数据库连接参数,配置文件在src/main/java/com/example/demo/utils/DatabaseConfig.java<br>
6.在course-server目录下，执行mvn clean install
<br>7.如何运行

- Eclipse或IDEA运行DemoApplication.java，则可启动项目【course-server】

### 特别鸣谢：

随风/yfsql

