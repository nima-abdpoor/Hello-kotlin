package root.main.Construcotr

import javax.naming.Context

class MyButton : View {
    constructor(ctx  :Context ) : this(ctx,"HI")
    constructor(ctx: Context , name: String)  :super(ctx,name)
}