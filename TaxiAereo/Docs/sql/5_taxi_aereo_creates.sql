

CREATE DOMAIN cpf	AS numeric(11);
CREATE DOMAIN dinheiro	AS numeric(8,2); -- 6 dígitos antes da vírgula e 2 dígitos depois
CREATE DOMAIN breve	AS numeric(20);
CREATE DOMAIN chassi_aeronave	AS varchar(40);
CREATE DOMAIN numero_casa	AS int
	CONSTRAINT numero_invalido CHECK (VALUE > 0);
CREATE DOMAIN tipo_aeronave	AS varchar(20)
	CONSTRAINT tipo_aeronave_invalido  CHECK (VALUE ='Aviao' or VALUE ='Helicoptero');

CREATE TABLE Pessoas
(
	cpf			cpf PRIMARY KEY,
	rg			varchar(30) UNIQUE,
	nome		varchar(100),
	cep			numeric(8),
	logradouro 	varchar(100),
	numero_casa numero_casa
);

CREATE TABLE Telefones
(
	cpf			cpf REFERENCES Pessoas(cpf)
					ON DELETE CASCADE,
	ddd 		numeric(2),
	numero		numeric(9)
);

CREATE TABLE Funcionarios
(
	cpf				cpf REFERENCES Pessoas(cpf)
						ON DELETE CASCADE,
	data_contrato 	timestamp,
	data_saida 		timestamp,
	salario 		dinheiro
);

CREATE TABLE Vendedores
(
	matricula 	serial PRIMARY KEY,
	cpf			cpf REFERENCES Pessoas(cpf)
					ON DELETE CASCADE
);

CREATE TABLE Pilotos
(
	breve 		breve PRIMARY KEY,
	cpf			cpf REFERENCES Pessoas(cpf)
					ON DELETE CASCADE
);

CREATE TABLE Clientes
(
	cpf				cpf REFERENCES Pessoas(cpf)
						ON DELETE CASCADE,
	data_cadastro	timestamp,
	data_saida 		timestamp
);

CREATE TABLE Aeronaves
(
	chassi		chassi_aeronave PRIMARY KEY,
	modelo		varchar(60),
	capacidade	int,
	velocidade	int,
	autonomia	int,
	tipo 		tipo_aeronave
);

CREATE TABLE Contratos
(
	protocolo 			serial PRIMARY KEY,
	data_contrato		timestamp,
	valor				dinheiro,
	desconto			dinheiro,
	cpf_cliente			cpf REFERENCES Pessoas(cpf)
							ON DELETE NO ACTION,
	matricula_vendedor	int REFERENCES Vendedores(matricula)
							ON DELETE NO ACTION
);

CREATE TABLE Voos
(
	numero				serial PRIMARY KEY,
	chassi_aeronave		chassi_aeronave REFERENCES Aeronaves(chassi)
									ON UPDATE CASCADE
									ON DELETE NO ACTION,
	breve_piloto		breve REFERENCES Pilotos(breve)
							ON UPDATE CASCADE
							ON DELETE NO ACTION,
	protocolo_contrato 	int REFERENCES Contratos(protocolo)
							ON UPDATE CASCADE
							ON DELETE NO ACTION,
	data_agendada		timestamp,
	data_saida			timestamp,
	data_chegada		timestamp,
	origem				varchar(100),
	destino				varchar(100)
);
