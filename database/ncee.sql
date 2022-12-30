/*
 Navicat MySQL Data Transfer

 Source Server         : newone
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : ncee

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 30/12/2022 16:38:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for allstudent
-- ----------------------------
DROP TABLE IF EXISTS `allstudent`;
CREATE TABLE `allstudent`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编号',
  `exam_num` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考号',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `chinese` int NULL DEFAULT NULL COMMENT '语文',
  `math` int NULL DEFAULT NULL COMMENT '数学',
  `english` int NULL DEFAULT NULL COMMENT '英语',
  `total_point` int NULL DEFAULT NULL COMMENT '总分',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 103 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of allstudent
-- ----------------------------
INSERT INTO `allstudent` VALUES (1, '8401111101', '杨清舜', 101, 120, 90, 396);
INSERT INTO `allstudent` VALUES (2, '8401111102', '韦晓钦', 112, 133, 120, 450);
INSERT INTO `allstudent` VALUES (3, '8401111103', '吴思浩', 90, 92, 110, 367);
INSERT INTO `allstudent` VALUES (4, '8401111104', '陈龙灿', 123, 90, 100, 379);
INSERT INTO `allstudent` VALUES (5, '8401111105', '陈昆', 87, 112, 94, 368);
INSERT INTO `allstudent` VALUES (6, '8401111106', '王华锋', 96, 113, 98, 393);
INSERT INTO `allstudent` VALUES (7, '8401111107', '梁文仲', 97, 110, 104, 399);
INSERT INTO `allstudent` VALUES (8, '8401111108', '刘敦杰', 95, 130, 105, 420);
INSERT INTO `allstudent` VALUES (9, '8401111109', '李浩彬', 94, 94, 99, 361);
INSERT INTO `allstudent` VALUES (10, '8401111110', '许哲淳', 98, 91, 89, 359);
INSERT INTO `allstudent` VALUES (11, '8401111111', '潘海彬', 100, 90, 83, 365);
INSERT INTO `allstudent` VALUES (12, '8401111112', '张理然', 125, 82, 92, 389);
INSERT INTO `allstudent` VALUES (13, '8401111113', '曹志荣', 113, 87, 88, 366);
INSERT INTO `allstudent` VALUES (14, '8401111114', '梁文辉', 121, 95, 137, 432);
INSERT INTO `allstudent` VALUES (15, '8401111115', '凌上军', 90, 120, 132, 424);
INSERT INTO `allstudent` VALUES (16, '0840111116', '黄小刚', 85, 135, 100, 403);
INSERT INTO `allstudent` VALUES (17, '0840111117', '林显拔', 83, 135, 92, 392);
INSERT INTO `allstudent` VALUES (18, '0840111118', '黄卓尔', 110, 111, 77, 382);
INSERT INTO `allstudent` VALUES (19, '0840111119', '袁子健', 90, 101, 97, 356);
INSERT INTO `allstudent` VALUES (20, '0840111120', '张奋', 120, 112, 95, 397);
INSERT INTO `allstudent` VALUES (21, '0840111121', '余兆钧', 110, 90, 94, 370);
INSERT INTO `allstudent` VALUES (22, '0840111122', '幸俊毅', 100, 123, 98, 386);
INSERT INTO `allstudent` VALUES (23, '0840111124', '周均霭', 94, 87, 100, 375);
INSERT INTO `allstudent` VALUES (24, '0840111124', '陈灏', 98, 96, 125, 405);
INSERT INTO `allstudent` VALUES (25, '0840111125', '马泽森', 104, 97, 113, 398);
INSERT INTO `allstudent` VALUES (26, '0840111126', '林豪荣', 105, 95, 121, 390);
INSERT INTO `allstudent` VALUES (27, '0840111127', '陆恩泽', 99, 94, 90, 370);
INSERT INTO `allstudent` VALUES (28, '0840111128', '刘志伟', 89, 98, 85, 346);
INSERT INTO `allstudent` VALUES (29, '0840111129', '范芳振', 83, 100, 83, 356);
INSERT INTO `allstudent` VALUES (30, '0840111130', '颜俊滨', 92, 125, 110, 413);
INSERT INTO `allstudent` VALUES (33, '8401111201', '许超', 121, 120, 87, 402);
INSERT INTO `allstudent` VALUES (34, '8401111202', '白伟泉', 90, 135, 85, 391);
INSERT INTO `allstudent` VALUES (35, '8401111203', '翟冠荣', 85, 135, 85, 397);
INSERT INTO `allstudent` VALUES (36, '8401111204', '许海涛', 83, 111, 75, 359);
INSERT INTO `allstudent` VALUES (37, '8401111205', '梁剑华', 110, 101, 66, 355);
INSERT INTO `allstudent` VALUES (38, '8401111206', '李德财', 90, 112, 75, 356);
INSERT INTO `allstudent` VALUES (39, '8401111207', '罗文飞', 120, 90, 86, 378);
INSERT INTO `allstudent` VALUES (40, '8401111208', '邓霞兰', 110, 123, 88, 404);
INSERT INTO `allstudent` VALUES (41, '8401111209', '谭振勇', 100, 97, 90, 369);
INSERT INTO `allstudent` VALUES (42, '8401111210', '段卓', 94, 95, 74, 347);
INSERT INTO `allstudent` VALUES (43, '8401111211', '林涛', 98, 94, 81, 341);
INSERT INTO `allstudent` VALUES (44, '8401111212', '陈宏彬', 104, 98, 92, 364);
INSERT INTO `allstudent` VALUES (45, '8401111213', '侯宇松', 112, 100, 90, 378);
INSERT INTO `allstudent` VALUES (46, '8401111214', '钟沛伦', 90, 125, 78, 358);
INSERT INTO `allstudent` VALUES (47, '8401111215', '黄永锋', 123, 113, 79, 409);
INSERT INTO `allstudent` VALUES (48, '0840111216', '林瑞焊', 87, 121, 82, 376);
INSERT INTO `allstudent` VALUES (49, '0840111217', '何彬', 96, 89, 83, 352);
INSERT INTO `allstudent` VALUES (50, '0840111218', '李龙形', 97, 87, 118, 371);
INSERT INTO `allstudent` VALUES (51, '0840111219', '李敏华', 95, 96, 96, 374);
INSERT INTO `allstudent` VALUES (52, '0840111220', '陈亮', 94, 95, 98, 361);
INSERT INTO `allstudent` VALUES (53, '0840111221', '沙永豪', 98, 94, 96, 378);
INSERT INTO `allstudent` VALUES (54, '0840111222', '陈庆从', 100, 98, 95, 379);
INSERT INTO `allstudent` VALUES (55, '0840111223', '吉白', 125, 100, 87, 396);
INSERT INTO `allstudent` VALUES (56, '0840111224', '谢启骢', 113, 125, 66, 372);
INSERT INTO `allstudent` VALUES (57, '0840111225', '郭叙国', 121, 113, 70, 374);
INSERT INTO `allstudent` VALUES (58, '0840111226', '冼康筠', 90, 121, 90, 377);
INSERT INTO `allstudent` VALUES (59, '0840111227', '廖健', 85, 90, 110, 350);
INSERT INTO `allstudent` VALUES (60, '0840111228', '黄晓生', 83, 85, 107, 369);
INSERT INTO `allstudent` VALUES (61, '0840111229', '何嘉驹', 100, 83, 120, 389);
INSERT INTO `allstudent` VALUES (62, '0840111230', '虞利敏', 116, 100, 89, 389);
INSERT INTO `allstudent` VALUES (64, '8401111301', '巫丹', 113, 87, 120, 503);
INSERT INTO `allstudent` VALUES (65, '8401111302', '张家杰', 121, 85, 110, 485);
INSERT INTO `allstudent` VALUES (66, '8401111303', '翁耀彬', 90, 85, 100, 451);
INSERT INTO `allstudent` VALUES (67, '8401111304', '钟泽坤', 99, 75, 94, 425);
INSERT INTO `allstudent` VALUES (68, '8401111305', '罗建军', 112, 66, 98, 429);
INSERT INTO `allstudent` VALUES (69, '8401111306', '管凌玉', 110, 75, 104, 438);
INSERT INTO `allstudent` VALUES (70, '8401111307', '潘倩珺', 90, 86, 105, 457);
INSERT INTO `allstudent` VALUES (71, '8401111308', '郑志腾', 120, 88, 99, 481);
INSERT INTO `allstudent` VALUES (72, '8401111309', '黄东辉', 110, 90, 89, 463);
INSERT INTO `allstudent` VALUES (73, '8401111310', '张艳美', 100, 74, 83, 412);
INSERT INTO `allstudent` VALUES (74, '8401111311', '林苏', 100, 81, 92, 428);
INSERT INTO `allstudent` VALUES (75, '8401111312', '张智媚', 98, 92, 88, 435);
INSERT INTO `allstudent` VALUES (76, '8401111313', '郑瑞丽', 104, 90, 137, 467);
INSERT INTO `allstudent` VALUES (77, '8401111314', '曾思远', 105, 78, 132, 493);
INSERT INTO `allstudent` VALUES (78, '8401111315', '温紫良', 99, 79, 100, 432);
INSERT INTO `allstudent` VALUES (79, '0840111316', '姚多雅', 116, 82, 110, 479);
INSERT INTO `allstudent` VALUES (80, '0840111317', '欧阳英洁', 130, 83, 90, 475);
INSERT INTO `allstudent` VALUES (81, '0840111318', '燕小林', 100, 118, 120, 508);
INSERT INTO `allstudent` VALUES (82, '0840111319', '区城玮', 125, 96, 110, 491);
INSERT INTO `allstudent` VALUES (83, '0840111320', '劳月凤', 113, 98, 100, 452);
INSERT INTO `allstudent` VALUES (84, '0840111321', '李洋', 121, 96, 100, 458);
INSERT INTO `allstudent` VALUES (85, '0840111322', '江帆劲', 98, 95, 98, 452);
INSERT INTO `allstudent` VALUES (86, '0840111323', '余德龙', 104, 87, 104, 468);
INSERT INTO `allstudent` VALUES (87, '0840111324', '曾华潇', 105, 66, 105, 438);
INSERT INTO `allstudent` VALUES (88, '0840111325', '周锐', 99, 70, 99, 448);
INSERT INTO `allstudent` VALUES (89, '0840111326', '李雪媛', 116, 90, 116, 495);
INSERT INTO `allstudent` VALUES (90, '0840111327', '钟倩茵', 130, 110, 130, 541);
INSERT INTO `allstudent` VALUES (91, '0840111328', '黄建森', 100, 99, 100, 468);
INSERT INTO `allstudent` VALUES (92, '0840111329', '黄丽玲', 125, 97, 125, 491);
INSERT INTO `allstudent` VALUES (93, '0840111330', '陈伟浩', 90, 110, 111, 464);

-- ----------------------------
-- Table structure for art
-- ----------------------------
DROP TABLE IF EXISTS `art`;
CREATE TABLE `art`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编号',
  `exam_num` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考号',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` enum('男','女') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `high_school` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中学名称',
  `chinese` int NULL DEFAULT NULL COMMENT '语文',
  `math` int NULL DEFAULT NULL COMMENT '数学',
  `english` int NULL DEFAULT NULL COMMENT '英语',
  `fine_arts` int NULL DEFAULT NULL COMMENT '美术',
  `total_point` int NULL DEFAULT NULL COMMENT '总分',
  `area` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地区',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of art
-- ----------------------------
INSERT INTO `art` VALUES (1, '8401111101', '杨清舜', '男', '深圳中学', 101, 120, 90, 85, 396, '深圳');
INSERT INTO `art` VALUES (2, '8401111102', '韦晓钦', '女', '深圳中学', 112, 133, 120, 85, 450, '深圳');
INSERT INTO `art` VALUES (3, '8401111103', '吴思浩', '男', '深圳中学', 90, 92, 110, 75, 367, '深圳');
INSERT INTO `art` VALUES (4, '8401111104', '陈龙灿', '男', '深圳中学', 123, 90, 100, 66, 379, '深圳');
INSERT INTO `art` VALUES (5, '8401111105', '陈昆', '女', '从化中学', 87, 112, 94, 75, 368, '广州');
INSERT INTO `art` VALUES (6, '8401111106', '王华锋', '男', '从化中学', 96, 113, 98, 86, 393, '广州');
INSERT INTO `art` VALUES (7, '8401111107', '梁文仲', '女', '从化中学', 97, 110, 104, 88, 399, '广州');
INSERT INTO `art` VALUES (8, '8401111108', '刘敦杰', '男', '梅州中学', 95, 130, 105, 90, 420, '梅州');
INSERT INTO `art` VALUES (9, '8401111109', '李浩彬', '男', '花都中学', 94, 94, 99, 74, 361, '广州');
INSERT INTO `art` VALUES (10, '8401111110', '许哲淳', '女', '肇庆中学', 98, 91, 89, 81, 359, '肇庆');
INSERT INTO `art` VALUES (11, '8401111111', '潘海彬', '女', '江门中学', 100, 90, 83, 92, 365, '江门');
INSERT INTO `art` VALUES (12, '8401111112', '张理然', '女', '从化中学', 125, 82, 92, 90, 389, '广州');
INSERT INTO `art` VALUES (13, '8401111113', '曹志荣', '男', '花都中学', 113, 87, 88, 78, 366, '广州');
INSERT INTO `art` VALUES (14, '8401111114', '梁文辉', '男', '白云中学', 121, 95, 137, 79, 432, '广州');
INSERT INTO `art` VALUES (15, '8401111115', '凌上军', '男', '从化中学', 90, 120, 132, 82, 424, '广州');
INSERT INTO `art` VALUES (16, '0840111116', '黄小刚', '男', '阳江中学', 85, 135, 100, 83, 403, '阳江');
INSERT INTO `art` VALUES (17, '0840111117', '林显拔', '女', '湛江中学', 83, 135, 92, 82, 392, '湛江');
INSERT INTO `art` VALUES (18, '0840111118', '黄卓尔', '女', '惠州中学', 110, 111, 77, 84, 382, '惠州');
INSERT INTO `art` VALUES (19, '0840111119', '袁子健', '男', '梅州中学', 90, 101, 97, 68, 356, '梅州');
INSERT INTO `art` VALUES (20, '0840111120', '张奋', '女', '花都中学', 120, 112, 95, 70, 397, '广州');
INSERT INTO `art` VALUES (21, '0840111121', '余兆钧', '女', '肇庆中学', 110, 90, 94, 76, 370, '肇庆');
INSERT INTO `art` VALUES (22, '0840111122', '幸俊毅', '男', '江门中学', 100, 123, 98, 65, 386, '江门');
INSERT INTO `art` VALUES (23, '0840111124', '周均霭', '女', '从化中学', 94, 87, 100, 94, 375, '广州');
INSERT INTO `art` VALUES (24, '0840111124', '陈灏', '女', '花都中学', 98, 96, 125, 86, 405, '广州');
INSERT INTO `art` VALUES (25, '0840111125', '马泽森', '男', '白云中学', 104, 97, 113, 84, 398, '广州');
INSERT INTO `art` VALUES (26, '0840111126', '林豪荣', '男', '从化中学', 105, 95, 121, 69, 390, '广州');
INSERT INTO `art` VALUES (27, '0840111127', '陆恩泽', '女', '阳江中学', 99, 94, 90, 87, 370, '阳江');
INSERT INTO `art` VALUES (28, '0840111128', '刘志伟', '男', '白云中学', 89, 98, 85, 74, 346, '广州');
INSERT INTO `art` VALUES (29, '0840111129', '范芳振', '女', '梅州中学', 83, 100, 83, 90, 356, '梅州');
INSERT INTO `art` VALUES (30, '0840111130', '颜俊滨', '男', '深圳中学', 92, 125, 110, 86, 413, '深圳');

-- ----------------------------
-- Table structure for english
-- ----------------------------
DROP TABLE IF EXISTS `english`;
CREATE TABLE `english`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编号',
  `exam_num` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考号',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `chinese` int NULL DEFAULT NULL COMMENT '语文',
  `math` int NULL DEFAULT NULL COMMENT '数学',
  `english` int NULL DEFAULT NULL COMMENT '英语',
  `total_point` int NULL DEFAULT NULL COMMENT '总分',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 124 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of english
-- ----------------------------
INSERT INTO `english` VALUES (95, '8401111102', '韦晓钦', 112, 133, 120, 450);
INSERT INTO `english` VALUES (96, '8401111103', '吴思浩', 90, 92, 110, 367);
INSERT INTO `english` VALUES (97, '8401111107', '梁文仲', 97, 110, 104, 399);
INSERT INTO `english` VALUES (98, '8401111108', '刘敦杰', 95, 130, 105, 420);
INSERT INTO `english` VALUES (99, '8401111114', '梁文辉', 121, 95, 137, 432);
INSERT INTO `english` VALUES (100, '8401111115', '凌上军', 90, 120, 132, 424);
INSERT INTO `english` VALUES (101, '0840111124', '陈灏', 98, 96, 125, 405);
INSERT INTO `english` VALUES (102, '0840111125', '马泽森', 104, 97, 113, 398);
INSERT INTO `english` VALUES (103, '0840111126', '林豪荣', 105, 95, 121, 390);
INSERT INTO `english` VALUES (104, '0840111130', '颜俊滨', 92, 125, 110, 413);
INSERT INTO `english` VALUES (105, '0840111218', '李龙形', 97, 87, 118, 371);
INSERT INTO `english` VALUES (106, '0840111227', '廖健', 85, 90, 110, 350);
INSERT INTO `english` VALUES (107, '0840111228', '黄晓生', 83, 85, 107, 369);
INSERT INTO `english` VALUES (108, '0840111229', '何嘉驹', 100, 83, 120, 389);
INSERT INTO `english` VALUES (109, '8401111301', '巫丹', 113, 87, 120, 503);
INSERT INTO `english` VALUES (110, '8401111302', '张家杰', 121, 85, 110, 485);
INSERT INTO `english` VALUES (111, '8401111306', '管凌玉', 110, 75, 104, 438);
INSERT INTO `english` VALUES (112, '8401111307', '潘倩珺', 90, 86, 105, 457);
INSERT INTO `english` VALUES (113, '8401111313', '郑瑞丽', 104, 90, 137, 467);
INSERT INTO `english` VALUES (114, '8401111314', '曾思远', 105, 78, 132, 493);
INSERT INTO `english` VALUES (115, '0840111316', '姚多雅', 116, 82, 110, 479);
INSERT INTO `english` VALUES (116, '0840111318', '燕小林', 100, 118, 120, 508);
INSERT INTO `english` VALUES (117, '0840111319', '区城玮', 125, 96, 110, 491);
INSERT INTO `english` VALUES (118, '0840111323', '余德龙', 104, 87, 104, 468);
INSERT INTO `english` VALUES (119, '0840111324', '曾华潇', 105, 66, 105, 438);
INSERT INTO `english` VALUES (120, '0840111326', '李雪媛', 116, 90, 116, 495);
INSERT INTO `english` VALUES (121, '0840111327', '钟倩茵', 130, 110, 130, 541);
INSERT INTO `english` VALUES (122, '0840111329', '黄丽玲', 125, 97, 125, 491);
INSERT INTO `english` VALUES (123, '0840111330', '陈伟浩', 90, 110, 111, 464);

-- ----------------------------
-- Table structure for liberal
-- ----------------------------
DROP TABLE IF EXISTS `liberal`;
CREATE TABLE `liberal`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编号',
  `exam_num` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考号',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` enum('男','女') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `high_school` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中学名称',
  `chinese` int NULL DEFAULT NULL COMMENT '语文',
  `math` int NULL DEFAULT NULL COMMENT '数学',
  `english` int NULL DEFAULT NULL COMMENT '英语',
  `history` int NULL DEFAULT NULL COMMENT '历史',
  `geography` int NULL DEFAULT NULL COMMENT '地理',
  `total_point` int NULL DEFAULT NULL COMMENT '总分',
  `area` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地区',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of liberal
-- ----------------------------
INSERT INTO `liberal` VALUES (1, '8401111301', '巫丹', '女', '花都中学', 113, 87, 120, 89, 94, 503, '广州');
INSERT INTO `liberal` VALUES (2, '8401111302', '张家杰', '男', '白云中学', 121, 85, 110, 83, 86, 485, '广州');
INSERT INTO `liberal` VALUES (3, '8401111303', '翁耀彬', '男', '从化中学', 90, 85, 100, 92, 84, 451, '广州');
INSERT INTO `liberal` VALUES (4, '8401111304', '钟泽坤', '男', '阳江中学', 99, 75, 94, 88, 69, 425, '阳江');
INSERT INTO `liberal` VALUES (5, '8401111305', '罗建军', '男', '湛江中学', 112, 66, 98, 66, 87, 429, '湛江');
INSERT INTO `liberal` VALUES (6, '8401111306', '管凌玉', '女', '惠州中学', 110, 75, 104, 75, 74, 438, '惠州');
INSERT INTO `liberal` VALUES (7, '8401111307', '潘倩珺', '女', '花都中学', 90, 86, 105, 86, 90, 457, '广州');
INSERT INTO `liberal` VALUES (8, '8401111308', '郑志腾', '男', '肇庆中学', 120, 88, 99, 88, 86, 481, '肇庆');
INSERT INTO `liberal` VALUES (9, '8401111309', '黄东辉', '男', '江门中学', 110, 90, 89, 90, 84, 463, '江门');
INSERT INTO `liberal` VALUES (10, '8401111310', '张艳美', '男', '湛江中学', 100, 74, 83, 87, 68, 412, '湛江');
INSERT INTO `liberal` VALUES (11, '8401111311', '林苏', '女', '花都中学', 100, 81, 92, 85, 70, 428, '广州');
INSERT INTO `liberal` VALUES (12, '8401111312', '张智媚', '女', '白云中学', 98, 92, 88, 81, 76, 435, '广州');
INSERT INTO `liberal` VALUES (13, '8401111313', '郑瑞丽', '女', '从化中学', 104, 90, 137, 71, 65, 467, '广州');
INSERT INTO `liberal` VALUES (14, '8401111314', '曾思远', '男', '阳江中学', 105, 78, 132, 84, 94, 493, '阳江');
INSERT INTO `liberal` VALUES (15, '8401111315', '温紫良', '女', '白云中学', 99, 79, 100, 68, 86, 432, '广州');
INSERT INTO `liberal` VALUES (16, '0840111316', '姚多雅', '女', '梅州中学', 116, 82, 110, 87, 84, 479, '梅州');
INSERT INTO `liberal` VALUES (17, '0840111317', '欧阳英洁', '女', '深圳中学', 130, 83, 90, 85, 87, 475, '深圳');
INSERT INTO `liberal` VALUES (18, '0840111318', '燕小林', '女', '湛江中学', 100, 118, 120, 85, 85, 508, '湛江');
INSERT INTO `liberal` VALUES (19, '0840111319', '区城玮', '男', '江门中学', 125, 96, 110, 75, 85, 491, '江门');
INSERT INTO `liberal` VALUES (20, '0840111320', '劳月凤', '女', '从化中学', 113, 98, 100, 66, 75, 452, '广州');
INSERT INTO `liberal` VALUES (21, '0840111321', '李洋', '男', '花都中学', 121, 96, 100, 75, 66, 458, '广州');
INSERT INTO `liberal` VALUES (22, '0840111322', '江帆劲', '女', '白云中学', 98, 95, 98, 86, 75, 452, '广州');
INSERT INTO `liberal` VALUES (23, '0840111323', '余德龙', '男', '从化中学', 104, 87, 104, 87, 86, 468, '广州');
INSERT INTO `liberal` VALUES (24, '0840111324', '曾华潇', '女', '阳江中学', 105, 66, 105, 74, 88, 438, '阳江');
INSERT INTO `liberal` VALUES (25, '0840111325', '周锐', '男', '湛江中学', 99, 70, 99, 90, 90, 448, '湛江');
INSERT INTO `liberal` VALUES (26, '0840111326', '李雪媛', '女', '惠州中学', 116, 90, 116, 86, 87, 495, '惠州');
INSERT INTO `liberal` VALUES (27, '0840111327', '钟倩茵', '女', '梅州中学', 130, 110, 130, 86, 85, 541, '梅州');
INSERT INTO `liberal` VALUES (28, '0840111328', '黄建森', '男', '花都中学', 100, 99, 100, 84, 85, 468, '广州');
INSERT INTO `liberal` VALUES (29, '0840111329', '黄丽玲', '女', '肇庆中学', 125, 97, 125, 69, 75, 491, '肇庆');
INSERT INTO `liberal` VALUES (30, '0840111330', '陈伟浩', '男', '江门中学', 90, 110, 111, 87, 66, 464, '江门');

-- ----------------------------
-- Table structure for science
-- ----------------------------
DROP TABLE IF EXISTS `science`;
CREATE TABLE `science`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编号',
  `exam_num` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考号',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` enum('男','女') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `high_school` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中学名称',
  `chinese` int NULL DEFAULT NULL COMMENT '语文',
  `math` int NULL DEFAULT NULL COMMENT '数学',
  `english` int NULL DEFAULT NULL COMMENT '英语',
  `physics` int NULL DEFAULT NULL COMMENT '物理',
  `total_point` int NULL DEFAULT NULL COMMENT '总分',
  `area` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地区',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of science
-- ----------------------------
INSERT INTO `science` VALUES (1, '8401111201', '许超', '男', '惠州中学', 121, 120, 87, 74, 402, '惠州');
INSERT INTO `science` VALUES (2, '8401111202', '白伟泉', '女', '阳江中学', 90, 135, 85, 81, 391, '阳江');
INSERT INTO `science` VALUES (3, '8401111203', '翟冠荣', '男', '深圳中学', 85, 135, 85, 92, 397, '深圳');
INSERT INTO `science` VALUES (4, '8401111204', '许海涛', '女', '深圳中学', 83, 111, 75, 90, 359, '深圳');
INSERT INTO `science` VALUES (5, '8401111205', '梁剑华', '男', '从化中学', 110, 101, 66, 78, 355, '广州');
INSERT INTO `science` VALUES (6, '8401111206', '李德财', '男', '梅州中学', 90, 112, 75, 79, 356, '梅州');
INSERT INTO `science` VALUES (7, '8401111207', '罗文飞', '女', '从化中学', 120, 90, 86, 82, 378, '广州');
INSERT INTO `science` VALUES (8, '8401111208', '邓霞兰', '女', '梅州中学', 110, 123, 88, 83, 404, '梅州');
INSERT INTO `science` VALUES (9, '8401111209', '谭振勇', '男', '花都中学', 100, 97, 90, 82, 369, '广州');
INSERT INTO `science` VALUES (10, '8401111210', '段卓', '男', '肇庆中学', 94, 95, 74, 84, 347, '肇庆');
INSERT INTO `science` VALUES (11, '8401111211', '林涛', '男', '江门中学', 98, 94, 81, 68, 341, '江门');
INSERT INTO `science` VALUES (12, '8401111212', '陈宏彬', '男', '从化中学', 104, 98, 92, 70, 364, '广州');
INSERT INTO `science` VALUES (13, '8401111213', '侯宇松', '男', '花都中学', 112, 100, 90, 76, 378, '广州');
INSERT INTO `science` VALUES (14, '8401111214', '钟沛伦', '男', '白云中学', 90, 125, 78, 65, 358, '广州');
INSERT INTO `science` VALUES (15, '8401111215', '黄永锋', '男', '从化中学', 123, 113, 79, 94, 409, '广州');
INSERT INTO `science` VALUES (16, '0840111216', '林瑞焊', '男', '阳江中学', 87, 121, 82, 86, 376, '阳江');
INSERT INTO `science` VALUES (17, '0840111217', '何彬', '男', '湛江中学', 96, 89, 83, 84, 352, '湛江');
INSERT INTO `science` VALUES (18, '0840111218', '李龙形', '女', '惠州中学', 97, 87, 118, 69, 371, '惠州');
INSERT INTO `science` VALUES (19, '0840111219', '李敏华', '女', '花都中学', 95, 96, 96, 87, 374, '广州');
INSERT INTO `science` VALUES (20, '0840111220', '陈亮', '男', '肇庆中学', 94, 95, 98, 74, 361, '肇庆');
INSERT INTO `science` VALUES (21, '0840111221', '沙永豪', '男', '江门中学', 98, 94, 96, 90, 378, '江门');
INSERT INTO `science` VALUES (22, '0840111222', '陈庆从', '男', '湛江中学', 100, 98, 95, 86, 379, '湛江');
INSERT INTO `science` VALUES (23, '0840111223', '吉白', '女', '花都中学', 125, 100, 87, 84, 396, '广州');
INSERT INTO `science` VALUES (24, '0840111224', '谢启骢', '男', '白云中学', 113, 125, 66, 68, 372, '广州');
INSERT INTO `science` VALUES (25, '0840111225', '郭叙国', '男', '从化中学', 121, 113, 70, 70, 374, '广州');
INSERT INTO `science` VALUES (26, '0840111226', '冼康筠', '男', '阳江中学', 90, 121, 90, 76, 377, '阳江');
INSERT INTO `science` VALUES (27, '0840111227', '廖健', '男', '白云中学', 85, 90, 110, 65, 350, '广州');
INSERT INTO `science` VALUES (28, '0840111228', '黄晓生', '男', '梅州中学', 83, 85, 107, 94, 369, '梅州');
INSERT INTO `science` VALUES (29, '0840111229', '何嘉驹', '男', '深圳中学', 100, 83, 120, 86, 389, '深圳');
INSERT INTO `science` VALUES (30, '0840111230', '虞利敏', '女', '湛江中学', 116, 100, 89, 84, 389, '湛江');

SET FOREIGN_KEY_CHECKS = 1;
