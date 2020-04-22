# Swagger2集成

   * pom.xml中添加依赖
   ```
  <dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-swagger2</artifactId>
      <version>2.8.0</version>
  </dependency>
  <dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-swagger-ui</artifactId>
      <version>2.8.0</version>
  </dependency>
   ```
   * 增加配置文件
   ```
   @EnableSwagger2
   @Configuration
   public class SwaggerConfig {
   
       @Value("${system.name}")
       String systemName;
       @Value("${system.version}")
       String systemVersion;
       @Value("${swagger.scan-path}")
       String swaggerScanPath;
   
       @Bean
       public Docket createRestApi() {
           return new Docket(DocumentationType.SWAGGER_2)
                   .pathMapping("/")
                   .select()
                   .apis(RequestHandlerSelectors.basePackage(swaggerScanPath))
                   .paths(PathSelectors.any())
                   .build().apiInfo(apiInfo());
       }
   
       private ApiInfo apiInfo() {
           return new ApiInfoBuilder()
                   .title(systemName)
                   .description(systemName + "接口信息")
                   .version(systemVersion)
                   .contact(new Contact("DESTINY", "https://github.com/songyingjian2009", "songyingjian2009@163.com"))
   //                        .license("The Apache License")
   //                        .licenseUrl("http://www.baidu.com")
                   .build();
       }
   
   }
   ```
   
   *访问
   ````
   http://localhost:8080/test/swagger-ui.html
   ```