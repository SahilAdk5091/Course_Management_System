-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 14, 2022 at 07:53 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `course_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `cname` varchar(20) DEFAULT NULL,
  `lev4f` varchar(50) DEFAULT NULL,
  `lev4s` varchar(50) DEFAULT NULL,
  `lev4t` varchar(50) DEFAULT NULL,
  `lev5f` varchar(50) DEFAULT NULL,
  `lev5s` varchar(50) DEFAULT NULL,
  `lev5t` varchar(50) DEFAULT NULL,
  `lev6f` varchar(50) DEFAULT NULL,
  `lev6s` varchar(50) DEFAULT NULL,
  `lev6t` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`cname`, `lev4f`, `lev4s`, `lev4t`, `lev5f`, `lev5s`, `lev5t`, `lev6f`, `lev6s`, `lev6t`) VALUES
('BIT', 'Academics', 'Introductory', 'Computing', 'Concept of AI', 'Object-Programming', 'Numerical Methods', 'Complex system', 'High performance', 'Big data'),
('BBM', 'Century Management', 'Success at University', 'Principle of Business', 'Innovative Business', 'Responsible Business', 'Digital Business', 'Project Planning', 'International HR', 'Pro Project');

-- --------------------------------------------------------

--
-- Table structure for table `enroll`
--

CREATE TABLE `enroll` (
  `student_id` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `first` varchar(100) DEFAULT NULL,
  `second` varchar(100) DEFAULT NULL,
  `third` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `enroll`
--

INSERT INTO `enroll` (`student_id`, `name`, `first`, `second`, `third`) VALUES
('2060275', 'Sahil Adhikari', 'PYTHON', 'JAVA', 'C');

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

CREATE TABLE `instructor` (
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `course` varchar(50) DEFAULT NULL,
  `Teacherno` int(11) DEFAULT NULL,
  `level4` varchar(50) DEFAULT NULL,
  `level5` varchar(60) DEFAULT NULL,
  `level6` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `instructor`
--

INSERT INTO `instructor` (`fname`, `lname`, `course`, `Teacherno`, `level4`, `level5`, `level6`) VALUES
('Rukesh', 'Shrestha', 'BIT', 3002408, 'Academiocs', 'Introductory', 'Computing');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `student_no` int(11) DEFAULT NULL,
  `marks1` int(11) DEFAULT NULL,
  `marks2` int(11) DEFAULT NULL,
  `marks3` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`student_no`, `marks1`, `marks2`, `marks3`) VALUES
(2065029, 60, 70, 90);

-- --------------------------------------------------------

--
-- Table structure for table `module1`
--

CREATE TABLE `module1` (
  `first` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `module1`
--

INSERT INTO `module1` (`first`) VALUES
('Academics'),
('Concept of AI'),
('Complex system'),
('Century Management'),
('Innovative Business'),
('Project Planning');

-- --------------------------------------------------------

--
-- Table structure for table `module2`
--

CREATE TABLE `module2` (
  `second` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `module2`
--

INSERT INTO `module2` (`second`) VALUES
('Introductory'),
('Object-Programming'),
('High performance'),
('Success at University'),
('Responsible Business'),
('International HR');

-- --------------------------------------------------------

--
-- Table structure for table `module3`
--

CREATE TABLE `module3` (
  `third` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `module3`
--

INSERT INTO `module3` (`third`) VALUES
('Computing'),
('Numerical Methods'),
('Big data'),
('Principle of Business'),
('Digital Business'),
('Pro Project');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone_no` varchar(20) DEFAULT NULL,
  `email` varchar(320) DEFAULT NULL,
  `course` varchar(50) DEFAULT NULL,
  `roll` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`fname`, `lname`, `age`, `DOB`, `address`, `phone_no`, `email`, `course`, `roll`) VALUES
('Sahil', 'Adhikari', 20, '2003-01-06', 'Naya-Baneshwor,KTM', '9807991363', 'sahiladk345@gmail.com', 'BIT', 2065029);

-- --------------------------------------------------------

--
-- Table structure for table `student_course`
--

CREATE TABLE `student_course` (
  `studentname` varchar(50) DEFAULT NULL,
  `studentno` varchar(50) DEFAULT NULL,
  `courses` varchar(50) DEFAULT NULL,
  `module1` varchar(50) DEFAULT NULL,
  `module2` varchar(50) DEFAULT NULL,
  `module3` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_course`
--

INSERT INTO `student_course` (`studentname`, `studentno`, `courses`, `module1`, `module2`, `module3`) VALUES
('Sahil Adhkari', '2065029', 'BIT', 'Academics', 'Introductory', 'Computing');

-- --------------------------------------------------------

--
-- Table structure for table `student_details`
--

CREATE TABLE `student_details` (
  `fname` varchar(20) DEFAULT NULL,
  `lname` varchar(20) DEFAULT NULL,
  `roll` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_details`
--

INSERT INTO `student_details` (`fname`, `lname`, `roll`) VALUES
('Sahil', 'Adhikari', 2065029);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `student_no` int(11) DEFAULT NULL,
  `Module1` varchar(60) DEFAULT NULL,
  `Module2` varchar(60) DEFAULT NULL,
  `Module3` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`student_no`, `Module1`, `Module2`, `Module3`) VALUES
(2065029, 'Academics', 'Introductory', 'Computing');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `name` varchar(20) DEFAULT NULL,
  `coursename` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
