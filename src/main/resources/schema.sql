
CREATE TABLE public.address (
	idaddress int4 NOT NULL,
	address_line varchar(80) NULL,
	colony varchar(80) NULL,
	municipality varchar(80) NULL,
	zipcode varchar(30) NULL,
	state varchar(60) NULL
);


CREATE TABLE public.catalog_category (
	categoryid int4 NOT NULL,
	"name" varchar(200) NOT NULL,
	"version" varchar(50) NULL,
	description varchar(200) NULL
);


CREATE TABLE public.catalog_empleo (
	empleoid int4 NOT NULL,
	empleo2category int4 NULL,
	"name" varchar NOT NULL,
	description varchar NULL,
	"version" varchar NULL
);


CREATE TABLE public.catalog_skill (
	id int4 NOT NULL,
	skill2empleo int4 NULL,
	"name" varchar(200) NULL,
	description varchar(500) NULL,
	"version" varchar NULL
);


CREATE TABLE public.provider (
	id int4 NOT NULL,
	firstname varchar(200) NOT NULL,
	lastname varchar(200) NULL,
	age int4 NOT NULL,
	gender bpchar(1) NULL,
	profilepicture bpchar(200) NULL
);



CREATE TABLE public.skill_provider (
	skill_id int4 NOT NULL,
	provider_id int4 NOT NULL
);


CREATE TABLE public.user_account (
	user_id int4 NULL,
	first_name varchar(50) NULL,
	last_name varchar(50) NULL,
	middle_name varchar(50) NULL,
	user_type varchar NULL,
	phone_number varchar(15) NULL,
	country_code varchar(5) NULL,
	idaddress int4 NOT NULL
);