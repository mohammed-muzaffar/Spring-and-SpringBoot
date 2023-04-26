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
- context.getBean("name"); Record @Bean Attribute
- Record Feature released in JDL 16. **Ex: record Address(String firstLine, String city) {};**
- Without attribute in @Bean means calling bean with the name of method name.
- @Bean(name="address2"); means calling bean with custom name.
- context.getBean(Address.class); this is called type of the bean
- context.getBean("address"); this is called name of the bean.
- Relation between two record feature.
- Bean method with parameter is a bean.

<h3>Spring Bean vs Java Bean vs POJO</h3>

**POJO**
- No constraints
- POJO stands for Plain Old Java Object. Any JAVA object is a POJO!.
- Contain toString method for printing the variable values.

**JavaBean**
*3 constraints*
- 1. Have public no-arg constructor.
- 2. getter and setters, to access all their properties.
- 3. JavaBean class implements java.io.Serializable
- If all above met the condition then the instance of the class is called java bean.

**Spring Beans**
- Any Java object that is managed by spring, that class is called spring beans.   

**To check how many beans are managing by container in a specific class, then used this**

- Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

*Ambiguity Problem*
- @Primary Annotation is used to remove ambiguity problems.
- @Qualifier()