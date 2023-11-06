CREATE TABLE introduction(
	introduction_id integer PRIMARY KEY,
	user_id varchar(10) NOT NULL,
	name varchar(10) NOT NULL,
	kana varchar(20) NOT NULL,
	gender char,
	hobby varchar(60) NOT NULL,
	word varchar(300),
	created_at timestamp without time zone DEFAULT NOW(),
	updated_at timestamp wiothout time zone
);