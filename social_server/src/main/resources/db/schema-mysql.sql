CREATE TABLE IF NOT EXISTS account
(
    id              INT         NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '自增主键',
    uin             VARCHAR(20) NOT NULL UNIQUE COMMENT '用户识别码',
    state           INT         NOT NULL COMMENT '状态',
    create_timestamp TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
);

CREATE TABLE IF NOT EXISTS account_email
(
    id              INT         NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '自增主键',
    accountId       INT         NOT NULL COMMENT 'account表主键',
    email           VARCHAR(50) NOT NULL UNIQUE COMMENT '邮箱',
    password        VARCHAR(50) NOT NULL COMMENT '密码',
    create_timestamp TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_timestamp TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
);
