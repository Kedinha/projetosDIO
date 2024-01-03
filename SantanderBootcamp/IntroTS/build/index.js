"use strict";
function printaObjetos(pessoa) {
    console.log(pessoa.nome);
    console.log(pessoa.habilidades);
}
printaObjetos({
    nome: "Flash",
    habilidades: ["velocidade", "reflexo"]
});
console.log("Olá Mundo");
let ligado = true;
let nome = "João";
let idade = 20;
let altura = 1.9;
let nulo;
let indefinido;
let qualquer = "aceita qualquer coisa";
let vazioSemRetorno;
//objeto com nome, idade e cidade
let pessoa = {
    nome: "João",
    idade: 20,
    cidade: "SP"
};
// tipos abrangentes: any, void
let retorno;
let retornoView = false;
// objeto - sem previsibilidade
let produto = {
    name: "Ked",
    cidade: "sp",
    idade: 40,
};
let meuProduto = {
    nome: "tênis",
    preco: 89.90,
    descricao: "descrição do produto",
    estoque: 100
};
/**
 * Arrays
 * */
let dados = ["Kedma", "Anne", "Carol"]; // ou
let daddos2 = ["Kedma", "Anne", "Maria"];
// array multi types - aceita dois tipos independente da ordem
let infos = ["Kedma", 20];
/**
 * Tuplas != "arrays" - aceita tipos diferentes, mas na ordem do tipo inserida
 */
let boleto = ["conta agua", 199.90, 685438];
/**
 * arrays métodos são os mesmos aos do javascript
 */
dados.push;
dados.reduce;
dados.pop;
dados.map;
/**
 * Datas - Date
 */
let aniversario = new Date("2023-12-30 19:00");
console.log(aniversario.toString());
/**
 * Funções
 */
function addNumber(x, y) {
    return x + y;
}
let soma = addNumber(4, 7);
console.log(soma);
function addToHello(name) {
    return `Hello ${name}`;
}
console.log(addToHello("Kedma"));
/**
 * Multi tipos
 */
function CallToPhone(phone) {
    return phone;
}
console.log(CallToPhone("12345"));
