-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 31, 2021 at 08:55 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cine`
--
CREATE DATABASE `cine` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `cine`;

-- --------------------------------------------------------

--
-- Table structure for table `butaca_letra`
--

CREATE TABLE `butaca_letra` (
  `letra` varchar(10) NOT NULL,
  `fila` int(11) NOT NULL,
  `butaca` varchar(10) NOT NULL,
  `pos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `butaca_letra`
--

INSERT INTO `butaca_letra` (`letra`, `fila`, `butaca`, `pos`) VALUES
('A', 1, '1A', 0),
('B', 1, '1B', 1),
('C', 1, '1C', 2),
('D', 1, '1D', 3),
('E', 1, '1E', 4),
('F', 1, '1F', 5),
('G', 1, '1G', 6),
('H', 1, '1H', 7),
('PP', 1, '1 P', 8),
('I', 1, '1I', 9),
('J', 1, '1J', 10),
('K', 1, '1K', 11),
('L', 1, '1L', 12),
('M', 1, '1M', 13),
('N', 1, '1N', 14),
('Ñ', 1, '1Ñ', 15),
('O', 1, '1O', 16),
('PP', 1, '1 P', 17),
('P', 1, '1P', 18),
('Q', 1, '1Q', 19),
('R', 1, '1R', 20),
('S', 1, '1S', 21),
('T', 1, '1T', 22),
('V', 1, '1V', 23),
('W', 1, '1W', 24),
('X', 1, '1X', 25),
('A', 2, '2A', 26),
('B', 2, '2B', 27),
('C', 2, '2C', 28),
('D', 2, '2D', 29),
('E', 2, '2E', 30),
('F', 2, '2F', 31),
('G', 2, '2G', 32),
('H', 2, '2H', 33),
('PP', 2, '2 P', 34),
('I', 2, '2I', 35),
('J', 2, '2J', 36),
('K', 2, '2K', 37),
('L', 2, '2L', 38),
('M', 2, '2M', 39),
('N', 2, '2N', 40),
('Ñ', 2, '2Ñ', 41),
('O', 2, '2O', 42),
('PP', 2, '2 P', 43),
('P', 2, '2P', 44),
('Q', 2, '2Q', 45),
('R', 2, '2R', 46),
('S', 2, '2S', 47),
('T', 2, '2T', 48),
('V', 2, '2V', 49),
('W', 2, '2W', 50),
('X', 2, '2X', 51),
('A', 3, '3A', 52),
('B', 3, '3B', 53),
('C', 3, '3C', 54),
('D', 3, '3D', 55),
('E', 3, '3E', 56),
('F', 3, '3F', 57),
('G', 3, '3G', 58),
('H', 3, '3H', 59),
('PP', 3, '3 P', 60),
('I', 3, '3I', 61),
('J', 3, '3J', 62),
('K', 3, '3K', 63),
('L', 3, '3L', 64),
('M', 3, '3M', 65),
('N', 3, '3N', 66),
('Ñ', 3, '3Ñ', 67),
('O', 3, '3O', 68),
('PP', 3, '3 P', 69),
('P', 3, '3P', 70),
('Q', 3, '3Q', 71),
('R', 3, '3R', 72),
('S', 3, '3S', 73),
('T', 3, '3T', 74),
('V', 3, '3V', 75),
('W', 3, '3W', 76),
('X', 3, '3X', 77),
('A', 4, '4A', 78),
('B', 4, '4B', 79),
('C', 4, '4C', 80),
('D', 4, '4D', 81),
('E', 4, '4E', 82),
('F', 4, '4F', 83),
('G', 4, '4G', 84),
('H', 4, '4H', 85),
('PP', 4, '4 P', 86),
('I', 4, '4I', 87),
('J', 4, '4J', 88),
('K', 4, '4K', 89),
('L', 4, '4L', 90),
('M', 4, '4M', 91),
('N', 4, '4N', 92),
('Ñ', 4, '4Ñ', 93),
('O', 4, '4O', 94),
('PP', 4, '4 P', 95),
('P', 4, '4P', 96),
('Q', 4, '4Q', 97),
('R', 4, '4R', 98),
('S', 4, '4S', 99),
('T', 4, '4T', 100),
('V', 4, '4V', 101),
('W', 4, '4W', 102),
('X', 4, '4X', 103),
('A', 5, '5A', 104),
('B', 5, '5B', 105),
('C', 5, '5C', 106),
('D', 5, '5D', 107),
('E', 5, '5E', 108),
('F', 5, '5F', 109),
('G', 5, '5G', 110),
('H', 5, '5H', 111),
('PP', 5, '5 P', 112),
('I', 5, '5I', 113),
('J', 5, '5J', 114),
('K', 5, '5K', 115),
('L', 5, '5L', 116),
('M', 5, '5M', 117),
('N', 5, '5N', 118),
('Ñ', 5, '5Ñ', 119),
('O', 5, '5O', 120),
('PP', 5, '5 P', 121),
('P', 5, '5P', 122),
('Q', 5, '5Q', 123),
('R', 5, '5R', 124),
('S', 5, '5S', 125),
('T', 5, '5T', 126),
('V', 5, '5V', 127),
('W', 5, '5W', 128),
('X', 5, '5X', 129),
('A', 6, '6A', 130),
('B', 6, '6B', 131),
('C', 6, '6C', 132),
('D', 6, '6D', 133),
('E', 6, '6E', 134),
('F', 6, '6F', 135),
('G', 6, '6G', 136),
('H', 6, '6H', 137),
('PP', 6, '6 P', 138),
('I', 6, '6I', 139),
('J', 6, '6J', 140),
('K', 6, '6K', 141),
('L', 6, '6L', 142),
('M', 6, '6M', 143),
('N', 6, '6N', 144),
('Ñ', 6, '6Ñ', 145),
('O', 6, '6O', 146),
('PP', 6, '6 P', 147),
('P', 6, '6P', 148),
('Q', 6, '6Q', 149),
('R', 6, '6R', 150),
('S', 6, '6S', 151),
('T', 6, '6T', 152),
('V', 6, '6V', 153),
('W', 6, '6W', 154),
('X', 6, '6X', 155),
('A', 7, '7A', 156),
('B', 7, '7B', 157),
('C', 7, '7C', 158),
('D', 7, '7D', 159),
('E', 7, '7E', 160),
('F', 7, '7F', 161),
('G', 7, '7G', 162),
('H', 7, '7H', 163),
('PP', 7, '7 P', 164),
('I', 7, '7I', 165),
('J', 7, '7J', 166),
('K', 7, '7K', 167),
('L', 7, '7L', 168),
('M', 7, '7M', 169),
('N', 7, '7N', 170),
('Ñ', 7, '7Ñ', 171),
('O', 7, '7O', 172),
('PP', 7, '7 P', 173),
('P', 7, '7P', 174),
('Q', 7, '7Q', 175),
('R', 7, '7R', 176),
('S', 7, '7S', 177),
('T', 7, '7T', 178),
('V', 7, '7V', 179),
('W', 7, '7W', 180),
('X', 7, '7X', 181),
('A', 8, '8A', 182),
('B', 8, '8B', 183),
('C', 8, '8C', 184),
('D', 8, '8D', 185),
('E', 8, '8E', 186),
('F', 8, '8F', 187),
('G', 8, '8G', 188),
('H', 8, '8H', 189),
('PP', 8, '8 P', 190),
('I', 8, '8I', 191),
('J', 8, '8J', 192),
('K', 8, '8K', 193),
('L', 8, '8L', 194),
('M', 8, '8M', 195),
('N', 8, '8N', 196),
('Ñ', 8, '8Ñ', 197),
('O', 8, '8O', 198),
('PP', 8, '8 P', 199),
('P', 8, '8P', 200),
('Q', 8, '8Q', 201),
('R', 8, '8R', 202),
('S', 8, '8S', 203),
('T', 8, '8T', 204),
('V', 8, '8V', 205),
('W', 8, '8W', 206),
('X', 8, '8X', 207),
('A', 9, '9A', 208),
('B', 9, '9B', 209),
('C', 9, '9C', 210),
('D', 9, '9D', 211),
('E', 9, '9E', 212),
('F', 9, '9F', 213),
('G', 9, '9G', 214),
('H', 9, '9H', 215),
('PP', 9, '9 P', 216),
('I', 9, '9I', 217),
('J', 9, '9J', 218),
('K', 9, '9K', 219),
('L', 9, '9L', 220),
('M', 9, '9M', 221),
('N', 9, '9N', 222),
('Ñ', 9, '9Ñ', 223),
('O', 9, '9O', 224),
('PP', 9, '9 P', 225),
('P', 9, '9P', 226),
('Q', 9, '9Q', 227),
('R', 9, '9R', 228),
('S', 9, '9S', 229),
('T', 9, '9T', 230),
('V', 9, '9V', 231),
('W', 9, '9W', 232),
('X', 9, '9X', 233),
('A', 10, '10A', 234),
('B', 10, '10B', 235),
('C', 10, '10C', 236),
('D', 10, '10D', 237),
('E', 10, '10E', 238),
('F', 10, '10F', 239),
('G', 10, '10G', 240),
('H', 10, '10H', 241),
('I', 10, '10I', 242),
('J', 10, '10J', 243),
('K', 10, '10K', 244),
('L', 10, '10L', 245),
('M', 10, '10M', 246),
('N', 10, '10N', 247),
('Ñ', 10, '10Ñ', 248),
('O', 10, '10O', 249),
('P', 10, '10P', 250),
('Q', 10, '10Q', 251),
('R', 10, '10R', 252),
('S', 10, '10S', 253),
('T', 10, '10T', 254),
('V', 10, '10V', 255),
('W', 10, '10W', 256),
('X', 10, '10X', 257),
('Y', 10, '10Y', 258),
('Z', 10, '10Z', 259),
('AA', 10, '10AA', 260),
('AB', 10, '10AB', 261);

-- --------------------------------------------------------

--
-- Table structure for table `disponible`
--

CREATE TABLE `disponible` (
  `id` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `tid` int(11) NOT NULL,
  `fila` int(11) NOT NULL,
  `letra` varchar(3) NOT NULL,
  `butacas` varchar(4) NOT NULL,
  `estado` int(11) NOT NULL,
  `pos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `disponible`
--

INSERT INTO `disponible` (`id`, `pid`, `sid`, `tid`, `fila`, `letra`, `butacas`, `estado`, `pos`) VALUES
(1, 1, 1, 1, 1, 'A', '1A', 0, 0),
(2, 1, 1, 1, 1, 'B', '1B', 0, 1),
(3, 1, 1, 1, 1, 'C', '1C', 0, 2),
(4, 1, 1, 1, 1, 'D', '1D', 0, 3),
(5, 1, 1, 1, 1, 'E', '1E', 0, 4),
(6, 1, 1, 1, 1, 'F', '1F', 0, 5),
(7, 1, 1, 1, 1, 'G', '1G', 0, 6),
(8, 1, 1, 1, 1, 'H', '1H', 0, 7),
(9, 1, 1, 1, 1, 'PP', '1 P', 0, 8),
(10, 1, 1, 1, 1, 'I', '1I', 0, 9),
(11, 1, 1, 1, 1, 'J', '1J', 0, 10),
(12, 1, 1, 1, 1, 'K', '1K', 0, 11),
(13, 1, 1, 1, 1, 'L', '1L', 0, 12),
(14, 1, 1, 1, 1, 'M', '1M', 0, 13),
(15, 1, 1, 1, 1, 'N', '1N', 0, 14),
(16, 1, 1, 1, 1, 'Ñ', '1Ñ', 0, 15),
(17, 1, 1, 1, 1, 'O', '1O', 0, 16),
(18, 1, 1, 1, 1, 'PP', '1 P', 0, 17),
(19, 1, 1, 1, 1, 'P', '1P', 0, 18),
(20, 1, 1, 1, 1, 'Q', '1Q', 0, 19),
(21, 1, 1, 1, 1, 'R', '1R', 0, 20),
(22, 1, 1, 1, 1, 'S', '1S', 0, 21),
(23, 1, 1, 1, 1, 'T', '1T', 0, 22),
(24, 1, 1, 1, 1, 'V', '1V', 0, 23),
(25, 1, 1, 1, 1, 'W', '1W', 0, 24),
(26, 1, 1, 1, 1, 'X', '1X', 0, 25),
(27, 1, 1, 1, 2, 'A', '2A', 0, 26),
(28, 1, 1, 1, 2, 'B', '2B', 1, 27),
(29, 1, 1, 1, 2, 'C', '2C', 1, 28),
(30, 1, 1, 1, 2, 'D', '2D', 1, 29),
(31, 1, 1, 1, 2, 'E', '2E', 0, 30),
(32, 1, 1, 1, 2, 'F', '2F', 0, 31),
(33, 1, 1, 1, 2, 'G', '2G', 0, 32),
(34, 1, 1, 1, 2, 'H', '2H', 0, 33),
(35, 1, 1, 1, 2, 'PP', '2 P', 0, 34),
(36, 1, 1, 1, 2, 'I', '2I', 0, 35),
(37, 1, 1, 1, 2, 'J', '2J', 0, 36),
(38, 1, 1, 1, 2, 'K', '2K', 0, 37),
(39, 1, 1, 1, 2, 'L', '2L', 0, 38),
(40, 1, 1, 1, 2, 'M', '2M', 0, 39),
(41, 1, 1, 1, 2, 'N', '2N', 0, 40),
(42, 1, 1, 1, 2, 'Ñ', '2Ñ', 0, 41),
(43, 1, 1, 1, 2, 'O', '2O', 0, 42),
(44, 1, 1, 1, 2, 'PP', '2 P', 0, 43),
(45, 1, 1, 1, 2, 'P', '2P', 0, 44),
(46, 1, 1, 1, 2, 'Q', '2Q', 0, 45),
(47, 1, 1, 1, 2, 'R', '2R', 0, 46),
(48, 1, 1, 1, 2, 'S', '2S', 0, 47),
(49, 1, 1, 1, 2, 'T', '2T', 0, 48),
(50, 1, 1, 1, 2, 'V', '2V', 0, 49),
(51, 1, 1, 1, 2, 'W', '2W', 0, 50),
(52, 1, 1, 1, 2, 'X', '2X', 0, 51),
(53, 1, 1, 1, 3, 'A', '3A', 0, 52),
(54, 1, 1, 1, 3, 'B', '3B', 0, 53),
(55, 1, 1, 1, 3, 'C', '3C', 0, 54),
(56, 1, 1, 1, 3, 'D', '3D', 0, 55),
(57, 1, 1, 1, 3, 'E', '3E', 0, 56),
(58, 1, 1, 1, 3, 'F', '3F', 0, 57),
(59, 1, 1, 1, 3, 'G', '3G', 0, 58),
(60, 1, 1, 1, 3, 'H', '3H', 0, 59),
(61, 1, 1, 1, 3, 'PP', '3 P', 0, 60),
(62, 1, 1, 1, 3, 'I', '3I', 0, 61),
(63, 1, 1, 1, 3, 'J', '3J', 0, 62),
(64, 1, 1, 1, 3, 'K', '3K', 0, 63),
(65, 1, 1, 1, 3, 'L', '3L', 0, 64),
(66, 1, 1, 1, 3, 'M', '3M', 0, 65),
(67, 1, 1, 1, 3, 'N', '3N', 0, 66),
(68, 1, 1, 1, 3, 'Ñ', '3Ñ', 0, 67),
(69, 1, 1, 1, 3, 'O', '3O', 0, 68),
(70, 1, 1, 1, 3, 'PP', '3 P', 0, 69),
(71, 1, 1, 1, 3, 'P', '3P', 0, 70),
(72, 1, 1, 1, 3, 'Q', '3Q', 0, 71),
(73, 1, 1, 1, 3, 'R', '3R', 0, 72),
(74, 1, 1, 1, 3, 'S', '3S', 0, 73),
(75, 1, 1, 1, 3, 'T', '3T', 0, 74),
(76, 1, 1, 1, 3, 'V', '3V', 0, 75),
(77, 1, 1, 1, 3, 'W', '3W', 0, 76),
(78, 1, 1, 1, 3, 'X', '3X', 0, 77),
(79, 1, 1, 1, 4, 'A', '4A', 0, 78),
(80, 1, 1, 1, 4, 'B', '4B', 0, 79),
(81, 1, 1, 1, 4, 'C', '4C', 0, 80),
(82, 1, 1, 1, 4, 'D', '4D', 0, 81),
(83, 1, 1, 1, 4, 'E', '4E', 0, 82),
(84, 1, 1, 1, 4, 'F', '4F', 0, 83),
(85, 1, 1, 1, 4, 'G', '4G', 0, 84),
(86, 1, 1, 1, 4, 'H', '4H', 0, 85),
(87, 1, 1, 1, 4, 'PP', '4 P', 0, 86),
(88, 1, 1, 1, 4, 'I', '4I', 0, 87),
(89, 1, 1, 1, 4, 'J', '4J', 0, 88),
(90, 1, 1, 1, 4, 'K', '4K', 0, 89),
(91, 1, 1, 1, 4, 'L', '4L', 0, 90),
(92, 1, 1, 1, 4, 'M', '4M', 0, 91),
(93, 1, 1, 1, 4, 'N', '4N', 0, 92),
(94, 1, 1, 1, 4, 'Ñ', '4Ñ', 0, 93),
(95, 1, 1, 1, 4, 'O', '4O', 0, 94),
(96, 1, 1, 1, 4, 'PP', '4 P', 0, 95),
(97, 1, 1, 1, 4, 'P', '4P', 0, 96),
(98, 1, 1, 1, 4, 'Q', '4Q', 0, 97),
(99, 1, 1, 1, 4, 'R', '4R', 0, 98),
(100, 1, 1, 1, 4, 'S', '4S', 0, 99),
(101, 1, 1, 1, 4, 'T', '4T', 0, 100),
(102, 1, 1, 1, 4, 'V', '4V', 0, 101),
(103, 1, 1, 1, 4, 'W', '4W', 0, 102),
(104, 1, 1, 1, 4, 'X', '4X', 0, 103),
(105, 1, 1, 1, 5, 'A', '5A', 0, 104),
(106, 1, 1, 1, 5, 'B', '5B', 0, 105),
(107, 1, 1, 1, 5, 'C', '5C', 0, 106),
(108, 1, 1, 1, 5, 'D', '5D', 0, 107),
(109, 1, 1, 1, 5, 'E', '5E', 0, 108),
(110, 1, 1, 1, 5, 'F', '5F', 0, 109),
(111, 1, 1, 1, 5, 'G', '5G', 0, 110),
(112, 1, 1, 1, 5, 'H', '5H', 0, 111),
(113, 1, 1, 1, 5, 'PP', '5 P', 0, 112),
(114, 1, 1, 1, 5, 'I', '5I', 0, 113),
(115, 1, 1, 1, 5, 'J', '5J', 0, 114),
(116, 1, 1, 1, 5, 'K', '5K', 0, 115),
(117, 1, 1, 1, 5, 'L', '5L', 0, 116),
(118, 1, 1, 1, 5, 'M', '5M', 0, 117),
(119, 1, 1, 1, 5, 'N', '5N', 0, 118),
(120, 1, 1, 1, 5, 'Ñ', '5Ñ', 0, 119),
(121, 1, 1, 1, 5, 'O', '5O', 0, 120),
(122, 1, 1, 1, 5, 'PP', '5 P', 0, 121),
(123, 1, 1, 1, 5, 'P', '5P', 0, 122),
(124, 1, 1, 1, 5, 'Q', '5Q', 0, 123),
(125, 1, 1, 1, 5, 'R', '5R', 0, 124),
(126, 1, 1, 1, 5, 'S', '5S', 0, 125),
(127, 1, 1, 1, 5, 'T', '5T', 0, 126),
(128, 1, 1, 1, 5, 'V', '5V', 0, 127),
(129, 1, 1, 1, 5, 'W', '5W', 0, 128),
(130, 1, 1, 1, 5, 'X', '5X', 0, 129),
(131, 1, 1, 1, 6, 'A', '6A', 0, 130),
(132, 1, 1, 1, 6, 'B', '6B', 0, 131),
(133, 1, 1, 1, 6, 'C', '6C', 0, 132),
(134, 1, 1, 1, 6, 'D', '6D', 0, 133),
(135, 1, 1, 1, 6, 'E', '6E', 0, 134),
(136, 1, 1, 1, 6, 'F', '6F', 0, 135),
(137, 1, 1, 1, 6, 'G', '6G', 0, 136),
(138, 1, 1, 1, 6, 'H', '6H', 0, 137),
(139, 1, 1, 1, 6, 'PP', '6 P', 0, 138),
(140, 1, 1, 1, 6, 'I', '6I', 0, 139),
(141, 1, 1, 1, 6, 'J', '6J', 0, 140),
(142, 1, 1, 1, 6, 'K', '6K', 0, 141),
(143, 1, 1, 1, 6, 'L', '6L', 0, 142),
(144, 1, 1, 1, 6, 'M', '6M', 0, 143),
(145, 1, 1, 1, 6, 'N', '6N', 0, 144),
(146, 1, 1, 1, 6, 'Ñ', '6Ñ', 0, 145),
(147, 1, 1, 1, 6, 'O', '6O', 0, 146),
(148, 1, 1, 1, 6, 'PP', '6 P', 0, 147),
(149, 1, 1, 1, 6, 'P', '6P', 0, 148),
(150, 1, 1, 1, 6, 'Q', '6Q', 0, 149),
(151, 1, 1, 1, 6, 'R', '6R', 0, 150),
(152, 1, 1, 1, 6, 'S', '6S', 0, 151),
(153, 1, 1, 1, 6, 'T', '6T', 0, 152),
(154, 1, 1, 1, 6, 'V', '6V', 0, 153),
(155, 1, 1, 1, 6, 'W', '6W', 0, 154),
(156, 1, 1, 1, 6, 'X', '6X', 0, 155),
(157, 1, 1, 1, 7, 'A', '7A', 0, 156),
(158, 1, 1, 1, 7, 'B', '7B', 0, 157),
(159, 1, 1, 1, 7, 'C', '7C', 0, 158),
(160, 1, 1, 1, 7, 'D', '7D', 0, 159),
(161, 1, 1, 1, 7, 'E', '7E', 0, 160),
(162, 1, 1, 1, 7, 'F', '7F', 0, 161),
(163, 1, 1, 1, 7, 'G', '7G', 0, 162),
(164, 1, 1, 1, 7, 'H', '7H', 0, 163),
(165, 1, 1, 1, 7, 'PP', '7 P', 0, 164),
(166, 1, 1, 1, 7, 'I', '7I', 0, 165),
(167, 1, 1, 1, 7, 'J', '7J', 0, 166),
(168, 1, 1, 1, 7, 'K', '7K', 0, 167),
(169, 1, 1, 1, 7, 'L', '7L', 0, 168),
(170, 1, 1, 1, 7, 'M', '7M', 0, 169),
(171, 1, 1, 1, 7, 'N', '7N', 0, 170),
(172, 1, 1, 1, 7, 'Ñ', '7Ñ', 0, 171),
(173, 1, 1, 1, 7, 'O', '7O', 0, 172),
(174, 1, 1, 1, 7, 'PP', '7 P', 0, 173),
(175, 1, 1, 1, 7, 'P', '7P', 0, 174),
(176, 1, 1, 1, 7, 'Q', '7Q', 0, 175),
(177, 1, 1, 1, 7, 'R', '7R', 0, 176),
(178, 1, 1, 1, 7, 'S', '7S', 0, 177),
(179, 1, 1, 1, 7, 'T', '7T', 0, 178),
(180, 1, 1, 1, 7, 'V', '7V', 0, 179),
(181, 1, 1, 1, 7, 'W', '7W', 0, 180),
(182, 1, 1, 1, 7, 'X', '7X', 0, 181),
(183, 1, 1, 1, 8, 'A', '8A', 0, 182),
(184, 1, 1, 1, 8, 'B', '8B', 0, 183),
(185, 1, 1, 1, 8, 'C', '8C', 0, 184),
(186, 1, 1, 1, 8, 'D', '8D', 0, 185),
(187, 1, 1, 1, 8, 'E', '8E', 0, 186),
(188, 1, 1, 1, 8, 'F', '8F', 0, 187),
(189, 1, 1, 1, 8, 'G', '8G', 0, 188),
(190, 1, 1, 1, 8, 'H', '8H', 0, 189),
(191, 1, 1, 1, 8, 'PP', '8 P', 0, 190),
(192, 1, 1, 1, 8, 'I', '8I', 0, 191),
(193, 1, 1, 1, 8, 'J', '8J', 0, 192),
(194, 1, 1, 1, 8, 'K', '8K', 0, 193),
(195, 1, 1, 1, 8, 'L', '8L', 0, 194),
(196, 1, 1, 1, 8, 'M', '8M', 0, 195),
(197, 1, 1, 1, 8, 'N', '8N', 0, 196),
(198, 1, 1, 1, 8, 'Ñ', '8Ñ', 0, 197),
(199, 1, 1, 1, 8, 'O', '8O', 0, 198),
(200, 1, 1, 1, 8, 'PP', '8 P', 0, 199),
(201, 1, 1, 1, 8, 'P', '8P', 0, 200),
(202, 1, 1, 1, 8, 'Q', '8Q', 0, 201),
(203, 1, 1, 1, 8, 'R', '8R', 0, 202),
(204, 1, 1, 1, 8, 'S', '8S', 0, 203),
(205, 1, 1, 1, 8, 'T', '8T', 0, 204),
(206, 1, 1, 1, 8, 'V', '8V', 0, 205),
(207, 1, 1, 1, 8, 'W', '8W', 0, 206),
(208, 1, 1, 1, 8, 'X', '8X', 0, 207),
(209, 1, 1, 1, 9, 'A', '9A', 0, 208),
(210, 1, 1, 1, 9, 'B', '9B', 0, 209),
(211, 1, 1, 1, 9, 'C', '9C', 0, 210),
(212, 1, 1, 1, 9, 'D', '9D', 0, 211),
(213, 1, 1, 1, 9, 'E', '9E', 0, 212),
(214, 1, 1, 1, 9, 'F', '9F', 0, 213),
(215, 1, 1, 1, 9, 'G', '9G', 0, 214),
(216, 1, 1, 1, 9, 'H', '9H', 0, 215),
(217, 1, 1, 1, 9, 'PP', '9 P', 0, 216),
(218, 1, 1, 1, 9, 'I', '9I', 0, 217),
(219, 1, 1, 1, 9, 'J', '9J', 0, 218),
(220, 1, 1, 1, 9, 'K', '9K', 0, 219),
(221, 1, 1, 1, 9, 'L', '9L', 0, 220),
(222, 1, 1, 1, 9, 'M', '9M', 0, 221),
(223, 1, 1, 1, 9, 'N', '9N', 0, 222),
(224, 1, 1, 1, 9, 'Ñ', '9Ñ', 0, 223),
(225, 1, 1, 1, 9, 'O', '9O', 0, 224),
(226, 1, 1, 1, 9, 'PP', '9 P', 0, 225),
(227, 1, 1, 1, 9, 'P', '9P', 0, 226),
(228, 1, 1, 1, 9, 'Q', '9Q', 0, 227),
(229, 1, 1, 1, 9, 'R', '9R', 0, 228),
(230, 1, 1, 1, 9, 'S', '9S', 0, 229),
(231, 1, 1, 1, 9, 'T', '9T', 0, 230),
(232, 1, 1, 1, 9, 'V', '9V', 0, 231),
(233, 1, 1, 1, 9, 'W', '9W', 0, 232),
(234, 1, 1, 1, 9, 'X', '9X', 0, 233),
(235, 1, 1, 1, 10, 'A', '10A', 0, 234),
(236, 1, 1, 1, 10, 'B', '10B', 0, 235),
(237, 1, 1, 1, 10, 'C', '10C', 0, 236),
(238, 1, 1, 1, 10, 'D', '10D', 0, 237),
(239, 1, 1, 1, 10, 'E', '10E', 0, 238),
(240, 1, 1, 1, 10, 'F', '10F', 0, 239),
(241, 1, 1, 1, 10, 'G', '10G', 0, 240),
(242, 1, 1, 1, 10, 'H', '10H', 0, 241),
(243, 1, 1, 1, 10, 'I', '10I', 0, 242),
(244, 1, 1, 1, 10, 'J', '10J', 0, 243),
(245, 1, 1, 1, 10, 'K', '10K', 0, 244),
(246, 1, 1, 1, 10, 'L', '10L', 0, 245),
(247, 1, 1, 1, 10, 'M', '10M', 0, 246),
(248, 1, 1, 1, 10, 'N', '10N', 0, 247),
(249, 1, 1, 1, 10, 'Ñ', '10Ñ', 0, 248),
(250, 1, 1, 1, 10, 'O', '10O', 0, 249),
(251, 1, 1, 1, 10, 'P', '10P', 0, 250),
(252, 1, 1, 1, 10, 'Q', '10Q', 0, 251),
(253, 1, 1, 1, 10, 'R', '10R', 0, 252),
(254, 1, 1, 1, 10, 'S', '10S', 0, 253),
(255, 1, 1, 1, 10, 'T', '10T', 0, 254),
(256, 1, 1, 1, 10, 'V', '10V', 0, 255),
(257, 1, 1, 1, 10, 'W', '10W', 0, 256),
(258, 1, 1, 1, 10, 'X', '10X', 0, 257),
(259, 1, 1, 1, 10, 'Y', '10Y', 0, 258),
(260, 1, 1, 1, 10, 'Z', '10Z', 0, 259),
(261, 1, 1, 1, 10, 'AA', '10AA', 0, 260),
(262, 1, 1, 1, 10, 'AB', '10AB', 0, 261);

-- --------------------------------------------------------

--
-- Table structure for table `infogeneral`
--

CREATE TABLE `infogeneral` (
  `email` varchar(50) NOT NULL,
  `TelContacto` varchar(20) NOT NULL,
  `TelTaquilla` varchar(20) NOT NULL,
  `Parking_1` varchar(20) NOT NULL,
  `Parking_2` varchar(20) NOT NULL,
  `Direccion_1` varchar(100) NOT NULL,
  `Direccion_2` varchar(100) NOT NULL,
  `Direccion_3` varchar(100) NOT NULL,
  `Direccion_4` varchar(100) NOT NULL,
  `AccesoMinusvalido` varchar(10) NOT NULL,
  `Sonido` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `infogeneral`
--

INSERT INTO `infogeneral` (`email`, `TelContacto`, `TelTaquilla`, `Parking_1`, `Parking_2`, `Direccion_1`, `Direccion_2`, `Direccion_3`, `Direccion_4`, `AccesoMinusvalido`, `Sonido`) VALUES
('cine@gmail.com', '809-724-4875', '809-580-1111', 'Disponible', '400', 'Ave. Winston Churchill', 'Londres', 'ReinoUnido', '', 'Si', 'Dolby Digital Surround 7.1');

-- --------------------------------------------------------

--
-- Table structure for table `pagos`
--

CREATE TABLE `pagos` (
  `id` int(11) NOT NULL,
  `tarjeta` varchar(20) NOT NULL,
  `mes` varchar(10) NOT NULL,
  `ano` varchar(10) NOT NULL,
  `tel` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pagos`
--

INSERT INTO `pagos` (`id`, `tarjeta`, `mes`, `ano`, `tel`) VALUES
(1, '3453464634', '3', '34', '346346');

-- --------------------------------------------------------

--
-- Table structure for table `pases`
--

CREATE TABLE `pases` (
  `tid` int(11) NOT NULL,
  `hora` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pases`
--

INSERT INTO `pases` (`tid`, `hora`) VALUES
(1, '16:00'),
(2, '16:30'),
(3, '17:00'),
(4, '17:30'),
(5, '18:00'),
(7, '18:30'),
(8, '19:00');

-- --------------------------------------------------------

--
-- Table structure for table `pase_sala`
--

CREATE TABLE `pase_sala` (
  `id` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `tid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pase_sala`
--

INSERT INTO `pase_sala` (`id`, `sid`, `tid`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `peliculas`
--

CREATE TABLE `peliculas` (
  `pid` int(11) NOT NULL,
  `Titulo` varchar(50) NOT NULL,
  `Director` varchar(50) NOT NULL,
  `Nacionalidad` varchar(50) NOT NULL,
  `Genero` varchar(50) NOT NULL,
  `Clasificacion` varchar(50) NOT NULL,
  `Descr` varchar(4000) NOT NULL,
  `Duracion` double NOT NULL,
  `Actores` varchar(100) NOT NULL,
  `Link_Exterior` varchar(100) NOT NULL,
  `Link_Imagen` varchar(100) NOT NULL,
  `Estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `peliculas`
--

INSERT INTO `peliculas` (`pid`, `Titulo`, `Director`, `Nacionalidad`, `Genero`, `Clasificacion`, `Descr`, `Duracion`, `Actores`, `Link_Exterior`, `Link_Imagen`, `Estado`) VALUES
(1, 'Transformers', 'Michael Bay', 'Americana', 'Accion/Ciencia Ficción', 'PG-13', 'A long time ago, far away on the planet of Cybertron, a war was being waged between the noble Autobots (led by the wise Optimus Prime) and the devious Decepticons (commanded by the dreaded Megatron) for control over the Allspark, a mystical talisman that would grant unlimited power to whoever possessed it. The Autobots managed to smuggle the Allspark off the planet, but Megatron blasted off in search of it. He eventually tracked it to the planet of Earth (circa 1850), but his reckless desire for power sent him right into the Arctic Ocean, and the sheer cold forced him into a paralyzed state. His body was later found by Captain Archibald Witwicky, and before going into a comatose state Megatron used the last of his energy to engrave a map, showing the location of the Allspark, into the Captains glasses, and send a transmission to Cybertron. He is then carted away by the Captains ship. A century later, Sam Witwicky, nicknamed Spike by his friends, buys his first car. To his shock, he discovers it to be Bumblebee, an Autobot in disguise who is to protect Spike, as he bears the Captains glasses and the map carved on them. But Bumblebee is not the only Transformer to have arrived on Earth - in the desert of Qatar, the Decepticons Blackout and Scorponok attack a U.S. military base, causing the Pentagon to send their special Sector Seven agents to capture all specimens of this alien race, and Spike and his girlfriend Mikaela find themselves in the middle of a grand battle between the Autobots and the Decepticons, stretching from Hoover Dam all the way to Los Angeles. Meanwhile, within the depths of the Pentagon, the cryogenically stored form of Megatron awakens...\r\n\r\nHigh-school student Sam Witwicky buys his first car, who is actually the Autobot Bumblebee. Bumblebee defends Sam and his girlfriend Mikaela Banes from the Decepticon Barricade, before the other Autobots arrive on Earth. They are searching for the Allspark, and the war on Earth heats up as the Decepticons attack a United States military base in Qatar. Sam and Mikaela are taken by the top-secret agency Sector 7 to help stop the Decepticons, but when they learn the agency also intends to destroy the Autobots, they formulate their own plan to save the world', 144, 'Shia LaBeouf, 	Megan Fox, Josh Duhamel, Tyrese Gibson', 'http://www.transformersmovie.com/intl/es/', 'imagenes/TF.jpg', 1),
(2, 'Joshua', 'George Ratliff', 'Americana', 'Thriler', 'No Apta', 'The arrival of a newborn girl causes the gradual disintegration of the Cairn family; particularly for 9-year-old Joshua (Kogan), an eccentric boy whose proper upbringing and refined tastes both take a sinister turn.', 0, 'Sam Rockwell, Vera Farmiga, Celia Weston', 'http://imdb.com/title/tt0808331/', 'imagenes/JO.jpg', 1),
(15, 'Ratatouille', 'Brad Bird ', 'USA', 'Animación/Comedia', 'Apta', 'Remy is a rat, constantly risking life in an expensive French restaurant because of his love of good food, as well as a desire to become a chef. Yet, obviously, this is a rather tough dream for a rat. But opportunity knocks when a young boy, who desperately needs to keep his job at the restaurant, despite his lack of cooking abilities, discovers and partners the young Remy. Its up to the two of them to avoid the insane head chef, bring the rest of Remy\'s family up to his spaserds, win his partner a girl, and, of course, produce the finest Ratatouille in all of France.', 144, 'Brad Garrett, Lou Romano, Patton Oswalt', 'http://disney.go.com/disneypictures/ratatouille/', 'imagenes/RT.jpg', 1),
(16, 'Live Free or Die Hard', 'Len Wiseman ', 'USA', 'Acción/Aventura', 'PG-13', 'When a criminal plot is in place to take down the entire computer and technological structure that supports the economy of the United States (and the world), it\'s up to a decidedly \"old school\" hero, police detective John McClane, to take down the conspiracy, aided by a young hacker.', 130, 'Bruce Willis, Justin Long, Timothy Olyphant ', 'http://www.livefreeordiehard.com/', 'imagenes/DH.jpg', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pelicula_sala`
--

CREATE TABLE `pelicula_sala` (
  `id` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pelicula_sala`
--

INSERT INTO `pelicula_sala` (`id`, `sid`, `pid`, `estado`) VALUES
(1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `salas`
--

CREATE TABLE `salas` (
  `sid` int(11) NOT NULL,
  `descr` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `salas`
--

INSERT INTO `salas` (`sid`, `descr`) VALUES
(1, '1'),
(2, '2'),
(3, '3');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `uid` int(11) NOT NULL,
  `usuario` varchar(10) NOT NULL,
  `pclave` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`uid`, `usuario`, `pclave`) VALUES
(1, 'admin', 'admin'),
(2, 'cine', 'abc123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `butaca_letra`
--
ALTER TABLE `butaca_letra`
  ADD PRIMARY KEY (`pos`);

--
-- Indexes for table `disponible`
--
ALTER TABLE `disponible`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pid` (`pid`),
  ADD KEY `sid` (`sid`),
  ADD KEY `tid` (`tid`);

--
-- Indexes for table `infogeneral`
--
ALTER TABLE `infogeneral`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `pagos`
--
ALTER TABLE `pagos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pases`
--
ALTER TABLE `pases`
  ADD PRIMARY KEY (`tid`);

--
-- Indexes for table `pase_sala`
--
ALTER TABLE `pase_sala`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sid` (`sid`),
  ADD KEY `tid` (`tid`);

--
-- Indexes for table `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `pelicula_sala`
--
ALTER TABLE `pelicula_sala`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pid` (`pid`),
  ADD KEY `sid` (`sid`);

--
-- Indexes for table `salas`
--
ALTER TABLE `salas`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `disponible`
--
ALTER TABLE `disponible`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=263;

--
-- AUTO_INCREMENT for table `pagos`
--
ALTER TABLE `pagos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pases`
--
ALTER TABLE `pases`
  MODIFY `tid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `pase_sala`
--
ALTER TABLE `pase_sala`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `pelicula_sala`
--
ALTER TABLE `pelicula_sala`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `salas`
--
ALTER TABLE `salas`
  MODIFY `sid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `disponible`
--
ALTER TABLE `disponible`
  ADD CONSTRAINT `disponible_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `peliculas` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `disponible_ibfk_2` FOREIGN KEY (`sid`) REFERENCES `salas` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `disponible_ibfk_3` FOREIGN KEY (`tid`) REFERENCES `pases` (`tid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pase_sala`
--
ALTER TABLE `pase_sala`
  ADD CONSTRAINT `pase_sala_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `salas` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pase_sala_ibfk_2` FOREIGN KEY (`tid`) REFERENCES `pases` (`tid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pelicula_sala`
--
ALTER TABLE `pelicula_sala`
  ADD CONSTRAINT `pelicula_sala_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `peliculas` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pelicula_sala_ibfk_2` FOREIGN KEY (`sid`) REFERENCES `salas` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
