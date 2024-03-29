该项目主要介绍了JDK9 ~ 17版本的新特性（偏向于API方面），其他底层原理以及JVM优化未做介绍，若有兴趣，可以搜索相关关键字自行研究

### JDK9
- 模块化
- 接口支持私有方法
- 新增Stream API & 集合工厂方法
- 改进版 Try-With Resources
- G1 成为默认垃圾收集器

### JDK10
- APPCDS 应用程序类数据共享
- 多线程并行 GC
- 局部变量类型推断
- 线程-局部管控
- 基于Java的实验性JIT编译器Graal

### JDK11
- String 增强
- 支持TLS 1.3 协议
- HTTP Client
- Epsilon：低开销垃圾回收器
- 飞行记录器：JFR

### JDK 12 ~ 14
- G1 收集器优化
- SocketAPI 重构
- 动态 CDS 存档
- 增强 switch
- 移除 CMS 垃圾收集器

### JDK 15 ~ 16
- 文本块
- Hidden Classes（隐藏类）
- instanceof 模式匹配
- 记录类
- ZGC 并发线程堆栈处理

### JDK17
- 增强的伪随机数生成器
- 密封类
- 移除实验性的 AOT 和 JIT 编译器
- 删除 Applet API
