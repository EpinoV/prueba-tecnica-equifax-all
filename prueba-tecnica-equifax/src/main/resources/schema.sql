drop table if exists TOKEN;
drop table if exists USERS;
drop table if exists DATA;
create table USERS(
  USER_ID int not null AUTO_INCREMENT,
  NAME varchar(100) not null,
  EMAIL varchar(250),
  PASSWORD varchar(100),
  ROLE VARCHAR (100),
  CREATED DATE,
  MODIFIED DATE,
  LAST_LOGIN DATE,
  TOKEN VARCHAR(200),
  ISACTIVE BOOLEAN,
PRIMARY KEY ( USER_ID )
);

create table TOKEN(
  TOKEN_ID int not null AUTO_INCREMENT,
  USER_ID int not null,
  TOKEN varchar (200) not null,
  TOKEN_TYPE varchar (50) not null,
  REVOKED boolean,
  EXPIRED boolean,
  PRIMARY KEY ( TOKEN_ID ),
  FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID)
);

create table DATA(
  DATA_ID int not null AUTO_INCREMENT,
  NOMBRE varchar(100) not null,
  RUT varchar(12) NOT NULL,
  CELULAR varchar(100),
  EMAIL VARCHAR (100),
PRIMARY KEY ( DATA_ID )
);

