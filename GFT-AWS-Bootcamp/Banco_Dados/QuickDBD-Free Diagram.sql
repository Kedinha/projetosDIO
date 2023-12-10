-- Exported from QuickDBD: https://www.quickdatabasediagrams.com/
-- Link to schema: https://app.quickdatabasediagrams.com/#/d/dYGYnl
-- NOTE! If you have used non-SQL datatypes in your design, you will have to change these here.

-- Modify this code to update the DB schema diagram.
-- To reset the sample schema, replace everything with
-- two dots ('..' - without quotes).

CREATE TABLE "Usuarios" (
    "id" int   NOT NULL,
    "Nome" "varchar"   NOT NULL,
    "DtNascimento" Date   NOT NULL,
    "Endereco" "varchar"   NOT NULL,
    CONSTRAINT "pk_Usuarios" PRIMARY KEY (
        "id"
     )
);

CREATE TABLE "Reservas" (
    "id" int   NOT NULL,
    "idUsuario" int   NOT NULL,
    "iddestino" "varchar"   NOT NULL,
    "status" boolean   NOT NULL,
    CONSTRAINT "pk_Reservas" PRIMARY KEY (
        "id"
     )
);

CREATE TABLE "Destino" (
    "id" int   NOT NULL,
    "iddestino" "varchar"   NOT NULL,
    "descricao" "varchar"   NOT NULL,
    CONSTRAINT "pk_Destino" PRIMARY KEY (
        "id"
     )
);

ALTER TABLE "Reservas" ADD CONSTRAINT "fk_Reservas_idUsuario" FOREIGN KEY("idUsuario")
REFERENCES "Usuarios" ("id");

ALTER TABLE "Destino" ADD CONSTRAINT "fk_Destino_iddestino" FOREIGN KEY("iddestino")
REFERENCES "Reservas" ("iddestino");

CREATE INDEX "idx_Usuarios_Nome"
ON "Usuarios" ("Nome");

