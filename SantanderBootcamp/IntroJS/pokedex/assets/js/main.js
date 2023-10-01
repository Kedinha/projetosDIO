
function convertPokemonToLi(pokemon) {
  return `
  <li class="pokemon">
  <span class="number">#${pokemon.number}</span>
  <span class="name">${pokemon.name}</span>

  <div class="detail">
    <ol class="types">
        ${pokemon.type.map((type) => `<li class="type">${type}</li>`).join('')}
    </ol>
    <img src="${pokemon.photo}" alt="${pokemon.name}" />
  </div>
</li>
`
}

const pokemonList = document.getElementById('pokemonList')

// console.log(document.getElementsByid('pokemonList'))

pokeApi.getPokemons().then((pokemons = []) => {
  const newHtml = pokemons.map(convertPokemonToLi).join('')
  pokemonList.innerHTML = newHtml


})
  //console.log(newList);

  // const listItems = []


  // for (let index = 0; index < pokemons.length; index++) {
  //     const pokemon = pokemons[index];
  //     listItems.push(convertPokemonToLi(pokemon))
  //   }
  //   console.log(listItems);

