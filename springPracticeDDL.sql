USE testdb;
CREATE TABLE IF NOT EXISTS `tb_user`( 
	  `id` int(10) unsigned NOT NULL AUTO_INCREMENT  comment '主键',
	  `name` varchar(255)  NOT NULL  DEFAULT '' comment '用户姓名',
	  `age` tinyint(3)  NOT NULL  DEFAULT '0' comment '年龄',
	  `add_time` datetime  NOT NULL  DEFAULT '1000-01-01 00:00:00' comment '添加时间',
	  `update_time` datetime  NOT NULL  DEFAULT '1000-01-01 00:00:00' comment '更新时间',
	  `mark` tinyint(3)  NOT NULL  DEFAULT '0' comment '删除标志(0:有效;1:删除)',
	PRIMARY KEY (`id`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';


CREATE TABLE IF NOT EXISTS `tb_user_level`( 
	  `id` int(10) unsigned NOT NULL AUTO_INCREMENT  comment '主键',
	  `user_id` int(10)  NOT NULL  DEFAULT '0' comment '用户Id',
	  `cust_level` tinyint(3)  NOT NULL  DEFAULT '0' comment '用户星级',
	  `add_time` datetime  NOT NULL  DEFAULT '1000-01-01 00:00:00' comment '添加时间',
	  `update_time` datetime  NOT NULL  DEFAULT '1000-01-01 00:00:00' comment '更新时间',
	  `mark` tinyint(3)  NOT NULL  DEFAULT '0' comment '删除标志(0:有效;1:删除)',
	PRIMARY KEY (`id`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='星级表';


CREATE TABLE IF NOT EXISTS `tb_user_hobby`( 
	  `id` int(10) unsigned NOT NULL AUTO_INCREMENT  comment '主键',
	  `user_id` int(10)  NOT NULL  DEFAULT '0' comment '用户Id',
	  `hobby` varchar(255)  NOT NULL  DEFAULT '' comment '爱好表',
	  `add_time` datetime  NOT NULL  DEFAULT '1000-01-01 00:00:00' comment '添加时间',
	  `update_time` datetime  NOT NULL  DEFAULT '1000-01-01 00:00:00' comment '更新时间',
	  `mark` tinyint(3)  NOT NULL  DEFAULT '0' comment '删除标志(0:有效;1:删除)',
	PRIMARY KEY (`id`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='爱好表';


CREATE UNIQUE INDEX ux_user_level_user_id ON tb_user_level (user_id);
CREATE INDEX idx_user_hobby_user_id ON tb_user_hobby (user_id);
COMMIT;