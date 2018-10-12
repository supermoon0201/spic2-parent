/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : author

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 12/10/2018 17:33:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource`  (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键/自增',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源名称',
  `url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '连接地址',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源描述',
  `icon` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标',
  `pid` bigint(19) NULL DEFAULT NULL COMMENT '父资源id',
  `seq` tinyint(2) NOT NULL DEFAULT 0 COMMENT '排序号',
  `status` tinyint(2) NOT NULL DEFAULT 0 COMMENT '状态',
  `resourcetype` tinyint(2) NOT NULL DEFAULT 0 COMMENT '资料类型：0菜单 1按钮',
  `createdate` datetime(0) NOT NULL COMMENT '创建时间',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注（用于记录此资源项对应哪个特殊需求）',
  `type` tinyint(4) NOT NULL DEFAULT 3 COMMENT '类型：0-风电；1-光伏; 3-通用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 132 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '资源' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_resource
-- ----------------------------
INSERT INTO `sys_resource` VALUES (1, '首页', 'wpfsIndex/turnjsp', NULL, 'fa fa-home', NULL, 1, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (2, '系统配置信息', '#', NULL, 'fa fa-cog', NULL, 3, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (3, '功率预测', '#', NULL, 'fa fa-area-chart', NULL, 4, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (4, '数据报表', '#', NULL, 'fa fa-file-text-o', NULL, 6, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (5, '气象信息', '#', NULL, 'fa fa-thermometer-full', NULL, 7, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (6, '统计分析', '#', NULL, 'fa fa-pie-chart', NULL, 8, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (7, '版本信息', 'static/common/demo/version.html', NULL, 'fa fa-file-code-o', NULL, 10, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (8, '权限管理', '#', NULL, 'fa fa-user-secret', NULL, 9, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (9, '风场信息', 'plant/turnjsp', NULL, 'fa fa-circle-o', 2, 5, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (10, '预测设置', 'forecast/turnjsp', NULL, 'fa fa-circle-o', 2, 0, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (11, '限电设置', 'limitPower/turnjsp', NULL, 'fa fa-circle-o', 2, 1, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (12, '机组信息', 'windturbine/turnjsp', NULL, 'fa fa-circle-o', 2, 8, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (13, '测风塔信息', 'windMetertower/turnjsp', NULL, 'fa fa-circle-o', 2, 9, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (14, '计划开机容量设置', 'plantCap/turnjsp', NULL, 'fa fa-circle-o', 2, 3, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (15, '机组型号信息', 'windturbineType/turnjsp', NULL, 'fa fa-circle-o', 2, 7, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (16, '短期预测', 'forecast/forecast', NULL, 'fa fa-circle-o', 3, 1, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (17, '超短期预测', 'sforecast/sforecast', NULL, 'fa fa-circle-o', 3, 2, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (18, '短期预测日报', 'dayReport/dayReport', NULL, 'fa fa-circle-o', 4, 1, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (19, '短期预测月报', 'monReport/monReport', NULL, 'fa fa-circle-o', 4, 2, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (20, '短期预测年报', 'yearReport/yearReport', NULL, 'fa fa-circle-o', 4, 3, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (21, '超短期预测日报', 'sdayReport/sdayReport', NULL, 'fa fa-circle-o', 4, 4, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (22, '超短期预测月报', 'smonReport/smonReport', NULL, 'fa fa-circle-o', 4, 5, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (23, '超短期预测年报', 'syearReport/syearReport', NULL, 'fa fa-circle-o', 4, 6, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (24, '电场累计日报', 'farmAccumReport/fdayReport', NULL, 'fa fa-circle-o', 4, 7, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (25, '电场累计月报', 'farmAccumReport/fmonReport', NULL, 'fa fa-circle-o', 4, 8, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (26, '电场累计年报', 'farmAccumReport/fyearReport', NULL, 'fa fa-circle-o', 4, 9, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (28, '风速', 'weather/windSpeed', NULL, 'fa fa-circle-o', 5, 1, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (29, '风向', 'weather/windDirection', NULL, 'fa fa-circle-o', 5, 2, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (33, '事件查询', 'dataAlarm/AlarmJump', NULL, 'fa fa-circle-o', 6, 1, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (38, '组织结构', 'organization/manager', NULL, 'fa fa-circle-o', 8, 1, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (39, '用户管理', 'user/manager', NULL, 'fa fa-circle-o', 8, 2, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (40, '角色管理', 'role/manager', NULL, 'fa fa-circle-o', 8, 3, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (41, '资源管理', 'resource/manager', NULL, 'fa fa-circle-o', 8, 4, 1, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (42, '功率误差统计', 'analysis/powerErrorStatics', NULL, 'fa fa-circle-o', 6, 2, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (44, '上传率统计', 'analysis/uploadStatics', NULL, 'fa fa-circle-o', 6, 3, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (58, '光伏电场信息', 'plant/turnspfs', NULL, 'fa fa-circle-o', 2, 6, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (60, '辐照度曲线', 'spfsWeather/irradiance', NULL, 'fa fa-circle-o', 5, 9, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (61, '光伏逆变器信息', 'pvUnit/turnspfs', NULL, 'fa fa-circle-o', 2, 11, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (62, '光伏气象站信息', 'pvEndetector/turnspfs', NULL, 'fa fa-circle-o', 2, 12, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (63, '光伏组件信息', 'pvUnitType/turnspfs', NULL, 'fa fa-circle-o', 2, 10, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (65, '光伏计划开机容量设置', 'plantCap/turnspfs', NULL, 'fa fa-circle-o', 2, 4, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (66, '光伏限电设置', 'limitPower/turnspfs', NULL, 'fa fa-circle-o', 2, 2, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (67, '光伏电场累计日报', 'spfsReport/farmDayAccumReport', NULL, 'fa fa-circle-o', 4, 10, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (68, '光伏电场累计月报', 'spfsReport/farmMonthAccumReport', NULL, 'fa fa-circle-o', 4, 11, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (69, '光伏电场累计年报', 'spfsReport/farmYearAccumReport', NULL, 'fa fa-circle-o', 4, 12, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (76, '光伏首页', 'spfsIndex/turnjsp', NULL, 'fa fa-home', NULL, 2, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (77, '组织结构添加', 'organization:add', NULL, '', 38, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (78, '组织结构修改', 'organization:edit', NULL, '', 38, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (79, '组织结构删除', 'organization:delete', NULL, '', 38, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (80, '用户添加', 'user:add', NULL, '', 39, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (81, '用户修改', 'user:edit', NULL, '', 39, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (82, '用户删除', 'user:delete', NULL, '', 39, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (83, '角色添加', 'role:add', NULL, '', 40, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (84, '角色修改', 'role:edit', NULL, '', 40, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (85, '角色删除', 'role:delete', NULL, '', 40, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (86, '角色授权', 'role:grant', NULL, '', 40, 0, 0, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (87, '资源添加', 'resource:add', NULL, '', 41, 0, 1, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (88, '资源修改', 'resource:edit', NULL, '', 41, 0, 1, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (89, '资源删除', 'resource:delete', NULL, '', 41, 0, 1, 1, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (90, '理论功率', 'theory/theory', NULL, 'fa fa-circle-o', 109, 0, 0, 0, '2017-07-17 11:13:08', NULL, 0);
INSERT INTO `sys_resource` VALUES (91, '数据补传', 'supplements/supplements', NULL, 'fa fa-circle-o', 3, 3, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (96, '光伏理论功率', 'theory/spfstheory', NULL, 'fa fa-circle-o', 109, 1, 0, 0, '2017-07-17 11:13:08', NULL, 1);
INSERT INTO `sys_resource` VALUES (97, '参数配置', 'webConfig/manager', NULL, 'fa fa-circle-o', 8, 6, 0, 0, '2017-07-17 11:13:08', NULL, 3);
INSERT INTO `sys_resource` VALUES (100, '日志数据库文件导出', 'file/manager', NULL, 'fa fa-circle-o', 8, 5, 0, 0, '2017-07-28 09:42:31', NULL, 3);
INSERT INTO `sys_resource` VALUES (101, '硬件资源监视数据展示', 'reshardwareshow/show', NULL, 'fa fa-circle-o', 2, 14, 0, 0, '2017-09-07 14:51:20', NULL, 3);
INSERT INTO `sys_resource` VALUES (102, '短期预测维护', 'fcstcastmodify/fcstcastModifyJump', NULL, 'fa fa-circle-o', 2, 13, 0, 0, '2017-09-07 13:29:14', NULL, 3);
INSERT INTO `sys_resource` VALUES (103, '上传状态查询', 'dataAlarm/fileAlarmJump', NULL, 'fa fa-circle-o', 6, 4, 0, 0, '2017-09-28 01:24:11', NULL, 3);
INSERT INTO `sys_resource` VALUES (104, '辐照度功率对比', 'contrastcurve/irradiancePowerContrastCurve', NULL, 'fa fa-circle-o', 3, 4, 0, 0, '2018-03-14 17:09:37', NULL, 1);
INSERT INTO `sys_resource` VALUES (105, '风速功率对比', 'contrastcurve/windPowerContrastCurve', NULL, 'fa fa-circle-o', 3, 5, 0, 0, '2018-03-14 16:58:46', NULL, 0);
INSERT INTO `sys_resource` VALUES (106, '温度', 'weather/windPlantWeatherJump/1', NULL, 'fa fa-circle-o', 5, 3, 0, 0, '2018-03-23 14:43:41', NULL, 0);
INSERT INTO `sys_resource` VALUES (107, '湿度', 'weather/windPlantWeatherJump/3', NULL, 'fa fa-circle-o', 5, 4, 0, 0, '2018-03-26 11:08:31', NULL, 0);
INSERT INTO `sys_resource` VALUES (108, '气压', 'weather/windPlantWeatherJump/2', NULL, 'fa fa-circle-o', 5, 5, 0, 0, '2018-03-26 11:09:04', NULL, 0);
INSERT INTO `sys_resource` VALUES (109, '理论功率', '#', NULL, 'fa fa-line-chart', NULL, 5, 0, 0, '2018-04-02 11:08:01', NULL, 3);
INSERT INTO `sys_resource` VALUES (110, '受阻电量', 'obstructed//windobstructed', NULL, 'fa fa-circle-o', 109, 2, 0, 0, '2018-04-09 10:29:51', NULL, 0);
INSERT INTO `sys_resource` VALUES (111, '光伏受阻电量', 'obstructed/spfsobstructed', NULL, 'fa fa-circle-o', 109, 3, 0, 0, '2018-04-09 10:30:43', NULL, 1);
INSERT INTO `sys_resource` VALUES (112, '光伏气压', 'spfsWeather/pressure', NULL, 'fa fa-circle-o', 5, 8, 0, 0, '2018-03-26 15:35:45', NULL, 1);
INSERT INTO `sys_resource` VALUES (113, '光伏温度', 'spfsWeather/temperature', NULL, 'fa fa-circle-o', 5, 6, 0, 0, '2018-03-26 18:21:24', NULL, 1);
INSERT INTO `sys_resource` VALUES (114, '光伏湿度', 'spfsWeather/humidity', NULL, 'fa fa-circle-o', 5, 7, 0, 0, '2018-03-27 11:25:27', NULL, 1);
INSERT INTO `sys_resource` VALUES (115, '风机状态', 'windturbine/windturbineState', NULL, 'fa fa-circle-o', 2, 15, 0, 0, '2018-05-25 11:13:18', NULL, 0);
INSERT INTO `sys_resource` VALUES (116, '功率频率分布统计', 'analysis/wpfsPowerJump', NULL, 'fa fa-circle-o', 6, 7, 0, 0, '2018-06-27 13:18:37', NULL, 0);
INSERT INTO `sys_resource` VALUES (117, '测风塔风向频率分布统计', 'analysis/windDirectionJump', NULL, 'fa fa-circle-o', 6, 8, 0, 0, '2018-06-27 14:13:40', NULL, 0);
INSERT INTO `sys_resource` VALUES (118, '风速频率分布统计', 'analysis/windSpeedJump', NULL, 'fa fa-circle-o', 6, 9, 0, 0, '2018-06-27 14:15:07', NULL, 0);
INSERT INTO `sys_resource` VALUES (119, '光伏功率频率分布统计', 'analysis/spfsPowerJump', NULL, 'fa fa-circle-o', 6, 10, 0, 0, '2018-06-27 14:16:48', NULL, 1);
INSERT INTO `sys_resource` VALUES (120, '辐照度频率分布统计', 'analysis/irradianceJump', NULL, 'fa fa-circle-o', 6, 11, 0, 0, '2018-06-27 14:18:01', NULL, 1);
INSERT INTO `sys_resource` VALUES (122, '光伏上传率统计', 'analysis/spfsUploadStatics', NULL, 'fa fa-circle-o', 6, 3, 0, 0, '2018-06-29 14:58:05', NULL, 1);
INSERT INTO `sys_resource` VALUES (123, '冀北气象导出', 'weather/jibeiExport', NULL, 'fa fa-circle-o', 5, 10, 1, 0, '2018-07-09 16:00:06', '冀北特殊版本：气象导出资源', 0);
INSERT INTO `sys_resource` VALUES (125, '新疆周报数据', 'report/xinjiangWeekReport', NULL, 'fa fa-circle-o', 4, 14, 1, 0, '2018-07-18 14:47:35', '新疆特殊版本：周报数据资源', 3);
INSERT INTO `sys_resource` VALUES (126, '工程配置管理', 'propertyManagement/manageJump', NULL, 'fa fa-cog', NULL, 11, 0, 0, '2018-08-07 15:30:34', '用于工程人员修改相关省份的特殊配置信息', 3);
INSERT INTO `sys_resource` VALUES (127, '冀北短期预测导出', 'forecast/northHeBeiForecast', NULL, 'fa fa-circle-o', 3, 6, 1, 0, '2018-08-10 15:43:23', '冀北短期预测导出', 3);
INSERT INTO `sys_resource` VALUES (128, '气象资源导出报表', 'weather/weatherResourceReport', '', 'fa fa-circle-o', 4, 13, 0, 0, '2018-08-20 15:07:06', '', 0);
INSERT INTO `sys_resource` VALUES (129, '光伏气象资源数据导出报表', 'spfsReport/pvMeteResourceExportReport', NULL, 'fa fa-circle-o', 4, 16, 0, 0, '2018-08-20 17:32:48', '', 1);
INSERT INTO `sys_resource` VALUES (130, '光伏风向', 'spfsWeather/spfsWinddirection', NULL, 'fa fa-circle-o', 5, 0, 0, 0, '2018-08-20 14:00:05', '', 1);
INSERT INTO `sys_resource` VALUES (131, '光伏风速', 'spfsWeather/windSpeed', '', 'fa fa-circle-o', 5, 0, 0, 0, '2018-08-20 14:00:05', '', 1);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键/自增',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `seq` tinyint(2) NOT NULL DEFAULT 0 COMMENT '排序',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `status` tinyint(2) NOT NULL DEFAULT 0 COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, 'admin', 0, '超级管理员', 0);
INSERT INTO `sys_role` VALUES (2, 'guest', 1, '访客', 0);
INSERT INTO `sys_role` VALUES (3, 'spfs', 0, '光伏用户', 0);
INSERT INTO `sys_role` VALUES (4, 'wpfs', 0, '风电用户', 0);
INSERT INTO `sys_role` VALUES (5, 'system', 0, '系统管理员', 0);

-- ----------------------------
-- Table structure for sys_role_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resource`;
CREATE TABLE `sys_role_resource`  (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键/自增',
  `role_id` bigint(19) NOT NULL COMMENT '角色id',
  `resource_id` bigint(19) NOT NULL COMMENT '资源id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 912 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色资源' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role_resource
-- ----------------------------
INSERT INTO `sys_role_resource` VALUES (318, 2, 1);
INSERT INTO `sys_role_resource` VALUES (319, 2, 2);
INSERT INTO `sys_role_resource` VALUES (320, 2, 58);
INSERT INTO `sys_role_resource` VALUES (321, 2, 61);
INSERT INTO `sys_role_resource` VALUES (322, 2, 62);
INSERT INTO `sys_role_resource` VALUES (323, 2, 63);
INSERT INTO `sys_role_resource` VALUES (324, 2, 65);
INSERT INTO `sys_role_resource` VALUES (325, 2, 66);
INSERT INTO `sys_role_resource` VALUES (326, 2, 70);
INSERT INTO `sys_role_resource` VALUES (327, 2, 9);
INSERT INTO `sys_role_resource` VALUES (328, 2, 10);
INSERT INTO `sys_role_resource` VALUES (329, 2, 11);
INSERT INTO `sys_role_resource` VALUES (330, 2, 12);
INSERT INTO `sys_role_resource` VALUES (331, 2, 13);
INSERT INTO `sys_role_resource` VALUES (332, 2, 14);
INSERT INTO `sys_role_resource` VALUES (333, 2, 15);
INSERT INTO `sys_role_resource` VALUES (334, 2, 3);
INSERT INTO `sys_role_resource` VALUES (335, 2, 16);
INSERT INTO `sys_role_resource` VALUES (336, 2, 17);
INSERT INTO `sys_role_resource` VALUES (337, 2, 4);
INSERT INTO `sys_role_resource` VALUES (338, 2, 18);
INSERT INTO `sys_role_resource` VALUES (339, 2, 19);
INSERT INTO `sys_role_resource` VALUES (340, 2, 20);
INSERT INTO `sys_role_resource` VALUES (341, 2, 21);
INSERT INTO `sys_role_resource` VALUES (342, 2, 22);
INSERT INTO `sys_role_resource` VALUES (343, 2, 23);
INSERT INTO `sys_role_resource` VALUES (344, 2, 24);
INSERT INTO `sys_role_resource` VALUES (345, 2, 25);
INSERT INTO `sys_role_resource` VALUES (346, 2, 26);
INSERT INTO `sys_role_resource` VALUES (347, 2, 27);
INSERT INTO `sys_role_resource` VALUES (348, 2, 67);
INSERT INTO `sys_role_resource` VALUES (349, 2, 68);
INSERT INTO `sys_role_resource` VALUES (350, 2, 69);
INSERT INTO `sys_role_resource` VALUES (351, 2, 73);
INSERT INTO `sys_role_resource` VALUES (352, 2, 74);
INSERT INTO `sys_role_resource` VALUES (353, 2, 75);
INSERT INTO `sys_role_resource` VALUES (354, 2, 5);
INSERT INTO `sys_role_resource` VALUES (355, 2, 28);
INSERT INTO `sys_role_resource` VALUES (356, 2, 29);
INSERT INTO `sys_role_resource` VALUES (357, 2, 30);
INSERT INTO `sys_role_resource` VALUES (358, 2, 31);
INSERT INTO `sys_role_resource` VALUES (359, 2, 32);
INSERT INTO `sys_role_resource` VALUES (360, 2, 51);
INSERT INTO `sys_role_resource` VALUES (361, 2, 52);
INSERT INTO `sys_role_resource` VALUES (362, 2, 53);
INSERT INTO `sys_role_resource` VALUES (363, 2, 54);
INSERT INTO `sys_role_resource` VALUES (364, 2, 57);
INSERT INTO `sys_role_resource` VALUES (365, 2, 60);
INSERT INTO `sys_role_resource` VALUES (366, 2, 64);
INSERT INTO `sys_role_resource` VALUES (367, 2, 6);
INSERT INTO `sys_role_resource` VALUES (368, 2, 72);
INSERT INTO `sys_role_resource` VALUES (369, 2, 33);
INSERT INTO `sys_role_resource` VALUES (370, 2, 34);
INSERT INTO `sys_role_resource` VALUES (371, 2, 42);
INSERT INTO `sys_role_resource` VALUES (372, 2, 43);
INSERT INTO `sys_role_resource` VALUES (373, 2, 44);
INSERT INTO `sys_role_resource` VALUES (374, 2, 45);
INSERT INTO `sys_role_resource` VALUES (375, 2, 46);
INSERT INTO `sys_role_resource` VALUES (376, 2, 35);
INSERT INTO `sys_role_resource` VALUES (377, 2, 71);
INSERT INTO `sys_role_resource` VALUES (378, 2, 36);
INSERT INTO `sys_role_resource` VALUES (379, 2, 37);
INSERT INTO `sys_role_resource` VALUES (380, 2, 7);
INSERT INTO `sys_role_resource` VALUES (683, 1, 1);
INSERT INTO `sys_role_resource` VALUES (684, 1, 2);
INSERT INTO `sys_role_resource` VALUES (685, 1, 9);
INSERT INTO `sys_role_resource` VALUES (686, 1, 10);
INSERT INTO `sys_role_resource` VALUES (687, 1, 11);
INSERT INTO `sys_role_resource` VALUES (688, 1, 12);
INSERT INTO `sys_role_resource` VALUES (689, 1, 13);
INSERT INTO `sys_role_resource` VALUES (690, 1, 14);
INSERT INTO `sys_role_resource` VALUES (691, 1, 15);
INSERT INTO `sys_role_resource` VALUES (692, 1, 3);
INSERT INTO `sys_role_resource` VALUES (693, 1, 16);
INSERT INTO `sys_role_resource` VALUES (694, 1, 17);
INSERT INTO `sys_role_resource` VALUES (695, 1, 90);
INSERT INTO `sys_role_resource` VALUES (696, 1, 91);
INSERT INTO `sys_role_resource` VALUES (697, 1, 4);
INSERT INTO `sys_role_resource` VALUES (698, 1, 18);
INSERT INTO `sys_role_resource` VALUES (699, 1, 19);
INSERT INTO `sys_role_resource` VALUES (700, 1, 20);
INSERT INTO `sys_role_resource` VALUES (701, 1, 21);
INSERT INTO `sys_role_resource` VALUES (702, 1, 22);
INSERT INTO `sys_role_resource` VALUES (703, 1, 23);
INSERT INTO `sys_role_resource` VALUES (704, 1, 24);
INSERT INTO `sys_role_resource` VALUES (705, 1, 25);
INSERT INTO `sys_role_resource` VALUES (706, 1, 26);
INSERT INTO `sys_role_resource` VALUES (707, 1, 5);
INSERT INTO `sys_role_resource` VALUES (708, 1, 28);
INSERT INTO `sys_role_resource` VALUES (709, 1, 29);
INSERT INTO `sys_role_resource` VALUES (710, 1, 6);
INSERT INTO `sys_role_resource` VALUES (711, 1, 33);
INSERT INTO `sys_role_resource` VALUES (712, 1, 46);
INSERT INTO `sys_role_resource` VALUES (713, 1, 99);
INSERT INTO `sys_role_resource` VALUES (714, 1, 35);
INSERT INTO `sys_role_resource` VALUES (715, 1, 36);
INSERT INTO `sys_role_resource` VALUES (716, 1, 37);
INSERT INTO `sys_role_resource` VALUES (717, 1, 8);
INSERT INTO `sys_role_resource` VALUES (718, 1, 97);
INSERT INTO `sys_role_resource` VALUES (719, 1, 7);
INSERT INTO `sys_role_resource` VALUES (781, 4, 1);
INSERT INTO `sys_role_resource` VALUES (782, 4, 2);
INSERT INTO `sys_role_resource` VALUES (783, 4, 9);
INSERT INTO `sys_role_resource` VALUES (784, 4, 10);
INSERT INTO `sys_role_resource` VALUES (785, 4, 11);
INSERT INTO `sys_role_resource` VALUES (786, 4, 12);
INSERT INTO `sys_role_resource` VALUES (787, 4, 13);
INSERT INTO `sys_role_resource` VALUES (788, 4, 14);
INSERT INTO `sys_role_resource` VALUES (789, 4, 15);
INSERT INTO `sys_role_resource` VALUES (790, 4, 3);
INSERT INTO `sys_role_resource` VALUES (791, 4, 16);
INSERT INTO `sys_role_resource` VALUES (792, 4, 17);
INSERT INTO `sys_role_resource` VALUES (793, 4, 90);
INSERT INTO `sys_role_resource` VALUES (794, 4, 91);
INSERT INTO `sys_role_resource` VALUES (795, 4, 4);
INSERT INTO `sys_role_resource` VALUES (796, 4, 18);
INSERT INTO `sys_role_resource` VALUES (797, 4, 19);
INSERT INTO `sys_role_resource` VALUES (798, 4, 20);
INSERT INTO `sys_role_resource` VALUES (799, 4, 21);
INSERT INTO `sys_role_resource` VALUES (800, 4, 22);
INSERT INTO `sys_role_resource` VALUES (801, 4, 23);
INSERT INTO `sys_role_resource` VALUES (802, 4, 24);
INSERT INTO `sys_role_resource` VALUES (803, 4, 25);
INSERT INTO `sys_role_resource` VALUES (804, 4, 26);
INSERT INTO `sys_role_resource` VALUES (805, 4, 5);
INSERT INTO `sys_role_resource` VALUES (806, 4, 28);
INSERT INTO `sys_role_resource` VALUES (807, 4, 29);
INSERT INTO `sys_role_resource` VALUES (808, 4, 6);
INSERT INTO `sys_role_resource` VALUES (809, 4, 33);
INSERT INTO `sys_role_resource` VALUES (810, 4, 42);
INSERT INTO `sys_role_resource` VALUES (811, 4, 44);
INSERT INTO `sys_role_resource` VALUES (812, 4, 46);
INSERT INTO `sys_role_resource` VALUES (813, 4, 35);
INSERT INTO `sys_role_resource` VALUES (814, 4, 36);
INSERT INTO `sys_role_resource` VALUES (815, 4, 37);
INSERT INTO `sys_role_resource` VALUES (816, 5, 8);
INSERT INTO `sys_role_resource` VALUES (817, 5, 38);
INSERT INTO `sys_role_resource` VALUES (818, 5, 77);
INSERT INTO `sys_role_resource` VALUES (819, 5, 78);
INSERT INTO `sys_role_resource` VALUES (820, 5, 79);
INSERT INTO `sys_role_resource` VALUES (821, 5, 39);
INSERT INTO `sys_role_resource` VALUES (822, 5, 80);
INSERT INTO `sys_role_resource` VALUES (823, 5, 81);
INSERT INTO `sys_role_resource` VALUES (824, 5, 82);
INSERT INTO `sys_role_resource` VALUES (825, 5, 40);
INSERT INTO `sys_role_resource` VALUES (826, 5, 83);
INSERT INTO `sys_role_resource` VALUES (827, 5, 84);
INSERT INTO `sys_role_resource` VALUES (828, 5, 85);
INSERT INTO `sys_role_resource` VALUES (829, 5, 86);
INSERT INTO `sys_role_resource` VALUES (830, 5, 41);
INSERT INTO `sys_role_resource` VALUES (831, 5, 87);
INSERT INTO `sys_role_resource` VALUES (832, 5, 88);
INSERT INTO `sys_role_resource` VALUES (833, 5, 89);
INSERT INTO `sys_role_resource` VALUES (834, 5, 97);
INSERT INTO `sys_role_resource` VALUES (835, 3, 76);
INSERT INTO `sys_role_resource` VALUES (836, 3, 2);
INSERT INTO `sys_role_resource` VALUES (837, 3, 58);
INSERT INTO `sys_role_resource` VALUES (838, 3, 61);
INSERT INTO `sys_role_resource` VALUES (839, 3, 62);
INSERT INTO `sys_role_resource` VALUES (840, 3, 63);
INSERT INTO `sys_role_resource` VALUES (841, 3, 65);
INSERT INTO `sys_role_resource` VALUES (842, 3, 66);
INSERT INTO `sys_role_resource` VALUES (843, 3, 3);
INSERT INTO `sys_role_resource` VALUES (844, 3, 16);
INSERT INTO `sys_role_resource` VALUES (845, 3, 17);
INSERT INTO `sys_role_resource` VALUES (846, 3, 96);
INSERT INTO `sys_role_resource` VALUES (847, 3, 91);
INSERT INTO `sys_role_resource` VALUES (848, 3, 4);
INSERT INTO `sys_role_resource` VALUES (849, 3, 18);
INSERT INTO `sys_role_resource` VALUES (850, 3, 19);
INSERT INTO `sys_role_resource` VALUES (851, 3, 20);
INSERT INTO `sys_role_resource` VALUES (852, 3, 21);
INSERT INTO `sys_role_resource` VALUES (853, 3, 22);
INSERT INTO `sys_role_resource` VALUES (854, 3, 23);
INSERT INTO `sys_role_resource` VALUES (855, 3, 67);
INSERT INTO `sys_role_resource` VALUES (856, 3, 68);
INSERT INTO `sys_role_resource` VALUES (857, 3, 69);
INSERT INTO `sys_role_resource` VALUES (858, 3, 5);
INSERT INTO `sys_role_resource` VALUES (859, 3, 60);
INSERT INTO `sys_role_resource` VALUES (860, 3, 6);
INSERT INTO `sys_role_resource` VALUES (861, 3, 33);
INSERT INTO `sys_role_resource` VALUES (862, 3, 42);
INSERT INTO `sys_role_resource` VALUES (864, 3, 99);
INSERT INTO `sys_role_resource` VALUES (868, 5, 100);
INSERT INTO `sys_role_resource` VALUES (869, 5, 101);
INSERT INTO `sys_role_resource` VALUES (870, 5, 2);
INSERT INTO `sys_role_resource` VALUES (871, 5, 102);
INSERT INTO `sys_role_resource` VALUES (872, 3, 103);
INSERT INTO `sys_role_resource` VALUES (873, 4, 103);
INSERT INTO `sys_role_resource` VALUES (874, 3, 10);
INSERT INTO `sys_role_resource` VALUES (875, 3, 104);
INSERT INTO `sys_role_resource` VALUES (876, 4, 105);
INSERT INTO `sys_role_resource` VALUES (877, 4, 106);
INSERT INTO `sys_role_resource` VALUES (878, 4, 107);
INSERT INTO `sys_role_resource` VALUES (879, 4, 108);
INSERT INTO `sys_role_resource` VALUES (880, 4, 109);
INSERT INTO `sys_role_resource` VALUES (881, 4, 110);
INSERT INTO `sys_role_resource` VALUES (882, 3, 109);
INSERT INTO `sys_role_resource` VALUES (883, 3, 111);
INSERT INTO `sys_role_resource` VALUES (884, 3, 112);
INSERT INTO `sys_role_resource` VALUES (885, 3, 113);
INSERT INTO `sys_role_resource` VALUES (886, 3, 114);
INSERT INTO `sys_role_resource` VALUES (887, 4, 115);
INSERT INTO `sys_role_resource` VALUES (888, 4, 116);
INSERT INTO `sys_role_resource` VALUES (889, 4, 117);
INSERT INTO `sys_role_resource` VALUES (890, 4, 118);
INSERT INTO `sys_role_resource` VALUES (891, 3, 119);
INSERT INTO `sys_role_resource` VALUES (892, 3, 120);
INSERT INTO `sys_role_resource` VALUES (893, 3, 122);
INSERT INTO `sys_role_resource` VALUES (894, 4, 123);
INSERT INTO `sys_role_resource` VALUES (895, 3, 125);
INSERT INTO `sys_role_resource` VALUES (896, 4, 125);
INSERT INTO `sys_role_resource` VALUES (906, 4, 127);
INSERT INTO `sys_role_resource` VALUES (907, 3, 127);
INSERT INTO `sys_role_resource` VALUES (908, 4, 128);
INSERT INTO `sys_role_resource` VALUES (909, 3, 129);
INSERT INTO `sys_role_resource` VALUES (910, 3, 130);
INSERT INTO `sys_role_resource` VALUES (911, 3, 131);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键/自增',
  `loginname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录名',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `sex` tinyint(2) NOT NULL DEFAULT 0 COMMENT '性别',
  `age` tinyint(2) NULL DEFAULT 0 COMMENT '年龄',
  `usertype` tinyint(2) NOT NULL DEFAULT 0 COMMENT '用户类型 0 风电用户 1 光伏用户 2 风电、光伏用户',
  `status` tinyint(2) NOT NULL DEFAULT 0 COMMENT '状态',
  `organization_id` int(11) NOT NULL DEFAULT 0 COMMENT '部门id',
  `createdate` datetime(0) NOT NULL COMMENT '创建时间',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (3, 'wpfs', '风电用户', '303682a4cf692da942d0c66a9f6e9700', 0, NULL, 0, 0, 1, '2017-07-17 11:13:08', '');
INSERT INTO `sys_user` VALUES (4, 'spfs', '光伏用户', 'bb6941e4305a56fabfc04c717eb4c925', 0, NULL, 1, 0, 1, '2017-07-17 11:13:08', '');
INSERT INTO `sys_user` VALUES (6, 'system', '系统管理员', '54b53072540eeeb8f8e9343e71f28176', 0, NULL, 2, 0, 1, '2017-07-17 11:13:08', '');
INSERT INTO `sys_user` VALUES (7, 'admin@sprixin.com', 'admin', '21232f297a57a5a743894a0e4a801fc3', 0, 25, 2, 0, 1, '2017-07-17 11:13:08', '13888888888');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `id` bigint(19) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(19) NOT NULL,
  `role_id` bigint(19) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES (1, 1, 1);
INSERT INTO `sys_user_role` VALUES (6, 2, 2);
INSERT INTO `sys_user_role` VALUES (7, 3, 4);
INSERT INTO `sys_user_role` VALUES (8, 4, 3);
INSERT INTO `sys_user_role` VALUES (9, 6, 5);

SET FOREIGN_KEY_CHECKS = 1;
