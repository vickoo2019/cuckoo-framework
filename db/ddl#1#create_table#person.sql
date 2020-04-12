drop table if exists person;
create table person
(
	id int not null,
	name varchar(32) null,
	age int null,
	sex varchar(1) null comment 'M:male F:female U:unknow',
	created_date timestamp null,
	created_by varchar(32) null,
	updated_date timestamp null,
	updated_by varchar(32) null,
	constraint person_pk
		primary key (id)
);