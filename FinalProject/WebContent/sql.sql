create table customers (
	userUid number primary key,
	userId varchar2(40), 
	userPw varchar2(40), 
	userName varchar2(40), 
	userTel varchar2(40) 
)
create table board (
	boardUid number primary key,
	title varchar2(40) ,
	b_date date ,
	content clob,
	b_count number,
	b_like number,
	userUid number,
	
	constraint fk_customer_board foreign key(userUid)
	references customers(userUid) on delete cascade
)
create table comm (
	boardUid number primary key,
	c_date date not null,
	content varchar2(100),
	userUid number,
	
	constraint fk_customer_comm foreign key(userUid)
	references customers(userUid) on delete cascade
)
create table gallery (
	galleryUid number primary key,
	title varchar2(40) not null,
	g_date date,
	imgName varchar2(50) not null,
	g_count number,
	g_like number,
	userUid number,
	
	constraint fk_customer_gallery foreign key(userUid)
	references customers(userUid) on delete cascade

)

create sequence cusNum start with 1 increment by 1;
create sequence boardNum start with 1 increment by 1;
create sequence commNum start with 1 increment by 1;
create sequence galNum start with 1 increment by 1;
