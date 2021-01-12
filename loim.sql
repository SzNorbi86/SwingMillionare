CREATE DATABASE  IF NOT EXISTS `loim` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci */;
USE `loim`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: loim
-- ------------------------------------------------------
-- Server version	5.7.25

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
-- Table structure for table `kerdes`
--

DROP TABLE IF EXISTS `kerdes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kerdes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kerdes` varchar(200) COLLATE utf8_hungarian_ci NOT NULL,
  `valasz0` varchar(200) COLLATE utf8_hungarian_ci NOT NULL,
  `valasz1` varchar(200) COLLATE utf8_hungarian_ci NOT NULL,
  `valasz2` varchar(200) COLLATE utf8_hungarian_ci NOT NULL,
  `valasz3` varchar(200) COLLATE utf8_hungarian_ci NOT NULL,
  `helyesvalasz` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kerdes`
--

LOCK TABLES `kerdes` WRITE;
/*!40000 ALTER TABLE `kerdes` DISABLE KEYS */;
INSERT INTO `kerdes` VALUES (1,'Mi Magyarország fővárosa?','Bukarest','Budapest','Bécs','Ferencváros',1),(2,'Melyik kontinensen folyik az Amazonas?','Észak-Amerika','Ausztrália','Dél-Amerika','Európa',2),(3,'Hány hidrogénatomot tartalmaz a vízmolekula?','0','1','2','3',2),(4,'Minek a mértékegysége a láb?','térfogat','tömeg','idő','távolság',3),(5,'Mikor volt a kiegyezés?','1876','1867','1849','1889',1),(6,'Hány Forma 1-es világbajnokságot nyert meg Mika Hakkinen?','1','2','3','4',1),(7,'Mikor rendezték meg az első Formula–1 Magyar Nagydíjat?','1987','1990','1986','1991',2),(8,'Mi az erdőtüzek oltásának legelterjedtebb módja?','A repülőgépekről való vízszórás','Oltóhab fújása tartálykocsikból','Homokszórás','Ellentűz gyújtása',0),(9,'Hány pont van a dobókockán?','6','17','21','23',2),(10,'Melyik zászlóban nincs piros szín?','Magyar','Olasz','Török','Argentín',3),(11,'Az A4-es papírméret hányada az A0-nak?','Fele','Negyede','Nyolcada','Tizenhatoda',3),(12,'Mi látható az 500 forintos bankjegy hátoldalán?','Az ideiglenes magyar képviselőház Pesten','Hercules kút','A sárospataki vár','Bethlen Gábor tudósai között',2),(13,'Hány különféle állatot láthattak a budapesti Állatkert megnyitásakor a látogatók?','kb 250 félét','kb 500 félét','kb 1000 félét','kb 750 félét',1),(14,'Mit nem szabad tenni egy vakvezető kutya esetében?','megsimogatni','etetni','mindkettőt lehet','egyiket sem, mert elvonja a kutya figyelmét, és ez veszélyeztetheti gazdája testi épségét',3),(15,'Mi volt a szamurájok 5 kötelezően fejlesztendő képessége?','hadvezetés, kardforgatás, harcművészet, lovaglás, vallás','harcművészet, íjászat, kalligráfia, kardforgatás, teaszertartás','kardforgatás, harcművészet, íjászat, lovaglás, költészet','kardforgatás, íjászat, harcművészet, hadvezetés, nyomolvasás',2);
/*!40000 ALTER TABLE `kerdes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-23 13:34:41
