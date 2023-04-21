# amazon-oss-stater

一款开箱即用的 Spring Boot Stater 企业级 OSS 对象存储服务

<br/>
适配 阿里云OSS、腾讯COS、七牛云OSS、MInio 等

<br/>
<br/>

[Amazon Simple Storage Service](https://docs.aws.amazon.com/zh_cn/AmazonS3/latest/userguide/Welcome.html )（Amazon S3，Amazon 简便存储服务）是 AWS 最早推出的云服务之一，经过多年的发展，S3 协议在对象存储行业事实上已经成为标准

## 亮点

1. 提供了统一的接口 REST/SOAP 来统一访问任何数据
2. 对 S3 来说，存在里面的数据就是对象名（键），和数据（值）
3. 不限量，单个文件最高可达 5TB，可动态扩容
3. 高速。每个 bucket 下每秒可达 3500 PUT/COPY/POST/DELETE 或 5500 GET/HEAD 请求
4. 具备版本，权限控制能力
5. 具备数据生命周期管理能力

<br/>
<br/>

## 为什么要基于AmazonS3 实现 Spring Boot Starter

市面上 OSS 对象存储服务基本都支持 AmazonS3，封装自己的 starter 那么就必须考虑适配，迁移，可扩展。比如现在使用的是阿里云 OSS 对接阿里云 OSS 的 SDK，之后使用的是腾讯 COS 对接是腾讯云 COS，那么直接对接 AmazonS3 实现，这样后续不需要调整代码，只需要去各个云服务商配置即可

<br/>
<br/>

## 使用方法

将本项目 deploy 到 maven 仓库，其他服务通过坐标直接引入，配置对应的存储服务信息即可
