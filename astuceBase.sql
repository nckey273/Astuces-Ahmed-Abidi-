-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 21, 2019 at 11:43 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `astuces`
--

CREATE TABLE `astuces` (
  `Id_Astuce` int(11) NOT NULL,
  `Titre_Astuce` varchar(255) NOT NULL,
  `Type_Astuce` varchar(30) NOT NULL,
  `Desc_Astuce` varchar(255) NOT NULL,
  `Image_Astuce` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `astuces`
--

INSERT INTO `astuces` (`Id_Astuce`, `Titre_Astuce`, `Type_Astuce`, `Desc_Astuce`, `Image_Astuce`) VALUES
(18, 'dfgdfgdf', 'fhfhfghg', 'zefefsd', 'iA6MhOcf.jpg'),
(19, 'dfgdfgdf', 'fhfhfghg', 'zefefsd', '3loIIrvy.jpg'),
(20, 'Ahmed', 'Abidi', 'Ahmedfezfzf', '9QA6AB4T.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `id` int(4) NOT NULL,
  `nom` varchar(8) NOT NULL,
  `prenom` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`id`, `nom`, `prenom`) VALUES
(1, 'med', 'amin'),
(2, 'raed', 'cherif'),
(3, 'med', 'amin'),
(4, 'med', 'ali'),
(5, 'raed', 'cherif'),
(6, 'med', 'amin');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('name', 'pass'),
('name', 'pass'),
('namefg', 'passgdfg'),
('amal', 'kekely');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `fname`, `lname`, `age`) VALUES
(1, 'HA', 'SA', 11),
(1, 'ffdg', 'dfgd', 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `astuces`
--
ALTER TABLE `astuces`
  ADD PRIMARY KEY (`Id_Astuce`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `astuces`
--
ALTER TABLE `astuces`
  MODIFY `Id_Astuce` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `test`
--
ALTER TABLE `test`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
