-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: catalogazione_libri
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autore`
--

DROP TABLE IF EXISTS `autore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autore` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `nazionalita` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autore`
--

LOCK TABLES `autore` WRITE;
/*!40000 ALTER TABLE `autore` DISABLE KEYS */;
INSERT INTO `autore` VALUES (1,'J.R.R. Tolkien','Inglese'),(2,'J.K. Rowling','Inglese'),(3,'George Orwell','Inglese'),(4,'Jane Austen','Inglese'),(5,'George R.R. Martin','Americano'),(6,'Umberto Eco','Italiano'),(7,'Harper Lee','Americano'),(8,'F. Scott Fitzgerald','Americano'),(9,'Miguel de Cervantes','Spagnolo'),(10,'Jane Austen','Inglese');
/*!40000 ALTER TABLE `autore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autore_libro`
--

DROP TABLE IF EXISTS `autore_libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autore_libro` (
  `libro_id` int NOT NULL,
  `autore_id` int NOT NULL,
  PRIMARY KEY (`libro_id`,`autore_id`),
  KEY `autore_id` (`autore_id`),
  CONSTRAINT `autore_libro_ibfk_1` FOREIGN KEY (`libro_id`) REFERENCES `libro` (`id`),
  CONSTRAINT `autore_libro_ibfk_2` FOREIGN KEY (`autore_id`) REFERENCES `autore` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autore_libro`
--

LOCK TABLES `autore_libro` WRITE;
/*!40000 ALTER TABLE `autore_libro` DISABLE KEYS */;
INSERT INTO `autore_libro` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(4,10);
/*!40000 ALTER TABLE `autore_libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editore`
--

DROP TABLE IF EXISTS `editore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editore` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `contatto` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editore`
--

LOCK TABLES `editore` WRITE;
/*!40000 ALTER TABLE `editore` DISABLE KEYS */;
INSERT INTO `editore` VALUES (1,'Mondadori','info@mondadori.com'),(2,'Bloomsbury','info@bloomsbury.com'),(3,'Penguin Books','info@penguinbooks.com'),(4,'HarperCollins','info@harpercollins.com'),(5,'Bompiani','info@bompiani.com'),(6,'Vintage Books','info@vintagebooks.com'),(7,'Charles Scribner\'s Sons','info@scribners.com'),(8,'Editorial Planeta','info@planeta.com'),(9,'Einaudi','info@einaudi.com'),(10,'HarperCollins','info@harpercollins.com');
/*!40000 ALTER TABLE `editore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titolo` varchar(200) DEFAULT NULL,
  `pagine` int DEFAULT NULL,
  `prezzo` decimal(10,2) DEFAULT NULL,
  `id_editore` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_libro_editore` (`id_editore`),
  CONSTRAINT `fk_libro_editore` FOREIGN KEY (`id_editore`) REFERENCES `editore` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (1,'Il signore degli anelli',1000,25.99,1),(2,'Harry Potter e la pietra filosofale',400,12.99,2),(3,'1984',300,9.99,3),(4,'Orgoglio e pregiudizio',350,11.99,4),(5,'Cronache del ghiaccio e del fuoco',1200,29.99,1),(6,'Il nome della rosa',500,14.99,5),(7,'To Kill a Mockingbird',320,10.99,6),(8,'The Great Gatsby',400,12.99,7),(9,'Don Quijote',900,21.99,8),(10,'Pride and Prejudice',350,11.99,4);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-03 13:53:12
