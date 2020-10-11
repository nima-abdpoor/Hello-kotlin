package root.excersice.main.Construcotr

class privateCost private constructor(){
    var privateCost : privateCost = root.excersice.main.Construcotr.privateCost();
    fun getInstance()  :privateCost{
        return this.privateCost
    }
}