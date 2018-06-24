package cn.com.dom4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**

 SpringBootApplication 用来标注一个主程序类, 说明这是一个 SpringBoot应用

     SpringBootApplication是一个组合注解, 由以下注解构成
     Target(ElementType.TYPE)
     Retention(RetentionPolicy.RUNTIME)
     Documented
     Inherited
     SpringBootConfiguration
     EnableAutoConfiguration
     ComponentScan(excludeFilters = {
     Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
     Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })


 元注解:
     Target: 用于设定注解的使用范围 (方法, 类或接口, 构造方法, 字段等)
     Retention: (保留)注解说明到哪个阶段 (SOURCE, CLASS, RUNTIME)
     Documented: 表明了这个注解应该被 javadoc工具记录
     Inherited: 表明了某个被标注的类型是被继承的

 普通注解:
     SpringBootConfiguration: SpringBoot的配置类, 标注在某个类上, 也是一个组合注解, 由 Configuration注解组成
        Configuration: 配置类 (即 java config), 这里的配置类也是一个组件 (Component)

    EnableAutoConfiguration: 开启自动配置功能, 包含 AutoConfigurationPackage注解
        AutoConfigurationPackage: 是一个组合注解, 包含 Import注解 (@Import(AutoConfigurationPackages.Registrar.class))
            Import: Spring底层注解, 给容器导入一个组件
            注: Import(AutoConfigurationPackages.Registrar.class) 将主配置类所在包及下面的所有子包里面的组件扫描到 spring容器
        Import(AutoConfigurationImportSelector.class): 给容器导入非常多的自动配置类 (XxxAutoConfiguration),: 就是给容器导入
            这个场景所需要的所有组件, 并配置好这些组件

 */

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
