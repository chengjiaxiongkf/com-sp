#系统架构                                     
                                    [request]
                                        |               
                                   [keepalived]
                    |                   |                |
                 [nginx]             [nginx]          [nginx]
                 ||||||||||||||||||||||||||||||||||||||||||||                 
                 [nacos]             [nacos]          [nacos]
                 ||||||||||||||||||||||||||||||||||||||||||||  
                  [zuul]             [zuul]           [zuul]
                 ||||||||||||||||||||||||||||||||||||||||||||
                [login,login]     [user,user]    [order,order] 
#内容概述:
    1. 初识微服务,微服务的前世今身
        什么是微服务：http://blog.cuicc.com/blog/2015/07/22/microservices/
        微服务的前世今生：https://www.jianshu.com/p/f4a907fe1485 
	2. maven项目结构及依赖管理，全局变量参数一键打包 开发/生产环境
	3. springcloud alibaba（SCA） 项目搭建
	    官网文档：https://spring.io/projects/spring-cloud-alibaba
	    中文文档：https://github.com/alibaba/spring-cloud-alibaba/blob/master/README-zh.md 
	4. swagger 基于Restful风格的接口文档自动生成与管理
	5. redis集群搭建
	6. redus基于生产/消费 者模式手写消息队列，延迟消息队列
	7. 微服务单点登录
	8. 项目部署配置，一键构建docker镜像的sh脚本，一键部署docker镜像的sh脚本
	9. Nginx集群搭建
	10. redis一主两从哨兵模式搭建
#项目结构:
    com-sp-common (公共模块)
	com-sp-login (登录模块，基于微服务网关统一入口的redis中间件加本地缓存存储登录信息，md5加盐加密方式)