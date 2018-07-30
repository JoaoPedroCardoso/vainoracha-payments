create database vainoacha_core;
create user vainoracha_test with password 'vainoracha_test';
alter database vainoacha_core OWNER TO vainoracha_test;
\connect vainoacha_core;
create SCHEMA IF NOT EXISTS vainoracha_core_1;
GRANT ALL PRIVILEGES ON SCHEMA vainoracha_core_1 TO GROUP vainoracha_test;