package com.example.lib.example

class Button :Clickable ,Focusable{
    //显示调用showoff，不能有接口默认实现
    //不调用showoff，抛出编译异常：
    override fun showoff() {
        super<Clickable>.showoff()
    }

    override val isClickable: Boolean
        get() = TODO("Not yet implemented")

    override fun click()= println("this is clicked")

    override fun setFocus(b: Boolean) {
        super.setFocus(b)
        val a = "xx"
    }
}