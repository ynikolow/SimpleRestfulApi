 CREATE TABLE ARTICLE(
  ARTICLE_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  PUBLISHED_DATE DATE NOT NULL,	
  TITLE VARCHAR(250) NOT NULL,
  SHORT_DESCRIPTION VARCHAR(250) NOT NULL,
  ARTICLE_TEXT VARCHAR(250) NOT NULL
);


