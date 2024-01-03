"use strict";
/* eslint-disable @typescript-eslint/consistent-type-definitions */
/**
 * Interfaces
 * type usa quando eu quero tipar um conjunto ou um objeto
 * interface para trabalhar com classe)
 */
const bot = {
    id: 1,
    name: "megaman"
};
const bot2 = {
    id: "1",
    name: "megaman",
    sayHello: function () {
        throw new Error("Function not implemented.");
    }
};
console.log(bot);
console.log(bot2);
class Pessoa {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    sayHello() {
        return `Hello I'm ${this.name}`;
    }
}
const p = new Pessoa(1, "gustman");
console.log(p.sayHello());
