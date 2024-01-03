"use strict";
/* eslint-disable @typescript-eslint/no-useless-constructor */
/**
 * Sobre classes
 */
class Character {
    constructor(name, stregth, skill) {
        this.name = name;
        this.stregth = stregth;
        this.skill = skill;
    }
    attack() {
        console.log(`Attack with ${this.stregth} points`);
    }
}
/**
 * Subclasses
 * exemplo Magician
 * Da classe Character que é pai super class
 */
class Magician extends Character {
    constructor(name, stregth, skill, magicPoints) {
        super(name, stregth, skill);
        this.magicPoints = magicPoints;
    }
}
const p1 = new Character("Ryu", 10, 98);
const p2 = new Magician("Mago", 9, 30, 100);
console.log(p1);
console.log(p2);
p1.attack();
