"use strict";
/**
 * Generics - para juntar vários arrays em um só
 */
function concatArray(...itens) {
    return new Array().concat(...itens);
}
const numArray = concatArray([1, 5], [3]);
const stringArray = concatArray(["Kedma", "maria"], ["Vegeta"]);
console.log(numArray);
console.log(stringArray);
