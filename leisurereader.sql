/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : leisurereader

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-04-01 17:55:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book` (
  `book_id` varchar(255) CHARACTER SET utf8 NOT NULL,
  `book_user_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`book_id`),
  KEY `book_user_id` (`book_user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `user_password` varchar(255) NOT NULL,
  PRIMARY KEY (`user_name`),
  KEY `user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
