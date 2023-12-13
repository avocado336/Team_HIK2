DROP TABLE IF EXISITS users;

CREATE TABLE users(
	user_id varchar(10) PRIMARY KEY,
	email varchar(100) NOT NULL,
	password varchar(100) NOT NULL,
	created_at timestamp without time zone DEFAULT NOW()
);