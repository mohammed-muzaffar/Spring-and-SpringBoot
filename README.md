<h1>**Spring-and-SpringBoot**</h1>

<h3>Initial Commit</h3>
- Tightly Coupling
- GammerRunner is Parent Class
- Mario, SuperContra, PacMan are Child Class

<h3>New Brach = Loose-Coupling</h3>
- Loose Coupling
- Using Interface(GamingConsole) as a ParentClass
- Mario, SuperContra, PacMan converted to Implement Class.


<h3>New Branch = SpringContainer</h3>
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