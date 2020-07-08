import com.example.lib.MyClass

class Xxx {
    fun method() {
        // internal 相同module中可见
        MyClass().internalMethod()
    }

}