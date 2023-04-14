**Spring-and-SpringBoot**

**Initial Commit**
- Tightly Coupling
- GammerRunner is Parent Class
- Mario, SuperContra, PacMan are Child Class

**New Brach = Loose-Coupling**
- Loose Coupling
- Using Interface(GamingConsole) as a ParentClass
- Mario, SuperContra, PacMan converted to Implement Class.


**New Branch = SpringContainer**
- AnnotationConfigApplicationContext
- context.getBean("name");

**Record @Bean Attribute**
- Record Feature released in JDL 16. **Ex: record Address(String firstLine, String city) {};**
- Without attribute in @Bean means calling bean with the name of method name.
- @Bean(name="address2"); means calling bean with custom name.
- context.getBean(Address.class); this is called type of the bean
- context.getBean("address"); this is called name of the bean.
- Relation between two record feature.
- Bean method with parameter is a bean.