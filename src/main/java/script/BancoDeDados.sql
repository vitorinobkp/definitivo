-- Script responsavel pela criação do banco utilizado pela aplicação. 

CREATE DATABASE estoque;

USE estoque;

CREATE TABLE `produtos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(150) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `preco` double NOT NULL,
  `compativel_Windows` varchar(255) NOT NULL,
  `compativel_Linux` varchar(45) NOT NULL,
  `compativel_Outros` varchar(45) DEFAULT NULL,
  `compativel_Socket` varchar(45) NOT NULL,
  `compativel_Mac` varchar(45) NOT NULL,
  `compativel_Slot` varchar(45) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;