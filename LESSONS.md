# Lessons

- [lessons](#lessons)
  - [spring intro](#spring-intro)
  - [javaconfig dependency injection](#javaconfig-dependency-injection)
  - [annotations](#annotations)
  - [test](#test)

# spring intro
- Understanding internal operations that need to be performed to implement "rewardAccountFor" method of the "RewardNetworkImpl" class
- Writing test code using stub implementations of dependencies
- Writing both target code and test code without using Spring framework

# javaconfig dependency injection
- Creating Spring configuration class
- Defining bean definitions within the configuration class
- Specifying the dependency relationships among beans
- Injecting dependencies through constructor injection
- Creating Spring application context in the test code (WITHOUT using Spring testContext framework)

# annotations
- Refactoring the current code that uses Spring configuration with @Bean methods so that it uses annotation and component-scanning instead
- Using constructor injection and setter injection
- Using @PostConstruct and @PreDestroy

# test
- Using annotation(s) from Spring TestContext Framework for creating application context for the test
- Using profiles in the test

