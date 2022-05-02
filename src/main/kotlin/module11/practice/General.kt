package module11.practice

class General(
    maxHP: Int = 100,
    accuracy: Int = 50,
    weapon: AbstractWeapon
) : AbstractWarrior(maxHP, accuracy, weapon) {
}