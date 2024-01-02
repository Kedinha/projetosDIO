/* eslint-disable @typescript-eslint/consistent-type-definitions */
/**
 * Interfaces 
 * type usa quando eu quero tipar um conjunto ou um objeto
 * interface para trabalhar com classe)
 */

type robot = {
readonly  id: number | string;
  name: string;
}

interface robot2 {
readonly  id: number | string,
  name: string
}

const bot: robot = {
  id:1,
  name: "megaman"
}
const bot2: robot2 = {
  id:"1",
  name: "megaman"
}

console.log(bot);
console.log(bot2);

