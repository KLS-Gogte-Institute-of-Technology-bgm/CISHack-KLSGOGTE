-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 24, 2021 at 12:25 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `elearn`
--

-- --------------------------------------------------------

--
-- Table structure for table `profilestable`
--

DROP TABLE IF EXISTS `profilestable`;
CREATE TABLE IF NOT EXISTS `profilestable` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `fullName` varchar(255) NOT NULL,
  `homeAddress` varchar(255) NOT NULL,
  `phoneNumber` varchar(255) NOT NULL,
  `joinedDate` date DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profilestable`
--

INSERT INTO `profilestable` (`userId`, `fullName`, `homeAddress`, `phoneNumber`, `joinedDate`) VALUES
(1, 'Basavraj Pandey', 'Tilakwadi,Belgaum', '9977885544', '2019-07-14'),
(2, 'Ananaya Kapoor', 'Rani Chenamma nagar,Belgaum', '9977885533', '2019-07-17'),
(3, 'Snehal Chaudary', 'Sambra,Belgaum', '9977885522', '2019-07-18');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) NOT NULL,
  `password` varchar(20) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `user_name`, `password`, `phone_number`) VALUES
(1, 'Rahul Patil', 'abcd1234', '9988776655'),
(2, 'Virat Singh', 'VS1234', '9988665577'),
(3, 'Abrahim D\'souza', 'AD1234', '9988775566');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
