-- -------------------------------------------------------------
-- TablePlus 3.12.6(366)
--
-- https://tableplus.com/
--
-- Database: farmfoods
-- Generation Time: 2021-05-09 23:47:53.1830
-- -------------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


CREATE TABLE `item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `is_active` tinyint(1) DEFAULT NULL,
  `is_available` tinyint(1) DEFAULT NULL,
  `category1` varchar(255) DEFAULT NULL,
  `category2` varchar(255) DEFAULT NULL,
  `display_name` varchar(255) DEFAULT NULL,
  `expiry_date` date DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `packed_date` date DEFAULT NULL,
  `price` decimal(19,2) DEFAULT NULL,
  `producer_id` bigint(20) DEFAULT NULL,
  `quantity` decimal(19,2) DEFAULT NULL,
  `rating` float DEFAULT NULL,
  `total_ratings` bigint(20) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `variety` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `producer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `about` varchar(255) DEFAULT NULL,
  `address1` varchar(255) DEFAULT NULL,
  `address2` varchar(255) DEFAULT NULL,
  `ara` varchar(255) DEFAULT NULL,
  `avg_rating` float DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `latitude` varchar(255) DEFAULT NULL,
  `longitude` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `near_by` varchar(255) DEFAULT NULL,
  `phone_no1` varchar(255) DEFAULT NULL,
  `phone_no2` varchar(255) DEFAULT NULL,
  `pincode` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `total_ratings` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;