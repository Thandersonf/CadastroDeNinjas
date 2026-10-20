-- V3__create_table_tb_missoes.sql

CREATE TABLE tb_missoes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_da_missao VARCHAR(255),
    dificuldade VARCHAR(255)
);