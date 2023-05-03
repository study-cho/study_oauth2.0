### [인프런] 스프링부트 시큐리티 & JWT 강의 _ 연습하기

---
#### 환경설정
SpringBoot : 3.0.6  
JDK : 17

Dependencies : 

- Spring Web
- Spring Security
- Spring Data JPA
- Spring Boot DevTools
- Thymeleaf
- MariaDB Driver
- OAuth2 Client
- Lombok

#### DB 및 사용자 생성
```sql
create user 'cos'@'%' identified by 'cos1234';
GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
create database security;
use security;
```