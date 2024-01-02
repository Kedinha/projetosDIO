/* eslint-disable @typescript-eslint/no-useless-constructor */
/**
 * Sobre classes
 */

class Character {
  protected name?: string;
  readonly stregth: number;
  skill: number;

  constructor(name: string, stregth: number, skill: number) {
    this.name = name;
    this.stregth = stregth;
    this.skill = skill;
  }

  attack(): void {
    console.log(`Attack with ${this.stregth} points`);
  }
}

/**
 * Subclasses
 * exemplo Magician
 * Da classe Character que é pai super class
 */

class Magician extends Character {
  magicPoints: number;
  constructor(
    name: string,
    stregth: number,
    skill: number,
    magicPoints: number,
  ) {
    super(name, stregth, skill);
    this.magicPoints = magicPoints;
  }
}
const p1 = new Character("Ryu", 10, 98);
const p2 = new Magician("Mago", 9, 30, 100);
console.log(p1);
console.log(p2);
p1.attack();
