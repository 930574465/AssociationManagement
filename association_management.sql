/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.25a : Database - association_management
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`association_management` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `association_management`;

/*Table structure for table `associationinfo` */

DROP TABLE IF EXISTS `associationinfo`;

CREATE TABLE `associationinfo` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PHOTOPATH` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `associationinfo` */

insert  into `associationinfo`(`ID`,`NAME`,`PHOTOPATH`) values (1,'协会介绍','../associationInfoFiles/C/CIFOY32M04OGZ2EOY4RU2YVIP2X2NTWY_车协介绍.jpg'),(2,'部门介绍','../associationInfoFiles/J/J0NKTYWTNNXASVVUM0EHBJL0SITQ2KJP_部门介绍.jpg'),(3,'规章制度','../associationInfoFiles/5/563BFBIPGGSA21DT6Z616677Y2S5XY79_规章制度.jpg'),(4,'假期远征','../associationInfoFiles/1/1J2RFD5F1D92JNNAL2QRZREXK3Q1VYRU_假期远征.jpg'),(5,'荣誉殿堂','../associationInfoFiles/C/CCYP1P8CF0A5QV6LH3LJQYI3P1MM0TRN_1.jpg'),(6,'合作伙伴','../associationInfoFiles/8/81XZSLUYGQPWCXTGEA73ITHVW3N5BWSK_1.jpg');

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CONTEXT` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `contact` */

insert  into `contact`(`ID`,`NAME`,`CONTEXT`) values (1,'微信号','caimutt0920'),(2,'官方QQ','210243384');

/*Table structure for table `dailyactivity` */

DROP TABLE IF EXISTS `dailyactivity`;

CREATE TABLE `dailyactivity` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CONTEXT` varchar(5000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `dailyactivity` */

insert  into `dailyactivity`(`ID`,`TITLE`,`CONTEXT`) values (1,'十一远征','车协的新马儿会在老马儿的带领下进行十一假期为期七天的远征。我们穿过由纵横交错的四大街、八小街、七十二条蚰蜒巷构成的平遥古城，我们置身于平遥，无不感受到的是这里的文化底蕴的厚重。从平遥城墙，街市格局，商贾铺号，到民居院落，佛寺庙宇，无不向你展示着，深厚的文化底蕴，和平遥人的智慧与才能。这里小到一个扶手的雕花，大到城门的布局，都有故事与内涵；我们穿过历史悠久的塞上古城银川，去接受“碧水蓝天，明媚银川”的洗礼，骑行在地势平坦开阔，土地肥沃，沟渠纵横，水利资源丰富，加之日照充足，热量丰富，自然条件优越的银川平原。我们在用车子去感受我们美丽的中国。'),(2,'清明骑行','在清明的小长假中，骑行包头总是我们不二的选择。骑行在包头街头，向东看，一条笔直而宽阔的“钢铁大街”从东到西，贯穿全市四区，它长约四十多华里。两旁是风格独特的高大建筑物给这座城市增加了威严。向南看，是一片片阡陌纵横的农田。麦子熟了，金灿灿的像一片金色的海洋，被子秋风一吹，掀起阵阵波涛。向西看，是被称为“全国十大钢铁基地之一”的包钢厂区。每当夜幕来临的时候，整个厂区的上空红艳艳的、看到这种情景，人们就会自然而然地想到，这正是“钢花怒放、铁水奔流”的时候。向北看，是巍峨的大青山，连绵起伏。冬天，大雪过后，大青山就像穿上了银装。在阳光的照射下，幻映出一道道五光十色的彩虹，美丽极了。 当我们骑行在秀美的希拉穆仁河畔，聆听着希拉穆仁河川流不息的河水声，解除了我们一天骑行的劳累，平静我们烦躁的心情。 我们漫步在中国著名的藏传佛教圣殿——五当召，我们从环绕五当召的山上看她的全貌，山峦重叠，苍松翠柏的大青山深处，坐落着一处气势宏伟、建筑规模盛大的召庙。在深秋的秋色中更加映衬出她的苍劲和厚重。'),(3,'北大车协全国高校山地车交流赛','“北大赛 ”是是由中国顶尖高等学府的最优秀社团，也是中国第一家大学生自行车协会和全国高校车协的领头羊——北京大学自行车协会主办的“全国高校山地车交流赛”，内蒙古工业大学与马者自行车协会每年都会参与到这个全国最大的大学生山地车赛事中。我们会为了参加“北大赛”进行集训，我们也年年取得优异的成绩。 2016年与马者会员在京东体育杯·第十四届全国高校山地车交流赛 取得男子大众组第六名的好成绩。'),(4,'暑假远征','青青岁月流逝无痕，十二度春秋的车轮印记编织了一张梦想的网 无所谓起点，无所谓终点 我们一直在路上 辽阔的中国大地上留下了与马者坚实的车辙 辉煌壮丽的北京城，中国最北漠河 浪漫海滨青岛，秀美江南南京杭州 辽阔激昂的大草原——科尔沁、呼伦贝尔 壮美秦岭，吕梁山，太行山，衡山 泰山，武当山，神龙架，大兴安岭 黄河大跳板——壶口瀑布 晋商故土山西，古都西安 悠闲乐土四川，彩云之南云南，海南岛天涯海角 拉面故乡兰州，情人鸟岛青海湖 柴达木盆地，世界屋脊青藏高原 在昆仑山口，唐古拉山口 圣洁的西藏…… 年轻的生命，你本来就激情飞扬 五次进藏，08—11连续四年进藏 与马者是生命跳动的精灵 即使很受伤，也是流淌着泪水欢笑 07年，暑假远征活动： 呼和浩特-北京-沧州-德州-济南1300公里 呼和浩特――青海湖1500公里 08年，暑假远征活动： 呼和浩特-拉萨、南京、北京、长春、秦皇岛 09年，建国60周年暑假远征活动： 单人呼和浩特——拉萨之行 呼和浩特——西安 10年，响应世博会，低碳暑假远征活动： 呼和浩特-兰州-拉萨 呼和浩特-黑龙江漠河 环青海湖骑行 11年，建校60周年暑假远征活动： 拉萨线：西宁——拉萨 漠河线：通辽——漠河 北京线：呼和浩特——北京 贵州线：呼和浩特——贵州 青海线：呼和浩特——青海湖 东北线：葫芦岛——呼伦贝尔'),(5,'日常活动','与马者的日常活动相当丰富，每到周末，大家骑着单车穿行于呼和浩特的各个角落；我们去和内蒙古地区的各个车协联谊、去和林格尔吃炖羊肉、去小井沟爬山、去武川吃莜面、去五一水库打水仗、与环保协会组织环保活动、去大学城摘草莓、去大青山露营、车协内部也会定期举办篮球赛足球赛、车协积极参加呼和浩特政府举办的的各种环保比赛公益活动等等。');

/*Table structure for table `file` */

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TYPE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `AUTHOR` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DATE` datetime DEFAULT NULL,
  `FILEPATH` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DOWLOADNUMBER` int(11) DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `FK20ED7CEBB7748C` (`AUTHOR`),
  CONSTRAINT `FK20ED7CEBB7748C` FOREIGN KEY (`AUTHOR`) REFERENCES `user` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `file` */

insert  into `file`(`ID`,`TYPE`,`AUTHOR`,`DATE`,`FILEPATH`,`DOWLOADNUMBER`) values (1,'1','201520200000','2018-09-25 19:58:09','../files/7/76VFS081BFB7V2082C8L5O5O0393NCQC_2015上半年周刊.docx',0),(2,'1','201520200000','2018-09-25 19:58:20','../files/H/HSS9DOI0O8FGWKUXYQRWU90RNM1XHWKI_2015下半年周刊.docx',1),(3,'2','201520200000','2018-09-25 19:58:31','../files/G/GM0TFIDLN1MH0Q3TGNY9YEUBI6EJQKDA_2017年清明出行路书.docx',0),(4,'2','201520200000','2018-09-25 19:58:37','../files/5/5U2KKVE7LOR9Y0HN3LQMDRZ8VWJGGOVG_2018年端午出行路书.docx',0),(5,'3','201520200000','2018-09-25 19:58:47','../files/4/48H16S7O7ZRJ3JIKEDAOCXFRDD3DIUE7_自行车维护常识.docx',0),(6,'4','201520200000','2018-09-25 19:59:00','../files/2/2JGHET8MDKX42XJSXUJ4M2BPPAYC3KI2_在校证明模板.doc',0),(7,'4','201520200000','2018-09-25 19:59:07','../files/2/2I069YXIUFLXUA3WXLT658E52A4W6D37_学生缓考申请表.doc',1);

/*Table structure for table `incomeorpayout` */

DROP TABLE IF EXISTS `incomeorpayout`;

CREATE TABLE `incomeorpayout` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MONEY` double DEFAULT NULL,
  `TYPE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `SOURCEORDESTINATION` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `DATE` datetime DEFAULT NULL,
  `AGENT` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `APPLICANT` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK74201F2C2F77203` (`APPLICANT`),
  KEY `FK74201F245119606` (`AGENT`),
  CONSTRAINT `FK74201F245119606` FOREIGN KEY (`AGENT`) REFERENCES `user` (`number`),
  CONSTRAINT `FK74201F2C2F77203` FOREIGN KEY (`APPLICANT`) REFERENCES `user` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `incomeorpayout` */

insert  into `incomeorpayout`(`ID`,`MONEY`,`TYPE`,`SOURCEORDESTINATION`,`DATE`,`AGENT`,`APPLICANT`) values (4,100,'1','会费','2018-09-24 22:09:49','201520200000',NULL),(5,50,'0','会费','2018-09-24 22:10:05','201520200000',NULL);

/*Table structure for table `keyevent` */

DROP TABLE IF EXISTS `keyevent`;

CREATE TABLE `keyevent` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `HAPPENEDDATE` date DEFAULT NULL,
  `AUTHOR` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PHOTOPATH` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CONTENT` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK4CD9E79BEBB7748C` (`AUTHOR`),
  CONSTRAINT `FK4CD9E79BEBB7748C` FOREIGN KEY (`AUTHOR`) REFERENCES `user` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `keyevent` */

insert  into `keyevent`(`ID`,`TITLE`,`HAPPENEDDATE`,`AUTHOR`,`PHOTOPATH`,`CONTENT`) values (1,'与马者自行车协会于内蒙古工业大学机械学院成立','2004-04-07','201520200000','../keyEventPhotos/N/NBX9NUIUBR4LB288HGD8YYQAG9A24DTC_20180704145427.jpg','车协成立'),(2,'测试1','2009-01-28','201520200000',NULL,'测试1'),(3,'测试2','2008-08-01','201520200000',NULL,'测试2'),(4,'测试3','2013-09-04','201520200000',NULL,'测试3'),(5,'测试4','2012-10-14','201520200000',NULL,'测试4'),(6,'测试5','2012-05-31','201520200000',NULL,'测试5'),(7,'测试6','2016-09-05','201520200000',NULL,'测试6');

/*Table structure for table `money` */

DROP TABLE IF EXISTS `money`;

CREATE TABLE `money` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SIZE` double DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `money` */

insert  into `money`(`ID`,`SIZE`) values (1,50);

/*Table structure for table `notice` */

DROP TABLE IF EXISTS `notice`;

CREATE TABLE `notice` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CONTENT` varchar(6000) COLLATE utf8_bin DEFAULT NULL,
  `DATE` datetime DEFAULT NULL,
  `AUTHOR` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CLICKS` int(11) DEFAULT '0',
  `FILEPATH` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PERMISSION` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK899A8AD8EBB7748C` (`AUTHOR`),
  CONSTRAINT `FK899A8AD8EBB7748C` FOREIGN KEY (`AUTHOR`) REFERENCES `user` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `notice` */

insert  into `notice`(`ID`,`TITLE`,`CONTENT`,`DATE`,`AUTHOR`,`CLICKS`,`FILEPATH`,`PERMISSION`) values (1,'工大自行车协会网站开通了','经过将近一个月的时间，网站终于可以初步运行了，系统还有很多不完善甚至存在bug的地方，希望大家可以谅解','2018-09-25 18:12:38','201520200000',3,NULL,'0'),(2,'招新','又是新的一年，内蒙古工业大学与马者自行车协会要招新了，同学们快来报名吧','2018-09-25 18:27:57','201520205015',3,'../appendFiles/3/38E12UPNFY3L64CBBNCF052NHL8YX9X_报名表.doc','0');

/*Table structure for table `permission` */

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `permission` */

insert  into `permission`(`ID`,`NAME`) values (1,'用户管理'),(2,'资金管理'),(3,'公告管理'),(4,'文件管理'),(5,'其他');

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `position` */

insert  into `position`(`ID`,`NAME`) values (1,'会长'),(2,'书记'),(3,'执委'),(4,'成员'),(5,'已退会');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `number` varchar(255) COLLATE utf8_bin NOT NULL,
  `NAME` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `SEX` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CLASSES` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `CONTACTWAY` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `POSITION` int(11) DEFAULT NULL,
  `PAYSTATE` varchar(255) COLLATE utf8_bin DEFAULT '1',
  `PHOTOPATH` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `PASSWORD` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`number`),
  KEY `FK27E3CB65660E88` (`POSITION`),
  CONSTRAINT `FK27E3CB65660E88` FOREIGN KEY (`POSITION`) REFERENCES `position` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `user` */

insert  into `user`(`number`,`NAME`,`SEX`,`CLASSES`,`CONTACTWAY`,`POSITION`,`PAYSTATE`,`PHOTOPATH`,`PASSWORD`) values ('201520200000','admin','0','软件15-3','15247149365',1,'0','../iconFiles/6/617BMZCH2JDKAC9TW51FIOU64J2TGPRW_1.jpg','12345'),('201520205001','王世奇','0','软件15-3','17647317483',4,'1','../iconFiles/M/MF5FWOSWQT0R462LY1CC2WGCAGDECNGT_20180704145427.jpg','123456'),('201520205009','张金倓','0','软件15-3','17647317483',4,'1','../iconFiles/2/2GZ8UBTWHJ7QEWCWX32LJ872HP9JABS7_20180704145427.jpg','123456'),('201520205014','王杰','0','软件15-3','17647317483',5,'0','../iconFiles/P/PWLGUUVKTQORGQZG5C897W6UVPZ0541Y_1.jpg','123456'),('201520205015','赵国庆','0','软件15-3','17647317483',4,'0','../iconFiles/Q/QCME6G3J1A2I0D7KJCIHXX6MEMV8WFOO_Screenshot_2017-06-28-19-28-07.jpg','12345'),('201520205016','潘坤','0','软件15-3','17647317483',4,'1','../iconFiles/G/GMA73VWD1L8JWZ6ZC3K6BIELVEEPORRE_1342405015.jpg','123456'),('201520205017','范成琦','1','软件15-3','17647317483',4,'1','../iconFiles/C/CHSNJW8KG703T59S5V4TRFY4MJG4RLJ5_20180704151521.jpg','123456'),('201520205038','张树春','0','软件15-3','17647317483',NULL,'1','../iconFiles/P/PNESYLIY7MFNP755C9KROU2TW4PU1L34_1342428068.jpg','123456'),('201520205049','弓志成','0','软件15-3','123456',4,'0','../iconFiles/O/O5ZED4FISFV48FCJSC6Q5NTL5JFGYPEZ_Screenshot_2017-06-28-19-37-11.jpg','12345'),('201520205052','蒋文','0','软件15-3','123456',4,'1','../iconFiles/L/LGBNIRW7Q50STXSNHNV8GDVDXHVCNYL7_Screenshot_2017-06-28-19-30-24.jpg','12345'),('201520205054','李永昊','0','软件-3','123456789',4,'1','../iconFiles/F/FHD1XZBEJHM0MAIA44JPHFIV92L9MWSA_初始界面.jpg','12345'),('201520205060','张健','0','软件15-3','17647317483',NULL,'1','../iconFiles/5/5UC2FOLXY2I2UJXLRDLO0GCXOQOQLWVJ_初始界面.jpg','123456');

/*Table structure for table `user_permission` */

DROP TABLE IF EXISTS `user_permission`;

CREATE TABLE `user_permission` (
  `pid` int(11) NOT NULL,
  `uid` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`uid`,`pid`),
  KEY `FKFE866C33F8C1751` (`uid`),
  KEY `FKFE866C3E0A21E10` (`pid`),
  CONSTRAINT `FKFE866C33F8C1751` FOREIGN KEY (`uid`) REFERENCES `user` (`number`),
  CONSTRAINT `FKFE866C3E0A21E10` FOREIGN KEY (`pid`) REFERENCES `permission` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `user_permission` */

insert  into `user_permission`(`pid`,`uid`) values (1,'201520200000'),(1,'201520205054'),(2,'201520200000'),(2,'201520205009'),(2,'201520205015'),(3,'201520200000'),(3,'201520205015'),(4,'201520200000'),(4,'201520205009'),(4,'201520205052'),(5,'201520200000'),(5,'201520205049');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
