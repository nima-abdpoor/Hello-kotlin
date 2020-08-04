package main.Interface

import main.Interface.Clickable

class Button: Clickable,Focusable {
    override fun click() {
        println("I was clicked!")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}