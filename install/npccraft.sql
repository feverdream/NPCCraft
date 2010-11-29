
-- phpMyAdmin SQL Dump
-- version 3.3.8
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 29, 2010 at 12:11 AM
-- Server version: 5.1.49
-- PHP Version: 5.3.3-1ubuntu9.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `minecraft`
--

-- --------------------------------------------------------

--
-- Table structure for table `npccraft`
--

CREATE TABLE IF NOT EXISTS `npccraft` (
  `npcid` int(11) NOT NULL AUTO_INCREMENT,
  `npcname` varchar(15) NOT NULL,
  `npclast_x` float NOT NULL,
  `npclast_y` float NOT NULL,
  `npclast_z` float NOT NULL,
  `npcbound_1_x` float NOT NULL,
  `npcbound_1_y` float NOT NULL,
  `npcbound_1_z` float NOT NULL,
  `npcbound_2_x` float NOT NULL,
  `npcbound_2_y` float NOT NULL,
  `npcbound_2_z` float NOT NULL,
  `npcbound_3_x` float NOT NULL,
  `npcbound_3_y` float NOT NULL,
  `npcbound_3_z` float NOT NULL,
  `npcbound_4_x` float NOT NULL,
  `npcbound_4_y` float NOT NULL,
  `npcbound_4_z` float NOT NULL,
  `npcalignment` int(11) NOT NULL COMMENT '0 = good 1 = evil 2 = chaotic 3 = neutral',
  `npchome_x` float NOT NULL,
  `npchome_y` float NOT NULL,
  `npchome_z` float NOT NULL,
  `npcsiminv_loc_x` float NOT NULL,
  `npcsiminv_loc_y` float NOT NULL,
  `npcsiminv_loc_z` float NOT NULL,
  `npcaiscript` varchar(15) NOT NULL,
  `npcskin` varchar(200) NOT NULL,
  `npcbirth` varchar(25) NOT NULL,
  `npcbirth_loc_x` float NOT NULL,
  `npcbirth_loc_y` float NOT NULL,
  `npcbirth_loc_z` float NOT NULL,
  `npcbuildmode` int(11) NOT NULL COMMENT '0 == off 1 == on',
  `npcbuildmodeldir` varchar(200) NOT NULL,
  PRIMARY KEY (`npcid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `npccraft`
--

