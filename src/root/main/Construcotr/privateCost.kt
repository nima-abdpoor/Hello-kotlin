package root.main.Construcotr

class privateCost private constructor(){
    var privateCost : privateCost = root.main.Construcotr.privateCost();
    fun getInstance()  :privateCost{
        return this.privateCost
    }
}