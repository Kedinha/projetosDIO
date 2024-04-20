//estrutura de repeticção

const notas = []

notas.push(10)
notas.push(5)
notas.push(7)

let soma = 0

for (let i = 0; i < notas.length; i++) {
  const nota= notas[i];
  soma = soma + nota
}

const media = soma / notas.length
console.log(media);