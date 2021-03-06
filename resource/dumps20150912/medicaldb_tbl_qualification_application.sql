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
-- Table structure for table `tbl_qualification_application`
--

DROP TABLE IF EXISTS `tbl_qualification_application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_qualification_application` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `APPLY_TIME` datetime DEFAULT NULL,
  `APPLY_USER_ID` int(11) DEFAULT NULL,
  `YSZGZ_IMG_ID` int(11) DEFAULT NULL COMMENT '医师资格证图片ID',
  `REVIEW_USER_ID` int(11) DEFAULT NULL COMMENT '设定的审查用户ID',
  `REVIEW_TEXT` varchar(100) DEFAULT NULL,
  `REVIEW_TIME` datetime DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL COMMENT '申请状态： 1 待审核 2 批准 3 拒绝',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资格申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_qualification_application`
--

LOCK TABLES `tbl_qualification_application` WRITE;
/*!40000 ALTER TABLE `tbl_qualification_application` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_qualification_application` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-09-12 22:33:00
