package com.test.ignite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IgniteExampleApplication {

  public static void main(String[] args) {
    // SpringApplication.run(IgniteExampleApplication.class, args);
    /**
     * 웹서버를 비활성화 하는 방법 - yml로 세팅도 가능
     * spring:
     *   main:
     *     web-application-type: none
     */
    SpringApplication app = new SpringApplication(IgniteExampleApplication.class);
    // 이 설정을 통해 내장 톰캣이나 서블릿 컨테이너가 실행되지 않고, 스프링 컨테이너만 초기화
    app.setWebApplicationType(WebApplicationType.NONE); // 웹 서버 비활성화
    app.run(args);
  }

}
