# java-springboot-2025
Java 개발자 과정 SpringBoot 리포지터리

## 1일차(04-01)

### 웹 개요
- 구성 3단계
    - 브라우저(클라이언트/프론트엔드) : 사용자가 **요청**을 하고, 그 결과를 돌려받는 부분
    - 서버(백엔드) : DB에서 사용자 요청 데이터를 가져와 처리하고, 다시 사용자에게 응답하는 부분
    - 데이터베이스 : 가장 중요한 데이터가 저장되어있는 부분
- 웹 개념
    - Request(요청)에 대한 Response(응답)

### Spring Boot 개요
- Java : 컴퓨팅 세상 모든 곳에서 사용될 수 있는 언어가 되고자 개발됨
- Java 웹개발
    1. CGI(Common GateWay Interface) - HTTP 프로토콜에서 정적인 데이터만 전달할 수 있는 웹기술
    2. Servlet - CGI를 개선한 Java 웹기술. 동적웹을 개발할 수 있음
        - HTML 코드를 전부 다 Java에서 작성해야함
    3. EJB(Enterpriise Jaca Bean) - 서블릿으로 대형 프로젝트를 개발할 수 있는 Java 웹기술
        - 많이 복잡함
    4. JSP(Java Server Page) - 자바코드와 웹페이지코드를 분리하여 개발할 수 있는 Java 웹기술
        - 확장자가 JSP / 스파게티 코드
    5. Spring - Java 웹개발 전성기. 웹페이지와 자바영역 분리
        - 설정이 복잡
    6. Spring Boot - Spring의 단점을 최소화. 설정을 간결화

- Spring Boot
    - https://spring.io/projects/spring-boot
    - Spring 기술을 그대로 사용(마이그레이션이 간단)
    - JPA 기술을 사용하면 ERD나 DB설계를 하지않고도 손쉽게 DB를 생성할 수 있음
    - Tomcat Webserver가 내장(설치 필요없음)
    - 서포트하는 기능 다수 존재(개발을 쉽게 도와줌)
    - 테스트용 JUnit, 로그용 log4J2 모두 포함(설치 필요없음)
    - 프론트엔드를 다양하게 지원. JSP, **Thymeleaf**, Mustache 등
    - React, View.js 등의 자바스크립트 프론트엔드와 연계해서 풀스택 개발가능
    - MVC(Model View Controller)로 영역을 분리, 각 부분별로 따로 개발

- MVC
    - View는 JSP포함, Thymeleef, Mustach, HTML 등등

    <img src="/image/sb001.png" width="700">

### Spring Boot 개발환경 설정
- 필수요소
    - Java, 개발툴, 데이터베이스
- Java
    > 설치 이전에 윈도우 + R > sysdm.cpl > 고급 > 환경변수에 자바 관련 다 지워주기 (충돌방지)
    >
    - Java Runtime과 JDK(Java Developer Kit) 존재
        - Oracle 외에도 OpenJDK가 산재
        - https://www.azul.com/downloads/?package=jdk#zulu
        - https://adoptium.net/
        - https://jdk.java.net/
    - Java 17버전 이상 설치
    - https://www.oracle.com/kr/java/technologies/downloads/archive/
        - Java archive > Java SE > Java SE 17(17.0.13) > Window x64 MSI Installer 설치
        - 경로 : C:\Dev\Lang\Java\jdk-17\
    - 시스템 정보(sysdm.cpl)에서 PATH 설정 (환경변수 설정창)
        - 시스템변수 > 새로만들기
            - JAVA_HOME
        - 시스템변수 > path > 새로만들기
            - %JAVA_HOME%\bin 생성 후 제일 위로 올려주기
    - powershell
        - java --version

- Visual Studio Code 확장 설치
    - Java 검색
        - Extension Pack for Java 설치. Debugger for Java등 총 7가지 확장 설치

### Java 기본 실행
- VS Code에서 명령팔레트 실행(Ctrl + Shift + p)
    - Java create > Maven > Arch..어쩌고 > com.이니셜 후 엔터 > demo는 hello로 수정하고 엔터
        1. build tool > Maven
        2. No ArchType 선택
        3. Group ID 입력 (com.example)
        4. Artifact ID 입력 (demo)
        5. 저장위치 결정

### Spring Boot 설정
- Visual Studio Code 확장 설치
    - Spring 검색
        - Spring Boot Extension Pack 설치(추가 3개 확장 같이 설치됨)
    - Gradle(빌드툴) 검색
        - Gradle for Java 설치

### Spring Boot 기본 실행(Java 프로젝트)
- VS Code에서 명령팔레트 실행
    - Spring Initializr : Create a Maven Project
    - Specify Spring Boot version : 3.3.10 선택
    - Specify project language : Java
    - Input Group ID : 본인 아이디 입력 (jm1109)
    - Input Artifact ID : spring01
    - Specify packaging type : Jar(Java archive, 압축파일)
    - Specify Java version : 17
    - Choose dependencied : Selected 0 dependencies
    - 저장위치 선택 (day01)
    - **새 창 열기** - Spring Boot 프로젝트가 루트폴더가 된 개발환경

- 실행방법
    - 코드 작성
    - Spring Boot Dashboard > Apps > 앱 실행

- 기초문법
    - [Java 기초문법](./JAVA_BASIC.md)

## 2일차

## 3일차

## 4일차

## 5일차

## 6일차(06-26)