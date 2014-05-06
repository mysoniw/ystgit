# MySQL-Front 5.1  (Build 1.5)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: 127.0.0.1    Database: jpetstore
# ------------------------------------------------------
# Server version 5.0.67-community-nt

DROP DATABASE IF EXISTS `jpetstore`;
CREATE DATABASE `jpetstore` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `jpetstore`;

#
# Source for table account
#

CREATE TABLE `account` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(80) character set utf8 NOT NULL default '',
  `password` varchar(60) default NULL,
  `email` varchar(80) NOT NULL,
  `xm` varchar(80) NOT NULL,
  `status` varchar(2) default NULL,
  `address` varchar(40) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1 COMMENT='InnoDB free: 7168 kB';

#
# Dumping data for table account
#
LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;

INSERT INTO `account` VALUES (1,'kkokok','122','2121','212121',NULL,'2121');
INSERT INTO `account` VALUES (2,'weikun','119','wk2003119@163.com','weikun','OK','');
INSERT INTO `account` VALUES (3,'wen','111','2121','122121',NULL,'221');
INSERT INTO `account` VALUES (4,'4343','4343','4343','4343',NULL,'4343');
INSERT INTO `account` VALUES (5,'3434343','4545','4343','4343',NULL,'4343');
INSERT INTO `account` VALUES (6,'32','12','4545','434343',NULL,'4545');
INSERT INTO `account` VALUES (7,'4444','123','2121','2121',NULL,'212121');
INSERT INTO `account` VALUES (8,'34343','4343','4343','43',NULL,'434343');
INSERT INTO `account` VALUES (9,'2332','123','32','32',NULL,'32');
INSERT INTO `account` VALUES (10,'9999','111','4343','4343',NULL,'3434343');
INSERT INTO `account` VALUES (11,'32323232','111','4343','434343',NULL,'434343');
INSERT INTO `account` VALUES (12,'323232443','12','4545','454545',NULL,'4545');
INSERT INTO `account` VALUES (13,'6666','12','454545','454545',NULL,'454545');
INSERT INTO `account` VALUES (14,'344343','12','4343','434343',NULL,'4343');
INSERT INTO `account` VALUES (15,'323243','12','4545','454545',NULL,'4545');
INSERT INTO `account` VALUES (16,'344343','12','2121','122121',NULL,'2121');
INSERT INTO `account` VALUES (17,'weikun111','111','122121','111',NULL,'212121');
INSERT INTO `account` VALUES (18,'454545','123','12121','323432',NULL,'212121');
INSERT INTO `account` VALUES (19,'yyyy','111','wk2003119@163.com','dsds','OK','dsdsds');
INSERT INTO `account` VALUES (20,'yyyyy','119','dsfds','ddd',NULL,'sdfds');
INSERT INTO `account` VALUES (21,'323232','111','4343','r34343',NULL,'4343');
INSERT INTO `account` VALUES (22,'rerere','111','4343','32434',NULL,'434343');
INSERT INTO `account` VALUES (23,'434345','111','3443','213232',NULL,'4343');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table banner
#

CREATE TABLE `banner` (
  `favcategory` varchar(80) NOT NULL,
  `bannername` varchar(255) default NULL,
  PRIMARY KEY  (`favcategory`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='InnoDB free: 6144 kB';

#
# Dumping data for table banner
#
LOCK TABLES `banner` WRITE;
/*!40000 ALTER TABLE `banner` DISABLE KEYS */;

INSERT INTO `banner` VALUES ('BIRDS','<image src=\"../images/banner_birds.gif\">');
INSERT INTO `banner` VALUES ('CATS','<image src=\"../images/banner_cats.gif\">');
INSERT INTO `banner` VALUES ('DOGS','<image src=\"../images/banner_dogs.gif\">');
INSERT INTO `banner` VALUES ('FISH','<image src=\"../images/banner_fish.gif\">');
INSERT INTO `banner` VALUES ('REPTILES','<image src=\"../images/banner_reptiles.gif\">');
/*!40000 ALTER TABLE `banner` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table cart
#

CREATE TABLE `cart` (
  `orderid` int(11) NOT NULL default '0',
  `linenum` int(11) NOT NULL,
  `itemid` varchar(10) NOT NULL,
  `quantity` int(11) NOT NULL,
  `unitprice` decimal(10,2) default NULL,
  PRIMARY KEY  (`orderid`,`linenum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table cart
#
LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;

INSERT INTO `cart` VALUES (1017,0,'EST_4',7,18.5);
INSERT INTO `cart` VALUES (1017,1,'EST_5',8,18.5);
INSERT INTO `cart` VALUES (1017,2,'EST_21',9,5.29);
INSERT INTO `cart` VALUES (1018,0,'EST_4',2,18.5);
INSERT INTO `cart` VALUES (1018,1,'EST_21',1,5.29);
INSERT INTO `cart` VALUES (1018,2,'EST_20',6,5.5);
INSERT INTO `cart` VALUES (1018,3,'EST_5',3,18.5);
INSERT INTO `cart` VALUES (1018,4,'EST_2',1,16.5);
INSERT INTO `cart` VALUES (1018,5,'EST_3',1,18.5);
INSERT INTO `cart` VALUES (1019,0,'EST_3',3,18.5);
INSERT INTO `cart` VALUES (1020,1,'EST_4',1,0);
INSERT INTO `cart` VALUES (1020,2,'EST_5',1,0);
INSERT INTO `cart` VALUES (1020,3,'EST_21',1,0);
INSERT INTO `cart` VALUES (1021,1,'EST_4',1,0);
INSERT INTO `cart` VALUES (1022,0,'EST_4',13,0);
INSERT INTO `cart` VALUES (1022,2,'EST_5',4,0);
INSERT INTO `cart` VALUES (1022,3,'EST_21',3,0);
INSERT INTO `cart` VALUES (1023,1,'EST_4',1,12);
INSERT INTO `cart` VALUES (1023,2,'EST_5',1,12);
INSERT INTO `cart` VALUES (1024,20,'EST_20',1,2);
INSERT INTO `cart` VALUES (1024,21,'EST_4',5,12);
INSERT INTO `cart` VALUES (1024,22,'EST_5',6,12);
INSERT INTO `cart` VALUES (1024,23,'EST_1',4,10);
INSERT INTO `cart` VALUES (1024,24,'EST_21',2,NULL);
INSERT INTO `cart` VALUES (1025,1,'EST_5',1,NULL);
INSERT INTO `cart` VALUES (1026,1,'EST_21',3,NULL);
INSERT INTO `cart` VALUES (1026,2,'EST_20',2,NULL);
INSERT INTO `cart` VALUES (1027,1,'EST_3',1,NULL);
INSERT INTO `cart` VALUES (1027,2,'EST_5',1,NULL);
INSERT INTO `cart` VALUES (1027,3,'EST_21',1,NULL);
INSERT INTO `cart` VALUES (1028,1,'EST_4',2,NULL);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table category
#

CREATE TABLE `category` (
  `catid` varchar(10) NOT NULL,
  `name` varchar(80) default NULL,
  `descn` varchar(255) default NULL,
  PRIMARY KEY  (`catid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table category
#
LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;

INSERT INTO `category` VALUES ('BIRDS','Birds','<image src=\"../images/birds_icon.gif\"><font size=\"5\" color=\"blue\"> Birds</font>');
INSERT INTO `category` VALUES ('CATS','Cats','<image src=\"../images/cats_icon.gif\"><font size=\"5\" color=\"blue\"> Cats</font>');
INSERT INTO `category` VALUES ('DOGS','Dogs','<image src=\"../images/dogs_icon.gif\"><font size=\"5\" color=\"blue\"> Dogs</font>');
INSERT INTO `category` VALUES ('FISH','Fish','<image src=\"../images/fish_icon.gif\"><font size=\"5\" color=\"blue\"> Fish</font>');
INSERT INTO `category` VALUES ('REPTILES','Reptiles','<image src=\"../images/reptiles_icon.gif\"><font size=\"5\" color=\"blue\"> Reptiles</font>');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table inventory
#

CREATE TABLE `inventory` (
  `itemid` varchar(10) NOT NULL,
  `qty` int(11) NOT NULL,
  PRIMARY KEY  (`itemid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table inventory
#
LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;

INSERT INTO `inventory` VALUES ('EST_1',10000);
INSERT INTO `inventory` VALUES ('EST_10',10000);
INSERT INTO `inventory` VALUES ('EST_11',10000);
INSERT INTO `inventory` VALUES ('EST_12',10000);
INSERT INTO `inventory` VALUES ('EST_13',10000);
INSERT INTO `inventory` VALUES ('EST_14',10000);
INSERT INTO `inventory` VALUES ('EST_15',10000);
INSERT INTO `inventory` VALUES ('EST_16',10000);
INSERT INTO `inventory` VALUES ('EST_17',10000);
INSERT INTO `inventory` VALUES ('EST_18',10000);
INSERT INTO `inventory` VALUES ('EST_19',10000);
INSERT INTO `inventory` VALUES ('EST_2',10000);
INSERT INTO `inventory` VALUES ('EST_20',10000);
INSERT INTO `inventory` VALUES ('EST_21',10000);
INSERT INTO `inventory` VALUES ('EST_22',10000);
INSERT INTO `inventory` VALUES ('EST_23',10000);
INSERT INTO `inventory` VALUES ('EST_24',10000);
INSERT INTO `inventory` VALUES ('EST_25',10000);
INSERT INTO `inventory` VALUES ('EST_26',10000);
INSERT INTO `inventory` VALUES ('EST_27',10000);
INSERT INTO `inventory` VALUES ('EST_28',10000);
INSERT INTO `inventory` VALUES ('EST_3',10000);
INSERT INTO `inventory` VALUES ('EST_4',10000);
INSERT INTO `inventory` VALUES ('EST_5',10000);
INSERT INTO `inventory` VALUES ('EST_6',10000);
INSERT INTO `inventory` VALUES ('EST_7',10000);
INSERT INTO `inventory` VALUES ('EST_8',10000);
INSERT INTO `inventory` VALUES ('EST_9',10000);
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table item
#

CREATE TABLE `item` (
  `itemid` varchar(10) NOT NULL,
  `productid` varchar(10) NOT NULL,
  `listprice` decimal(10,2) default NULL,
  `unitcost` decimal(10,2) default NULL,
  `supplier` int(11) default NULL,
  `status` varchar(2) default NULL,
  `attr1` varchar(80) default NULL,
  `attr2` varchar(80) default NULL,
  `attr3` varchar(80) default NULL,
  `attr4` varchar(80) default NULL,
  `attr5` varchar(80) default NULL,
  PRIMARY KEY  (`itemid`),
  KEY `fk_item_2` (`supplier`),
  KEY `itemProd` (`productid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table item
#
LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;

INSERT INTO `item` VALUES ('EST_1','FI-SW-01',16.5,10,1,'P','Large',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_10','K9-DL-01',18.5,12,1,'P','Spotted Adult Female',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_11','RP-SN-01',18.5,12,1,'P','Venomless',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_12','RP-SN-01',18.5,12,1,'P','Rattleless',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_13','RP-LI-02',18.5,12,1,'P','Green Adult',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_14','FL-DSH-01',58.5,12,1,'P','Tailless',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_15','FL-DSH-01',23.5,12,1,'P','With tail',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_16','FL-DLH-02',93.5,12,1,'P','Adult Female',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_17','FL-DLH-02',93.5,12,1,'P','Adult Male',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_18','AV-CB-01',193.5,92,1,'P','Adult Male',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_19','AV-SB-02',15.5,2,1,'P','Adult Male',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_2','FI-SW-01',16.5,10,1,'P','Small',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_20','FI-FW-02',5.5,2,1,'P','Adult Male',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_21','FI-FW-02',5.29,1,1,'P','Adult Female',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_22','K9-RT-02',135.5,100,1,'P','Adult Male',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_23','K9-RT-02',145.49,100,1,'P','Adult Female',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_24','K9-RT-02',255.5,92,1,'P','Adult Male',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_25','K9-RT-02',325.29,90,1,'P','Adult Female',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_26','K9-CW-01',125.5,92,1,'P','Adult Male',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_27','K9-CW-01',155.29,90,1,'P','Adult Female',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_28','K9-RT-01',155.29,90,1,'P','Adult Female',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_3','FI-SW-02',18.5,12,1,'P','Toothless',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_4','FI-FW-01',18.5,12,1,'P','Spotted',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_5','FI-FW-01',18.5,12,1,'P','Spotless',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_6','K9-BD-01',18.5,12,1,'P','Male Adult',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_7','K9-BD-01',18.5,12,1,'P','Female Puppy',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_8','K9-PO-02',18.5,12,1,'P','Male Puppy',NULL,NULL,NULL,NULL);
INSERT INTO `item` VALUES ('EST_9','K9-DL-01',18.5,12,1,'P','Spotless Male Puppy',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table lineitem
#

CREATE TABLE `lineitem` (
  `id` int(11) NOT NULL auto_increment,
  `orderid` int(11) NOT NULL,
  `itemid` varchar(10) NOT NULL,
  `quantity` int(11) NOT NULL,
  `unitprice` decimal(10,2) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

#
# Dumping data for table lineitem
#
LOCK TABLES `lineitem` WRITE;
/*!40000 ALTER TABLE `lineitem` DISABLE KEYS */;

INSERT INTO `lineitem` VALUES (1,1001,'EST_13',1,18.5);
INSERT INTO `lineitem` VALUES (2,1002,'EST_3',3,55.5);
INSERT INTO `lineitem` VALUES (3,1002,'EST_15',1,23.5);
INSERT INTO `lineitem` VALUES (4,1003,'EST_3',3,55.5);
INSERT INTO `lineitem` VALUES (5,1003,'EST_15',1,23.5);
INSERT INTO `lineitem` VALUES (6,1004,'EST_19',1,15.5);
INSERT INTO `lineitem` VALUES (7,1004,'EST_15',2,47);
INSERT INTO `lineitem` VALUES (8,1005,'EST_11',1,18.5);
INSERT INTO `lineitem` VALUES (9,1005,'EST_28',2,310.58);
INSERT INTO `lineitem` VALUES (10,1006,'EST_11',1,18.5);
INSERT INTO `lineitem` VALUES (11,1006,'EST_28',2,310.58);
INSERT INTO `lineitem` VALUES (12,1006,'EST_19',1,15.5);
INSERT INTO `lineitem` VALUES (13,1007,'EST_11',1,18.5);
INSERT INTO `lineitem` VALUES (14,1007,'EST_28',2,310.58);
INSERT INTO `lineitem` VALUES (15,1007,'EST_19',1,15.5);
INSERT INTO `lineitem` VALUES (16,1008,'EST_11',1,18.5);
INSERT INTO `lineitem` VALUES (17,1008,'EST_28',2,310.58);
INSERT INTO `lineitem` VALUES (18,1008,'EST_19',1,15.5);
INSERT INTO `lineitem` VALUES (19,1009,'EST_19',1,15.5);
INSERT INTO `lineitem` VALUES (20,1010,'EST_12',1,18.5);
INSERT INTO `lineitem` VALUES (21,1011,'EST_12',1,18.5);
INSERT INTO `lineitem` VALUES (22,1012,'EST_15',1,23.5);
INSERT INTO `lineitem` VALUES (23,1013,'EST_19',1,15.5);
INSERT INTO `lineitem` VALUES (24,1014,'EST_4',2,37);
INSERT INTO `lineitem` VALUES (25,1014,'EST_9',1,18.5);
INSERT INTO `lineitem` VALUES (26,1014,'EST_3',1,18.5);
INSERT INTO `lineitem` VALUES (27,1016,'EST_8',4,74);
INSERT INTO `lineitem` VALUES (28,1016,'EST_12',2,37);
INSERT INTO `lineitem` VALUES (29,1016,'EST_28',1,155.29);
INSERT INTO `lineitem` VALUES (30,1028,'EST_4',2,37);
INSERT INTO `lineitem` VALUES (31,1028,'EST_3',1,18.5);
INSERT INTO `lineitem` VALUES (32,1029,'EST_4',2,37);
INSERT INTO `lineitem` VALUES (33,1029,'EST_12',4,74);
/*!40000 ALTER TABLE `lineitem` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table orders
#

CREATE TABLE `orders` (
  `orderid` int(11) NOT NULL default '0' COMMENT '订单序号',
  `orderdate` date NOT NULL default '0000-00-00' COMMENT '订单日期',
  `userid` varchar(80) character set utf8 NOT NULL default '' COMMENT '用户id',
  `shipaddr` varchar(80) character set utf8 NOT NULL default '' COMMENT '用户地址',
  `shipcity` varchar(80) character set utf8 NOT NULL default '' COMMENT '用户所在城市',
  `shipname` varchar(80) character set utf8 NOT NULL default '' COMMENT '购买用户名',
  `cardno` varchar(80) NOT NULL default '' COMMENT '卡号',
  `cardtype` varchar(80) character set utf8 NOT NULL default '' COMMENT '卡类型',
  `totalprice` decimal(10,2) default NULL COMMENT '总价格',
  PRIMARY KEY  (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table orders
#
LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;

INSERT INTO `orders` VALUES (1001,'2010-08-29','weikun','的','俄','45454545','999 9999 9999 9999','Visa',0);
INSERT INTO `orders` VALUES (1002,'2010-08-29','weikun','32332','2323232','我','999 9999 9999 9999','Visa',0);
INSERT INTO `orders` VALUES (1003,'2010-08-29','weikun','是','是','我','999 9999 9999 9999','Visa',0);
INSERT INTO `orders` VALUES (1004,'2010-08-29','weikun','是','是','我','999 9999 9999 9999','Visa',0);
INSERT INTO `orders` VALUES (1005,'2010-08-29','weikun','东方饭店','反对反对反对','热热热','999 9999 9999 9999','工行牡丹卡',62.5);
INSERT INTO `orders` VALUES (1006,'2010-08-29','weikun','22','233232','发达省份的所得税','999 9999 9999 9999','Visa',329.08);
INSERT INTO `orders` VALUES (1007,'2010-08-29','weikun','434343','434343','广泛','999 9999 9999 9999','Visa',344.58);
INSERT INTO `orders` VALUES (1008,'2010-08-29','weikun','434343','434343','广泛','999 9999 9999 9999','Visa',344.58);
INSERT INTO `orders` VALUES (1009,'2010-08-29','weikun','434343','434343','广泛','999 9999 9999 9999','Visa',344.58);
INSERT INTO `orders` VALUES (1010,'2010-08-29','weikun','额外额外','我饿饿我','额额我饿我','999 9999 9999 9999','Visa',15.5);
INSERT INTO `orders` VALUES (1011,'2010-08-29','weikun','rere','rere','errere','999 9999 9999 9999','Visa',18.5);
INSERT INTO `orders` VALUES (1012,'2010-08-29','weikun','rerere','rere','rrere','999 9999 9999 9999','工行牡丹卡',18.5);
INSERT INTO `orders` VALUES (1013,'2010-08-29','weikun','gfgf','gfgf','gfgfgf','999 9999 9999 9999','建行龙卡',23.5);
INSERT INTO `orders` VALUES (1014,'2010-08-29','weikun','3232','3232','3232','999 9999 9999 9999','建行龙卡',15.5);
INSERT INTO `orders` VALUES (1016,'2011-05-29','weikun','123213','123213','212121','999 9999 9999 9999','Visa',74);
INSERT INTO `orders` VALUES (1017,'2011-08-01','weikun','323','3','2','999 9999 9999 9999','Visa',266.29);
INSERT INTO `orders` VALUES (1018,'2011-08-04','','','','','','',165.79);
INSERT INTO `orders` VALUES (1019,'2011-08-04','','','','','','',55.5);
INSERT INTO `orders` VALUES (1020,'2011-05-29','','','','','','',NULL);
INSERT INTO `orders` VALUES (1022,'2011-08-04','','','','','','',NULL);
INSERT INTO `orders` VALUES (1023,'2011-05-29','','','','','','',333);
INSERT INTO `orders` VALUES (1024,'2012-03-12','','','','','','',0);
INSERT INTO `orders` VALUES (1025,'2012-03-12','','','','','','',0);
INSERT INTO `orders` VALUES (1026,'2012-03-12','','','','','','',0);
INSERT INTO `orders` VALUES (1027,'2012-03-12','','','','','','',42.29);
INSERT INTO `orders` VALUES (1028,'2012-03-12','','','','','','',37);
INSERT INTO `orders` VALUES (1029,'2012-05-15','weikun','43','4343','43243','999 9999 9999 9999','龙卡',55.5);
INSERT INTO `orders` VALUES (1030,'2012-08-16','weikun','212121','233232','122121','999 9999 9999 9999','建行龙卡',111);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table product
#

CREATE TABLE `product` (
  `productid` varchar(10) NOT NULL,
  `category` varchar(10) NOT NULL,
  `name` varchar(80) default NULL,
  `descn` varchar(255) default NULL,
  PRIMARY KEY  (`productid`),
  KEY `productCat` (`category`),
  KEY `productName` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table product
#
LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;

INSERT INTO `product` VALUES ('AV-CB-01','BIRDS','Amazon Parrot','<image src=\"../images/bird4.gif\">Great companion for up to 75 years');
INSERT INTO `product` VALUES ('AV-SB-02','BIRDS','Finch','<image src=\"../images/bird1.gif\">Great stress reliever');
INSERT INTO `product` VALUES ('FI-FW-01','FISH','Koi','<image src=\"../images/fish3.gif\">Fresh Water fish from Japan');
INSERT INTO `product` VALUES ('FI-FW-02','FISH','Goldfish','<image src=\"../images/fish2.gif\">Fresh Water fish from China');
INSERT INTO `product` VALUES ('FI-SW-01','FISH','Angelfish','<image src=\"../images/fish1.jpg\">Salt Water fish from Australia');
INSERT INTO `product` VALUES ('FI-SW-02','FISH','Tiger Shark','<image src=\"../images/fish4.gif\">Salt Water fish from Australia');
INSERT INTO `product` VALUES ('FL-DLH-02','CATS','Persian','<image src=\"../images/cat1.gif\">Friendly house cat, doubles as a princess');
INSERT INTO `product` VALUES ('FL-DSH-01','CATS','Manx','<image src=\"../images/cat3.gif\">Great for reducing mouse populations');
INSERT INTO `product` VALUES ('K9-BD-01','DOGS','Bulldog','<image src=\"../images/dog2.gif\">Friendly dog from England');
INSERT INTO `product` VALUES ('K9-CW-01','DOGS','Chihuahua','<image src=\"../images/dog4.gif\">Great companion dog');
INSERT INTO `product` VALUES ('K9-DL-01','DOGS','Dalmation','<image src=\"../images/dog5.gif\">Great dog for a Fire Station');
INSERT INTO `product` VALUES ('K9-PO-02','DOGS','Poodle','<image src=\"../images/dog6.gif\">Cute dog from France');
INSERT INTO `product` VALUES ('K9-RT-01','DOGS','Golden Retriever','<image src=\"../images/dog1.gif\">Great family dog');
INSERT INTO `product` VALUES ('K9-RT-02','DOGS','Labrador Retriever','<image src=\"../images/dog5.gif\">Great hunting dog');
INSERT INTO `product` VALUES ('RP-LI-02','REPTILES','Iguana','<image src=\"../images/lizard2.gif\">Friendly green friend');
INSERT INTO `product` VALUES ('RP-SN-01','REPTILES','Rattlesnake','<image src=\"../images/lizard3.gif\">Doubles as a watch dog');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table profile
#

CREATE TABLE `profile` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(80) NOT NULL,
  `langpref` varchar(82) NOT NULL default '',
  `favcategory` varchar(30) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='InnoDB free: 7168 kB';

#
# Dumping data for table profile
#
LOCK TABLES `profile` WRITE;
/*!40000 ALTER TABLE `profile` DISABLE KEYS */;

INSERT INTO `profile` VALUES (1,'kkkk','英文','BIRDS');
INSERT INTO `profile` VALUES (2,'kkokok','英文','BIRDS');
INSERT INTO `profile` VALUES (3,'weikun','中文','DOGS');
INSERT INTO `profile` VALUES (4,'wen','英文','BIRDS');
INSERT INTO `profile` VALUES (5,'32','中文','BIRDS');
INSERT INTO `profile` VALUES (6,'4444','中文','BIRDS');
INSERT INTO `profile` VALUES (7,'34343','中文','BIRDS');
INSERT INTO `profile` VALUES (8,'2332','中文','BIRDS');
INSERT INTO `profile` VALUES (9,'9999','中文','BIRDS');
INSERT INTO `profile` VALUES (10,'32323232','中文','BIRDS');
INSERT INTO `profile` VALUES (11,'323232443','中文','BIRDS');
INSERT INTO `profile` VALUES (12,'6666','中文','BIRDS');
INSERT INTO `profile` VALUES (13,'344343','中文','BIRDS');
INSERT INTO `profile` VALUES (14,'323243','中文','BIRDS');
INSERT INTO `profile` VALUES (15,'344343','中文','BIRDS');
INSERT INTO `profile` VALUES (16,'','中文','BIRDS');
INSERT INTO `profile` VALUES (17,'','中文','BIRDS');
INSERT INTO `profile` VALUES (18,'','中文','BIRDS');
INSERT INTO `profile` VALUES (19,'weikun111','中文','BIRDS');
INSERT INTO `profile` VALUES (20,'454545','中文','BIRDS');
INSERT INTO `profile` VALUES (21,'yyyy','中文','BIRDS');
INSERT INTO `profile` VALUES (22,'yyyyy','中文','BIRDS');
INSERT INTO `profile` VALUES (23,'rerere','英文','Birds');
INSERT INTO `profile` VALUES (24,'434345','英文','BIRDS');
/*!40000 ALTER TABLE `profile` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table sequence
#

CREATE TABLE `sequence` (
  `name` varchar(30) NOT NULL,
  `nextid` int(11) NOT NULL,
  PRIMARY KEY  (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table sequence
#
LOCK TABLES `sequence` WRITE;
/*!40000 ALTER TABLE `sequence` DISABLE KEYS */;

INSERT INTO `sequence` VALUES ('linenum',1000);
INSERT INTO `sequence` VALUES ('ordernum',1000);
/*!40000 ALTER TABLE `sequence` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table signon
#

CREATE TABLE `signon` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table signon
#
LOCK TABLES `signon` WRITE;
/*!40000 ALTER TABLE `signon` DISABLE KEYS */;

INSERT INTO `signon` VALUES ('12','123');
INSERT INTO `signon` VALUES ('ACID','ACID');
INSERT INTO `signon` VALUES ('j2ee','j2ee');
/*!40000 ALTER TABLE `signon` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table supplier
#

CREATE TABLE `supplier` (
  `suppid` int(11) NOT NULL,
  `name` varchar(80) default NULL,
  `status` varchar(2) NOT NULL,
  `addr1` varchar(80) default NULL,
  `addr2` varchar(80) default NULL,
  `city` varchar(80) default NULL,
  `state` varchar(80) default NULL,
  `zip` varchar(5) default NULL,
  `phone` varchar(80) default NULL,
  PRIMARY KEY  (`suppid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table supplier
#
LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;

INSERT INTO `supplier` VALUES (1,'XYZ Pets','AC','600 Avon Way','','Los Angeles','CA','94024','212-947-0797');
INSERT INTO `supplier` VALUES (2,'ABC Pets','AC','700 Abalone Way','','San Francisco ','CA','94024','415-947-0797');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table wl_llr_adminserver
#

CREATE TABLE `wl_llr_adminserver` (
  `XIDSTR` varchar(40) NOT NULL,
  `POOLNAMESTR` varchar(64) default NULL,
  `RECORDSTR` varchar(1000) default NULL,
  PRIMARY KEY  (`XIDSTR`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table wl_llr_adminserver
#
LOCK TABLES `wl_llr_adminserver` WRITE;
/*!40000 ALTER TABLE `wl_llr_adminserver` DISABLE KEYS */;

INSERT INTO `wl_llr_adminserver` VALUES ('JDBC LLR Domain//Server','JDBC LLR Domain//Server','base_domain//AdminServer');
INSERT INTO `wl_llr_adminserver` VALUES ('JDBC LLR Version','JDBC LLR Version','1.0');
/*!40000 ALTER TABLE `wl_llr_adminserver` ENABLE KEYS */;
UNLOCK TABLES;

#
#  Foreign keys for table item
#

ALTER TABLE `item`
ADD CONSTRAINT `fk_item_1` FOREIGN KEY (`productid`) REFERENCES `product` (`productid`),
ADD CONSTRAINT `fk_item_2` FOREIGN KEY (`supplier`) REFERENCES `supplier` (`suppid`);

#
#  Foreign keys for table product
#

ALTER TABLE `product`
ADD CONSTRAINT `fk_product_1` FOREIGN KEY (`category`) REFERENCES `category` (`catid`);


/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
