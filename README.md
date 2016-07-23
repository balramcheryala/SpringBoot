# Student-CRUD
WHY We Need Spring Boot?

Spring Boot is next generation attempt to easy spring setup.
Spring Boot’s main benefit is configuring the resources based on what it finds in the classpath.
If your Maven POM includes JPA dependencies and a MYSQL driver, then Spring Boot will setup a persistence unit based on MySQL. If you�ve added a web dependency, then you will get Spring MVC configured with defaults.
When we talk about defaults, Spring Boot has its own opinions. If you are not specifying the details, it will use its own default configurations. If you want persistence, but don�t specify anything else in your POM file, then Spring Boot configures Hibernate as a JPA provider with an HSQLDB database.
The primary goals of spring boot:

To provide a radically faster and widely accessible getting started development experience for all Spring development. Since spring community has evolved so big, it is time to re-invent the way how spring applications are deployed in much quicker turn around time.
To be get started so quickely using the default values which are supported out of the box in the Spring Boot configurations.
To provide bunch of non-functional features/solutions that are very much common to large scale projects (e.g. embedded servers, security, metrics, health checks, externalized configuration).
