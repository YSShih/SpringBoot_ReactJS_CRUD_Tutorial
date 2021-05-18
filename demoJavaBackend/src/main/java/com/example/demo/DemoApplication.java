
              package com.example.demo;
              import org.springframework.boot.SpringApplication;
              import org.springframework.boot.autoconfigure.SpringBootApplication;
              import org.springframework.boot.builder.SpringApplicationBuilder;
			  import org.springframework.context.annotation.ComponentScan;    
              // Spring Boot 2.x
              import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;   
             
              @SpringBootApplication
              @ComponentScan(basePackages={"com.example.demo"})            
              public class DemoApplication extends SpringBootServletInitializer {
                
                  
                  public static void main(String[] args) {
                    SpringApplication.run(DemoApplication.class, args);                
                  }     
                  @Override
                  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
                      return application.sources(DemoApplication.class);
                  }
               
                  private static Class<DemoApplication> applicationClass = DemoApplication.class;
              
              
              
              }
            