-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: localhost    Database: medicaldb
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_notification`
--

DROP TABLE IF EXISTS `tbl_notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_notification` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(100) DEFAULT NULL,
  `CONTENT` varchar(500) DEFAULT NULL,
  `IS_READ` int(11) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `OWNER_USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_notification`
--

LOCK TABLES `tbl_notification` WRITE;
/*!40000 ALTER TABLE `tbl_notification` DISABLE KEYS */;
INSERT INTO `tbl_notification` VALUES (1,NULL,'您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。',1,'2015-09-12 21:30:38',1),(2,NULL,'您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。',1,'2015-09-09 21:31:14',1),(3,NULL,'您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。',1,'2015-09-01 21:31:17',1),(4,NULL,'您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。',1,'2015-08-18 21:31:24',1),(5,NULL,'您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。',1,'2015-09-06 21:31:34',1),(6,NULL,'您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。',1,'2015-06-25 21:31:29',1),(7,NULL,'您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。',1,'2015-07-27 16:31:40',1),(8,NULL,'您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。',0,'2015-09-02 01:42:58',1),(9,NULL,'您的请求[胸腔 3张]已诊断完成，可以去支付并查看诊断报告了。',0,'2015-06-25 21:31:29',1);
/*!40000 ALTER TABLE `tbl_notification` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-09-12 22:33:01
