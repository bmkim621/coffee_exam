-- 내 스키마
DROP SCHEMA IF EXISTS `ncs_product`;

-- 내 스키마
CREATE SCHEMA `ncs_product`;

create table product(
	code char(4) primary key,
	name varchar(20) not null
);

insert into product values
('A001', '아메리카노'), ('A002', '카푸치노'),
('A003', '헤이즐넛'), ('A004', '에스프레소'),
('B001', '딸기쉐이크'), ('B002', '후르츠와인'),
('B003', '팥빙수'), ('B004', '아이스초코');

select * from product;


create table sale(
	no int(11) auto_increment primary key,
	code char(4),
	price int(11) not null,
	saleCnt int(11) not null,
	marginRate int(11) not null,
	foreign key (code) references product(code)
);

insert into sale(code, price, saleCnt, marginRate) values
('A001', 4500, 150, 10),
('A002', 3800, 140, 15),
('B001', 5200, 250, 12),
('B002', 4300, 110, 11);

insert into sale(code, price, saleCnt, marginRate) values ('B001', 4500, 150, 10);
delete from sale;
truncate table sale;
select * from sale;

call product_ranking(true);