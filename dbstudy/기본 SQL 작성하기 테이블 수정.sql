-- 테이블 수정
-- 회원 테이블 : MEMBERS

/*
    1. 회원 번호 : NO, NUMBER, 기본키
    2. 회원 아이디 : ID, VARCHAR2(30), 필수, 중복 불가
    3. 회원패스워드 : PW, VARCHAR2(30), 필수
    4. 회원포인트 : POINT, NUMBER, 기본값(디폴트) 1000
    5. 회원등급 : GRADE, VARCHAR2(10), 'VIP', 'GOLD', 'SILVER', 'BRONZE' 중 하나
    6. 회원이메일 : EMAIL, VARCHAR2(100), 중복 불가
*/

CREATE TABLE MEMBERS(
    NO NUMBER PRIMARY KEY,
    ID VARCHAR2(30) NOT NULL UNIQUE,
    PW VARCHAR2(30) NOT NULL,
    POINT NUMBER DEFAULT 1000,
    GRADE VARCHAR2(10) CHECK(GRADE = 'VIP' OR GRADE = 'GOLD' OR GRADE = 'SILVER' OR GRADE = 'BRONZE'),
                    -- CHECK(GRADE IN('VIP', 'GOLD', 'SILVER', 'BRONZE'))
    EMAIL VARCHAR2(100) UNIQUE
);

DESC MEMBERS;

-- 1. 새로운 칼럼 추가
ALTER TABLE MEMBERS ADD ADDRESS VARCHAR2(200);
ALTER TABLE MEMBERS ADD REGDATE DATE;

-- 2. 기존 칼럼 삭제
ALTER TABLE MEMBERS DROP COLUMN ADDRESS;

-- 3. 기존 칼럼 타입 수정
ALTER TABLE MEMBERS MODIFY GRADE VARCHAR2(20);

-- 4. 기존 칼럼 이름 수정
ALTER TABLE MEMBERS RENAME COLUMN PW TO PWD;


