CREATE DATABASE  IF NOT EXISTS `casestudy` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `casestudy`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: casestudy
-- ------------------------------------------------------
-- Server version	5.7.20

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
-- Table structure for table `Accessory`
--

DROP TABLE IF EXISTS `Accessory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Accessory` (
  `CmpCode` varchar(10) NOT NULL,
  `SeriesCode` varchar(10) NOT NULL,
  `ModelCode` varchar(20) NOT NULL,
  `AccessoryCode` varchar(10) NOT NULL,
  `AccessoryName` varchar(100) NOT NULL,
  `Price` decimal(22,6) DEFAULT '0.000000',
  PRIMARY KEY (`CmpCode`,`AccessoryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accessory`
--

LOCK TABLES `Accessory` WRITE;
/*!40000 ALTER TABLE `Accessory` DISABLE KEYS */;
INSERT INTO `Accessory` VALUES ('5000','SER0001','SER0001MOD01','ACC01','FRONT BUMPER',2000.000000),('5000','SER0001','SER0001MOD01','ACC02','BACK BUMPER',1775.000000),('5000','SER0001','SER0001MOD01','ACC03','FOOT GUARD',20000.000000);
/*!40000 ALTER TABLE `Accessory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Dealer`
--

DROP TABLE IF EXISTS `Dealer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Dealer` (
  `CmpCode` varchar(10) NOT NULL,
  `DealerCode` varchar(50) NOT NULL,
  `DealerName` varchar(50) NOT NULL,
  PRIMARY KEY (`CmpCode`,`DealerCode`),
  CONSTRAINT `FK_Dealer_Company` FOREIGN KEY (`CmpCode`) REFERENCES `company` (`CmpCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Dealer`
--

LOCK TABLES `Dealer` WRITE;
/*!40000 ALTER TABLE `Dealer` DISABLE KEYS */;
INSERT INTO `Dealer` VALUES ('5000','5000D01','FRIENDS ABC'),('5000','5000D02','LIKE ABC');
/*!40000 ALTER TABLE `Dealer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Model`
--

DROP TABLE IF EXISTS `Model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Model` (
  `CmpCode` varchar(10) NOT NULL,
  `SeriesCode` varchar(50) NOT NULL,
  `ModelCode` varchar(20) NOT NULL,
  `ModelName` varchar(50) DEFAULT NULL,
  `ModelPrice` decimal(22,6) NOT NULL DEFAULT '0.000000',
  PRIMARY KEY (`CmpCode`,`ModelCode`),
  KEY `FK_Model_Series` (`CmpCode`,`SeriesCode`),
  CONSTRAINT `FK_Model_Company` FOREIGN KEY (`CmpCode`) REFERENCES `company` (`CmpCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Model_Series` FOREIGN KEY (`CmpCode`, `SeriesCode`) REFERENCES `Series` (`CmpCode`, `SeriesCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Model`
--

LOCK TABLES `Model` WRITE;
/*!40000 ALTER TABLE `Model` DISABLE KEYS */;
INSERT INTO `Model` VALUES ('5000','SER0001','SER0001MOD01','HARENA-LITE',1000000.000000),('5000','SER0001','SER0001MOD02','HARENA-PILO',1100000.000000),('5000','SER0002','SER0002MOD01','CATPIL-FI',1200000.000000),('5000','SER0002','SER0002MOD02','CATPIL-FIPLUS',1300000.000000);
/*!40000 ALTER TABLE `Model` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Series`
--

DROP TABLE IF EXISTS `Series`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Series` (
  `CmpCode` varchar(10) NOT NULL,
  `SeriesCode` varchar(50) NOT NULL,
  `SeriesName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CmpCode`,`SeriesCode`),
  CONSTRAINT `FK_Series_Company` FOREIGN KEY (`CmpCode`) REFERENCES `company` (`CmpCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Series`
--

LOCK TABLES `Series` WRITE;
/*!40000 ALTER TABLE `Series` DISABLE KEYS */;
INSERT INTO `Series` VALUES ('5000','SER0001','HARENA'),('5000','SER0002','CATPIL');
/*!40000 ALTER TABLE `Series` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appuser`
--

DROP TABLE IF EXISTS `appuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `appuser` (
  `CmpCode` varchar(10) NOT NULL,
  `usercode` varchar(50) NOT NULL,
  `UserName` varchar(36) DEFAULT NULL,
  `UserPwd` varchar(80) NOT NULL,
  `GroupCode` varchar(13) NOT NULL,
  PRIMARY KEY (`usercode`),
  KEY `FK_AppUser_UserGroup` (`CmpCode`,`GroupCode`),
  CONSTRAINT `FK_AppUser_UserGroup` FOREIGN KEY (`CmpCode`, `GroupCode`) REFERENCES `usergroup` (`CmpCode`, `GroupCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appuser`
--

LOCK TABLES `appuser` WRITE;
/*!40000 ALTER TABLE `appuser` DISABLE KEYS */;
INSERT INTO `appuser` VALUES ('5000','ADMIN1','DEALER ADMIN1','12345','GROUP1'),('5000','MEMBER1','DEALER MEMBER1','12345','GROUP2');
/*!40000 ALTER TABLE `appuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colors`
--

DROP TABLE IF EXISTS `colors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `colors` (
  `CmpCode` varchar(10) NOT NULL,
  `SeriesCode` varchar(10) NOT NULL,
  `ModelCode` varchar(20) NOT NULL,
  `ColorCode` varchar(10) NOT NULL,
  `ColorName` varchar(100) NOT NULL,
  `Price` decimal(22,6) DEFAULT '0.000000',
  PRIMARY KEY (`CmpCode`,`ColorCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colors`
--

LOCK TABLES `colors` WRITE;
/*!40000 ALTER TABLE `colors` DISABLE KEYS */;
INSERT INTO `colors` VALUES ('5000','SER0001','SER0001MOD01','COL01','WHITE',100000.000000),('5000','SER0001','SER0001MOD01','COL02','SILVER',105000.000000),('5000','SER0001','SER0001MOD01','COL03','BLACK',120000.000000),('5000','SER0001','SER0001MOD01','COL04','RED',150000.000000);
/*!40000 ALTER TABLE `colors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company` (
  `CmpCode` varchar(10) NOT NULL,
  `CmpName` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `CmpState` varchar(50) DEFAULT NULL,
  `Country` varchar(50) DEFAULT NULL,
  `PostalCode` int(11) DEFAULT NULL,
  PRIMARY KEY (`CmpCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES ('5000','ABC CORPORATION','TEXAS','TEXAS','US',100001);
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderaccessorydetail`
--

DROP TABLE IF EXISTS `orderaccessorydetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderaccessorydetail` (
  `CmpCode` varchar(10) NOT NULL,
  `DealerCode` varchar(50) NOT NULL,
  `OrderNo` varchar(100) NOT NULL,
  `AccessoryCode` varchar(10) NOT NULL,
  `ModDt` datetime DEFAULT NULL,
  PRIMARY KEY (`CmpCode`,`DealerCode`,`OrderNo`,`AccessoryCode`),
  KEY `FK_orderaccessorydetail_Company` (`CmpCode`),
  KEY `FK_orderaccessorydetail_OrderHeader` (`CmpCode`,`DealerCode`,`OrderNo`),
  KEY `FK_orderaccessorydetail_Accessory` (`CmpCode`,`AccessoryCode`),
  CONSTRAINT `FK_orderaccessorydetail_Accessory` FOREIGN KEY (`CmpCode`, `AccessoryCode`) REFERENCES `Accessory` (`CmpCode`, `AccessoryCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_orderaccessorydetail_Company` FOREIGN KEY (`CmpCode`) REFERENCES `Company` (`CmpCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_orderaccessorydetail_OrderHeader` FOREIGN KEY (`CmpCode`, `DealerCode`, `OrderNo`) REFERENCES `orderheader` (`CmpCode`, `DealerCode`, `OrderNo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderaccessorydetail`
--

LOCK TABLES `orderaccessorydetail` WRITE;
/*!40000 ALTER TABLE `orderaccessorydetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderaccessorydetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail`
--

DROP TABLE IF EXISTS `orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderdetail` (
  `CmpCode` varchar(10) NOT NULL,
  `DealerCode` varchar(50) NOT NULL,
  `OrderNo` varchar(100) NOT NULL,
  `ColorCode` varchar(10) NOT NULL,
  `TotalOrdQty` int(11) DEFAULT NULL,
  `TotalAccQty` int(11) DEFAULT NULL,
  `OrderBaseAmount` decimal(22,6) DEFAULT NULL,
  `OrderAccesoryAmount` decimal(22,6) DEFAULT NULL,
  `OrderTotalAmount` decimal(22,6) DEFAULT NULL,
  `ModDt` datetime DEFAULT NULL,
  PRIMARY KEY (`CmpCode`,`DealerCode`,`OrderNo`,`ColorCode`),
  KEY `FK_OrderDetail_Company` (`CmpCode`),
  KEY `FK_OrderDetail_OrderHeader` (`CmpCode`,`DealerCode`,`OrderNo`),
  KEY `FK_OrderDetail_Colors` (`CmpCode`,`ColorCode`),
  CONSTRAINT `FK_OrderDetail_Colors` FOREIGN KEY (`CmpCode`, `ColorCode`) REFERENCES `colors` (`CmpCode`, `ColorCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_OrderDetail_Company` FOREIGN KEY (`CmpCode`) REFERENCES `Company` (`CmpCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_OrderDetail_OrderHeader` FOREIGN KEY (`CmpCode`, `DealerCode`, `OrderNo`) REFERENCES `orderheader` (`CmpCode`, `DealerCode`, `OrderNo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetail`
--

LOCK TABLES `orderdetail` WRITE;
/*!40000 ALTER TABLE `orderdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderheader`
--

DROP TABLE IF EXISTS `orderheader`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderheader` (
  `CmpCode` varchar(10) NOT NULL,
  `SeriesCode` varchar(50) NOT NULL,
  `ModelCode` varchar(20) NOT NULL,
  `DealerCode` varchar(50) NOT NULL,
  `OrderNo` varchar(100) NOT NULL,
  `OrderDt` date DEFAULT NULL,
  `OrderValue` decimal(22,6) DEFAULT NULL,
  PRIMARY KEY (`CmpCode`,`DealerCode`,`OrderNo`),
  KEY `FK_OrderHeader_Dealer` (`CmpCode`,`DealerCode`),
  KEY `FK_OrderHeader_Series` (`CmpCode`,`SeriesCode`),
  KEY `FK_OrderHeader_Model` (`CmpCode`,`SeriesCode`,`ModelCode`),
  CONSTRAINT `FK_OrderHeader_Dealer` FOREIGN KEY (`CmpCode`, `DealerCode`) REFERENCES `dealer` (`CmpCode`, `DealerCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_OrderHeader_Model` FOREIGN KEY (`CmpCode`, `SeriesCode`, `ModelCode`) REFERENCES `Model` (`CmpCode`, `SeriesCode`, `ModelCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_OrderHeader_Series` FOREIGN KEY (`CmpCode`, `SeriesCode`) REFERENCES `Series` (`CmpCode`, `SeriesCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderheader`
--

LOCK TABLES `orderheader` WRITE;
/*!40000 ALTER TABLE `orderheader` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderheader` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usergroup`
--

DROP TABLE IF EXISTS `usergroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usergroup` (
  `CmpCode` varchar(10) NOT NULL,
  `GroupCode` varchar(13) NOT NULL,
  `GroupName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`CmpCode`,`GroupCode`),
  CONSTRAINT `FK_UserGroup_CmpCode` FOREIGN KEY (`CmpCode`) REFERENCES `company` (`CmpCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usergroup`
--

LOCK TABLES `usergroup` WRITE;
/*!40000 ALTER TABLE `usergroup` DISABLE KEYS */;
INSERT INTO `usergroup` VALUES ('5000','GROUP1','DEALER ADMIN'),('5000','GROUP2','DEALER MEMBER');
/*!40000 ALTER TABLE `usergroup` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-28 11:33:22
