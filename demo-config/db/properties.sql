CREATE TABLE `properties` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `env_key` varchar(64) NOT NULL,
  `env_value` varchar(2048) NOT NULL,
  `env_profile` varchar(64) NOT NULL,
  `env_application` varchar(64) NOT NULL,
  `env_label` varchar(64) NOT NULL,
  `env_memo` varchar(120) DEFAULT NULL,
  `version` int(10) NOT NULL DEFAULT 0
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf-8;

