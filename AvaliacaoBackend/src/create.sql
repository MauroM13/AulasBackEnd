CREATE TABLE if not exists filial
(   id INT PRIMARY KEY,
    nome VARCHAR(255),
    rua VARCHAR(255),
    numero VARCHAR(10),
    cidade VARCHAR(100),
    estado VARCHAR(100),
    estrelas BOOLEAN );