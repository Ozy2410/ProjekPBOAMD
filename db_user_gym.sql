-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2024 at 03:45 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_user_gym`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_bayaran`
--

CREATE TABLE `tb_bayaran` (
  `no` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_hp` varchar(16) NOT NULL,
  `email` varchar(50) NOT NULL,
  `bayaran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_bayaran`
--

INSERT INTO `tb_bayaran` (`no`, `nama`, `no_hp`, `email`, `bayaran`) VALUES
(4, 'Aziz1', '081824918247', 'Az@gmail.com', 'Rp. 100.000'),
(5, 'Reza Fahlevi', '0819471075', 'rezaF@gmail.com', 'Rp. 750.000');

-- --------------------------------------------------------

--
-- Table structure for table `tb_login`
--

CREATE TABLE `tb_login` (
  `no` int(11) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `pass` varchar(16) DEFAULT NULL,
  `conf_pass` varchar(16) DEFAULT NULL,
  `nama_panjang` varchar(150) DEFAULT NULL,
  `tanggal_lahir` varchar(50) DEFAULT NULL,
  `gender` varchar(25) DEFAULT NULL,
  `paket` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_login`
--

INSERT INTO `tb_login` (`no`, `username`, `email`, `pass`, `conf_pass`, `nama_panjang`, `tanggal_lahir`, `gender`, `paket`) VALUES
(77, 'FHD', 'rezaR@gmail.com', '12345', '12345', 'Reza Fahlevi', '12-June-2015', 'Male', 'Monthly'),
(78, 'admin', NULL, 'admin', 'admin', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tb_member`
--

CREATE TABLE `tb_member` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_hp` varchar(16) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(16) NOT NULL,
  `gym_time` varchar(16) NOT NULL,
  `id_member` int(11) NOT NULL,
  `tgl_lahir` varchar(20) NOT NULL,
  `bayaran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_member`
--

INSERT INTO `tb_member` (`id`, `nama`, `no_hp`, `email`, `gender`, `gym_time`, `id_member`, `tgl_lahir`, `bayaran`) VALUES
(62, 'Aziz1', '081824918247', 'Az@gmail.com', 'Male', '1 Month', 1001, '01-June-2024', 'Rp. 100.000'),
(63, 'Aziz2', '0812390218412', 'Az2@gmail.com', 'Male', '1 Month', 1002, '01-June-2024', 'Rp. 100.000'),
(64, 'AZIZ', '0810873014', 'AZIZ@gmail.com', 'Male', '1 Month', 1003, '01-June-2024', 'Rp. 100.000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_bayaran`
--
ALTER TABLE `tb_bayaran`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `tb_login`
--
ALTER TABLE `tb_login`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `tb_member`
--
ALTER TABLE `tb_member`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_member` (`id_member`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_bayaran`
--
ALTER TABLE `tb_bayaran`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tb_login`
--
ALTER TABLE `tb_login`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT for table `tb_member`
--
ALTER TABLE `tb_member`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
