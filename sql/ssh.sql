/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.5.27 : Database - ssh
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssh` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssh`;

/*Table structure for table `dep` */

DROP TABLE IF EXISTS `dep`;

CREATE TABLE `dep` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `tele` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=123213128 DEFAULT CHARSET=utf8;

/*Data for the table `dep` */

insert  into `dep`(`uuid`,`name`,`tele`) values (1,'XCM','123123'),(2,'XXX','2313232'),(3,'XGD','543341213'),(21312,'XXX','2313232'),(123213123,'XCM','12312313'),(123213124,'asda','12e124'),(123213125,'asdasda','2342342'),(123213126,'asdasd','12311312qw'),(123213127,'sdf','2134');

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`name`,`age`) values (1,'XCM',18),(2,'XGD',23),(4,'GD',22),(5,'sad',23),(6,'sssa',111),(7,'aaa',111),(8,'sssaa',1111),(9,'xzc',14);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
