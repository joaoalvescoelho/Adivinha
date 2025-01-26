CREATE TABLE players (
                         uuid UUID PRIMARY KEY,
                         nome VARCHAR(255),
                         posicao VARCHAR(50),
                         numero SMALLINT CHECK (numero > 0 AND numero <= 99),
                         golos SMALLINT,
                         jogos SMALLINT,
                         pe VARCHAR(50),
                         altura SMALLINT CHECK (altura > 0),
                         pais VARCHAR(50),
                         periodo_na_equipa VARCHAR(9) CHECK (periodo_na_equipa ~ '^\d{4}-\d{4}$'), -- Formato "YYYY-YYYY"
                           foto BYTEA
);

CREATE INDEX idx_jogadores_nome ON players (nome);