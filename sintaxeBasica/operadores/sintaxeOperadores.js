/* 
*Crie uma função que recebe dois números como parâmetros.
*Confira se os números são iguais.
*Confira se a soma dos números é maior que 10 ou menor que 20.
*Retorne uma string dizendo "Os números num1 e num2 não/são iguais. 
Sua soma é soma, que é maior/menor que 10 e maior/menor que 20". */

//Crie uma função que recebe dois números como parâmetros.
function numberRelation(n1, n2) {
  let equals = n1 === n2
  const soma = n1 + n2

  //Confira se os números são iguais.
  // return equals ? "São iguais" : "são diferentes"

  if (equals) {
    console.log(`${n1} e ${n2} são iguais`)
  }
  console.log(`${n1} e ${n2} são diferentes`)
  return soma
  //Confira se a soma dos números é maior que 10 ou menor que 20
  if (soma > 10 && soma < 20) {
    soma`Sua soma é ${soma} dentro do range, portanto a sentença é verdadeira`
  }
}
console.log(numberRelation(22, 21))
