-- MySQL dump 10.13  Distrib 8.0.14, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: torneo
-- ------------------------------------------------------
-- Server version	8.0.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aspirante`
--

DROP TABLE IF EXISTS `aspirante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `aspirante` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fechaDeNacimiento` datetime DEFAULT NULL,
  `nombres` varchar(255) DEFAULT NULL,
  `sexo` bit(1) DEFAULT NULL,
  `id_categoria` bigint(20) NOT NULL,
  `id_escuela` bigint(20) NOT NULL,
  `dni` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_mya0bgaegvbwu5ca8dqsxcyph` (`id_categoria`),
  KEY `FK_6rkibq3unlgat7ah4xgxg1rdf` (`id_escuela`),
  CONSTRAINT `FK_6rkibq3unlgat7ah4xgxg1rdf` FOREIGN KEY (`id_escuela`) REFERENCES `escuela` (`id`),
  CONSTRAINT `FK_mya0bgaegvbwu5ca8dqsxcyph` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aspirante`
--

LOCK TABLES `aspirante` WRITE;
/*!40000 ALTER TABLE `aspirante` DISABLE KEYS */;
/*!40000 ALTER TABLE `aspirante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `categoria` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `edadDeFinalizacion` int(11) DEFAULT NULL,
  `edadDeInicio` int(11) DEFAULT NULL,
  `nombreCategoria` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,11,6,'Infantiles Varones'),(2,11,6,'Infantiles Mujeres'),(3,17,12,'Menores Varones'),(4,17,12,'Menores Mujeres');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `competencia`
--

DROP TABLE IF EXISTS `competencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `competencia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fechaCompetencia` datetime DEFAULT NULL,
  `horaCompetencia` datetime DEFAULT NULL,
  `id_categoria` bigint(20) NOT NULL,
  `id_disciplina` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_u0679oe9sjv29cd0lomnu9fm` (`id_categoria`),
  KEY `FK_exjywu06slqpwegjl3j6m0krb` (`id_disciplina`),
  CONSTRAINT `FK_exjywu06slqpwegjl3j6m0krb` FOREIGN KEY (`id_disciplina`) REFERENCES `disciplina` (`id`),
  CONSTRAINT `FK_u0679oe9sjv29cd0lomnu9fm` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competencia`
--

LOCK TABLES `competencia` WRITE;
/*!40000 ALTER TABLE `competencia` DISABLE KEYS */;
INSERT INTO `competencia` VALUES (1,'2019-03-20 00:00:00','2019-03-20 00:00:00',1,1),(2,'2019-03-20 00:00:00','2019-03-20 00:00:00',2,1),(3,'2019-03-20 00:00:00','2019-03-20 00:00:00',3,1),(4,'2019-03-20 00:00:00','2019-03-20 00:00:00',4,1),(5,'2019-03-20 00:00:00','2019-03-20 00:00:00',1,2),(6,'2019-03-20 00:00:00','2019-03-20 00:00:00',2,2),(7,'2019-03-20 00:00:00','2019-03-20 00:00:00',3,2),(8,'2019-03-20 00:00:00','2019-03-20 00:00:00',4,2),(9,'2019-03-20 00:00:00','2019-03-20 00:00:00',1,3),(10,'2019-03-20 00:00:00','2019-03-20 00:00:00',2,3),(11,'2019-03-20 00:00:00','2019-03-20 00:00:00',3,3),(12,'2019-03-20 00:00:00','2019-03-20 00:00:00',4,3),(13,'2019-03-20 00:00:00','2019-03-20 00:00:00',1,4),(14,'2019-03-20 00:00:00','2019-03-20 00:00:00',2,4),(15,'2019-03-20 00:00:00','2019-03-20 00:00:00',3,4),(16,'2019-03-20 00:00:00','2019-03-20 00:00:00',4,4),(17,'2019-03-20 00:00:00','2019-03-20 00:00:00',1,5),(18,'2019-03-20 00:00:00','2019-03-20 00:00:00',2,5),(19,'2019-03-20 00:00:00','2019-03-20 00:00:00',3,5),(20,'2019-03-20 00:00:00','2019-03-20 00:00:00',4,5),(21,'2019-03-20 00:00:00','2019-03-20 00:00:00',1,6),(22,'2019-03-20 00:00:00','2019-03-20 00:00:00',2,6),(23,'2019-03-20 00:00:00','2019-03-20 00:00:00',3,6),(24,'2019-03-20 00:00:00','2019-03-20 00:00:00',4,6);
/*!40000 ALTER TABLE `competencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `competidor`
--

DROP TABLE IF EXISTS `competidor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `competidor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `resultado` float DEFAULT NULL,
  `id_competencia` bigint(20) NOT NULL,
  `id_inscripcion` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_pnfx1vhsy4n9f6o03pf3g6sc3` (`id_competencia`),
  KEY `FK_dt81bq1whftxt4ltfdpggfi7g` (`id_inscripcion`),
  CONSTRAINT `FK_dt81bq1whftxt4ltfdpggfi7g` FOREIGN KEY (`id_inscripcion`) REFERENCES `inscripcion` (`id`),
  CONSTRAINT `FK_pnfx1vhsy4n9f6o03pf3g6sc3` FOREIGN KEY (`id_competencia`) REFERENCES `competencia` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competidor`
--

LOCK TABLES `competidor` WRITE;
/*!40000 ALTER TABLE `competidor` DISABLE KEYS */;
/*!40000 ALTER TABLE `competidor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `disciplina` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `id_torneo` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_6x6c7dunj5qt37f2cw7x8dqfd` (`id_torneo`),
  CONSTRAINT `FK_6x6c7dunj5qt37f2cw7x8dqfd` FOREIGN KEY (`id_torneo`) REFERENCES `torneo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disciplina`
--

LOCK TABLES `disciplina` WRITE;
/*!40000 ALTER TABLE `disciplina` DISABLE KEYS */;
INSERT INTO `disciplina` VALUES (1,'100 metros llanos',1),(2,'300 metros con posta',1),(3,'500 metros con posta',1),(4,'50 metros con vallas',1),(5,'salto en largo',1),(6,'natación',1);
/*!40000 ALTER TABLE `disciplina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escuela`
--

DROP TABLE IF EXISTS `escuela`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `escuela` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `barrio` varchar(255) DEFAULT NULL,
  `cue` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `nivel` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `id_zona` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_5njarrol7mwx8y0pt8offwmi7` (`id_zona`),
  CONSTRAINT `FK_5njarrol7mwx8y0pt8offwmi7` FOREIGN KEY (`id_zona`) REFERENCES `zona` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escuela`
--

LOCK TABLES `escuela` WRITE;
/*!40000 ALTER TABLE `escuela` DISABLE KEYS */;
INSERT INTO `escuela` VALUES (1,'itaembe','1234','calle 151','primario','Colegio Carbó','44886879',1),(2,'Alamo','1234','calle 111','primario','Colegio Corazón de Maria','44886678',1),(3,'Las Flores','1222','calle 110','primario','Colegio del Carmen','44886575',1),(4,'Las palmeras','1223','calle 112','primario','Colegio Montserrat','44886474',1),(5,'Los Naranjos','1224','calle 113','primario','Colegio Nacional General San Martín','44886373',1),(6,'Comercial','1225','calle 125','secundario','Escuela Agrotécnica Número 23','44886272',1),(7,'Pasaje Sur','1226','calle 126','secundario','Escuela Normal Superior Número 10','44886171',1),(8,'Costanera','1227','calle 127','secundario','Instituto Hellen Keller','44886070',1);
/*!40000 ALTER TABLE `escuela` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscripcion`
--

DROP TABLE IF EXISTS `inscripcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `inscripcion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `estadoInscripcion` bit(1) DEFAULT NULL,
  `fechaInscripcion` datetime DEFAULT NULL,
  `id_aspitante` bigint(20) NOT NULL,
  `id_competencia` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_6wl2qx9xbyubn2l4pt3u8q18b` (`id_aspitante`),
  KEY `FK_26shlyee29a7xpiqdh84opk41` (`id_competencia`),
  CONSTRAINT `FK_26shlyee29a7xpiqdh84opk41` FOREIGN KEY (`id_competencia`) REFERENCES `competencia` (`id`),
  CONSTRAINT `FK_6wl2qx9xbyubn2l4pt3u8q18b` FOREIGN KEY (`id_aspitante`) REFERENCES `aspirante` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscripcion`
--

LOCK TABLES `inscripcion` WRITE;
/*!40000 ALTER TABLE `inscripcion` DISABLE KEYS */;
/*!40000 ALTER TABLE `inscripcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `municipalidad`
--

DROP TABLE IF EXISTS `municipalidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `municipalidad` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `direccion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `municipalidad`
--

LOCK TABLES `municipalidad` WRITE;
/*!40000 ALTER TABLE `municipalidad` DISABLE KEYS */;
INSERT INTO `municipalidad` VALUES (1,NULL,'Cordoba muni'),(2,NULL,'Cordoba muni'),(3,NULL,'Cordoba muni'),(4,NULL,'Cordoba muni');
/*!40000 ALTER TABLE `municipalidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `torneo`
--

DROP TABLE IF EXISTS `torneo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `torneo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fechaTorneo` datetime DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `id_municipalidad` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_oy8r3qfvvfoiajcf02rifh93t` (`id_municipalidad`),
  CONSTRAINT `FK_oy8r3qfvvfoiajcf02rifh93t` FOREIGN KEY (`id_municipalidad`) REFERENCES `municipalidad` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `torneo`
--

LOCK TABLES `torneo` WRITE;
/*!40000 ALTER TABLE `torneo` DISABLE KEYS */;
INSERT INTO `torneo` VALUES (1,'2019-03-20 00:00:00','Cordoba Aniversario Primera Parte',1),(2,'2019-03-22 00:00:00','Cordoba Aniversario Segunda Parte',1);
/*!40000 ALTER TABLE `torneo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zona`
--

DROP TABLE IF EXISTS `zona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `zona` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `id_municipalidad` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_r3ky6lyne30pmh1k0i69mb0rj` (`id_municipalidad`),
  CONSTRAINT `FK_r3ky6lyne30pmh1k0i69mb0rj` FOREIGN KEY (`id_municipalidad`) REFERENCES `municipalidad` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zona`
--

LOCK TABLES `zona` WRITE;
/*!40000 ALTER TABLE `zona` DISABLE KEYS */;
INSERT INTO `zona` VALUES (1,'zona roja',1),(2,'zona azul',1),(3,'zona verde',1);
/*!40000 ALTER TABLE `zona` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-28  0:12:19
