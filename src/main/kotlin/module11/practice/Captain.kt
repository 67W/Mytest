package module11.practice

class Captain(
    maxHP: Int = 70,
    accuracy: Int = 25,
    weapon: AbstractWeapon
) : AbstractWarrior(maxHP, accuracy, weapon) {
}