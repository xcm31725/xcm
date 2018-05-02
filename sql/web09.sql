/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.5.27 : Database - web09
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`web09` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `web09`;

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `pid` (`pid`),
  CONSTRAINT `city_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `province` (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;

/*Data for the table `city` */

insert  into `city`(`cid`,`cname`,`pid`) values (1,'西安市',1),(2,'渭南市',1),(3,'咸阳市',1),(4,'宝鸡市',1),(5,'铜川市',1),(6,'延安市',1),(7,'汉中市',1),(8,'榆林市',1),(9,'安康市',1),(10,'商洛市',1),(11,'兴平市',1),(12,'韩城市',1),(13,'华阴市',1),(14,'菏泽市',2),(15,'济南市',2),(16,'青岛市',2),(17,'淄博市',2),(18,'枣庄市',2),(19,'东营市',2),(20,'烟台市',2),(21,'潍坊市',2),(22,'济宁市',2),(23,'泰安市',2),(24,'威海市',2),(25,'日照市',2),(26,'滨州市',2),(27,'德州市',2),(28,'聊城市',2),(29,'临沂市',2),(30,'莱芜市',2),(31,'太原市',3),(32,'大同市',3),(33,'阳泉市',3),(34,'长治市',3),(35,'晋城市',3),(36,'朔州市',3),(37,'晋中市',3),(38,'运城市',3),(39,'临汾市',3),(40,'吕梁市',3),(41,'古交市',3),(42,'潞城市',3),(43,'高平市',3),(44,'介休市',3),(45,'永济市',3),(46,'河津市',3),(47,'原平市',3),(48,'郑州市',4),(49,'开封市',4),(50,'洛阳市',4),(51,'平顶山市',4),(52,'安阳市',4),(53,'鹤壁市',4),(54,'新乡市',4),(55,'三门峡市',4),(56,'南阳市',4),(57,'信阳市',4),(58,'商丘市',4),(59,'濮阳市',4),(60,'石家庄市',5),(61,'唐山市 ',5),(62,'晋州市',5),(63,'秦皇岛市 ',5),(64,'邯郸市',5),(65,'邢台市',5),(66,'南宫市',5),(67,'保定市',5),(68,'张家口市 ',5),(69,'承德市 ',5),(70,'沧州市',5),(71,'廊坊市',5),(72,'霸州市',5),(73,'昆明市',6),(74,'曲靖市',6),(75,'大理市',6),(76,'丽江市',6),(77,'玉溪市',6),(78,'普洱市',6),(79,'临沧市',6),(80,'西双版纳',6);

/*Table structure for table `province` */

DROP TABLE IF EXISTS `province`;

CREATE TABLE `province` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `province` */

insert  into `province`(`pid`,`pname`) values (1,'陕西省'),(2,'山东省'),(3,'山西省'),(4,'河南省'),(5,'河北省'),(6,'云南省');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nickname` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`nickname`,`type`) values (1,'aaa','111','小凤','user'),(2,'bbb','111','小森','user');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
