 
 type heroi={
  
nome: string;
habilidades: string[];

 }

 function printaObjetos(pessoa:heroi){
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

//criar type produto loja 

type ProdutoLoja = {
  nome: string;
  preco: number;
  descricao: string;
  estoque: number;
}