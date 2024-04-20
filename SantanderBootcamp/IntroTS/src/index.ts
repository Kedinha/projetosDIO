 
 type heroi={
  
nome: string;
habilidades: string[];

 }

 function printaObjetos(pessoa: heroi){
   console.log(pessoa.nome)
   console.log(pessoa.habilidades)
 }
 printaObjetos({
   nome:"Flash",
   habilidades:["velocidade","reflexo"]
 });

 console.log("Olá Mundo");

 let ligado:boolean = true;
 let nome:string = "João";
 let idade:number = 20;
 let altura = 1.9;

 let nulo:null;
 let indefinido:undefined;

 let qualquer:any = "aceita qualquer coisa";
 let vazioSemRetorno:void;

 //objeto com nome, idade e cidade

 let pessoa:object = {
  nome:"João",
  idade:20,
  cidade: "SP"
};


// tipos abrangentes: any, void
let retorno: void;
let retornoView: any = false;

// objeto - sem previsibilidade
let produto:object = {
  name: "Ked",
  cidade: "sp",
  idade: 40,
};


// Objeto tipado com previsibilidade - type produto loja (struct)

type ProdutoLoja = {
  nome: string;
  preco: number;
  descricao: string;
  estoque: number;
}

let meuProduto: ProdutoLoja = {
  nome: "tênis",
  preco: 89.90,
  descricao: "descrição do produto",
  estoque:100

}

/**
 * Arrays
 * */ 

let dados: string[] = ["Kedma", "Anne", "Carol"]; // ou
let daddos2: Array<string> = ["Kedma", "Anne", "Maria"];


// array multi types - aceita dois tipos independente da ordem

let infos: (string | number)[] = ["Kedma", 20];


/**
 * Tuplas != "arrays" - aceita tipos diferentes, mas na ordem do tipo inserida
 */

let boleto: [string, number, number] = ["conta agua", 199.90, 685438];

/**
 * arrays métodos são os mesmos aos do javascript
 */

dados.push
dados.reduce
dados.pop
dados.map

/**
 * Datas - Date
 */

let aniversario:Date = new Date("2023-12-30 19:00");

console.log(aniversario.toString());


/**
 * Funções
 */

function addNumber(x:number, y:number): number {
  return x + y;
}
let soma: number = addNumber(4,7);

console.log(soma);

function addToHello(name:string):string {
  return `Hello ${name}`;
}

console.log(addToHello("Kedma"));

/**
 * Multi tipos
 */

function CallToPhone(phone:number | string): number | string{
  return phone;  
}

console.log(CallToPhone("12345" ));
