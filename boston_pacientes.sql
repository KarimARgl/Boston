CREATE DATABASE  IF NOT EXISTS `boston` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `boston`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: boston
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pacientes` (
  `idpacientes` bigint(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `sexo` varchar(6) DEFAULT NULL,
  `raza` varchar(50) DEFAULT NULL,
  `color` varchar(30) DEFAULT NULL,
  `fecha` varchar(18) DEFAULT NULL,
  `notas` varchar(200) DEFAULT NULL,
  `dueno` varchar(99) DEFAULT NULL,
  `direccion` varchar(99) DEFAULT NULL,
  `telefono` varchar(11) DEFAULT NULL,
  `celular` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`idpacientes`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientes`
--

/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES (1,'Bobby','Macho','Cocker Spaniel','Beige','1/Enero/2000','No cuenta con antecedentes.','Claudia Arceo Rodríguez','Pto. Zihuatanejo 135','5767 7143','55 2081 7317'),(2,'Sunny','Hembra','Delmer','Beige','19/Octubre/2012','Sin alergias','Claudia Arceo Rodríguez','Casas Alemán','57677143','5520817.31'),(4,'Moon','Macho','Delmer','Beige','1/Enero/1996','Oh...','Pepe','Zihuatanejo 132','57531236',' - '),(5,'Camila','Hembra','Pastor Alemán','Negro','1/Enero/2007','','Manuel Arceo Esparza','Villa de Ayala','735','7351044');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-14 15:10:53
