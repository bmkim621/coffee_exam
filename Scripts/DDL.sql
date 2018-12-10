-- 내 스키마
DROP SCHEMA IF EXISTS `ncs_product`;

-- 내 스키마
CREATE SCHEMA `ncs_product`;

-- 제품
CREATE TABLE `ncs_product`.`product` (
	`code` CHAR(4)     NOT NULL COMMENT '제품코드', -- 제품코드
	`name` VARCHAR(20) NOT NULL COMMENT '제품명' -- 제품명
)
COMMENT '제품';

-- 제품
ALTER TABLE `ncs_product`.`product`
	ADD CONSTRAINT `PK_product` -- 제품 기본키
		PRIMARY KEY (
			`code` -- 제품코드
		);

-- 판매
CREATE TABLE `ncs_product`.`sale` (
	`no`           int(10) NOT NULL COMMENT '순서', -- 순서
	`code`         CHAR(4) NOT NULL COMMENT '제품코드', -- 제품코드
	`price`        int(11) NOT NULL COMMENT '제품단가', -- 제품단가
	`sale_cnt`     int(11) NOT NULL COMMENT '판매수량', -- 판매수량
	`supply_price` int(11) NOT NULL COMMENT '공급가액', -- 공급가액
	`add_tax`      int(11) NOT NULL COMMENT '부가세액', -- 부가세액
	`sale_price`   int(11) NOT NULL COMMENT '판매세액', -- 판매세액
	`margin_rate`  int(5)  NOT NULL COMMENT '마진율', -- 마진율
	`margin_price` int(11) NOT NULL COMMENT '마진액', -- 마진액
	`rank`         int(5)  NOT NULL COMMENT '순위' -- 순위
)
COMMENT '판매';

-- 판매
ALTER TABLE `ncs_product`.`sale`
	ADD CONSTRAINT `PK_sale` -- 판매 기본키
		PRIMARY KEY (
			`no` -- 순서
		);

-- 판매
ALTER TABLE `ncs_product`.`sale`
	ADD CONSTRAINT `FK_product_TO_sale` -- 제품 -> 판매
		FOREIGN KEY (
			`code` -- 제품코드
		)
		REFERENCES `ncs_product`.`product` ( -- 제품
			`code` -- 제품코드
		);