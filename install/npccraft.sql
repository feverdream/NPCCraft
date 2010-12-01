
-- phpMyAdmin SQL Dump
-- version 3.3.8
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 30, 2010 at 11:41 PM
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
  `npclast_x` double NOT NULL,
  `npclast_y` double NOT NULL,
  `npclast_z` double NOT NULL,
  `npcbound_1_x` double NOT NULL,
  `npcbound_1_y` double NOT NULL,
  `npcbound_1_z` double NOT NULL,
  `npcbound_2_x` double NOT NULL,
  `npcbound_2_y` double NOT NULL,
  `npcbound_2_z` double NOT NULL,
  `npcbound_3_x` double NOT NULL,
  `npcbound_3_y` double NOT NULL,
  `npcbound_3_z` double NOT NULL,
  `npcbound_4_x` double NOT NULL,
  `npcbound_4_y` double NOT NULL,
  `npcbound_4_z` double NOT NULL,
  `npcalignment` int(11) NOT NULL COMMENT '0 = good 1 = evil 2 = chaotic 3 = neutral',
  `npchome_x` double NOT NULL,
  `npchome_y` double NOT NULL,
  `npchome_z` double NOT NULL,
  `npcsiminv_loc_x` double NOT NULL,
  `npcsiminv_loc_y` double NOT NULL,
  `npcsiminv_loc_z` double NOT NULL,
  `npcaiscript` varchar(15) NOT NULL,
  `npcskin` varchar(200) NOT NULL,
  `npcbirth` varchar(25) NOT NULL,
  `npcbirth_loc_x` double NOT NULL,
  `npcbirth_loc_y` double NOT NULL,
  `npcbirth_loc_z` double NOT NULL,
  `npcbuildmode` int(11) NOT NULL COMMENT '0 == off 1 == on',
  `npcbuildmodeldir` varchar(200) NOT NULL,
  `npcrot` float NOT NULL,
  `npcpitch` float NOT NULL,
  `npcitminhand` int(11) NOT NULL,
  PRIMARY KEY (`npcid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `npccraft`
--

