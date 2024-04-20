/**
 * Generics - para juntar vários arrays em um só
 */

// function concatArray(...itens: any[]): any[]
function concatArray<T>(...itens: T[]): T[] {
  // eslint-disable-next-line @typescript-eslint/no-array-constructor
  return new Array().concat(...itens);
}

const numArray = concatArray<number[]>([1, 5], [3]);
const stringArray = concatArray<string[]>(["Kedma", "maria"], ["Vegeta"]);

// numArray.push("saitama");

console.log(numArray);
console.log(stringArray);
