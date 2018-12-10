CREATE USER 'user_ncs_product'@'%';
ALTER USER 'user_ncs_product'@'%'
IDENTIFIED BY 'rootroot' ;
GRANT Alter ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Create ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Create view ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Delete ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Drop ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Grant option ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Index ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Insert ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT References ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Select ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Show view ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Trigger ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Update ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Alter routine ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Create routine ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Create temporary tables ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Execute ON ncs_product.* TO 'user_ncs_product'@'%';
GRANT Lock tables ON ncs_product.* TO 'user_ncs_product'@'%';
FLUSH PRIVILEGES;

CREATE USER 'user_ncs_product'@'localhost';
ALTER USER 'user_ncs_product'@'localhost'
IDENTIFIED BY 'rootroot' ;
GRANT Alter ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Create ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Create view ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Delete ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Drop ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Grant option ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Index ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Insert ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT References ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Select ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Show view ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Trigger ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Update ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Alter routine ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Create routine ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Create temporary tables ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Execute ON ncs_product.* TO 'user_ncs_product'@'localhost';
GRANT Lock tables ON ncs_product.* TO 'user_ncs_product'@'localhost';
FLUSH PRIVILEGES;