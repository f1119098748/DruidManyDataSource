# druid 测试多mysql多数据源
测试使用的sql如下
-- -----------------
表一 second 有数据
 ----  --------------------
    CREATE DATABASE second;
    DROP TABLE IF EXISTS `tb_user`;
    CREATE TABLE `tb_user` (
      `id` int(11) NOT NULL AUTO_INCREMENT,
      `name` varchar(20) DEFAULT NULL,
      `age` int(11) DEFAULT NULL,
      `gender` char(1) DEFAULT NULL,
      PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
    
    -- ----------------------------
    -- 插入数据
    -- ----------------------------
    
    INSERT INTO `tb_user` VALUES ('1', '张三', '16', '男');
    INSERT INTO `tb_user` VALUES ('2', '李四', '18', '女');
    INSERT INTO `tb_user` VALUES ('3', '小七', '22', '男');
    INSERT INTO `tb_user` VALUES ('4', '王鑫', '24', '女');

    --- -----------------------------
    表二 master 无数据
    -- ------------------------------
    CREATE DATABASE master;
    DROP TABLE IF EXISTS `tb_user`;
    CREATE TABLE `tb_user` (
      `id` int(11) NOT NULL AUTO_INCREMENT,
      `name` varchar(20) DEFAULT NULL,
      `age` int(11) DEFAULT NULL,
      `gender` char(1) DEFAULT NULL,
      PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
