module org.example.jdk9 {
    // 声明依赖模块, transitive修饰符会导致依赖于当前模块的其他模块具有隐式依赖性。
    requires transitive java.logging;
    requires transitive java.transaction.xa;
    requires transitive java.xml;
    requires java.sql;

    // 声明哪些包是可以被其它模块访问
    // exports org.example.jdk9.access;

    // 使用语句（uses statement）和提供语句（provides statement）实现其服务
    // 使用语句可以指定服务接口的名字，当前模块就会发现它，使用 java.util.ServiceLoader类进行加载
    uses java.sql.Driver;
}