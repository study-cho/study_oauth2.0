###  프로젝트 진행 중 발생한 오류 및 해결

---

- 데이터베이스에 INSERT 작업 중 발생   
incorrect string value: '\xE3\x84\xB4\xE3\x85\x87...' for column
=> 한글 깨짐
  - 방법   
    ```sql   
    -- 기존에 생성한 데이터베이스 캐릭터셋 UTF8로 변경
    -- ALTER DATABASE 데이터베이스명 DEFAULT CHARACTER SET UTF8;
    ALTER DATABASE test DEFAULT CHARACTER SET UTF8;

    -- 기존에 생성한 테이블 캐릭터셋 UTF8로 변경
    -- ALTER TABLE 테이블명 CONVERT TO CHARACTER SET UTF8;
    ALTER TABLE test_table CONVERT TO CHARACTER SET UTF8;
    ``` 

---
