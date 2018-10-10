DROP TABLE IF EXISTS login_info_tab;

CREATE TABLE `account_login_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL COMMENT '微信标示',
  `phone` varchar(100) DEFAULT NULL COMMENT '手机号',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `server_id` varchar(100) DEFAULT NULL COMMENT '对应的公众号',
  `open_id` varchar(100) DEFAULT NULL COMMENT '登录微信openId',
  `pay_open_id` varchar(100) DEFAULT NULL COMMENT '支付微信openId',
  `type` int(1) DEFAULT NULL COMMENT '类型：1，2...',
  `relate_id` bigint(20) NOT NULL COMMENT '关联id，根据type区分',
   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_id` bigint(20) DEFAULT NULL COMMENT '创建者id',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_id` bigint(20) DEFAULT NULL COMMENT '修改者id',
  `is_delete` int(1) DEFAULT '1' COMMENT '状态1有效0无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=232 COMMENT='登录表';