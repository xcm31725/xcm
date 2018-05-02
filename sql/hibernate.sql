/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.5.27 : Database - hibernatetest
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hibernatetest` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hibernatetest`;

/*Table structure for table `s_t` */

DROP TABLE IF EXISTS `s_t`;

CREATE TABLE `s_t` (
  `sid` int(11) NOT NULL,
  `tid` int(11) NOT NULL,
  PRIMARY KEY (`sid`,`tid`),
  KEY `FKgf4v7u65qa3qfpogp3qa4iytf` (`tid`),
  CONSTRAINT `FKgf4v7u65qa3qfpogp3qa4iytf` FOREIGN KEY (`tid`) REFERENCES `t_teacher` (`id`),
  CONSTRAINT `FKirrvew7njqo9ges56o6h56opa` FOREIGN KEY (`sid`) REFERENCES `t_student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_t` */

/*Table structure for table `t_book` */

DROP TABLE IF EXISTS `t_book`;

CREATE TABLE `t_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_book` */

insert  into `t_book`(`id`,`name`,`price`,`time`) values (1,'java基础',39.9,'2018-04-14 20:54:35'),(2,'java基础',39.9,'2018-04-14 21:18:32');

/*Table structure for table `t_customer` */

DROP TABLE IF EXISTS `t_customer`;

CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `t_customer` */

insert  into `t_customer`(`id`,`NAME`,`address`) values (1,'XCM','渭南'),(2,'XGD','西安'),(3,'ZC','咸阳'),(4,'ZD','上海');

/*Table structure for table `t_emp` */

DROP TABLE IF EXISTS `t_emp`;

CREATE TABLE `t_emp` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_emp` */

insert  into `t_emp`(`id`,`name`) values ('4028979962c7e2ff0162c7e304990001','XCM');

/*Table structure for table `t_husband` */

DROP TABLE IF EXISTS `t_husband`;

CREATE TABLE `t_husband` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_husband` */

insert  into `t_husband`(`id`,`name`) values (2,'XGD');

/*Table structure for table `t_idcard` */

DROP TABLE IF EXISTS `t_idcard`;

CREATE TABLE `t_idcard` (
  `id` varchar(255) NOT NULL,
  `cardNum` varchar(255) DEFAULT NULL,
  `eid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKneiryo2pk4q6ko8mhgscccpkk` (`eid`),
  CONSTRAINT `FKneiryo2pk4q6ko8mhgscccpkk` FOREIGN KEY (`eid`) REFERENCES `t_emp` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_idcard` */

insert  into `t_idcard`(`id`,`cardNum`,`eid`) values ('4028979962c7e2ff0162c7e3048b0000','12313431231','4028979962c7e2ff0162c7e304990001');

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkymvvaj9rps3st3bkniqi0oci` (`uid`),
  CONSTRAINT `FKkymvvaj9rps3st3bkniqi0oci` FOREIGN KEY (`uid`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `t_order` */

insert  into `t_order`(`id`,`address`,`price`,`uid`) values (1,'陕西',2100,1),(2,'陕西',2200,1),(3,'陕西',2300,1),(4,'陕西',2400,1),(5,'陕西',2500,1),(6,'陕西',2600,1),(7,'陕西',2700,1),(8,'陕西',2800,1),(9,'陕西',2900,1),(10,'陕西',3000,1),(11,'上海',2100,2),(12,'上海',2200,2),(13,'上海',2300,2),(14,'上海',2400,2),(15,'上海',2500,2),(16,'上海',2600,2),(17,'上海',2700,2),(18,'上海',2800,2),(19,'上海',2900,2),(20,'上海',3000,2);

/*Table structure for table `t_per` */

DROP TABLE IF EXISTS `t_per`;

CREATE TABLE `t_per` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_per` */

insert  into `t_per`(`id`,`name`) values ('402897ae62c454880162c4548b300000','XCM');

/*Table structure for table `t_person` */

DROP TABLE IF EXISTS `t_person`;

CREATE TABLE `t_person` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_person` */

insert  into `t_person`(`id`,`name`) values ('402897ae62c451f20162c451f5ac0000','XCM'),('402897ae62c454290162c4542cb90000','XCM');

/*Table structure for table `t_preson` */

DROP TABLE IF EXISTS `t_preson`;

CREATE TABLE `t_preson` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_preson` */

/*Table structure for table `t_student` */

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_student` */

/*Table structure for table `t_teacher` */

DROP TABLE IF EXISTS `t_teacher`;

CREATE TABLE `t_teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_teacher` */

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`name`) values (1,'CZM'),(2,'CC'),(3,'XXX');

/*Table structure for table `t_wife` */

DROP TABLE IF EXISTS `t_wife`;

CREATE TABLE `t_wife` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_wife` */

insert  into `t_wife`(`id`,`name`) values (2,'XCM');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
