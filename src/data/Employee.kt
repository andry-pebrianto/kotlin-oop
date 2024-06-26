package data

open class Employee(open val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    override val name: String = "Tuan $name"

    override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
};

class SuperManager(name: String) : Manager(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is Super Manager ${this.name}")
    }
}

open class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President ${this.name}")
    }
};

class Owner(name: String) : VicePresident(name) {
    fun sayaOwner() {
        println("Saya Punya Kuasa")
        super.sayHello("Owner")
    }
}