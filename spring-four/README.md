# spring4.0学习
![img](doc/image/微信截图_20190727172117.png)
##第一章 Spring 基础

---
##第二章 Spring 常用配置
###2.1 Bean 的 Scope
   * @Scope("singleton") 单例  默认值
   * @Scope("protorype") 多列
###2.2 Spring EL 和资源调用
   * @Value
   * 注入普通字符串
   * 注入操作系统属性
   * 注入表达式结果
   * 注入其他 Bean 属性
   * 注入文件资源
   * 注入网址资源
   * 注入配置文件
###2.3 Bean 的初始化和销毁
   * Java 配置方法：使用 @Bean 的 initMethod 和 destoryMethod （相当于 xml 配置的 init-method 和 destory-method）
   * 注解方式：利用 JSR-250 的 @PostConstruct 和 @PreDestroy
###2.4 Profile
   * 通过设定 Environment 的ActiveProfiles 来设定当前 context 需要使用的配置环境, 在开发中使用 @Profile 注解类或者方法, 达到在不同情况下选择实例化不同的Bean
   * 通过设定 jvm 的spring.profiles.active 参数来设置配置环境
   * Web 项目设置在 Servlet 的 context parameter 中
###2.5 事件 (Application Event)
Spring 的事件 (Application Event) 为 Bean 与 Bean 之间的消息通信提供了支持, 当一个 Bean 处理完一个任务之后, 希望另一个 Bean 知道并能做相应的处理,这时我们就需要让另一个 Bean 监听当前 Bean 所发送的事件
Spring 的事件需要遵循如下流程
   1. 自定义事件, 集成 ApplicationEvent
   2. 定义事件监听器, 实现 ApplicationListener
   3. 使用容器发布事件
   
   
   
---
##第三章 Spring 高级话题
