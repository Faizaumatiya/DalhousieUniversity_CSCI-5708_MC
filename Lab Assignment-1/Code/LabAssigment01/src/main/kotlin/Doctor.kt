open class Doctor (var name: String, var registry: Int, private var phoneNumber: String) {

    override fun toString(): String {
        return name + " " + "(" + registry + ")" + " - " + phoneNumber
    }

    open fun getPhoneNumber(): String {
        return this.phoneNumber
    }

    open fun setPhoneNumber(phoneNumber: String): Boolean {
        if(phoneNumber.length == 10) {
            this.phoneNumber = phoneNumber
            return true
        } else if(this.phoneNumber.length>10 || this.phoneNumber.length<10){
            this.phoneNumber = ""
            return false
        }
        else {
            return false
        }
    }
}

