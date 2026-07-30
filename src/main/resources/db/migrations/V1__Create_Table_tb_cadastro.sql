-- V1__create_table_tb_cadastro.sql
CREATE TABLE tb_cadastro (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    idade INT,
    img_url VARCHAR(255),
    missoes_id BIGINT
);