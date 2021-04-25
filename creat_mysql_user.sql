CREATE USER 'homestead'@'localhost' IDENTIFIED BY 'secret';
CREATE USER 'homestead'@'%' IDENTIFIED BY 'secret';

GRANT ALL ON *.* TO 'homestead'@'localhost';
GRANT ALL ON *.* TO 'homestead'@'%';
flush privileges;