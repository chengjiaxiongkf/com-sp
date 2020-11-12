#docker pull nacos/nacos-server

#通过指定MODE=standalone参数，以单例方式启动Nacos服务端。
docker run --name nacos --restart always -d -p 8848:8848 -e MODE=standalone nacos/nacos-server

#http://IP:8848/nacos  访问nacos控制台