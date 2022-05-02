package module11.practice

class Soldier(
    maxHP: Int = 50,
    accuracy: Int = 15,
    weapon: AbstractWeapon
) : AbstractWarrior(maxHP, accuracy, weapon) {
}