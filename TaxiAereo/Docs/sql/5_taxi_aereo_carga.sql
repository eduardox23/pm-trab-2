/*Carga de dados de teste do TaxiAéreo*/

--Pessoas
INSERT INTO Pessoas(cpf, rg, nome, cep, logradouro, numero_casa) VALUES (11111111111, 8000001, 'Alesanderson Capivara do Mato Pascoal de Souza', 21931120, 'rua xpto', 111);
INSERT INTO Pessoas(cpf, rg, nome, cep, logradouro, numero_casa) VALUES (22222222222, 8000002, 'Manfred von Richthofen', 21931120, 'rua xpto2', 222);
INSERT INTO Pessoas(cpf, rg, nome, cep, logradouro, numero_casa) VALUES (33333333333, 8000003, 'Andréia Floresta Negra Hughes', 21931120, 'rua xpto3', 333);
INSERT INTO Pessoas(cpf, rg, nome, cep, logradouro, numero_casa) VALUES (44444444444, 8000004, 'Abecê Nogueira Hughes', 21931120, 'rua xpto4', 444);
INSERT INTO Pessoas(cpf, rg, nome, cep, logradouro, numero_casa) VALUES (55555555555, 8000005, 'Abrilina Décima Nona Caçapavana Piratininga de Hughes', 21931120, 'rua xpto5', 555);
INSERT INTO Pessoas(cpf, rg, nome, cep, logradouro, numero_casa) VALUES (66666666666, 8000006, 'João José', 21931121, 'rua xpto6', 555);
INSERT INTO Pessoas(cpf, rg, nome, cep, logradouro, numero_casa) VALUES (77777777777, 8000007, 'Maria Joaquina', 20500300, 'rua xpto6', 600);

--Clientes
INSERT INTO Clientes(cpf, data_cadastro) VALUES (11111111111, '2000-11-02');
INSERT INTO Clientes(cpf, data_cadastro) VALUES (22222222222, '1996-10-30');
INSERT INTO Clientes(cpf, data_cadastro) VALUES (33333333333, '2007-02-14');

--Funcionarios
INSERT INTO Funcionarios(cpf, data_contrato, salario) VALUES (44444444444, '2000-01-21', 1500);
INSERT INTO Funcionarios(cpf, data_contrato, salario) VALUES (55555555555, '2012-11-01', 900);
INSERT INTO Funcionarios(cpf, data_contrato, salario) VALUES (66666666666, '1987-10-21', 2500);
INSERT INTO Funcionarios(cpf, data_contrato, salario) VALUES (77777777777, '1999-09-30', 3000);

--Vendedores
INSERT INTO Vendedores(cpf) VALUES (44444444444);
INSERT INTO Vendedores(cpf) VALUES (55555555555);

--Pilotos
INSERT INTO Pilotos(breve, cpf) VALUES (123, 66666666666);
INSERT INTO Pilotos(breve, cpf) VALUES (456, 77777777777);

--Telefones
INSERT INTO Telefones(cpf, ddd, numero) VALUES (11111111111, 21, 11122233);
INSERT INTO Telefones(cpf, ddd, numero) VALUES (11111111111, 11, 22223333);
INSERT INTO Telefones(cpf, ddd, numero) VALUES (33333333333, 11, 33334444);
INSERT INTO Telefones(cpf, ddd, numero) VALUES (44444444444, 21, 44445555);
INSERT INTO Telefones(cpf, ddd, numero) VALUES (55555555555, 21, 55556666);

--Aeronaves
INSERT INTO Aeronaves(chassi, modelo, capacidade, velocidade, autonomia, tipo) VALUES ('A1', 'Cessna Caravan' , 599, 420, 700000, 'Aviao');
INSERT INTO Aeronaves(chassi, modelo, capacidade, velocidade, autonomia, tipo) VALUES ('A2', 'Eurocopter AS-332 Super Puma' , 5, 500, 500000, 'Helicoptero');
INSERT INTO Aeronaves(chassi, modelo, capacidade, velocidade, autonomia, tipo) VALUES ('A3', '777-200LR' , 699, 800, 800000, 'Aviao');
INSERT INTO Aeronaves(chassi, modelo, capacidade, velocidade, autonomia, tipo) VALUES ('A4', '747-400', 800, 850, 950000, 'Aviao');
INSERT INTO Aeronaves(chassi, modelo, capacidade, velocidade, autonomia, tipo) VALUES ('A5', '77-200FR', 699, 810, 900000, 'Aviao');

--Contratos
INSERT INTO Contratos(data_contrato, valor, desconto, cpf_cliente, matricula_vendedor) VALUES ('2000-12-21', 1500, 50, 11111111111, 1);
INSERT INTO Contratos(data_contrato, valor, desconto, cpf_cliente, matricula_vendedor) VALUES ('2001-11-15', 500, 0, 22222222222, 1);
INSERT INTO Contratos(data_contrato, valor, desconto, cpf_cliente, matricula_vendedor) VALUES ('2000-10-06', 10000, 100, 33333333333, 2);
INSERT INTO Contratos(data_contrato, valor, desconto, cpf_cliente, matricula_vendedor) VALUES ('2002-05-07', 1000, 30, 22222222222, 1);

--Voos
INSERT INTO voos(chassi_aeronave, breve_piloto, protocolo_contrato, data_agendada, data_saida, data_chegada, origem, destino) VALUES ('A1', 123, 1, '2011-12-15', '2011-12-15', '2011-12-15', 'Recife', 'Belo Horizonte');
INSERT INTO voos(chassi_aeronave, breve_piloto, protocolo_contrato, data_agendada, data_saida, data_chegada, origem, destino) VALUES ('A2', 123, 2, '2011-11-15', '2011-11-15', '2011-11-15', 'Recife', 'Rio de Janeiro');
INSERT INTO voos(chassi_aeronave, breve_piloto, protocolo_contrato, data_agendada, data_saida, data_chegada, origem, destino) VALUES ('A3', 456, 4, '2011-10-15', '2011-10-15', '2011-10-16', 'Recife', 'Sao Paulo');
INSERT INTO voos(chassi_aeronave, breve_piloto, protocolo_contrato, data_agendada, data_saida, data_chegada, origem, destino) VALUES ('A4', 123, 3, '2012-01-15', '2011-01-15', '2011-01-15', 'Sao Paulo', 'Recife');

COMMIT;