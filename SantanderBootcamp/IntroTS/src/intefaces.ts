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
  sayHello(): string;

}

const bot: robot = {
  id:1,
  name: "megaman"
}
const bot2: robot2 = {
  id: "1",
  name: "megaman",
  sayHello: function (): string {
    throw new Error("Function not implemented.");
  }
}

console.log(bot);
console.log(bot2);

class Pessoa implements robot2 {
  id: string | number;
  name: string;

  constructor(id: string | number, name: string) {
    this.id = id;
    this.name = name;
  }

  sayHello(): string {
   return `Hello I'm ${this.name}`;
    
  }
}

const p = new Pessoa(1, "gustman")
console.log(p.sayHello());
