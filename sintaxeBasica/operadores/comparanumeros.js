function numberRelation(n1, n2) {
  //tratamento e validação
  if (!n1 || !n2) return 'Defina dois números'
  const phraseOne = createPhraseOne(n1, n2)
  const phraseTwo = createPhraseTwo(n1, n2)

  return `${phraseOne} ${phraseTwo}`
}

function createPhraseOne(n1, n2) {
  let equals = ''

  if (n1 !== n2) {
    equals = 'Não'
  }

  return `Os números ${n1} e ${n2} ${equals} são iguais\n`
}

function createPhraseTwo(n1, n2) {
  const sum = n1 + n2
  const compare10 = sum > 10
  const compare20 = sum < 20

  let result10 = 'menor'
  let result20 = 'maior'

  if (compare10) {
    result10 = 'maior'
  }
  if (compare20) {
    result20 = 'menor'
  }

  return `Sua soma é ${sum}, que é ${result10} que 10 e ${result20} que 20`
}

console.log(numberRelation(8, 8))
